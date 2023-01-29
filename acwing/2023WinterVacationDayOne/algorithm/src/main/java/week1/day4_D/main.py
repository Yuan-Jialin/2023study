def get_score(x): # 计算绩点
    if x >= 90:
        return 4.0
    elif x >= 85:
        return 3.7
    elif x >= 82:
        return 3.3
    elif x >= 78:
        return 3.0
    elif x >= 75:
        return 2.7
    elif x >= 72:
        return 2.3
    elif x >= 68:
        return 2.0
    elif x >= 64:
        return 1.5
    elif x >= 60:
        return 1.0
    else:
        return 0

n = int(input())
score = list(map(int, input().split()))
grade = list(map(int, input().split()))

ji = 0 # 不是重点！(doge)
for i in range(n):
    ji += score[i] # 所有课程学分的和

cxk = 0 # 不是重点！不是重点！不是重点！(doge)
for i in range(n):
    cxk += get_score(grade[i]) * score[i] # 所有学分绩点的和

print("%.2f" %(cxk / ji)) # 蒟蒻实在不会 Python 里的宏定义QwQ

