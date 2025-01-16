def fun1(a):
    return(a[::-1])
def fun2(a):
    i,j=0,len(a)-1

    while(i<j):
        a[i]=a[i]+a[j]
        a[j]=a[i]-a[j]
        a[i]=a[i]-a[j]
        i+=1
        j-=1
    return a
a=[1,2,3,4,5]
print(fun1(a))
print(fun2(a))