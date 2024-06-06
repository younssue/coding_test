import sys

input = sys.stdin.readline
N = int(input())
words = []
for _ in range(N):
    word = input().strip()
    words.append(word)

password_num = 0
center = None
for word in words:
    if word[::-1] in words:
        password_num = len(word)
        center = word[password_num // 2]
        break
print(password_num, center)