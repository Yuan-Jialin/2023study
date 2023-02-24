#author:袁佳林
change = {'B':'W','W':'B'}
for _ in range(int(input())):
    N = int(input())
    line = list(input()[:N])
    if 'W' not in line or 'B' not in line:
        print('0')
    else:
        result = []
        for i in range(N-1):
            if line[i] == 'B':
                line[i], line[i+1] = 'W', change[line[i+1]]
                result.append(i+1)
        if line[-1] == 'W':
            print(f"{len(result)}\n{' '.join(map(str,result))}")
        else:
            for i in range(N-1):
                if line[i] == 'W':
                    line[i], line[i+1] = 'B', change[line[i+1]]
                    result.append(i+1)
            if line[-1] == 'B':
                print(f"{len(result)}\n{' '.join(map(str,result))}")
            else:
                print('-1')

