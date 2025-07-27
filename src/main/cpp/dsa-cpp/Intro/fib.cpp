#include<iostream>
using namespace std;
int fibonacci(int n){
    if(n<=1){
        return 0;
    }
    return fibonacci(n-1)+fibonacci(n-2);
}
int main(){
    int n;
    cout<<"Enter the number: ";
    cin>>n;
    cout<<fibonacci(n);
    return 0;
}
//The Fibonacci sequence - series where the next term is the sum of the prev two terms. The first two terms of . is 0 followed by 1.