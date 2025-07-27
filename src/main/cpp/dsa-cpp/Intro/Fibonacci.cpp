/*#include <iostream>
using namespace std;
int main()
{
    int n,n1,n2,nxt;
    cout<<"Program to Print Fibonacci Series:  By MK";
    cout<<"\nEnter Any Number: ";
    cin>>n;
    n1=0,n2=1,nxt=0;
    while (nxt<=n) {
    n1=n2;
    n2=nxt;
    cout<<nxt<<" ";
    nxt=n1+n2;
    }
    return 0;
}
*/

//if n is no's of terms
#include <iostream>
using namespace std;
int main()
{
    int n,n1,n2,nxt;
    cout<<"Program to Print Fibonacci Series:  By MK";
    cout<<"\nEnter no of Terms: ";
    cin>>n;
    n1=0,n2=1,nxt=0;
    for (int i=1; i<=n; ++i) {
    n1=n2, n2=nxt;
    cout<<nxt<<" ";
    nxt=n1+n2;
    }
    return 0;
}