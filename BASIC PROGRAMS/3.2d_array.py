def spiral_matrix(a):
   left=0
   right=col-1
   bottom=row-1
   top=0
   for i in range(left,right+1):
      print(a[top][i])
   top+=1
   for j in range(top,bottom+1):
      
      print(a[j][right])
   right-=1
   for k in range(right,left-1,-1):
      print(a[bottom][k])
   bottom-=1
   for l in range(bottom,top-1,-1):
      print(a[l][left])
   left+=1
row=6
col=6

a=[[0]*col for _ in range(row)]
print(a)
n=1
for i in range(row):
    for j in range(col):
      a[i][j] = n
      n+=1
for x in a:
   print(*x)
spiral_matrix(a)