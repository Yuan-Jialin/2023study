package main

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:15
 */
import (
    "bufio"
    "fmt"
    "math"
    "os"
)

//N const
var out = bufio.NewWriter(os.Stdout)
var in = bufio.NewReader(os.Stdin)
var t, n, a, b int
func main() {
    defer out.Flush()
    for fmt.Fscan(in, &t); t > 0; t-- {
        fmt.Fscan(in, &n, &a, &b)
        x1, y1 := calc(n, a - 1)
        x2, y2 := calc(n, b - 1)
        dx, dy := float64(x2 - x1), float64(y2 - y1)
        var res float64 = math.Sqrt(dx*dx + dy*dy)*10
        fmt.Fprintf(out, "%.0f", res)
        fmt.Fprintln(out)
    }
    fmt.Fprint(out)
}

func calc(n, m int) (int, int) {
    if n == 0 {
        return 0, 0
    }
    len, cnt := 1<<(n-1), 1<<(2*n-2)
    x, y := calc(n-1, m%cnt)
    z := m/cnt
    if z == 0 {
        return y, x
    }
    if z == 1 {
        return x, y + len
    }
    if z == 2 {
        return x + len, y + len
    }
    return 2*len-1-y, len-1-x
}
