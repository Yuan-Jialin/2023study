package main
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:19
 */
import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)

//N const
const N int = 2e4 + 10
var p [N]int
var out = bufio.NewWriter(os.Stdout)
var sc = bufio.NewScanner(os.Stdin)
func main() {
    sc.Split(bufio.ScanWords)
    n, m := scanInt(), scanInt()
    for i := 1; i <= n; i++ {
        p[i] = i;
    }
    for ; m > 0; m-- {
        a, b := scanInt(), scanInt()
        a, b = find(a), find(b)
        if a != b {
            p[b] = a
        }
    }
    for q := scanInt(); q > 0; q-- {
        c, d := scanInt(), scanInt()
        if find(c) == find(d) {
            fmt.Fprintln(out, "Yes")
        } else {
            fmt.Fprintln(out, "No")
        }
    }
    fmt.Fprint(out)
    out.Flush()
}

func find(x int) int {
    for x != p[x] {
        p[x] = p[p[x]]
        x = p[x]
    }
    return x
}

func scanInt() int {
    sc.Scan()
    a, _ := strconv.Atoi(sc.Text())
    return a
}

