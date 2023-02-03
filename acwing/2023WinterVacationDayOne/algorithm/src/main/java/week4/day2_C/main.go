package main

import (
    "fmt"
    "os"
    "bufio"
    "strings"
    "strconv"
)

var (
    in = bufio.NewScanner(os.Stdin)
    bs = make([]byte, 20 * 1024 * 1024)

    readLine = func() string {
        in.Scan()
        return in.Text()
    }
    readLineNums = func(start int) []int {
        strs := strings.Split(readLine(), " ")
        nums := make([]int, len(strs) + start)
        for i, v := range strs {
            nums[i + start], _ = strconv.Atoi(v)
        }
        return nums
    }
)

const (
    N = 1010
    M = 55
)

func main() {
    in.Buffer(bs, len(bs))

    var n, L, S int
    fmt.Scan(&n, &L, &S)

    tree := [N][N]int{}
    b := [M][M]int{}

    for i := 0; i < n; i ++ {
        t := readLineNums(0)
        tree[i][0], tree[i][1] = t[0], t[1]
    }

    var tc int
    for i := S; i >= 0; i -- {
        t := readLineNums(0)
        for j := 0; j <= S; j ++ {
            b[i][j] = t[j]
            tc += b[i][j]
        }
    }

    var res int
    for i := 0; i < n; i ++ {
        sx, sy := tree[i][0], tree[i][1]
        if sx + S > L || sy + S > L {
            continue
        }
        cnt := 0
        for j := 0; j < n; j ++ {
            x, y := tree[j][0], tree[j][1]
            if x >= sx && x <= sx + S && y >= sy && y <= sy + S {
                if b[x - sx][y - sy] == 1 {
                    cnt ++
                } else {
                    cnt = -1e8
                }
            }
        }

        if cnt == tc {
            res ++
        }
    }

    fmt.Printf("%d", res)
}

