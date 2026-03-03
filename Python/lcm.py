a=4;b=6;lcm=0;
for i in range(max(a,b),(a*b) + 1):
    if i%a == 0 and i%b == 0:
        lcm=i
        break
print(lcm)