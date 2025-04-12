package tree;
import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class Binary_Tree 
{
	Node root;
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root=newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true)
		{
			parent = current;
			if(data<current.data)
			{
				current = current.left;
				if(current==null)
				{
					parent.left=newNode;
					return;
				}
			}
			else
			{
				current=current.right;
				if(current==null)
				{
					parent.right=newNode;
					return;
				}			
				
			}
		}
	}
	
	public void inorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public static void main(String[] args) 
	{
		Binary_Tree tree = new Binary_Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(6);
		tree.insert(9);
		tree.insert(98);
		tree.insert(3);
		tree.insert(1);
		tree.insert(80);
		System.out.println("Inorder Traversal:");
		tree.inorder(tree.root);
	}
}
	


