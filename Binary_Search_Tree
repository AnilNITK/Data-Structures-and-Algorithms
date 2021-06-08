

public class binarys {
	public  treenode root;
	public class treenode{
		int data;
		treenode left;
		treenode right;
		 public treenode(int data) {
			this.data=data;
			
			
		}
	}
		public void insert(int value) {
			root = insert( root, value);
			System.out.print(root.data);
			
		}
		public treenode insert(treenode root,int value) {
			if(root==null) {
				root=new treenode(value);
				return root;
			}
			if(value<root.data) {
				root.left=insert(root.left,value);
			}
			else {
				root.right=insert(root.right,value);
			}
			return root;
		}
		public void inorder() {
			inorder(root);
		}
		public void inorder(treenode root) {
			if(root==null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data+"-->");
			inorder(root.right);
		}
		
		public static void main(String args[]) {
			BST bst=new BST();
			bst.insert(12);
			bst.insert(1);
			bst.insert(15);
			bst.insert(18);
		
			bst.inorder();
			
			
			
		}
	
	

}


