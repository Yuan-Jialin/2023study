n, m = map(int, input().split())
w = []
for i in range(n):
    a, b = map(int, input().split())
    w.append([a, b])

def check(x):
    cnt, cnt1, S = 0, 0, 0
    for i in range(n):
        if(w[i][0] < x):
            continue
        l = (w[i][0] - x) // w[i][1]
        if w[i][0] - l * w[i][1] == x: 
            cnt1 += 1
            l -= 1

        S, cnt = S + w[i][0] * (l + 1) - l * (l + 1) * w[i][1] // 2, cnt + (l + 1);

    if cnt <= m:
        S += min(m - cnt, cnt1) * x;

        global res
        res = max(res, S)

        return True;
    return False

l, r, res = 0, 1e6, 0
while r > l:
    mid = (l + r) // 2
    if check(mid):
        r = mid
    else:
        l = mid + 1

print(int(res))

