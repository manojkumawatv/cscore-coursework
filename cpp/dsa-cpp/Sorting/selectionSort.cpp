#include<iostream>
#define SIZE 10
using namespace std;
void swap(int* a, int* b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

void SelectionSort(int arr[], int n){
    for(int i=0; i<n-1; i++){
        //selecting min
        int min=i;
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        //put min at correct position
        if(min!=i){
            swap(&arr[i], &arr[min]);
        }
    }
}

int main() {
    int arr[SIZE];
    cout<<"Enter the elements: ";
    for(int i=0; i<SIZE; i++){
        cin>>arr[i];
    }

    SelectionSort(arr, SIZE);
    //display
    cout<<"Sorted Array: Ascending order"<<endl;
    for(int i=0; i<SIZE; i++){
        cout<<arr[i]<<", ";
    }
    return 0;
}