package trees;

/**
 * 1) If node is NULL then return 0. 2) Else If left and right child nodes are
 * NULL return 1. 3) Else recursively calculate leaf count of the tree using
 * below formula. Leaf count of a tree = Leaf count of left subtree + Leaf count
 * of right subtree
 * 
 * 
 *
 */
public class LeafCount {

	int getLeafCount(TreeNode node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1;
		} else {
			return getLeafCount(node.left) + getLeafCount(node.right);
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
		LeafCount lc = new LeafCount();
		System.out.println(lc.getLeafCount(rootNode));
	}

}
