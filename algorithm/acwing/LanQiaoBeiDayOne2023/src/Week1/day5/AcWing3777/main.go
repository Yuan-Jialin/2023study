package main

import (
    "bufio"
    "fmt"
    "os"
)
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 21:03
 */
//N const
var n, m, t int
var s string
var chs []byte
var out = bufio.NewWriter(os.Stdout)
var in = bufio.NewReader(os.Stdin)
func solve() {
    fmt.Fscan(in, &n, &s)
    chs = []byte(s)
    for i := 0; i < n; i++ {
        if chs[i] == 'W' {
            chs[i] = 1
        } else {
            chs[i] = 0
        }
    }
    one, zero := 0, 0
    for i := 0; i < n; i++ {
        if chs[i] == 0 {
            zero++
        } else {
            one++
        }
    }
    if zero%2 == 1 && one%2 == 1 {
        fmt.Fprintln(out, -1)
        return
    }
    if one%2 == 0 {
        work(0)
    } else {
        work(1)
    }
}

func work(c byte) {
    res := []int{}
    for i := 0; i < n - 1; i++ {
        if chs[i] != c {
            res = append(res, i + 1)
            chs[i] ^= 1
            chs[i + 1] ^= 1
        }
    }
    fmt.Fprintln(out, len(res))
    for _, v := range res {
        fmt.Fprintf(out, "%d ", v)
    }
    if len(res) != 0 {
        fmt.Fprintln(out)
    }
}

func main() {
    defer out.Flush()
    for fmt.Fscan(in, &t); t > 0; t-- {
        solve()
    }
}

