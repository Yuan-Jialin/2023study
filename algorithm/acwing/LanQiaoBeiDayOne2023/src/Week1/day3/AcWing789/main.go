
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/18 15:22
 */
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

    a [N]int
    n, m int
    )

func find(x int) {
    l, r := 0, n
    for l < r {
        mid := l + (r - l) >> 1
        if a[mid] >= x {
            r = mid
        } else {
            l = mid + 1
        }
    }
    r1 := r

    l, r = -1, n - 1
    for l < r {
        mid := l + (r - l) + 1 >> 1
        if a[mid] <= x {
            l = mid
        } else {
            r = mid - 1
        }
    }
    r2 := r

    if r1 > r2 {r1, r2 = -1, -1}
    fmt.Fprintf(out, "%d %d\n", r1, r2)
    out.Flush()
}

func main() {
    fmt.Fscan(in, &n, &m)
    for i := 0; i < n; i++ {fmt.Fscan(in, &a[i])}
    for ; m > 0; m-- {
        x := 0
        fmt.Fscan(in, &x)
        find(x)
    }
}

