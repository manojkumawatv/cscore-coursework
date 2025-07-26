#include <iostream>
#define SIZE 5
using namespace std;
char stack[SIZE];
int top = -1;
void push(char val)
{
  if (top >=SIZE- 1)
  {
    cout << "Stack is overflow ";
    return;
  }
  else
  {
    top++;
    stack[top] = val;
  }
}

char pop()
{
  top--;
  return stack[top + 1];
}

void display()
{
  if (top >= 0)
  {
    cout << "Stack elements are : ";
    for (int i = top; i >= 0; i--)
    {
      cout << stack[i] << ", ";
    }
  }
  else
  {
    cout << "Stack is empty " << endl;
  }
}

int main()
{
  int ch;
  char val[SIZE];
  cout << "Enter value to be pushed: ";
  for (int i = 0; i < SIZE; i++)
  {
    cin >> val[i];
    push(val[i]);
  }
  cout<<"Reverse is : ";
  for(int i=top; i>=0; i--){
    cout<<pop();
  }
  return 0;
}
