import re
regex = r'^[a-z]$|^([a-z]).*\1$'

def check(string):
    if(re.search(regex, string)):
        print("Valid")
    else:
        print("Invalid")


if __name__ == '__main__' :
 
    sample1 = "abba"
    sample2 = "a"
    sample3 = "abcd"
 
    check(sample1)
    check(sample2)
    check(sample3)        