defmodule FreelancerRates do
  def daily_rate(hourly_rate), do: hourly_rate * 8.0

  def apply_discount(before_discount, discount), do: before_discount * (1 - discount / 100)

  def monthly_rate(hourly_rate, discount) do
    before_discount = daily_rate(hourly_rate) * 22
    trunc(Float.ceil(apply_discount(before_discount, discount)))
  end

  def days_in_budget(budget, hourly_rate, discount) do
    before_discount = daily_rate(hourly_rate)
    after_discount = apply_discount(before_discount, discount)
    Float.floor(budget / after_discount, 1)
  end
end
