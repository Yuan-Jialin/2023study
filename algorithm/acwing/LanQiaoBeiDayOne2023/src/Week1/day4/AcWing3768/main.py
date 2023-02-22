# author:袁佳林
N = int(input())
line = input()[:N]

count, ctn = 0, 0
for i in range(N):
    ctn = ctn + 1 if line[i] == 'x' else 0
    if ctn >= 3:
        count += 1
print(count)