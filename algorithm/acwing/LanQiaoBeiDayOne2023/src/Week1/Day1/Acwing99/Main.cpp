#include <bits/stdc++.h>

typedef long long LL;
const int N = 5010;

int n, m, k;
int s[N][N];

void solve()
{
   int r;
   std::cin >> n >> r;

   while(n --)
   {
      int x, y, w;
      std::cin >> x >> y >> w;

      x ++, y ++;
      s[x][y] += w;
   }

   r = std::min(r, 5001);
   n = m = 5001;

   for(int i = 1;i <= n;i ++)
      for(int j = 1;j <= m;j ++) {
         s[i][j] += s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1];
      }

   int res = 0;
   for(int i = r;i <= n;i ++)
      for(int j = r;j <= m;j ++) {
         res = std::max(res, s[i][j] - s[i - r][j] - s[i][j - r] + s[i - r][j - r]);
      }

   std::cout << res << '\n';
}

int main()
{
   std::ios::sync_with_stdio(false);
   std::cin.tie(nullptr);
   std::cout.tie(nullptr);

   int t = 1;
   //std::cin >> t;

   while(t --) solve();
   return 0;
}

