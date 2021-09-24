import math
value=int(input())
num=abs(value)
temp=num
rev=0
while(num > 0):
    digit=num%10
    rev=rev*10+digit
    num=num//10
if(temp==rev):
    print("true")
else:
    print("false")