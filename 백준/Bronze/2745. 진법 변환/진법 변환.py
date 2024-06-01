n, b = input().split()
arr = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
result = 0

n = n[::-1]

for i, num in enumerate(n):
    result += ((int(b)**i)) * (arr.index(num))
print(result)
