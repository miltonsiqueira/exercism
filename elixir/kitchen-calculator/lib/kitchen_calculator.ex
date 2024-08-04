defmodule KitchenCalculator do
  defp unit_in_milliliter(:milliliter), do: 1
  defp unit_in_milliliter(:cup), do: 240
  defp unit_in_milliliter(:fluid_ounce), do: 30
  defp unit_in_milliliter(:teaspoon), do: 5
  defp unit_in_milliliter(:tablespoon), do: 15
  def get_volume({_, volume}), do: volume
  def to_milliliter({unit, volume}), do: {:milliliter, volume * unit_in_milliliter(unit)}
  def from_milliliter({:milliliter, volume}, unit), do: {unit, volume / unit_in_milliliter(unit)}

  def convert(volume_pair, unit) do
    volume_pair |> to_milliliter() |> from_milliliter(unit)
  end
end
