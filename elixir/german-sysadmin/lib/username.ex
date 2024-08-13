defmodule Username do
  def sanitize([head]), do: sanitize(head)
  def sanitize([head | tail]), do: sanitize(head) ++ sanitize(tail)

  def sanitize(username) do
    case username do
      ?ä -> [?a, ?e]
      ?ö -> [?o, ?e]
      ?ü -> [?u, ?e]
      ?ß -> [?s, ?s]
      ?_ -> [username]
      username when username >= ?a and username <= ?z -> [username]
      _ -> []
    end
  end
end
