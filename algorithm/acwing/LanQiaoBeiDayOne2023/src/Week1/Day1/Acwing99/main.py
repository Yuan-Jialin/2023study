n,r=map(int,input().split())
N=0
a=[[0]*5010 for i in range(5010)]
for i in range(n):
    x,y,w=map(int,input().split())
    N=max(N,x+1,y+1)
    a[x+1][y+1]+=w
res=0
for i in range(1,N+1):
    for j in range(1,N+1):
        a[i][j]+=a[i-1][j]+a[i][j-1]-a[i-1][j-1]
if r<N:
    for i in range(r,N+1):
        for j in range(r,N+1):
            res=max(res,a[i][j]-a[i-r][j]-a[i][j-r]+a[i-r][j-r])
else:
    res=a[N][N]
print(res)

