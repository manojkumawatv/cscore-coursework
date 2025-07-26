#include <iostream>
using namespace std;

#define MAX 100

/* Stack */
static char stack[MAX];
static int top = -1;
void push(char c);
char pop();
char peek();
int empty();

/* Converts infix to postfix and stores it in postfix */
void infixToPostfix(char *infix, char *postfix);
/* Returns precedence */
int prec(char c);

int main()
{
    char s[MAX], t[MAX];
    cout << "Enter the infix expression: ";
    cin >> s; // Example: A+B*(C+D-E/F*X+T)^U
    infixToPostfix(s, t);
    cout << "Postfix expression: " << t << endl; // Example: ABCD+EFX*/-T+U^*+
    return 0;
}

/* Infix to postfix conversion */
void infixToPostfix(char *infix, char *postfix)
{
    int j = 0; // Index for postfix
    for (int i = 0; infix[i] != '\0'; i++)
    {
        char c = infix[i];

        // If c is an operand, append it to postfix
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        {
            postfix[j++] = c;
        }
        // If c is an opening bracket, push it
        else if (c == '(')
        {
            push(c);
        }
        // If c is a closing bracket, pop till '(' is found
        else if (c == ')')
        {
            while (!empty() && peek() != '(')
            {
                postfix[j++] = pop();
            }
            if (!empty() && peek() == '(')
                pop(); // Discard the '('
        }
        // If c is an operator
        else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
        {
            while (!empty() && prec(c) <= prec(peek()) && peek() != '(')
            {
                postfix[j++] = pop();
            }
            push(c);
        }
    }

    // Pop remaining operators in the stack
    while (!empty())
    {
        if (peek() == '(')
        {
            pop(); // Discard any unmatched '('
        }
        else
        {
            postfix[j++] = pop();
        }
    }

    postfix[j] = '\0'; // Null-terminate the postfix expression
}

int prec(char c)
{
    if (c == '+' || c == '-')
        return 1;
    if (c == '*' || c == '/')
        return 2;
    if (c == '^')
        return 3; // Higher precedence for ^ (right associative)
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