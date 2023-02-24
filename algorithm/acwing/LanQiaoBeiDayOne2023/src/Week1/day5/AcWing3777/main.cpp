#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 21:03
 */
using namespace std;

int n;
string str;

void update(char& c)
{
    if (c == 'W') c = 'B';
    else c = 'W';
}

bool check(char c)
{
    vector<int> res;
    string s = str;
    for (int i = 0; i + 1 < n; i ++ )
        if (s[i] != c)
        {
            update(s[i]);
            update(s[i + 1]);
            res.push_back(i);
        }

    if (s.back() != c) return false;

    cout << res.size() << endl;
    for (int x: res) cout << x + 1 << ' ';
    if (res.size()) cout << endl;

    return true;
}

int main()
{
    int T;
    cin >> T;
    while (T -- )
    {
        cin >> n >> str;
        if (!check('B') && !check('W')) puts("-1");
    }

    return 0;
}

