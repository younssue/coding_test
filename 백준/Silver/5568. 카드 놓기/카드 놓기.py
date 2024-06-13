import sys
from itertools import permutations


n = int(input())
k = int(input())

cards = []
for _ in range(n):
    card = sys.stdin.readline().strip()
    cards.append(card)

# set을 사용해 중복 제거
unique_permutations = set()
for perm in permutations(cards, k):
    permutation_string = "".join(perm)
    unique_permutations.add(permutation_string)


print(len(unique_permutations))
