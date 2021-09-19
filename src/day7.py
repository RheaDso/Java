def checkEqual(N):
    for i in range(len(N)):
        if(N[i]!='1'and N[i]!='0' 
                    and N[i]!='8'):
            return"No";
    start=0;
    end = len(N) - 1;
    while (start<end):
        if(N[start]!=N[end]):
            return"No";
        start += 1;
        end -= 1;
    return "Yes";
N="101";
print(checkEqual(N));                    