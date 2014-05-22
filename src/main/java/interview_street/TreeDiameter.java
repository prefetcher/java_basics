package interview_street;

public class TreeDiameter {

	class Node {
		Node left, right;
		int data;

		Node(int newData) {
			left = right = null;
			data = newData;
		}
	}

	/* Write your custom functions here */
	static int diameterOfTree(Node root) {
		int leftDepth = 0;
		int rightDepth = 0;
		
		if (root.left == null && root.right == null) {
			return 1;
		} else if (root.left == null && root.right != null) {
			rightDepth = depthOfTree(root.right);
		} else if (root.left != null && root.right == null) {
			leftDepth = depthOfTree(root.left);
		} else {
			leftDepth = depthOfTree(root.left);
			rightDepth = depthOfTree(root.right);
		}
		return 1 + leftDepth + rightDepth;
	}

	static int depthOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = 1 + depthOfTree(root.left);
		int rightDepth = 1 + depthOfTree(root.right);
		return Math.max(leftDepth, rightDepth);

	}

	public static void main(String[] args) {

	}

}
