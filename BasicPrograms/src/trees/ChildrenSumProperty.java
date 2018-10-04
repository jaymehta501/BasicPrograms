package trees;

public class ChildrenSumProperty {

	int isSumProperty(TreeNode node) {
		/*
		 * left_data is left child data and right_data is for right child data
		 */
		int left_data = 0, right_data = 0;

		/*
		 * If node is NULL or it's a leaf node then return true
		 */
		if (node == null || (node.left == null && node.right == null))
			return 1;
		else {
			/*
			 * If left child is not present then 0 is used as data of left child
			 */
			if (node.left != null)
				left_data = node.left.key;

			/*
			 * If right child is not present then 0 is used as data of right
			 * child
			 */
			if (node.right != null)
				right_data = node.right.key;

			/*
			 * if the node and both of its children satisfy the property return
			 * 1 else 0
			 */
			if ((node.key == left_data + right_data) && (isSumProperty(node.left) != 0) && isSumProperty(node.right) != 0)
				return 1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode(5);
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
		ChildrenSumProperty csm = new ChildrenSumProperty();
		if (csm.isSumProperty(rootNode) != 0)
			System.out.println("Given Tree Satisfies children" + "sum property");
		else {
			System.out.println("The given tree does not satisfy children" + " sum property");
		}
	}

}
