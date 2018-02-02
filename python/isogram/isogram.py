def is_isogram(string):
    """
        Determine if a word or phrase is an isogram
    """
    if string:
        string = string.lower()
        for i in range(len(string)-1):
            char = string[i]
            if char.isalpha() and char in string[i+1:]:
                return False
    return True
