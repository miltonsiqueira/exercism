def is_leap_year(year):
    """
    Indicate whether a year is leap year or not
    """
    return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)
