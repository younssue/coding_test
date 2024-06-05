N = int(input())

stick_list = []
for _ in range(N):
    char = int(input())
    stick_list.append(char)


stick_cnt = 0
max_stick = 0

# 오른쪽부터 왼쪽까지 탐색
for i in range(N-1, -1, -1):
    if stick_list[i] > max_stick:
        stick_cnt += 1
        max_stick = stick_list[i]
print(stick_cnt)