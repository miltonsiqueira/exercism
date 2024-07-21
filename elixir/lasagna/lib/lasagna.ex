defmodule Lasagna do
  def expected_minutes_in_oven(), do: 40

  def remaining_minutes_in_oven(min), do: expected_minutes_in_oven() - min

  def preparation_time_in_minutes(layers), do: layers * 2

  def total_time_in_minutes(layers, minutes_in_over),
    do: preparation_time_in_minutes(layers) + minutes_in_over

  def alarm(), do: "Ding!"
end
