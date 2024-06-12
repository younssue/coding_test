from itertools import combinations

n, m = map(int, input().split())

card_list = list(map(int, input().split()))
# combinations: 조합
# card_list에서 3개의 카드를 뽑아 조합으로 만듦
com = list(combinations(card_list, 3))
total = 0
for i in com:
    if sum(i) <= m:
        total = max(total, sum(i))
print(total)