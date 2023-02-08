package main

import (
    "bufio"
    . "fmt"
    "io"
    "os"
)

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}

func dfs(u int, g map[int][]int) int {
    maxv := 0
    cnt := 0
    for _, num := range g[u] {
        cnt++
        maxv = max(maxv, dfs(num, g))
    }
    return cnt + maxv
}

func solve(_r io.Reader, _w io.Writer) {
    in := bufio.NewReader(_r)
    out := bufio.NewWriter(_w)
    defer out.Flush()
    n := 0
    g := make(map[int][]int)
    x := 0
    Fscan(in, &n)
    for i := 2; i <= n; i++ {
        Fscan(in, &x)
        g[x] = append(g[x], i)
    }
    Fprintln(out, dfs(1, g))
}

func main() {
    solve(os.Stdin, os.Stdout)
}

