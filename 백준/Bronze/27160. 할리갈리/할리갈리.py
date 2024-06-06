from collections import defaultdict
import sys
input = sys.stdin.readline

n = int(input())
game_card = defaultdict(int)  # 기본값으로 int, 즉 0을 설정

for i in range(n):
    fruit_name, num = input().split()
    game_card[fruit_name] += int(num) # fruit_name 이 없으면, 먼저 0으로 설정 -> 그 후에 int(num)을 더함


# fruit_name의 values 값 중 5가 되는 값이 있을 때
if 5 in game_card.values():
    print("YES")
# fruit_name의 values 값 중 5가 되는 값이 없을 때
else:
    print("NO")
