n = int(input())
milk_list = list(map(int, input().split()))

milk_num = 0
count = 0

for i in milk_list:
    if i == milk_num:
        count += 1
        milk_num += 1

    if milk_num > 2:
        milk_num = 0
print(count)