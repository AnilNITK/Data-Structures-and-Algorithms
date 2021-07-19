package newproject;

import java.util.*;
public class max_BT {
	 static treenode root;
	 static class treenode{
		treenode left;
		treenode right;
		int data;
		treenode(int data){
			this.data=data;
			left=right=null;
		}
	}
	public void preorder(treenode root){
		if(root==null) {
			return;
		}
		System.out.print(root.data+"--->");
		preorder(root.left);
		preorder(root.right);

	}
	public   void iterative() {
		if(root==null) {
			return;
		}
		Stack<treenode> stac =new Stack<>();
		stac.push(root);
		while(!stac.isEmpty()) {
			treenode temp=stac.pop();
			System.out.print(temp.data+"-->");
			if(temp.right!=null) {
				stac.push(temp.right);
			}
			if(temp.left!=null) {
				stac.push(temp.left);
			}
		}
					
				
			
		}
	 public void inorder(treenode root) {
		 if(root==null) {
				return;
			}
		 inorder(root.left);
		 
		 System.out.print(root.data+"--->");
		 inorder(root.right);

		 
	 }
	 public void inorder_iterative(treenode root) {
		 if(root==null) {
			 return;
		 }
		 Stack<treenode> stack = new Stack<>();
		  treenode temp=root;
		 while(!stack.isEmpty()|| temp!=null) {
			 if(temp!=null) {
				 stack.push(temp);
				 temp=temp.left;	 
			 }
			 else {
				 temp=stack.pop();
				 System.out.print(temp.data+"--->");
				 temp=temp.right;
			 }
			 
		 }
		 
		 
	 }
	 public void rec_postorder(treenode root) {
		 if(root==null) {
			 return;
		 }
		 rec_postorder(root.left);
		 rec_postorder(root.right);
		 System.out.print(root.data+"-->");
		 
		 
	 }
	 public void level_order( treenode root) {
		 if(root==null) {
			 return;
		 }
		 
		 Queue<treenode> q=new LinkedList();
		 treenode temp=root;
		 q.offer(temp);
		 while(!q.isEmpty()) {
			 temp=q.poll();
			 System.out.print(temp.data+"-->");
			 if(temp.left!=null) {
				 q.offer(temp.left);
			 }
			 if(temp.right!=null) {
				 q.offer(temp.right);
			 }
		 }
		
		 
	 }
	 public int max(treenode root) {
		 int max_value = Integer.MIN_VALUE;;
		 if(root!=null) {
			 int left=max(root.left);
			 int right=max(root.right);
			 if(left>right) {
				 max_value=left;
			 }
			 else {
				 max_value=right;
			 }
			 if(root.data>max_value) {
				 max_value=root.data;
			 }
		 }
		 return max_value;
		 
	 }



public  static void main(String args[]) {
	max_BT bi=new max_BT();
	bi.root=new treenode(10);
	treenode second=new treenode(12);
	treenode third=new treenode(14);
	treenode fourth=new treenode(8);
	treenode five=new treenode(1);
	root.left=second;
	root.right=third;
	second.left=fourth;
	third.left=five;
	/*bi.preorder(root);
	bi.iterative();
	bi.inorder(root);
	bi.inorder_iterative(root);
	bi.rec_postorder(root);
	bi.level_order(root);*/
	System.out.print(bi.max(root));
	
}
}
