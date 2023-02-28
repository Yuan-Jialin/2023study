
#author:袁佳林
N = 100010
p, size = [0] * N, [0] * N

def find(x):
    if(x != p[x]): p[x] = find(p[x])
    return p[x]

def main():
    n, m = list(map(int, input().split(" ")))
    for i in range(n + 1):
        p[i] = i
        size[i] = 1

    while(m):
        m -= 1
        s = list(input().split(" "))
        opt = s[0]
        if(opt == 'C'):
            a = int(s[1])
            b = int(s[2])
            if(find(a) == find(b)): continue
            size[find(b)] += size[find(a)]
            p[find(a)] = find(b)
        elif(opt == 'Q1'):
            a = int(s[1])
            b = int(s[2])
            if(find(a) == find(b)): print("Yes")
            else: print("No")
        else:
            a = int(s[1])
            print(size[find(a)]);


main();

