package main

import (
    "bufio"
    . "fmt"
    "io"
    "math"
    "os"
)

const N = 1010

func solve(_r io.Reader, _w io.Writer) {
    in := bufio.NewReader(_r)
    out := bufio.NewWriter(_w)
    defer out.Flush()
    var a, b int
    Fscan(in, &a, &b)
    qmi := func(a, b int) int {
        res := 1
        for b > 0{
            if b&1 == 1 {
                if int(math.Pow(10, 9)) / a < res{
                    return -1
                }
                res *= a
            }
            a *= a
            b >>= 1

        }
        return res
    }
    Fprintln(out, qmi(a, b))
}

func main() {
    solve(os.Stdin, os.Stdout)
}

