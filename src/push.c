
#include<stdio.h>

int stack[5];
int top=-1;
void push(int);
void pop();
void display();
void exit();

int main()
{
    int ch;
    int n1;
    while(1)
    {
        printf("\nEnter choice");
        printf("\n1.Push");
        printf("\n2.Pop");
        printf("\n3.Display");
        printf("\n4.Exit");
        printf("\nEnter choice:");
        scanf("%d",&ch);

        switch (ch)
        {
            case 1:
                printf("\nenter element to be pushed intothe stack:");
                scanf("%d",&n1);
                push(n1);
                break;

            case 2:
            {
                pop();
            }    
            case 3:
            {
                display();
                break;
            }
            case 4;
            {
                exit();
                break;
            }
            default:
            {
                printf("Invalid Input");
                break;
            }
        }
    }
}

//push method
void push(int x)
{
    if(top==4)
    {
        printf("\nStack is full.");
    }
    else
    {
        top++;
        stack[top]=x;
    }
}

//start of pop
void pop()
{
    if(top==-1)
    {
        printf("\nStack is Empty.");
    }
    else
    {
        printf("\n%d Element is popped", stack[top--]);
    }
}

//start of display
void display()
{
    if(top==-1)
    {
        printf("Stack is empty.");
    }
    else
    {
        printf("Stack elements are:\n");
        for(int i=top; i>0; i--)
        printf("%d", stack[i]);
    }
}