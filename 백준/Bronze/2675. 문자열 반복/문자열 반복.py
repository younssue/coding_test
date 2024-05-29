n = int(input())

# n=2 -> 0,1
for i in range(n):
    a, b = input().split()
    a = int(a)
    # len(b) : 문자열 b의 길이
    for j in range(len(b)):
        # 줄바꿈 없이 출력 end=''
        print(a*b[j], end='')
    # print() : 띄어쓰기
    print()