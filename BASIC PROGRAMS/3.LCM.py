def rec_lcm(x,y):
    
    if x%y==0:
        return x
    
    return rec_lcm(1+x,y)
def while_lcm(x,y):
    i=1
    while(x%y!=0):
        x*=i
        i+=1
    return x
a=int(input("enter a: "))
b=int(input("enter b: "))
    
print(f"WHILE lcm of {a} and {b} is {while_lcm(a,b)}")
print(f"RECURSION lcm of {a} and {b} is {rec_lcm(a,b)}")