package main

import (
    "bufio"
    "fmt"
    "os"
)

const N int = 1010

func main() {
    in := bufio.NewReader(os.Stdin)
    out := bufio.NewWriter(os.Stdout)
    defer out.Flush()

    var n, m, q int
    var w [N][N]int
    fmt.Fscan(in, &n, &m, &q)
    for i := 1; i <= n; i++ {
        for j := 1; j <= m; j++ {
            fmt.Fscan(in, &w[i][j])
            w[i][j] += w[i-1][j] + w[i][j-1] - w[i-1][j-1]
        }
    }
    for i := 1; i <= q; i++ {
        var x1, y1, x2, y2 int
        fmt.Fscan(in, &x1, &y1, &x2, &y2)
        res := w[x2][y2] - w[x1-1][y2] - w[x2][y1-1] + w[x1-1][y1-1]
        fmt.Fprintln(out, res)
    }
}

