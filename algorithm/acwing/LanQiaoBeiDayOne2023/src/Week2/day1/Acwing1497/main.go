
import "fmt"

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/25 16:14
 */
const N = 40

var (
    n int
    postorder, inorder [N]int
    l, r, pos = make(map[int]int, 0), make(map[int]int, 0), make(map[int]int, N)
    )

func build(il, ir, pl, pr int) int {
    root := postorder[pr]
    k := pos[root]
    if il < k {l[root] = build(il, k - 1, pl, k - 1 - il + pl)}
    if ir > k {r[root] = build(k + 1, ir, k - 1 - il + pl + 1, pr - 1)}
    return root
}

func bfs(root int) {
    q := []int{root}
    for len(q) > 0 {
        top := q[0]; q = q[1:]
        fmt.Printf("%d ", top)
        if _, ok := l[top]; ok {q = append(q, l[top])}
        if _, ok := r[top]; ok {q = append(q, r[top])}
    }
}

func main() {
    fmt.Scan(&n)
    for i := 0; i < n; i++ {fmt.Scan(&postorder[i])}
    for i := 0; i < n; i++ {
        fmt.Scan(&inorder[i])
        pos[inorder[i]] = i
    }
    root := build(0, n - 1, 0, n - 1)
    bfs(root)
}

