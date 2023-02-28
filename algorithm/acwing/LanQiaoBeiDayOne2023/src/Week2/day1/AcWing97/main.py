#author: 袁佳林
def qmi(a, b):

    a %= mod
    res = 1
    while b:
        if b & 1:
            res = a * res % mod
        a = a * a % mod
        b >>= 1
    return res

def sum(p, k):
    if k == 0: return 1
    if k % 2 == 0:
        return (p % mod * sum(p, k - 1) + 1) % mod
    return (1 + qmi(p, k // 2 + 1)) * sum(p, k // 2) % mod

def main():
    a, b = map(int, input().split())
    res = 1
    i = 2
    while i <= a / i:
        s = 0
        while a % i == 0:
            s += 1
            a //= i
        if s:
            res = res * sum(i, s * b) % mod
        i += 1
    if a > 1:
        res = res * sum(a, b) % mod
    if not a:
        res = 0
    print(res)

if __name__ == "__main__":
    mod = 9901
    main()

