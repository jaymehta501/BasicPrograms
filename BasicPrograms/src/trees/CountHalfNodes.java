package trees;

public class CountHalfNodes {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		root1.left = root2;
		root1.right = root3;
		root2.left = root4;
		root4.left = root5;
		System.out.println(Practice.getHalfNodes(root1));
	}

}
