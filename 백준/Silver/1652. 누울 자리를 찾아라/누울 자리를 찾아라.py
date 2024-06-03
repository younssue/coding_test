N = int(input())
arr = [list(input()) for _ in range(N)]

# 가로, 세로로 누울 수 있는 자리 개수
width = 0
depth = 0

# 가로로 누울 자리
for i in range(N):
    space_width = 0 # 각 행을 검사하기 전에 초기화 필요  
    for j in range(N):
        if arr[i][j] == '.':
            space_width += 1
        else:
            space_width = 0
        if space_width == 2:
            width += 1


for i in range(N):
    space_depth = 0 # 각 열을 검사하기 전에 초기화 필요  
    for j in range(N):
        if arr[j][i] == '.':
            space_depth += 1
        else:
            space_depth = 0
        if space_depth == 2:
            depth += 1


print(width, depth, end=" ")