package main

import (
    "bufio"
    "fmt"
    "os"
)

const N int = 5010

func main() {
    in := bufio.NewReader(os.Stdin)
    out := bufio.NewWriter(os.Stdout)
    defer out.Flush()

    var n, R int
    var g [N][N]int
    fmt.Fscan(in, &n, &R)
    if R > 5001 {
        R = 5001
    }

    for i := 0; i < n; i ++ {
        var x, y, w int
        fmt.Fscan(in, &x, &y, &w)
        x ++
        y ++
        g[x][y] += w
    }
    for i := 1; i <= 5001; i ++ {
        for j := 1; j <= 5001; j ++ {
            g[i][j] += g[i - 1][j] + g[i][j - 1] - g[i - 1][j - 1];
        }
    }
    res := 0
    for i := R; i <= 5001; i ++ {
        for j := R; j <= 5001; j ++ {
            now := g[i][j] - g[i - R][j] - g[i][j - R] + g[i - R][j - R]
            if now > res {
                res = now
            }
        }
    }
    fmt.Fprint(out, res)
}

