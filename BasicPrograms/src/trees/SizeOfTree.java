package trees;

/**
 * Size of a tree = Size of left subtree + 1 + Size of right subtree
 * 
 * 
 *
 */
public class SizeOfTree {

	int size(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return (size(root.left) + 1 + size(root.right));
		}
	}

	public static void main(String[] args) {
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

		SizeOfTree sizeTree = new SizeOfTree();
		System.out.println(sizeTree.size(rootNode));
	}

}
