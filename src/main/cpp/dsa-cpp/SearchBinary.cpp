//binary search
#include<iostream>
using namespace std;

int search(int key, int arr[], int n){
    int lb=0, ub=n-1;

    while(lb<=ub){
        int mid=(lb+ub)/2;
        if(key==arr[mid]) return mid;
        if(key>arr[mid]) lb=mid+1;
        else ub=mid-1;
    };
    return -1;
}
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9,11};
    int n=10;
    
    int result = search(7, arr, n);
    (result!=-1)? cout<<"Element found at index "<<result:cout<<"Element Not found";

    return 0;
}