n = 1234
rev = 0

for i in str(n):
    rev = int(i) + rev*10

print(rev)