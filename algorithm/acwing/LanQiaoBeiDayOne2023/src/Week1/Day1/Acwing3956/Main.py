n=int(input())
a=list(map(int,input().split()))
s=sum(a)
if s%3:
    print(0)
else:
    p=ans=pre=0
    for i in range(n-1):
        pre+=a[i]
        if pre==s*2//3:
            ans+=p
        if pre==s//3:
            p+=1
    print(ans)
