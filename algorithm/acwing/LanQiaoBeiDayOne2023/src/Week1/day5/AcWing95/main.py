
#author:袁佳林
t, mp, dirs = int(input()), [], [(0, 0), (-1, 0), (0, -1), (1, 0), (0, 1)]
def turn(x, y):
    for i in range(5):
        xn, yn = x + dirs[i][0], y + dirs[i][1]
        if not (xn < 0 or yn < 0 or xn >= 5 or yn >= 5):
            mp[5 * xn + yn] ^= 1

for _ in range(t):
    res, mip, row = 7, [], 5
    while row:
        s = input()
        if not s:
            continue
        for i in s:
            mip.append(int(i))
        row -= 1

    for op in range(0, 32): # bin(31) 11111
        step, mp, flag = 0, mip[:], True
        for i in range(5): # 枚举第一层
            if op >> i & 1:
                step += 1
                turn(0, i)
        for i in range(0, 4): # 由前一层决定后一层
            for j in range(0, 5):
                if mp[i*5+j] == 0:
                    step += 1
                    turn(i + 1, j)
        for i in range(5): # 检验
            if mp[20+i] == 0:
                flag = False
                break
        if flag:
            res = min(res, step)
    print(-1 if res > 6 else res)

