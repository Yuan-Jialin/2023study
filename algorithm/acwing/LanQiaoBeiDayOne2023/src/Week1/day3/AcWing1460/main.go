package main
import (
    "fmt"
    "os"
    "bufio"
    )
/**
 * @Author 袁佳林
 * @Description common
 * @Date 2023/2/18 15:03
 */
var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    n int
    s string
    )

func check(x int) bool {
    st := map[string]bool{}
    for i := 0; i + x <= n; i++ {
        if st[s[i : i + x]] {
            return false
        }
        st[s[i : i + x]] = true
    }
    return true
}

func main() {
    defer out.Flush()
    fmt.Fscan(in, &n, &s)

    l, r := 1, n
    for l < r {
        mid := (l + r - 1) >> 1
        if check(mid) {
            r = mid
        } else {
            l = mid + 1
        }
    }
    fmt.Fprint(out, r)
}

