from itertools import permutations

time = list(map(int, input().split(":")))
time_per = list(permutations(time))

count = 0
for a, b, c in time_per:
    if 1 <= a <= 12 and 0 <= b <= 59 and 0 <= c <= 59:
        count += 1
print(count)