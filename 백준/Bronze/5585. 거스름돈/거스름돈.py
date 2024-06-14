payment = 1000 - int(input())

changes = [500, 100, 50, 10, 5, 1]
count = 0
for change in changes:
    count += payment // change
    payment = payment % change

print(count)