package main
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 14:57
 */
import (
    "fmt"
    "os"
    "bufio"
    )

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    a []int
    s [100010]int
    )

func max(i, j int) int {if i > j {return i}; return j}

func main() {
    n := 0
    fmt.Fscan(in, &n)
    a = make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Fscan(in, &a[i])
    }

    res := 0
    for i, j := 0, 0; i < n; i++ {
        s[a[i]]++
        for j < i && s[a[i]] > 1 {s[a[j]]--; j++}

        res = max(res, i - j + 1)
    }
    fmt.Fprint(out, res)
    out.Flush()
}

