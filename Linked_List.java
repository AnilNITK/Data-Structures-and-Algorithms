
public class linked {
	node head;
	 static class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			next=null;
		}
	 }
	public void display() {
		node current=head;
		while(current!=null) {
			System.out.print(current.data+" ---->");
			current=current.next;

	}
		}
	public void atfirst(int value) {
		node newnode=new node(value);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
			
		}
		
	}
	public void atend(int value) {
		node newnode=new node(value);
		if(head==null) {
			head=newnode;
		}
		else {
			node current=head;
			while(current.next!=null) {
				current=current.next;
			}
		current.next=newnode;
		}
		
	}

public static void main(String arg[]) {
	linked s11=new linked();
	s11.head=new node(13);
	node newnode2=new node(12);
	node newnode3=new node(178);
	node newnode4=new node(18);
	node newnode5=new node(5);
	
	s11.head.next=newnode2;
	newnode2.next=newnode3;
	newnode3.next=newnode4;
	newnode4.next=newnode5;
	s11.atfirst(11);
	s11.atend(100);
	s11.display();
	}


}
