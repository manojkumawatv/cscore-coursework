#include<iostream>
using namespace std;
//Seraching Technique
int search(int arr[], int size, int key){
    for(int i=0; i<size; i++){
        if (arr[i]==key){
            return i;
        }
    }
    return -1;
}
int main(){
    int data[]={37,38,72,75};
    int n=sizeof(data)/sizeof(data[0]);

    int result = search(data, n, 72);
    //shortcut if
    (result==-1)?cout<<"Element not found":cout<<"Element found at index "<<result;
    return 0; 
}