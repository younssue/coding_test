import sys

input = sys.stdin.readline

n = int(input())
seat_list = list(map(int, input().split()))

seat_list.sort()

# 1부터 시작하여 가장 작은 비어 있는 좌석 번호 찾기
seat = 1

for s in seat_list:
    if s == seat:
        seat += 1
    # s가 seat 보다 크다면, seat이 가장 작은 비어있는 좌석
    elif s > seat:
        break

print(seat)