n=18
sum=0
for i in str(n):
    sum=sum+int(i)
if n%sum==0:
    print("Harshad")
else:
    print("Not Harshad")