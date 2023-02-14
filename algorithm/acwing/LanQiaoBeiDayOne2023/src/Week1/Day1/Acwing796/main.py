n,m,q=map(int,input().split())
a=[[0] for i in range(n+1)]
a[0]=[0]*(m+1)
for i in range(1,n+1):
    a[i]+=list(map(int,input().split()))
for i in range(1,n+1):
    for j in range(1,m+1):
        a[i][j]+=a[i-1][j]+a[i][j-1]-a[i-1][j-1]
for _ in range(q):
    x1,y1,x2,y2=map(int,input().split())
    print(a[x2][y2]+a[x1-1][y1-1]-a[x2][y1-1]-a[x1-1][y2])

