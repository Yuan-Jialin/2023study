import numpy as np
import matplotlib.pyplot as plt
import random

# 准备数据
x_data = [f"20{i}年" for i in range(16, 21)]
y_data = [random.randint(100, 300) for i in range(6)]

# 正确显示中文和负号
plt.rcParams["font.sans-serif"] = ["SimHei"]
plt.rcParams["axes.unicode_minus"] = False

# 画图，plt.bar()可以画柱状图
for i in range(len(x_data)):
	plt.bar(x_data[i], y_data[i])
# 设置图片名称
plt.title("销量分析")
# 设置x轴标签名
plt.xlabel("年份")
# 设置y轴标签名
plt.ylabel("销量")
# 显示
plt.show()

