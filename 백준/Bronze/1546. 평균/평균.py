n = int(input())

list = list(map(int, input().split()))
M = max(list)
new_list = []

for i in range(len(list)):
    new_list.append((list[i]/M)*100)

print(sum(new_list)/len(new_list))