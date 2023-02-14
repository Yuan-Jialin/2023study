n,k=map(int,input().split())
s=[0]
for i in range(1,n+1):
    s.append(int(input()))
    s[i]+=s[i-1]
cnt=[0]*k;cnt[0]+=1
res=0
for i in range(1,n+1):
    res+=cnt[s[i]%k]
    cnt[s[i]%k]+=1
print(res)