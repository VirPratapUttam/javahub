package datastructure.list;



public class ReverseGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=createList();
		head=reverse(head, 3);
		while(head!=null)
		{
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
	
	public static ListNode createList() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		l6.setNext(l7);
		l7.setNext(l8);
		l8.setNext(l9);
		// l9.setNext(l4);
		return l1;
	}

	
	public static ListNode reverse(ListNode head, int k) {
		ListNode temp = head;
		ListNode prevTemp = temp;
		ListNode out = null;
		ListNode newListNode = null;
		if (head != null)
		{
		
			temp = head;
			int i = 0;
			while (temp.getNext()!=null) {
				if(i == k)
					break;
				prevTemp = temp;
				temp = temp.getNext();
				i++;
			}
			prevTemp.setNext(null);
			newListNode = reverse(head);
			out = merge(newListNode,temp);
				
		}
		return out;
	}

	public static ListNode reverse(ListNode ListNode) {
		if (ListNode == null)
			return null;
		else if (ListNode.getNext()== null)
			return ListNode;
		else {

			ListNode second = ListNode.getNext();
			ListNode.setNext(null);
			ListNode reverseRest = reverse(second);
			second.setNext(ListNode);
			return reverseRest;

		}

	}
	


	private static ListNode merge(ListNode ListNode1, ListNode ListNode2) { // 3,2,1 -- 4,5
		ListNode temp = ListNode1;
		if(temp.getNext() == null)
		{
			temp.setNext(ListNode2);
			return temp;
		}
		else {
			merge(temp.getNext(), ListNode2);
		}
		return temp;
		
	}

}
