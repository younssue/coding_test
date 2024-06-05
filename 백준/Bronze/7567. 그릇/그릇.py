plates = list(input())

first = 0

for i in range(len(plates)):
    if i == 0:
        first += 10
    elif plates[i] == plates[i-1]:
        first += 5
    else:
        first += 10

print(first)