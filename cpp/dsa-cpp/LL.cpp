#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next=NULL;
};

void insertAtBegin(int value, Node*& head_ref)
{
    Node *node = new Node; //initialize & allocate Memory
    node->data = value; //assign data value
    node->next = NULL; 
    cout<<"\nhead="<<(head_ref==nullptr)<<"\n";
    if(head_ref==NULL){
       head_ref=node;
    } else {
        node->next=head_ref;  //connect
        head_ref=node; //update start
    }
}
void insertAtEnd(int value, Node *head_ref)
{
    Node *node = new Node;
    node->data = value;
    Node *ptr = head_ref;
    while (ptr->next != NULL)
    {
        ptr = ptr->next;
    }; 
    //now ptr is last node
    ptr->next = node;
    node->next=NULL;
}
void insert(int value, int position, Node *head_ref){
    Node *node = new Node;
    node->data = value;
    int count=0;
    Node *ptr=head_ref;
    while (ptr!=NULL){
        ++count;
        ptr=ptr->next;
    };
    if(position==1){
        insertAtBegin(value, head_ref);
    } else if(position=count){
        insertAtEnd(value, head_ref);
    } else {
        ptr=head_ref;
        for(int i=2; i<=position; i++){
            ptr=ptr->next;
        }
        //After position
        node->next=ptr->next;
        ptr->next=node;
    }
}
void displayList(Node *head_ref)
{
    Node *ptr = new Node;
    ptr = head_ref;
    cout<<"head ref"<<(head_ref==nullptr);
    while (ptr != NULL)
    {
        cout << ptr->data << ",  ";
        ptr = ptr->next;
    };
}
int main()
{
    int value, ch;
    Node* head=NULL;
    cout<<__DATE__<<"\t Manoj Kumawat\t "<<__TIME__<<endl;
    cout<<"<---------Linked List Implementation--------->"<<endl<<endl;
    cout<<"Choices are:-";
    cout<<"\n 1 for Insert";
    cout<<"\n 2 for Delete";
    cout<<"\n 3 for Display Nodes";
    cout<<"\n 0 to exit";

    do {
        cout<<"\nEnter the choice: ";
        cin>>ch;
        int pos;
        switch(ch){
            case 1:
            cout<<"Enter the value: ";
            cin>>value;
            // cout<<"Position: ";
            // cin>>pos;
            insertAtBegin(value, head);
            break;
           case 3:
            cout<<"Display: ";
            displayList(head);
            break;
            default:
            cout<<"---Invalid Choice---\nPlz Enter correct option"<<endl;
        }
    } while(ch!=0);
    

    return 0;
}