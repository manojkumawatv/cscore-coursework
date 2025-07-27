#include <iostream>
using namespace std;
int main()
{
    int n;
    long int f=1;
    cout<<"Enter a positive integer: ";
    cin>>n;
    if (n<0) {
        cout<<"Error! factorial of a Negative Number doesn't exist";
    } 
    else {
        for (int i=1; i<=n; ++i)
        {
            f*=i;
        }
      cout<<"Factorial "<<n<<"! = "<<f;
    }
    return 0;
}
// Mathematical logic for f is n! = 1 * 2 * 3 * ...*n