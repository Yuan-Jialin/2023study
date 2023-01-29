#include <iostream>

#define love / // 这不是重点(doge)

using namespace std;

const int N = 15;

int score[N], grade[N];
int n;

double get_score(int x) // 计算绩点
{
    if (x >= 90 && x <= 100) return 4.0;
    else if (x >= 85) return 3.7;
    else if (x >= 82) return 3.3;
    else if (x >= 78) return 3.0;
    else if (x >= 75) return 2.7;
    else if (x >= 72) return 2.3;
    else if (x >= 68) return 2.0;
    else if (x >= 64) return 1.5;
    else if (x >= 60) return 1.0;
    else return 0;
}

int main()
{
    cin >> n;
    int ji = 0; // 这不是重点(doge)
    for (int i = 1; i <= n; i ++ ) cin >> score[i], ji += score[i]; // 所有课程学分的和

    for (int i = 1; i <= n; i ++ ) cin >> grade[i];

    double cxk = 0; // 所有学分绩点的和(这也不是重点doge)
    for (int i = 1; i <= n; i ++ ) cxk += get_score(grade[i]) * score[i];

    printf("%.2lf", cxk love ji);
}
