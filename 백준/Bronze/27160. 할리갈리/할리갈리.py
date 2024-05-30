n = int(input())
game_card = {}
for i in range(n):
    fruit_name, num = map(str, input().split())
    # game_card 에 fruit_name이 같은 값이 있을 때
    if fruit_name in game_card:
        game_card[fruit_name] += int(num)
    # game_card 에 fruit_name이 같은 값이 없을 때
    else:
        game_card[fruit_name] = int(num)
# fruit_name의 values 값이 5 가 되는 값이 있을 때
if 5 in game_card.values():
    print("YES")
# fruit_name의 values 값이 5 가 되는 값이 없을 때
else:
    print("NO")