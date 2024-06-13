import sys
from itertools import permutations
input = sys.stdin.readline

n = int(input())
k = int(input())

card_list = []
for _ in range(n):
    card =input().strip()
    card_list.append(card)

# set을 사용해 중복 제거
unique = set()
for i in permutations(card_list, k):
    str = "".join(i)
    unique.add(str)


print(len(unique))
