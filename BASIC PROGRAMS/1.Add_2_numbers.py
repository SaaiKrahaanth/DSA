# 1 normal addition
a=5
b=6
print("the sum1 of a=",a, "and b= ",b,"is ",a+b)

# 2 user inputs
'''
a=int(input("enter a :"))
b=int(input("enter b :"))
'''
a,b=3,4

print("the sum2 of a=",a, "and b= ",b,"is ",a+b)

print(f"the sum3 of a={a} and b= {b} is {a+b}")

print("the sum4 of a={0} and b= {1} is {2}".format(a,b,a+b))

#using function

def add_fun(a,b):
    return a+b
print("the sum5 of a=",a, "and b= ",b,"is ",add_fun(a,b)," by function")

#operator.add()

import operator
print(f"operator.add->{operator.add(a,b)}")

#lambda fun
sum=0
sum=lambda a,b:a+b
print(f"sum using lambda{sum(a,b)}")

#recursion add
def rec_add(a,b):
    if b==0:
        return a
    else:
        return rec_add(a+1,b-1)
print(f"the sum using recursion is->{rec_add(a,b)}")