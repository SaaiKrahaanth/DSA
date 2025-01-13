#min fun

a,b=2,3
print(f"the min of {a}and {b} is {min(a,b)}")

#min by reduce & lambda

from functools import reduce

num=[a,b]
print(num)

min_num = reduce(lambda x,y:min(x,y),num)
print(f"the min found using min+reduce+lambda ->{min_num}")
