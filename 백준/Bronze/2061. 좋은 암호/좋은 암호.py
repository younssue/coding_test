import sys
input = sys.stdin.readline

k, l = input().split()
L = int(l)
is_bad = False
# 2부터 L까지 나누어 떨어진다면 좋은 암호가 아니므로 (BAD + 인수 ) 출력 후 프로그램 종료
for i in range(2, L):
    if int(k) % i == 0:
        print("BAD", i)
        is_bad = True
        break

# 그 외에는 좋은 암호
if not is_bad:
    print("GOOD")
