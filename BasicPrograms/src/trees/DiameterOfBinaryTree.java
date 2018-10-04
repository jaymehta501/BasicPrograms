package trees;

/**
 * The diameter of a tree (sometimes
 * called the width) is the number of
 * nodes on the longest path between two
 * leaves in the tree
 * 
 * 
 *
 */
public class DiameterOfBinaryTree {

	/*
	 * define height =0 globally and
	 * call diameterOpt(root,height)
	 * from main
	 */
	int diameterOpt(TreeNode root, Height height) {
		/*
		 * lh --> Height of left subtree
		 * rh --> Height of right
		 * subtree
		 */
		Height lh = new Height(), rh = new Height();

		if (root == null) {
			height.h = 0;
			return 0; /*
						 * diameter is
						 * also 0
						 */
		}

		/*
		 * ldiameter --> diameter of
		 * left subtree rdiameter -->
		 * Diameter of right subtree
		 */
		/*
		 * Get the heights of left and
		 * right subtrees in lh and rh
		 * And store the returned values
		 * in ldiameter and ldiameter
		 */
		lh.h++;
		rh.h++;
		int ldiameter = diameterOpt(root.left, lh);
		int rdiameter = diameterOpt(root.right, rh);

		/*
		 * Height of current node is max
		 * of heights of left and right
		 * subtrees plus 1
		 */
		height.h = Math.max(lh.h, rh.h) + 1;

		return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
	}

	/*
	 * A wrapper over diameter(Node
	 * root)
	 */
	int diameter(TreeNode root) {
		Height height = new Height();
		return diameterOpt(root, height);
	}

	/*
	 * The function Compute the "height"
	 * of a tree. Height is the number f
	 * nodes along the longest path from
	 * the root node down to the
	 * farthest leaf node.
	 */
	static int height(Node node) {
		/* base case tree is empty */
		if (node == null)
			return 0;

		/*
		 * If tree is not empty then
		 * height = 1 + max of left
		 * height and right heights
		 */
		return (1 + Math.max(height(node.left), height(node.right)));
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		DiameterOfBinaryTree bt = new DiameterOfBinaryTree();
		Height ht = new Height();
		System.out.println(bt.diameter(root));
		System.out.println(Practice.diameter(root, new Height()));
	}

}
