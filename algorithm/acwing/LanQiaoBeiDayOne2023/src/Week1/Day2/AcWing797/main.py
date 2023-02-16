#author：袁佳林
n, q = map(int, input().split())
a = [0] * (n + 10)
b = [0] * (n + 10)

# a的0位是0，第1位到第n位是输入的数, 第n+1位起往后都是0
a = [0] + list(map(int, input().split())) + a[n + 1:]
for i in range(1, n + 1):
    b[i] = a[i] - a[i - 1] # 初始化b数组

while q:
    l, r, c = map(int, input().split())
    b[l] += c
    b[r + 1] -= c
    q -= 1
# 此时所有操作都用b数组记录下来了，a数组实际上已经没用了。

# 把没用的a数组整体全部用b数组更新一次
for i in range(1, n + 1):
    a[i] = a[i-1] + b[i]
    print(a[i], end = ' ')

