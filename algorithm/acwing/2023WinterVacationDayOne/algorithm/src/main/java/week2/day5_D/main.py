import math
size = int((input().strip())[1])
length = 1189
width = 841
for i in range(size):
    length, width = width, math.floor(length/2)
print(length)
print(width)