str = input().upper() # 대문자로 정렬
# set을 이용 하여 중복 되는 값 제거
set_list = list(set(str))
cnt =[] # 문자열의 알파벳 개수를 추가 시켜 줄 빈 리스트

for i in set_list:
    cnt.append(str.count(i))

max_cnt = max(cnt)
# max_cnt가 여러개 일 경우
if cnt.count(max_cnt) > 1:
    print("?")
# max_cnt가 한 개 일 경우
# 해당 index 에 해당하는 알파벳 출력
else:
    print(set_list[cnt.index(max_cnt)])
