import sys

input = sys.stdin.readline

T = int(input())
for _ in range(T):
    school = {}
    N = int(input())
    for _ in range(N):
        key, value = input().split()
        school[key] = int(value)

    max_school = max(school.values())

    for key,value in school.items():
        if value == max_school:
            print(key)
            break