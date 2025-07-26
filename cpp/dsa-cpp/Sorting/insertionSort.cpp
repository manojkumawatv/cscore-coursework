#include<iostream>
#define SIZE 10
using namespace std;
void swap(int* a, int* b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
void insertionSort(int arr[], int n){
    for(int i=1; i<n; i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j]){
            arr[j + 1] = arr[j];  //Array shifting
            --j;
        }
        arr[j+1]=current;
    }
}

int main() {
    int arr[SIZE];
    cout<<"Enter the elements: ";
    for(int i=0; i<SIZE; i++){
        cin>>arr[i];
    }

    insertionSort(arr, SIZE);
    //display
    cout<<"Sorted Array: Ascending order"<<endl;
    for(int i=0; i<SIZE; i++){
        cout<<arr[i]<<", ";
    }
    return 0;
}