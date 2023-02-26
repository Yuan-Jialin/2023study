# 绘制育龄妇女的受教育程度分布饼图
import matplotlib.pyplot as plt

# ********** Begin *********#
# 总数据
Num = 46431380
# 单个数据
data = [2052380, 11315444, 20435242, 7456627, 3014264, 1972395, 185028]
# 数据标签
labels = ['none', 'primary', 'junior', 'senior', 'specialties', 'bachelor', 'master']
# 各区域颜色
colors = ['red', 'orange', 'yellow', 'green', 'purple', 'blue', 'black']
# 数据计算处理
sizes = [data[0] / Num * 100, data[1] / Num * 100, data[2] / Num * 100, data[3] / Num * 100, data[4] / Num * 100,
         data[5] / Num * 100, data[6] / Num * 100]
# 设置突出模块偏移值
expodes = (0, 0, 0.1, 0, 0, 0, 0)
# 设置绘图属性并绘图
plt.pie(sizes, explode=expodes, labels=labels, shadow=True, colors=colors)
## 用于显示为一个长宽相等的饼图
plt.axis('equal')
# 保存并显示
plt.savefig('picture/step3/fig3.png')
plt.show()
# ********** End **********#

