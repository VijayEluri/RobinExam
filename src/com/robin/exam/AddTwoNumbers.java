package com.robin.exam;

public class AddTwoNumbers {

	public static void main(String[] args) {
		LinkNode list1 = new LinkNode(6, 3);
		LinkNode list2 = new LinkNode(5, 9);

		System.out.println(new AddTwoNumbers().addTwoNumbers(list1, list2).toString());
	}

	LinkNode addTwoNumbers(LinkNode n1, LinkNode n2){
		if (n1 == null && n2 == null)
			return null;

		LinkNode ret = new LinkNode(0);
		LinkNode p = ret;
		int carry = 0;
		while (n1 != null || n2 != null) {
			int v1 = 0;
			int v2 = 0;
			if(n1!=null){
				v1 = n1.value;
				n1 = n1.next;
			}

			if(n2!=null){
				v2 = n2.value;
				n2 = n2.next;
			}

			int v = v1+v2+carry;

			LinkNode q = new LinkNode(v%10);
			carry = v/10;
			p.next = q;
			p = q;
		}
		if (carry > 0) {
			LinkNode q = new LinkNode(carry);
			p.next = q;
		}

		return ret.next;
	}

}
