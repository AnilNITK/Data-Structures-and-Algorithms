package newproject;

import java.util.*;
public class size_binary_tree {
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
	
	 public static int size(treenode root) {
			 int left_count=root.left==null?0:size(root.left);
			 int right_count=root.right==null?0:size(root.right);
			 return 1 + left_count + right_count; 
	 }
	 
public  static void main(String args[]) {
	size_binary_tree bi=new size_binary_tree();
	bi.root=new treenode(10);
	treenode second=new treenode(12);
	treenode third=new treenode(14);
	treenode fourth=new treenode(8);
	treenode five=new treenode(1);
	root.left=second;
	root.right=third;
	second.left=fourth;
	third.left=five;
	System.out.println(size(root));
	
}
}
