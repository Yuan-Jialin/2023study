package main
import (
    "fmt"
    "os"
    "bufio"
    )
/**
 * @Author 袁佳林
 * @Description
 * @Date 2020/9/9 22:14
 */
const N = 6

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)


    dx = [N]int{-1, 0, 1, 0, 0}
    dy = [N]int{0, 1, 0, -1, 0}

    g, backup [N][N]byte
    )

func turn(x, y int) {
    for i := 0; i < 5; i++ {
        a := x + dx[i]; b := y + dy[i]
        if a < 0 || a >= 5 || b < 0 || b >= 5 {continue}
        g[a][b] ^= 1
    }
}

func min(i, j int) int {if i < j {return i}; return j}

func main() {
    defer out.Flush()
    n := 0
    fmt.Fscan(in, &n)
    for ; n > 0; n-- {
        for i := 0; i < 5; i++ {
            var s string
            fmt.Fscan(in, &s)
            cur := []byte(s)
            for j := 0; j < 5; j++ {g[i][j] = cur[j]}
        }

        res := 10
        for op := 0; op < 32; op++ {
            copy(backup[:][:], g[:][:])
            step := 0

            for i := 0; i < 5; i++ {
                if op >> i & 1 == 1 {
                    step++
                    turn(0, i)
                }
            }

            for i := 0; i < 4; i++ {
                for j := 0; j < 5; j++ {
                    if g[i][j] == '0' {
                        step++
                        turn(i + 1, j)
                    }
                }
            }

            dark := false
            for j := 0; j < 5; j++ {
                if g[4][j] == '0' {
                    dark = true; break
                }
            }
            if !dark {res = min(res, step)}
            copy(g[:][:], backup[:][:])
        }

        if res > 6 {res = -1}
        fmt.Fprintln(out, res)
    }
}

