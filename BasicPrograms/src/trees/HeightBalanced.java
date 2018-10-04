package trees;

/**
 * An empty tree is height-balanced. A non-empty binary tree T is balanced if:
 * 1) Left subtree of T is balanced 2) Right subtree of T is balanced 3) The
 * difference between heights of left subtree and right subtree is not more than
 * 1.
 * 
 * 
 *
 */
public class HeightBalanced {

	TreeNode root;

	boolean isBalanced(TreeNode root, Height height) {
		/* If tree is empty then return true */
		if (root == null) {
			height.h = 0;
			return true;
		}

		/* Get heights of left and right sub trees */
		Height lheight = new Height(), rheight = new Height();
		boolean l = isBalanced(root.left, lheight);
		boolean r = isBalanced(root.right, rheight);
		int lh = lheight.h, rh = rheight.h;

		/*
		 * Height of current node is max of heights of left and right subtrees
		 * plus 1
		 */
		height.h = (lh > rh ? lh : rh) + 1;

		/*
		 * If difference between heights of left and right subtrees is more than
		 * 2 then this node is not balanced so return 0
		 */
		if ((lh - rh >= 2) || (rh - lh >= 2))
			return false;

		/*
		 * If this node is balanced and left and right subtrees are balanced
		 * then return true
		 */
		else
			return l && r;
	}

	public static void main(String[] args) {
		Height height = new Height();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		
		HeightBalanced hBal = new HeightBalanced();
		if (hBal.isBalanced(root, height))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}

}
