package trees;

public class DistanceKfromRoot {

	TreeNode node;

	void printKDistant(TreeNode node, int k) {
		if (node == null)
			return;
		if (k == 0) {
			System.out.print(node.key + " ");
			return;
		} else {
			printKDistant(node.left, k - 1);
			printKDistant(node.right, k - 1);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(8);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		DistanceKfromRoot dis = new DistanceKfromRoot();
		dis.printKDistant(root, 2);

	}
}
