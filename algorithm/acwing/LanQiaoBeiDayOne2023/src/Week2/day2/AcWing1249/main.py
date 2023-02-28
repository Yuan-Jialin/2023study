#author:袁佳林
def merge(x, y):#T了X﹏X
    fx = get(x)
    fy = get(y)
    fa[fx] = fy


def get(x):
    if x == fa[x]:
        return x
    fa[x] = get(fa[x])
    return fa[x]


n, m = map(int, input().split())
fa = [0] * (n + 1)
for i in range(n + 1):
    fa[i] = i
for i in range(m):
    x, y = map(int, input().split())
    merge(x, y)

q = int(input())
for i in range(q):
    x, y = map(int, input().split())
    if get(x) == get(y):
        print('Yes')
    else:
        print('No')


