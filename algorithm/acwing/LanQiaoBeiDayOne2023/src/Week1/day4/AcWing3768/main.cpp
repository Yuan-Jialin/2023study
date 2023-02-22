#include <iostream>
#include <cstring>
#include <algorithm>
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/22 21:16
 */

using namespace std;

int n;

int main()
{
    int n;
    string str;
    cin >> n >> str;

    int res = 0;
    for (int i = 0; i < n; i ++ )
        if (str[i] == 'x')
        {
            int j = i + 1;
            while (j < n && str[j] == 'x') j ++ ;
            res += max(j - i - 2, 0);
            i = j - 1;
        }

    cout << res << endl;
    return 0;
}

