//
// Created by 袁佳林 on 2023/3/5.
//
#include "iostream"

using namespace std;
//引用的本质实际上就是指针常量
//1.不要返回局部变量的引用
int &test1() {
   static int a = 10;
    return a;
}
//2.函数的调用可以作为左值
int &test2() {
    static int a = 10;
    return a;
}

int main() {
    int &ref=test1();
    cout<<"??"<<ref<<endl;

    int &pp=test2();

    test2()=20;
    cout<<"!"<<pp<<endl;

    const int &a=10;
    //这段代码如果直接看是不合规的
    //没报错是因为,编译帮我们对代码进行了修改
    //将代码改为
    //int temp;
    // int &a=temp;
    
}