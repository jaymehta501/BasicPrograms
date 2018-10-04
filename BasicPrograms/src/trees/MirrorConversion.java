package trees;

public class MirrorConversion {

	TreeNode mirror(TreeNode root) {
		if (root == null) {
			return root;
		}
		TreeNode left = mirror(root.left);
		TreeNode right = mirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}

	void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
	}

	public static void main(String[] args) {
		MirrorConversion mc = new MirrorConversion();
		TreeNode rootNode = new TreeNode(1);
		TreeNode rootNode1 = new TreeNode(2);
		TreeNode rootNode2 = new TreeNode(3);
		TreeNode rootNode3 = new TreeNode(4);
		TreeNode rootNode4 = new TreeNode(5);
		TreeNode rootNode5 = new TreeNode(6);
		rootNode.left = rootNode1;
		rootNode.right = rootNode2;
		rootNode1.left = rootNode3;
		rootNode1.right = rootNode4;
		rootNode2.left = rootNode5;
		rootNode2.right = rootNode5;
		mc.inOrder(rootNode);
		mc.inOrder(mc.mirror(rootNode));

	}

}
