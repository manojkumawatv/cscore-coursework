#include <iostream>
using namespace std;

#define MAX 15

/* Stack */
static char stack[MAX];
static int top = -1;
void push(char c);
char pop();
char peek();
int empty();

int evaluatePostfix(string exp)
{
	

	// Scan all characters one by one
	for (int i = 0; i < exp.size(); ++i) {
		
		// If the scanned character is an operand 
		// (number here), push it to the stack.
		if (isdigit(exp[i]))
			push(exp[i] - '0');

		// If the scanned character is an operator, 
		// pop two elements from stack apply the operator
		else {
			int val1 = peek();
			pop();
			int val2 = peek();
			pop();
			switch (exp[i]) {
			case '+':
				push(val2 + val1);
				break;
			case '-':
				push(val2 - val1);
				break;
			case '*':
				push(val2 * val1);
				break;
			case '/':
				push(val2 / val1);
				break;
			}
		}
	}
	return peek();
}

int main()
{
	string exp;
    cout<<"Enter postfix expression: ";
    cin>>exp;
	cout << "postfix evaluation: " << evaluatePostfix(exp);
	return 0;
}

/* Stack operations */

void push(char c)
{
    if (top == MAX - 1) // Overflow
    {
        cout << "Stack overflow!" << endl;
        return;
    }
    stack[++top] = c;
}

char pop()
{
    if (top == -1) // Underflow
        return '\0';
    return stack[top--];
}

char peek()
{
    if (top == -1)
        return '\0';
    return stack[top];
}

int empty()
{
    return top == -1;
}