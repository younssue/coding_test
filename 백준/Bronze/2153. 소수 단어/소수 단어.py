words = input()

def is_prime_number(n):
    if n == 1:
        return "It is a prime word."

    for i in range(2, n):
        if n % i == 0:
            return "It is not a prime word."
    return "It is a prime word."

total = 0
for word in words:
    if word.islower():
        # ord('a') = 97
        total += ord(word) - 96
    else:
        # ord('A') = 65
        total += ord(word) - 38

print(is_prime_number(total))