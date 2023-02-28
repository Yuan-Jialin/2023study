package main
import "fmt"

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 14:49
 */
const mod = 9901

func qmi(a, b, p int) int {
    res := 1 % p
    for b > 0 {
        if b & 1 > 0 {res = res * a % p}
        a = a * a % p
        b >>= 1
    }
    return res
}

func sum(p, k int) int {
    if  k == 0 {return 1}
    if k % 2 == 0 {return (p % mod * sum(p, k - 1) + 1) % mod}
    return (1 + qmi(p, k / 2 + 1, mod)) * sum(p, k / 2) % mod
}

func main() {
    a, b := 0, 0
    fmt.Scan(&a, &b)
    res := 1
    for i := 2; i <= a; i++ {
        s := 0
        for a % i == 0 {
            s++
            a /= i
        }
        if s > 0 {res = res * sum(i, s * b) % mod}
    }
    if a == 0 {res = 0}
    fmt.Println(res)
}


