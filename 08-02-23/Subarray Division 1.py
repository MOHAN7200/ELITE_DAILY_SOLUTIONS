#Subarray Division 1



def birthday(s, d, m):
    count=0
    if(len(s)==1 and s[0]==d):
        return 1
        
    for i in range(len(s)-m+1):
        print(s[i:i+m])
        if(sum(s[i:i+m])==d):
            count+=1
    return count
