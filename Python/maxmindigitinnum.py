from unicodedata import digit

n=2745
digits=[int(d) for d in str(n)]
print("Max=",max(digits), " Min=",min(digits))