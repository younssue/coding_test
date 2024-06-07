import sys

input = sys.stdin.readline

arr = []
take_out_one =0
take_out_two = 0
for i in range(9):
    stature = int(input())
    arr.append(stature)

arr.sort()

sum_val = sum(arr)
for i in range(9):
    for j in range(i+1, 9):
        # 데이터 합에서 2개 골라서 뺏을때 그 합이 100이면
        # 그 데이터를 뺴준다
        if sum_val - (arr[i] + arr[j]) == 100:
            take_out_one = arr[i]
            take_out_two = arr[j]
arr.remove(take_out_one)
arr.remove(take_out_two)
arr.sort()

for i in arr:
    print(i)