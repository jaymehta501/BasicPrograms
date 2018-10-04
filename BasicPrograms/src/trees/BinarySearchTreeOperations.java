package trees;

public class BinarySearchTreeOperations {

	public static void main(String[] args) {
		BinarySearchTreeOperations op = new BinarySearchTreeOperations();
		BinarySearchTree bst = BinarySearchTree.createBinarySearchTree();
		System.out.println("Is Found :: " + op.find(bst, 125));
		op.insert(15);
		BinarySearchTree deleted = op.delete(bst, 40);
		printLeftToRight(deleted);
	}

	/**
	 * Its very sim­ple oper­a­tion to
	 * perform. start from the root and
	 * com­pare root.data with n if
	 * root.data is greater than n that
	 * means we need to go to the left
	 * of the root. if root.data is
	 * smaller than n that means we need
	 * to go to the right of the root.
	 * if any point of time root.data is
	 * equal to the n then we have found
	 * the node, return true. if we
	 * reach to the leaves (end of the
	 * tree) return false, we didn’t
	 * find the element
	 * 
	 * Find id in binary search tree
	 * Whenever divide by 2 approach is
	 * taken time complexity is in log
	 * In this Avg case O(log n) Worst
	 * Case O(n) Space O(n)
	 * 
	 */
	public boolean find(BinarySearchTree node, int id) {
		BinarySearchTree current = node;
		boolean isFound = false;
		if (null == node) {
			return false;
		}
		if (null != current && current.data == id) {
			isFound = true;
			return isFound;
		}
		if (node.data < id) {
			isFound = find(node.right, id);
		} else if (node.data > id) {
			isFound = find(node.left, id);
		}
		return isFound;
	}

	/**
	 * To insert a node our first task
	 * is to find the place to insert
	 * the node. Take cur­rent = root .
	 * start from the cur­rent and
	 * com­pare root.data with n if
	 * current.data is greater than n
	 * that means we need to go to the
	 * left of the root. if current.data
	 * is smaller than n that means we
	 * need to go to the right of the
	 * root. if any point of time
	 * cur­rent is null that means we
	 * have reached to the leaf node,
	 * insert your node here with the
	 * help of par­ent node. Time
	 * Complexity O(logn) Worst Case =
	 * O(n) Space O(n)
	 */
	public void insert(int id) {
		BinarySearchTree root = BinarySearchTree.createBinarySearchTree();
		BinarySearchTree inserted = this.insertRecursion(root, id);
		//Print in descending order
		System.out.println("Descending order");
		printRightToLeft(root);
		System.out.println("Ascending order");
		//Print in ascending order
		printLeftToRight(root);
		return;
	}

	static private BinarySearchTree insertRecursion(BinarySearchTree node, int value) {
		if (node == null) {
			return new BinarySearchTree(value);
		} else if (node.data < value) {
			node.right = insertRecursion(node.right, value);
		} else if (node.data > value) {
			node.left = insertRecursion(node.left, value);
		}
		return node;
	}

	static public void printRightToLeft(BinarySearchTree node) {
		if (node != null) {
			if (node.right != null) {
				printRightToLeft(node.right);
			}
			System.out.println(node.data);
			if (node.left != null) {
				printRightToLeft(node.left);
			}
		}
	}

	static public void printLeftToRight(BinarySearchTree node) {
		if (node != null) {
			if (node.left != null) {
				printLeftToRight(node.left);
			}
			System.out.println(node.data);
			if (node.right != null) {
				printLeftToRight(node.right);
			}
		}
	}

	/**
	 * Three different Cases 1. Node to
	 * be deleted is a leaf node ( No
	 * Children). 2. Node to be deleted
	 * has only one child. 3. Node to be
	 * deleted has two childrens.
	 * 
	 * Case1: Traverse Tree Keep Track
	 * of parent and find if set
	 * parent.left or parent.right to
	 * NULL Case2: If a node to be
	 * deleted(deleteNode) has only one
	 * child then just tra­verse to that
	 * node, keep track of par­ent node
	 * and the side in which the node
	 * exist(left or right). check which
	 * side child is null (since it has
	 * only one child).Say node to be
	 * deleted has child on its left
	 * side . Then take the entire sub
	 * tree from the left side and add
	 * it to the par­ent and the side on
	 * which deleteN­ode exist Case 3:
	 * Find Successor- Suc­ces­sor is
	 * the smaller node in the right sub
	 * tree of the node to be deleted.
	 * Successor will replace deleted
	 * Node
	 */
	public BinarySearchTree delete(BinarySearchTree node, int value) {
		if (node.data < value) {
			node.right = delete(node.right, value);
		} else if (node.data > value) {
			node.left = delete(node.left, value);
		} else {
			if (node.right == null) {
				return node.left;
			}
			if (node.left == null) {
				return node.right;
			}
			BinarySearchTree temp = node;
			// Find min element of right subtree
			node = min(temp.right);
			node.right = deleteMin(temp.right);
			node.left = temp.left;
		}
		return node;
	}

	private BinarySearchTree min(BinarySearchTree node) {
		if (node.left == null) {
			return node;
		} else {
			return min(node.left);
		}
	}

	private BinarySearchTree deleteMin(BinarySearchTree node) {
		if (node.left == null) {
			return node.right;
		}
		node.left = deleteMin(node.left);
		return node;
	}

}
