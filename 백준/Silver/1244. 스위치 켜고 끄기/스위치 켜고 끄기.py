
switch_cnt = int(input())
switch_status = [0] + list(map(int, input().split()))
student_cnt = int(input())
student_received = [list(map(int, input().split())) for _ in range(student_cnt)]

for student_gender, student_num in student_received:
    if student_gender == 1:  # 남학생
        for j in range(student_num, switch_cnt + 1, student_num):
            switch_status[j] = 1 if switch_status[j] == 0 else 0
    else:  # 여학생
        left = student_num - 1
        right = student_num + 1
        switch_status[student_num] = 1 if switch_status[student_num] == 0 else 0
        while left >= 1 and right <= switch_cnt and switch_status[left] == switch_status[right]:
            switch_status[left] = 1 if switch_status[left] == 0 else 0
            switch_status[right] = 1 if switch_status[right] == 0 else 0
            left -= 1
            right += 1

for i in range(1, switch_cnt + 1):
    print(switch_status[i], end=" ")
    if i % 20 == 0:
        print()
