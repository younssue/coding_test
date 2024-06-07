import sys

input = sys.stdin.readline

T = int(input())
for _ in range(T):
    school = {}
    N = int(input())
    for _ in range(N):
        key, value = input().split()
        school[key] = int(value)
    dict_school = dict(zip(school.values(), school.keys()))
    print(dict_school[max(dict_school)])