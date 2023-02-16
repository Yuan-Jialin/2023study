//author：袁佳林
package main
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
    b [N]int
    )

func diff(l, r, c int) {
    b[l] += c; b[r + 1] -= c
}

func main() {
    fmt.Fscan(in, &n, &m)
    for i := 1; i <= n; i++ {
        x := 0
        fmt.Fscan(in, &x)
        diff(i, i, x)
    }

    for; m > 0; m-- {
        x, y, c := 0, 0, 0
        fmt.Fscan(in, &x, &y, &c)
        diff(x, y, c)
    }
    for i := 1; i <= n; i++ {
        b[i] += b[i - 1]
        fmt.Fprint(out, b[i], " ")
    }
    out.Flush()
}

