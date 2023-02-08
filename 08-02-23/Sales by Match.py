#Sales by Match

def sockMerchant(n, ar):
    s=set(ar)           
    count=0
    for i in s:
        a=ar.count(i)
        count+=a//2
    return count
