n = 153
temp = n
sum = 0

for i in range(len(str(n))):
    d = n % 10
    sum += d*d*d
    n = n // 10

if sum == temp:
    print("Armstrong")
else:
    print("Not Armstrong")