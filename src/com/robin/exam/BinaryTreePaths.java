package com.robin.exam;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public static void Test()
	{
		BinaryTreePaths btp = new BinaryTreePaths();
		
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		
		tn.left.right = new TreeNode(5);
		
		btp.binaryTreePaths(tn);
	}
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> ret = new ArrayList<String>();
    	if(root == null) return ret;
    	
    	generateTreePaths(root, ret, "" + root.val);
    	
    	return ret;
    }
    
    private void generateTreePaths(TreeNode node, List<String> ret, String path)
    {
    	if(node.left == null && node.right == null) 
    	{
    		ret.add(path);
    		return;
    	}
    	
    	if(node.left != null) 
    	{
    		generateTreePaths(node.left, ret, path + "->" + node.left.val);
    	}
    	
    	if(node.right != null)
    	{
    		generateTreePaths(node.right, ret, path + "->" + node.right.val);
    	}
    }
}
