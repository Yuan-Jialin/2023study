import matplotlib.pyplot as plt
from pylab import *  # 支持中文

mpl.rcParams['font.sans-serif'] = ['SimHei']

names = ['2017/12/31', '2018/12/31', '2019/12/31', '2017/12/31', '2017/12/31']
x = range(len(names))
y = [13.95, 14.05, 6.434, 386.1, 2.833]
y1 = [31.01, 38.03, 49.79, 59.61, 42.01]
y2 = [23.46, 38.04, 22.34, 27.18, 32.77]
# plt.plot(x, y, 'ro-')
# plt.plot(x, y1, 'bo-')
# pl.xlim(-1, 11) # 限定横轴的范围
plt.ylim(0,400) # 限定纵轴的范围
plt.plot(x, y, marker='o', mec='r', mfc='w', label=u'信立泰')
plt.plot(x, y1, marker='*', ms=10, label=u'恒瑞医药')
plt.plot(x, y2, marker='.', ms=10, label=u'复星医药')
plt.legend()  # 让图例生效
plt.xticks(x, names, rotation=45)
plt.margins(0)
plt.subplots_adjust(bottom=0.15)
plt.xlabel(u"时间")  # X轴标签
plt.ylabel("亿元")  # Y轴标签
plt.title("扣非净利润")  # 标题

plt.show()
