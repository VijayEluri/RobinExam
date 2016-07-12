package com.robin.exam;

public class LinkNode {
	int value;
	LinkNode next;

	LinkNode(int value){
		this.value = value;
	}

	LinkNode(int... args){
		if (args.length == 0) {
			return;
		}
		LinkNode p = null;
		for (int v : args) {
			if (p == null) {
				this.value = v;
				p = this;
			}
			else {
				LinkNode newnode = new LinkNode(v);
				p.next = newnode;
				p = newnode;
			}
		}
	}

	@Override
	public String toString(){
		LinkNode p = this;
		StringBuilder sb = new StringBuilder();
		do{
			if (p != this) {
				sb.append("->");
			}
			sb.append(p.value);
			if (p.next == null) break;
			p = p.next;
		}while(p!=null);

		return sb.toString();
	}
}
