#author:袁佳林
def main():
    n = int(input())
    a = [0 for i in range(n+10)]
    for i in range(1,n+1):
        x = int(input())
        a[i] += x
        a[i+1] -= x

    pos, neg = 0, 0
    for i in range(2, n+1):
        if a[i] > 0:
            pos += a[i]
        else:
            neg -= a[i]

    min_cnt = min(pos, neg) + abs(pos - neg)
    res = abs(pos - neg) + 1

    print(min_cnt)
    print(res)
if __name__ == "__main__":
    main()
