#include<iostream>
using namespace std;
int main() {
  int size=0, k=0;

  int sparseMatrix[4][5]={
  {0,0,1,2,0},
  {2,3,0,4,0},
  {0,1,2,0,0},
  {0,0,0,0,7}
  };

  // Calculate size of compact matrix
  for(int i=0; i<4; i++){
	 for(int j=0; j<5; j++){
		  if(sparseMatrix[i][j]!=0){
			 size++;
		  }
	 }
  }

  int compactMatrix[3][size];
  for(int i=0; i<4; i++){
	 for(int j=0; j<5; j++){
	   if(sparseMatrix[i][j]!=0){
		 compactMatrix[0][k]=i;
		 compactMatrix[1][k]=j;
		 compactMatrix[2][k]=sparseMatrix[i][j];
		 k++;
	   }
	 }
  }
  //Display
  for(int i=0; i<3; i++){
    for(int j=0; j<size; j++){
      cout<<compactMatrix[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
}