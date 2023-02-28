from math import sqrt
#author :袁佳林
def get(n,a):
    if n==0:
        return (0,0)
    block, leth = 1 << (2 * n - 2), 1 << (n - 1)
    (x, y), z = get(n-1, a % block), a // block
    if not z:   # z in [0, 1, 2, 3]
        return (y, x)
    elif z == 1:
        return (x, y + leth)
    elif z == 2:
        return (x + leth, y + leth)
    return (2 * leth - 1 - y, leth - 1 - x)

for _ in range(int(input())):
    n, a, b = map(int, input().split())
    x1, y1 = get(n, a-1)
    x2, y2 = get(n, b-1)
    print(f'{sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)*10:.0f}')

