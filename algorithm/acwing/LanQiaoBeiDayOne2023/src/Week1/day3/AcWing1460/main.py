
# author:袁佳林
n = int(input())         # 输入农场数
s = input().strip()      # 输入邮筒序列

def check(k):            # 定义check函数用来检查k的取值是否满足条件
    substrings = set()   # 用set存储s中所有长度为k的不同的子串
    for i in range(n-k+1):
        substrings.add(s[i:i+k])
    return len(substrings) == n-k+1  # 如果set中的元素个数为n-k+1则说明所有长度为k的子串均不相同

left, right = 1, n              # 初始时，left=1,right=n
while left < right:             # 当left < right时，循环继续
    mid = (left+right)//2       # 计算中间值mid
    if check(mid):       # 如果check(mid)返回True，则说明k=mid满足条件，应该继续往左找
        right = mid
    else:                # 如果check(mid)返回False，则说明k=mid不满足条件，应该往右找
        left = mid+1

print(left)

