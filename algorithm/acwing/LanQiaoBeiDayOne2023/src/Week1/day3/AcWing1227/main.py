#author: 袁佳林
def main():
    n, k = map(int, input().split())
    h, w = [0]*(n+10), [0]*(n+10)

    l, r = 1, 0

    for i in range(1,n+1):
        h[i], w[i] = map(int, input().split())
        r = max(max(h[i], w[i]), r)

    while l < r:
        mid = l + r + 1 >> 1
        cnt = 0

        for i in range(1,n+1):
            cnt += (h[i] // mid) * (w[i] // mid)

        if cnt >= k:
            l = mid
        else:
            r = mid - 1

    print(l)

if __name__ == "__main__":
    main()

