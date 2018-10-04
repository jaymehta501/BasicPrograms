package trees;

class BinaryTree {

	int data;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int data) {
		this.data = data;
	}
}

public class TopViewOfBinaryTree {
	BinaryTree temp = null;

	public static void main(String[] args) {
		BinaryTree binTree1 = new BinaryTree(3);
		BinaryTree binTree2 = new BinaryTree(5);
		BinaryTree binTree3 = new BinaryTree(2);
		BinaryTree binTree4 = new BinaryTree(1);
		BinaryTree binTree5 = new BinaryTree(4);
		BinaryTree binTree6 = new BinaryTree(9);
		BinaryTree binTree7 = new BinaryTree(6);
		BinaryTree binTree8 = new BinaryTree(7);
		BinaryTree binTree9 = new BinaryTree(8);
		binTree1.left = binTree2;
		binTree1.right = binTree3;
		binTree2.left = binTree4;
		binTree2.right = binTree5;
		binTree4.right = binTree6;
		binTree3.left = binTree7;
		binTree3.right = binTree8;
		binTree7.left = binTree9;
		TopViewOfBinaryTree topView = new TopViewOfBinaryTree();
		topView.printTopView(binTree1);
	}

	public void printTopView(BinaryTree node) {

		if (temp == null) {
			temp = node;
		}
		if (node == null) {
			return;
		}
		printTopView(node.left);
		System.out.print(node.data + " ");
		if (node == temp) {
			// Avoid duplicate prints
			node = node.right;
			System.out.print(node.data + " ");
			printTopView(node.right);
		}
	}

}
