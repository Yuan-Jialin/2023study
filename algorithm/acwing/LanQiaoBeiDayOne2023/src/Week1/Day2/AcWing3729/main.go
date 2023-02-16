package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)
//N const
const N int = 2e5 + 10
var sc = bufio.NewScanner(os.Stdin)
func solve() {
    n := scanInt()
    v := []int{}
    var d [N]int
    for i := 1; i <= n; i++ {
        x := scanInt()
        v = append(v, 0)
        d[max(0, len(v) - x)]++
        d[len(v)]--
    }
    for i := 1; i <= n; i++ {
        d[i] += d[i - 1]
    }
    for i := 0; i < n; i++ {
        if d[i] > 0 {
            fmt.Print(1, " ")
        } else {
            fmt.Print(0, " ")
        }
    }
}

func main() {
    sc.Split(bufio.ScanWords)
    sc.Buffer([]byte{}, 1024*1024)
    for t := scanInt(); t > 0; t-- {
        solve()
        fmt.Println()
    }
}

func scanInt() int {
    sc.Scan()
    a, _ := strconv.Atoi(sc.Text())
    return a
}
