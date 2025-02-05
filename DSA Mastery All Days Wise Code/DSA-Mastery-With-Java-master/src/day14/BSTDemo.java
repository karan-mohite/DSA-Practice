package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTDemo {

	public static List<Integer> nodeData=new ArrayList();
	
	public static void main(String[] args) {
	Node root=null;
	root=create(root);
	System.out.print("Preorder Traversal : ");
	preorderTraversal(root);
	System.out.print("\nPostorder Traversal : ");
	postorderTraversal(root);
	System.out.print("\nInorder Traversal : ");
	inorderTraversal(root);
	
	System.out.println("\n Node List " + nodeData);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sum");
	int sum=sc.nextInt();
	
	searchSumInTree(sum);
	
	}

	private static void searchSumInTree(int sum) {
		for(int n1:BSTDemo.nodeData)
		{
			int n2=sum-n1;
			if(BSTDemo.nodeData.contains(n2))
			{
				System.out.println("["+n1+","+n2+"]");
				break;
			}
		}
		
	}

	private static void inorderTraversal(Node root)   //LDR
	{
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			BSTDemo.nodeData.add(root.data);
			inorderTraversal(root.right);	
		}
		
	}

	private static void postorderTraversal(Node root) //LRD
	{
		if(root!=null)
		{
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+",");
			
		}
		
	}

	private static void preorderTraversal(Node root) //DLR
	{
		if(root!=null)
		{
			System.out.print(root.data+",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}

	private static Node create(Node root) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter Data for Node");
			int info=sc.nextInt();
			Node nn=new Node(info);
			if(root==null)
			{
				root=nn;
			}
			else
			{
			insert(root,nn);
			}
			
			System.out.println("Do you want to add more elements? 1-Yes 0-No");
			choice=sc.nextInt();
		}while(choice==1);
		return root;
	}

	private static void insert(Node root, Node nn) {
		if(nn.data<=root.data)
		{
			if(root.left==null)
			{
				root.left=nn;
			}
			else
			{
				insert(root.left,nn);
			}
		}
		else
		{
			if(root.right==null)
			{
				root.right=nn;
			}
			else
			{
				insert(root.right,nn);
			}		
		}	
	}
}
