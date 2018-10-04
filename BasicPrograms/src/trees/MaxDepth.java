package trees;

public class MaxDepth {

	int maxDepth(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int ldepth = maxDepth(node.left);
			int rdepth = maxDepth(node.right);

			if (ldepth > rdepth) {
				return ldepth + 1;
			} else {
				return rdepth + 1;
			}
		}

	}

	public static void main(String[] args) {
		MaxDepth maxDepth = new MaxDepth();
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
		System.out.println(maxDepth.maxDepth(rootNode));
	}

}
