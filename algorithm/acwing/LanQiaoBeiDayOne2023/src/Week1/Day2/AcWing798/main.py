
#author：袁佳林
def insert(matrix,x1,y1,x2,y2,c):
    matrix[x1][y1] += c
    matrix[x2+1][y1] -= c
    matrix[x1][y2+1] -= c
    matrix[x2+1][y2+1] += c

def main():
    n, m, q = map(int, input().split())
    matrix = [[0 for i in range(m+10)] for j in range(n+10)]

    for i in range(1,n+1):
        row = list(map(int, input().split()))
        for j in range(m):
            insert(matrix,i,j+1,i,j+1,row[j])

    for i in range(q):
        x1, y1, x2, y2, c = map(int, input().split())
        insert(matrix, x1, y1, x2, y2, c)

    for i in range(1, n+1):
        for j in range(1, m+1):
            matrix[i][j] += matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1]
            print(matrix[i][j],end=" ")
        print()

if __name__ == "__main__":
    main()


