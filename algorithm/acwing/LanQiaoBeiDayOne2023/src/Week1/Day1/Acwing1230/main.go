package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)
//N const
const N int = 1e5 + 10
var s [N]int
var res int
var sc = bufio.NewScanner(os.Stdin)
func main() {
    sc.Split(bufio.ScanWords)
    sc.Buffer([]byte{}, 1024*1024)
    n, k := scanInt(), scanInt()
    mp := map[int]int{}
    mp[0] = 1
    for i := 1; i <= n; i++ {
        s[i] = scanInt()
        s[i] += s[i - 1]
        mp[s[i]%k]++
    }
    for k, v := range mp {
        if k == 0 {
            res += v + v * (v-1)/2
        } else {
            res += v * (v-1)/2
        }
    }
    fmt.Print(res)
}


func scanInt() int {
    sc.Scan()
    a, _ := strconv.Atoi(sc.Text())
    return a
}

func max(a, b int) int {if a < b {return b}; return a}
func min(a, b int) int {if a > b {return b}; return a}
func abs(a int) int {if a > 0 {return a}; return -a}

