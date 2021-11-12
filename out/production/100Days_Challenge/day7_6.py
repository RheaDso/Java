N = int(input("Enter a value: "))  
temp = N  
rev = 0  
while(N > 0; -10000<=N<=10000):  
    dig = N % 10  
    rev = (rev * 10) + dig  
    N= N // 10  
if(temp == rev):  
    print("True")  
else:  
    print("False")  