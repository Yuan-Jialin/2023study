#author:袁佳林
def main():
    N = 100010
    n = int(input())
    num = list(map(int, input().split()))
    cnt = [0 for i in range(N)]

    j, res = 0, 0
    for i in range(n):
        cnt[num[i]] += 1

        while cnt[num[i]] > 1:
            cnt[num[j]] -= 1
            j += 1

        res = max(res, i - j + 1)

    print(res)
if __name__ == "__main__":
    main()

