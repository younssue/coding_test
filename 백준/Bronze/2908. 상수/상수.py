A, B = map(str, input().split())

rev_A = A[::-1]
rev_B = B[::-1]

int_A = int(rev_A)
int_B = int(rev_B)

if(int_A > int_B):
    print(int_A)
else:
    print(int_B)