package main
import (
    "fmt"
    "bufio"
    "os"
)
var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)
    s string 
)
func main() {
    defer out.Flush()
    fmt.Fscan(in, &s)
    x := int(s[1] - '0')
    a, b := 1189, 841
    for x != 0  {
        a = a / 2
        if b > a {
            a, b = b, a
        }
        x --
    }
    fmt.Fprintln(out, a)
    fmt.Fprintln(out, b)
}

