import sys

str = sys.stdin.readline()

for i in range(0, len(str), 10):
    print(str[i:i+10])