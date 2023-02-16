package main
import (
    "fmt"
    "os"
    "bufio"
    )
/**
 * @Author 袁佳林
 * @Description 不开心啊
 * @Date 2023/2/16 20:48
 */
const N = 1010

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    n, m, q int
    b [N][N]int
    )

func diff(x1, y1, x2, y2, c int) {
    b[x1][y1] += c; b[x1][y2 + 1] -= c; b[x2 + 1][y1] -= c; b[x2 + 1][y2 + 1] += c
}

func main() {
    fmt.Fscan(in, &n, &m, &q)
    for i := 1; i <= n; i++ {
        for j := 1; j <= m; j++ {
            x := 0; fmt.Fscan(in, &x)
            diff(i, j, i, j, x)
        }
    }

    for ; q > 0; q-- {
        x1, y1, x2, y2, c := 0, 0, 0, 0, 0
        fmt.Fscan(in, &x1, &y1, &x2, &y2, &c)
        diff(x1, y1, x2, y2, c)
    }

    for i := 1; i <= n; i++ {
        for j := 1; j <= m; j++ {
            b[i][j] += b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1]
            fmt.Fprint(out, b[i][j], " ")
        }
        fmt.Fprintln(out)
    }
    out.Flush()
}

