#Drawing Book


def pageCount(n, p):
    # Write your code here
    count=0
    count1=0
    for i in range(1,n,2):
        if(p!=i and p>i):
            count+=1 
    if(n%2==0):       
        for i in range(n,0,-2):
            if(p!=i and p<=i):
                count1+=1
    else:
        for i in range(n-1,0,-2):
            if(p!=i and p<=i):
                count1+=1
        
                
    if count>count1:
        return count1
    return count
