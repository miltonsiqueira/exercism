defmodule LogLevel do
  def to_label(0, true), do: :unknown
  def to_label(5, true), do: :unknown

  def to_label(level, _legacy?) do
    cond do
      level == 0 -> :trace
      level == 1 -> :debug
      level == 2 -> :info
      level == 3 -> :warning
      level == 4 -> :error
      level == 5 -> :fatal
      true -> :unknown
    end
  end

  def alert_recipient(level, legacy?) do
    label = to_label(level, legacy?)

    alert_recipent_label(label, legacy?)
  end

  defp alert_recipent_label(:unknown, true), do: :dev1
  defp alert_recipent_label(:unknown, false), do: :dev2
  defp alert_recipent_label(:error, _), do: :ops
  defp alert_recipent_label(:fatal, _), do: :ops
  defp alert_recipent_label(_, _), do: false
end
