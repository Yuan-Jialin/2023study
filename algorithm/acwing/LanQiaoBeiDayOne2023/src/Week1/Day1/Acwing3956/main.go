package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)

//N const
const N int = 1e5 + 10
var sum [N]int
var res int
var sc = bufio.NewScanner(os.Stdin)
func main() {
    sc.Split(bufio.ScanWords)
    sc.Buffer([]byte{}, 1024*1024)
    n := scanInt()
    for i := 1; i <= n; i++ {
        sum[i] = scanInt()
        sum[i] += sum[i - 1]
    }
    if sum[n]%3 != 0 {
        fmt.Print(0)
        return
    }
    avg := sum[n]/3
    for i, cnt := 3, 0; i <= n; i++ {
        if sum[i - 2] == avg {
            cnt++
        }
        if sum[n] - sum[i - 1] == avg {
            res += cnt
        }
    }
    fmt.Print(res)
}


func scanInt() int {
    sc.Scan()
    a, _ := strconv.Atoi(sc.Text())
    return a
}

