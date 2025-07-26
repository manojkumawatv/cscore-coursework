#include<iostream>
using namespace std;
//by recursive method
int fact(int n){
    if(n<=1){
        return 1;
    } else {
        return n*fact(n-1);
    }
}
int main(){
    int n;
    cout<<"Enter a positive number: ";
    cin>>n;
    cout<<"Factorial "<<n<<"! = "<<fact(n);
    return 0;
}