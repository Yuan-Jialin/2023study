
import (
    "fmt"
    "os"
    "bufio"
    )
 /**
  * @Author 袁佳林
  * @Description
  * @Date 2023/2/24 19:47
  */

var in = bufio.NewReader(os.Stdin)

func main() {
    n, m := 0, 0
    fmt.Fscan(in, &n, &m)
    a, b := make([]int, n), make([]int, m)
    for i := 0; i < n; i++ {fmt.Fscan(in, &a[i])}
    for j := 0; j < m; j++ {fmt.Fscan(in, &b[j])}

    i, j := 0, 0
    for i < n && j < m {
        if a[i] == b[j] {i++}
        j++
    }

    if  i == n {
        fmt.Print("Yes")
    } else {
        fmt.Print("No")
    }

}
