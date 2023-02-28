#author: 袁佳林
from sys import stdin

def find(x):
    if p[x] != x:
        p[x] = find(p[x])
    return p[x]

def main():
    n,m =map(int,input().split())
    for i in range(m):
        op, a, b = stdin.readline().split()
        a,b = int(a), int(b)
        if op == "M":
            if find(a) != find(b):
                p[find(a)] = find(b)
        elif op == "Q":
            if find(a) == find(b):
                print("Yes")
            else:
                print("No")

if __name__ == "__main__":
    N = 100010
    p = [i for i in range(N)]
    main()
