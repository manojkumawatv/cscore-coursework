// input & display of matrix using Multi D. array
#include <iostream>
using namespace std;
class matrix
{
public:
    // 2d Array
    int x[2][2];

public:
    void getd()
    {
        for (int i = 0; i < 2; ++i)
        {
            for (int j = 0; j < 2; ++j)
            {
                cin >> x[i][j];
            }
        }
    }
    void putd()
    {
        for (int i = 0; i < 2; ++i)
        {
            for (int j = 0; j < 2; ++j)
            {
                cout << x[i][j] << " ";
            }
            cout << endl;
        }
    }
};

int main()
{
    matrix m1, m2;
    cout << "Enter value of A Matrix: ";
    m1.getd();
    cout << "\n Enter the value of B matrix: ";
    m2.getd();

    cout << "\n Display: " << endl;
    cout << "A = \n";
    m1.putd();
    cout << "\nB = \n";
    m2.putd();

    cout << "\n\nA+B = " << endl;
    for (int i = 0; i < 2; ++i)
    {
        cout << "\t";
        for (int j = 0; j < 2; ++j)
        {
            cout << m1.x[i][j] + m2.x[i][j] << "  ";
        }
        cout << endl;
    }
    return 0;
}