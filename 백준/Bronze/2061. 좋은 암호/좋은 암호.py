def goodOrBad(K, L):
    for i in range(2, L):
        if K % i == 0:
            return "BAD", i
    return "GOOD", None

# 예제 입력
K, L = map(int, input().split())

result, number = goodOrBad(K, L)
if result == "GOOD":
    print("GOOD")
else:
    print(f"BAD {number}")
