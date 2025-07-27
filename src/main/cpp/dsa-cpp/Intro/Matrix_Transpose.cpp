#include<iostream>
using namespace std;
int main(){
  int transpose[4][3];
  int matrix[3][4]=
  {
   {3,4,5,6},
   {1,2,3,4},
   {9,8,7,6}
  };
  cout<<"Transpose of Matrix "<<endl;
  for(int i=0; i<4; i++){
	 for(int j=0; j<3; j++) {
	   transpose[i][j]=matrix[j][i];
	   cout<<transpose[i][j]<<" ";
	 }
	 cout<<endl;
  }
  return 0;
}








