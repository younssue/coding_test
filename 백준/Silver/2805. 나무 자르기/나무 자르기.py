import sys

input = sys.stdin.readline

N, M = map(int, input().split())
tree_list = list(map(int, input().split()))
start, end = 1, max(tree_list)  # 이분탐색 검색 범위 설정

while start <= end:
    mid = (start + end) // 2 # 중간위치

    tree_sum = 0  # 벌목된 나무 총합
    # 나무자르기 
    for tree in tree_list:
        # 나무의 높이가 절단기 높이보다 크다면
        if tree >= mid:
            # 자르기
            tree_sum += tree - mid

    # 자른 나무들의 길이가 목표값 이상이면
    if tree_sum >= M:
        # 시작점을 조정
        start = mid + 1
    # 자른 나무들의 길이가 목표값 이하
    else:
        # 끝점 조정
        end = mid - 1
print(end)