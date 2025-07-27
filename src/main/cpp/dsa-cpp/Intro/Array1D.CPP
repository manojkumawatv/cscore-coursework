#include<iostream>
#define max 10
using namespace std;
int main(){
	int arr[max], i;

	for(i=0; i<(max-1); i++){
		cout<<"Enter the Element: ";
		cin>>arr[i];
	}
	cout<<endl;
	
	for(i=0; i<max-1; i++){
		cout<<arr[i]<<endl;
	}
    return 0;
}