package main
import (
    "fmt"
    "os"
    "bufio"
    "strconv"
    )

const N = 100010

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewScanner(os.Stdin)
    bs = make([]byte, 20000 * 1024)

    a, b [N]int
    pos, neg, n int
    )

func max(i, j int) int {if i > j {return i}; return j}
func abs(i int) int {if i > 0 {return i}; return -i}
func scanInt() int {
    in.Scan()
    a, _ := strconv.Atoi(in.Text())
    return a
}

func main() {
    in.Buffer(bs, len(bs))
    n = scanInt()
    for i := 1; i <= n; i++ {
        a[i] = scanInt()
        b[i] = a[i] - a[i - 1]
    }

    for i := 2; i <= n; i++ {
        if b[i] > 0 {
            pos += b[i]
        } else {
            neg -= b[i]
        }
    }

    fmt.Fprintf(out, "%d\n", max(pos, neg))
    fmt.Fprintf(out, "%d\n",  abs(pos - neg) + 1)
    out.Flush()
}
