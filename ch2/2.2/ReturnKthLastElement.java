/*
	Ex 2.2
	Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
*/

public class ReturnKthLastElement{
	static class Node{
		Node next;
		int data;
		
		public Node(int data){
			this.next = null;
			this.data = data;
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
		
		public Node returnKthLastNode(Node head, int kth){
			Node n1 = head;
			Node n2 = head;
			
			for(int i=0; n2!= null && i<kth; i++){
				n2 = n2.next;
			}
			
			while(n2 != null){
				n1 = n1.next;
				n2 = n2.next;
			}
			return n1;
		}
	}
	
	public static void main(String[] args){
		ReturnKthLastElement	 r = new ReturnKthLastElement();
		ReturnKthLastElement	.Node head = new Node(1);		
		head = head.insertHead(head, 2);
		head = head.insertHead(head, 3);
		head = head.insertHead(head, 4);
		head.printList(head);
		
		Node ans = head.returnKthLastNode(head, 4);
		System.out.println("Kth Last Node: " + ans.data);
	}
}