#include <iostream>
using namespace std;
const int N=1e5+10;
bool q[N];
int n,k;
int x,y;
int res;

int main(){
    q[0]=true;
    cin >>n>>k;
    while(k--){
        cin >>x>>y;
        if(!q[y])  res++;
        q[x]=true;
    }
    cout <<res<<endl;
    return 0;
}
