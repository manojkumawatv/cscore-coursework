#include<iostream>
#define SIZE 10
using namespace std;
void swap(int* a, int* b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
void bubbleSort(int arr[], int n) {
    int temp;
    //i=step
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++ ){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
        }
    }
}

int main() {
    int arr[SIZE];
    cout<<"Enter the elements: ";
    for(int i=0; i<SIZE; i++){
        cin>>arr[i];
    }

    bubbleSort(arr, SIZE);
    //display
    cout<<"Sorted Array: Ascending order"<<endl;
    for(int i=0; i<SIZE; i++){
        cout<<arr[i]<<", ";
    }
    return 0;
}