#include<vector>
#include "stack"

using namespace std;


class Solution {
public:
    //剑指offer：29
    vector<int> spiralOrder(vector<vector<int>> &matrix) {
        vector<int> ans;
        if (matrix.empty())
            return ans;
        int dir[4][2] = {{0,  1},
                         {1,  0},
                         {0,  -1},
                         {-1, 0}};
        int minx = 0, maxx = matrix.size() - 1;
        int miny = 0, maxy = matrix[0].size() - 1;
        int x = 0, y = 0;
        int all = matrix.size() * matrix[0].size();
        int ji = 0;
        int i = 0;
        while (ji < all) {

            while (x <= maxx && x >= minx && y <= maxy && y >= miny) {
                ans.push_back(matrix[x][y]);
                ji++;
                y += dir[i][1];
                x += dir[i][0];
            }
            y -= dir[i][1];
            x -= dir[i][0];
            y += dir[(i + 1) % 4][1];
            x += dir[(i + 1) % 4][0];
            if (i == 0)
                minx++;
            if (i == 1)
                maxy--;
            if (i == 2)
                maxx--;
            if (i == 3)
                miny++;
            i = (i + 1) % 4;

        }
        return ans;

    }

    //
    // Created by 袁佳林 on 2023/3/5.
    //   leetcode:剑指offer：31
    bool validateStackSequences(vector<int> &pushed, vector<int> &popped) {
        stack<int> v;
        int j = 0;
        for (int i = 0; i < pushed.size(); i++) {
            v.push(pushed[i]);
            while (!v.empty() && v.top() == popped[j]) {
                v.pop();
                j++;
            }
        }
        if (j == popped.size())
            return true;
        else
            return false;

    }

};