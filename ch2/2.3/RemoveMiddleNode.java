/* 	
	Ex 2.3 
	Remove any middle node of a singly linked list, given only access to that node 
*/

public class RemoveMiddleNode{
	static class Node{
		Node next;
		int data;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
		public void printList(Node head){
			Node current = head;
			while(current != null){
				System.out.print(current.data + "->");
				current = current.next;
			}
			System.out.println();	
		}

		public Node insertHead(Node head, int data){
			Node newNode = new Node(data);
			newNode.data = data;
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		public void deleteMiddle(Node middle){
			if (middle == null || middle.next == null){
				return;
			}  
			Node nextNode = middle.next;
			middle.data = nextNode.data;
			middle.next = nextNode.next;
		}
	}
			
	public static void main(String[] args){
		RemoveMiddleNode r = new RemoveMiddleNode();
		RemoveMiddleNode.Node head = new Node(0);		
		
		for(int i=1; i<10; i++){		
			head = head.insertHead(head, i);
		}
		
		head.printList(head);
		// Deleting 4th Node
		head.deleteMiddle(head.next);
		head.printList(head);
	}
}