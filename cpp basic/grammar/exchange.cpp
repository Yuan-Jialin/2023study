//
// Created by Administrator on 2023/3/5.
//
#include "stdio.h"
#include "iostream"
using namespace std;

void exchange(int a,int b)
{
    int p=a;
    a=b;
    b=p;
}
void exchange1(int* a,int* b){
    int* p=a;
    a=b;
    b=p;
}
void exchange2(int& a,int& b)
{
    int p=a;
    a=b;
    b=p;
}
int main(){

    int a=10,b=20;
    exchange(a,b);
    cout<<a<<" "<<b<<endl;
    exchange1(&a,&b);
    cout<<a<<" "<<b<<endl;
    exchange2(a,b);
    cout<<a<<" "<<b<<endl;
}