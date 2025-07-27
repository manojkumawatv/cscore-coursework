#include<iostream>
#define SIZE 5
using namespace std;
class Queue{
    int items[SIZE], rear, front;
    public:
    Queue(){
        front=-1;
        rear=-1;
    }
    bool isFull(){
        if(rear==SIZE-1){
            return true;
        }
        return false;
    }
    bool isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    void enQueue(int element){
        if (isFull()){
            cout<<"Queue is full";
        } else {
            if (front==-1) front=0;
            rear++;
            items[rear]=element;
            cout<<"Inserted element "<<element<<endl;
        }
    }
    int deQueue(){
        int element;
        if (isEmpty()) {
            cout<<"Queue is empty"<<endl;
            return -1;
        } else {
            element=items[front];
            if(front>=rear) {
                rear=-1;
                front=-1;
            } else {
                ++front;
            }
        }
        cout<<"Deleted -> "<<element;
        return element;
    }
    void display(){
        if (isEmpty()){
            cout<<"Queue is Empty"<<endl;
        } else {
            for(int i=front; i<=rear; i++){
                cout<<items[i]<<", ";
            }
        }
    }
};

int main(){
    Queue q1;
    cout << __TIME__ << "\t\t\tDeveloped by ManoJ Kumawat\t\t" << __DATE__ << endl;
	cout << "Queue implementation using array" << endl;
	cout << "Choices are:-";
	cout << "\n1 for enqueue";
	cout << "\n2 for dequeue";
	cout << "\n3 for display";
	cout << "\n0 to exit\n\n";
	int op, element;

	do
	{
		cout << "\nEnter the choice: ";
		cin >> op;
		switch (op)
		{
		case 1:
			cout << "Enter the element: ";
			cin >> element;
			q1.enQueue(element);
			break;
		case 2:
			q1.deQueue();
			break;
		case 3:
			q1.display();
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