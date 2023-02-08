N=100005
h=[-1]*(2*N)
e=[0]*(10*N)
ne=[0]*(10*N)
idx=0
def add(a,b):
    global idx
    e[idx]=b
    ne[idx]=h[a]
    h[a]=idx
    idx+=1
n=int(input())
for i in range(2,n+1):
    x=int(input())
    add(i,x)
    add(x,i)
stk=[1]
v=[0]*N
res=[0]*N
while len(stk):
    t=stk[-1]
    if v[t]==0:#第一次遇见，向下递归
        v[t]=1
        i=h[t]
        while i!=-1:
            j=e[i]
            if v[j]==0:
                stk.append(j)
            i=ne[i]
    else :#第二次遇见，计算答案
        stk.pop()
        v[t]=2#代表已经计算完成
        cnt=0
        maxn=0
        i=h[t]
        while i!=-1:
            j=e[i]
            if v[j]==2:
                cnt+=1
                maxn=max(maxn,res[j])
            i=ne[i]
        res[t]=cnt+maxn
print(res[1])

