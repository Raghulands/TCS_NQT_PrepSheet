n = 10
binary = ""
for i in range(n,0,-1):
    if n==0:
        break
    binary = str(n%2) + binary
    n//=2
print(binary)