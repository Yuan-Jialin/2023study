package main


/**
 * @Author 袁佳林
 * @Description 今天被甩了 草
 * @Date 2023/2/28 20:35
 */
import (
    "fmt"
    "os"
    "bufio"
    )

const N = 100010

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    n, m int
    fa, cnt [N]int
    )

func find(x int) int {
    if fa[x] != x {fa[x] = find(fa[x])}; return fa[x]
}

func main() {
    defer out.Flush()
    for i := 0; i < N; i++ {fa[i] = i; cnt[i] = 1}
    for fmt.Fscan(in, &n, &m); m > 0; m-- {
        var ops string
        a, b := 0, 0
        fmt.Fscan(in, &ops)
        switch ops{
            case "C":
                fmt.Fscan(in, &a, &b)
                pa, pb := find(a), find(b)
                if pa != pb {fa[pa] = pb; cnt[pb] += cnt[pa]}
            case "Q1":
                fmt.Fscan(in, &a, &b)
                pa, pb := find(a), find(b)
                if pa == pb {
                    fmt.Fprintln(out, "Yes")
                } else {
                    fmt.Fprintln(out, "No")
                }
            case "Q2":
                fmt.Fscan(in, &a)
                fmt.Fprintln(out, cnt[find(a)])
        }
    }
}

