for i in range(int(input())):
    n,a=int(input()),list(map(int,input().split()))
    arr,interval=[0]*n,[]
    for j in range(n):
        if a[j]:
            interval.append([max(0,j-a[j]+1),j])
    interval.sort(key=lambda x:x[0])
    if interval:
        p=1
        for j in range(1,len(interval)):
            if interval[j][0]>interval[p-1][1]+1:
                interval[p]=interval[j]
                p+=1
            else:
                interval[p-1][1]=max(interval[p-1][1],interval[j][1])
        for j in range(p):
            for k in range(interval[j][0],interval[j][1]+1):
                arr[k]=1
    for a in arr:
        print(a,end=' ')
    print()

