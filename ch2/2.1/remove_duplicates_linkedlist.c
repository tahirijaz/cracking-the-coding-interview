#include <stdio.h>
#include <stdlib.h>

/*
	Ex 2.1
	Write code to remove duplicates from an unsorted linked list.
	How would you solve this problem if a temporary buffer is not allowed?
*/

typedef struct Node{
	int data;
	struct Node * next;
} node;


node * initNode(int data){
	node * newNode = malloc(sizeof(node));
	newNode->data = data;
	newNode->next = NULL;
	return newNode;
}

void insertNode(node ** head, int data){
	node * newNode = initNode(data);
	if ((*head) == NULL){	
		*head = newNode;
	}else{
		newNode->next = *head;
		*head = newNode;	
	}
}

void printList(node *head){
	for(node *ptr = head; ptr; ptr = ptr->next){
		fprintf(stderr, "%d->", ptr->data);
	}
	printf("\n");
}

void removeDuplicates(node **head){
	if((*head)->next == NULL)
		return;

	for(node *ptr = (*head)->next; ptr; ptr = ptr->next){
		for(node *trailer = *head; trailer->next!=NULL && trailer != ptr; trailer = trailer->next){
			if((*head)->data == ptr->data){
				node * tmp = *head;
				*head = (*head)->next;
				free(tmp);
			}
			else if (trailer->data == ptr->data){
				node *tmp = trailer->next;
				trailer->next = trailer->next->next;
				free(tmp);
			}
		}
	}	
}

int main(int argc, char *argv[]) {
	node * head = NULL;
	insertNode(&head, 4);
	insertNode(&head, 1);
	insertNode(&head, 1);
	insertNode(&head, 4);
	
	fprintf(stderr, "Before:\t");
	printList(head);
	removeDuplicates(&head);
	fprintf(stderr, "After:\t");
	printList(head);
}