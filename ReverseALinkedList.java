
public class ReverseALinkedList {

	public static void main(String [] args){

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
		
		System.out.println();
		
		list.reverse();
		list.print();

	}

	public static class LinkedList{

		node head;

		public LinkedList(){
			head = null;
		}

		public void add(int i){
			node newNode = new node();
			newNode.num = i;
			
			if(head == null)
				head = newNode;
			else{
				node cur = head;
				while(cur.next != null){
					cur = cur.next; 
				}

				cur.next = newNode;

			}

		}
        
        //need at least 3 nodes to do the swap
		public void reverse(){
			if(head == null || head.next == null)
				return;
			node pre = null;
			
			while(head != null){
				node temp = head.next;
				head.next = pre;
				pre = head;
				head = temp;
			}
			head = pre;
		}

		public void print(){
			node cur = head;
			while(cur != null){
				System.out.print(cur.num + " ");
				cur = cur.next;
			}
		}


		public class node{
			int num;
			node next;
		}
	}


}
