num_list = list(map(int, input().split()))

common = 1

while True:
    count = 0
    for i in num_list:
        if common % i == 0:
            count += 1
    if count >= 3:
        print(common)
        break
    common += 1