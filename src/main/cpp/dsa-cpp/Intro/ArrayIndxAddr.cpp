#include<iostream>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5};
    int index;
    cout<<"Base Address is: "<<&arr[0];
    cout<<"\nEnter the index: ";
    cin>>index;
    int* addr;
    addr=&arr[0]+index;
    cout<<"Address at index "<<index<<" is: "<<addr;
    return 0;
}