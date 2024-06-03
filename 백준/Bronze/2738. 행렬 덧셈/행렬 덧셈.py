N, M = map(int, input().split())

arrA = []
arrB = []

for i in range(N):
    arrA.append(list(map(int, input().split())))

for j in range(N):
    arrB.append(list(map(int, input().split())))

for c in range(N):
    for d in range(M):
        print(arrA[c][d] + arrB[c][d], end=" ")
    print()