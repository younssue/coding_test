score = 0
mushroom_list = [int(input()) for _ in range(10)]

for i in range(10):
    pre_score = score
    score += mushroom_list[i]

    if score > 100:
        score_under = 100 - pre_score
        score_over = score - 100

        if score_over <= score_under:
            # 100을 넘은 값이 더 100에 가까움
            # 현재 스코어 출력
            print(score)
            break
        else:
            # 100-이전값을 해준게 더 100에 가까움
            # 그전 값을 출력
            print(pre_score)
            break
# 루프가 정상 종료 된 경우
# break되지 않고 끝까지 실행된 경우 최종 score 출력
else:
    print(score)