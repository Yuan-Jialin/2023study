#author:袁佳林
ori = list(input())
tar = list(input())
res = 0
for i in range(len(ori) - 1):
    if ori[i] != tar[i]:
        res += 1
        ori[i + 1] = '*' if ori[i + 1] == 'o' else 'o'
print(res)