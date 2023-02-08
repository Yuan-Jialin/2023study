n=int(input())
k=int(input())
a=[i for i in range(1,n+1)]
a.sort(key=lambda x:sum(list(map(int,str(x)))))
print(a[k-1])