#include <iostream>
#include <cstring>
#include <algorithm>
#include <unordered_set>

using namespace std;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/18 15:03
 */

int n;
string str;
unordered_set<string> S;

bool check(int mid)
{
    S.clear();
    for (int i = 0; i + mid - 1 < n; i ++ )
    {
        string s = str.substr(i, mid);
        if (S.count(s)) return false;
        S.insert(s);
    }

    return true;
}

int main()
{
    cin >> n >> str;

    int l = 1, r = n;
    while (l < r)
    {
        int mid = l + r >> 1;
        if (check(mid)) r = mid;
        else l = mid + 1;
    }

    cout << r << endl;

    return 0;
}

