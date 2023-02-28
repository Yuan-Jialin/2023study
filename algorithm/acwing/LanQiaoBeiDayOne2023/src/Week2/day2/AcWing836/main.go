package main
import (
    "fmt"
    "os"
    "bufio"
    )

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:56
 */
const N = 100010

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    fa [N]int
    )

func find(x int) int {
    if fa[x] != x {fa[x] = find(fa[x])}
    return fa[x]
}

func main() {
    defer out.Flush()
    for i := 0; i < N; i++ {fa[i] = i}
    n, m := 0, 0
    fmt.Fscan(in, &n, &m)
    for ; m > 0; m-- {
        var op string
        var a, b int
        fmt.Fscan(in, &op, &a, &b)
        pa, pb := find(a), find(b)
        switch op{
            case "M":
                fa[pa] = pb
            case "Q":
                if pa == pb {
                    fmt.Fprintln(out, "Yes")
                } else {
                    fmt.Fprintln(out, "No")
                }
        }
    }
}

