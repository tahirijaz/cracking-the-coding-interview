public class SumList{
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
		
		public static void main(String[] args){
			
		}
	}
}