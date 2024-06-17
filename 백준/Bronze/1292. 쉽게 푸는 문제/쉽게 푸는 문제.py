import sys
input = sys.stdin.readline

start, end = map(int, input().split())

list = []

for i in range(1000):
    for j in range(i):
        list.append(i)


list2 = list[start-1:end]

sum = 0

for i in list2:
    sum += i

print(sum)