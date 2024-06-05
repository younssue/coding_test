import sys


N = int(input())
for i in range(N):
    s = sys.stdin.readline().split()
    print('Case #' + str(i + 1) + ':', end=" ")
    for j in range(len(s)):
        print(s.pop(), end=" ")