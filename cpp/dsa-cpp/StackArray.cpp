#include <iostream>
#define MAX 5
using namespace std;
int stack[MAX], top = -1;

void push(int value)
{
	if (top == MAX - 1) {
		cout << "Stack is overflow";
	}
	else {
		top++;
		stack[top] = value;
	}
}

void pop()
{
	if (top == -1)
	{
		cout << "Stack is underflow, Can't Pop";
	}
	else
	{
		cout << "Element poped: " << stack[top];
		top--;
	}
}
void peek(){
	if(top!=-1){
    	cout<<"Peek element is: "<<stack[top];
	}
}

void display()
{
	cout << "Stack:" << endl;
	if (top == -1)
	{
		cout << "Stack is empty";
	}
	for (int i = top; i >= 0; i--)
	{
		cout << stack[i] << endl;
	}
}
int main()
{
	cout << __TIME__ << "\t\t\tDeveloped by ManoJ Kumawat\t\t" << __DATE__ << endl;
	cout << "Stack implementation using array" << endl;
	cout << "Choices are:-";
	cout << "\n1 for push";
	cout << "\n2 for pull";
	cout << "\n3 for display";
	cout << "\n4 for peek";
	cout << "\n0 to exit\n\n";
	int op, value;

	do
	{
		cout << "\nEnter the choice: ";
		cin >> op;
		switch (op)
		{
		case 1:
			cout << "Enter the element: ";
			cin >> value;
			push(value);
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
		case 4:
			peek();
			break;
		case 0:
			cout << "---Exited---\nPress Enter";
			break;
		default:
			cout << "Invalide choice";
		};
	} while (op != 0);
	return 0;
}