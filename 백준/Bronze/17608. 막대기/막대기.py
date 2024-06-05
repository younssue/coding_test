import sys

input = sys.stdin.readline

n = int(input())
stack = []

for _ in range(n):
    stack.append(int(input()))

# stack[-1]: 가장 마지막 값
last = stack[-1]
count = 1

# 역으로 for문
# reversed 함수: 메모리 용량에서 이점
# set ( 순서개념이 없는 ) 사용 불가
for i in reversed(range(n)):
    if stack[i] > last:
        count += 1
        last = stack[i]

print(count)