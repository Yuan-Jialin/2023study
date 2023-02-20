package main
/**
 * @Author 袁佳林
 * @Description unhappy
 * @Date 2023/2/20 11:22
 */
import (
    "bufio"
    "fmt"
    "os"
)

var (
    in = bufio.NewReader(os.Stdin)
    N  = 5000005
)

func main() {
    C := make([]int, N)
    D := make([]int, N)
    var n int
    _, err := fmt.Fscan(in, &n)
    if err != nil {
        return
    }
    for i := range C {
        C[i] = -1
    }
    for i := 0; i*i <= n; i++ {
        for j := i; j*j+i*i <= n; j++ {
            v := i*i + j*j
            if C[v] == -1 {
                C[v] = i
                D[v] = j
            }
        }
    }
    for i := 0; i*i <= n; i++ {
        for j := i; j*j+i*i <= n; j++ {
            v := n - i*i - j*j
            if C[v] != -1 {
                fmt.Println(i, j, C[v], D[v])
                return
            }
        }
    }
}

