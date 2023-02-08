n,l,s=map(int,input().split())
dic=dict()
p=[0]*n
for i in range(n):
    x,y=map(int,input().split())
    p[i]=(x,y)
    dic[(x,y)]=1
g=[0]*(s+1)
cnt=0
for i in range(s,-1,-1):
    g[i]=list(map(int,input().split()))
    cnt+=sum(g[i])
res=0
for i in range(n):
    t=0
    sx,sy=p[i][0],p[i][1]
    ex,ey=sx+s,sy+s
    if ex>l or ey>l:
        continue
    for j in range(n):
        x,y=p[j][0],p[j][1]
        if x>=sx and x<=ex and y>=sy and y<=ey:
            #print(x-sx,y-sy,g[x-sx][y-sy])
            if g[x-sx][y-sy]:
                t+=1
            else :
                t=-1
                break
    if t==cnt:
        res+=1
print(res)

