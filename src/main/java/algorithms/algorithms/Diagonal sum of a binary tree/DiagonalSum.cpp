// key : In case of right child, diagonal remains same; In case of left child, we move to another diagonal

#include <bits/stdc++.h> 
using namespace std; 

// represents a node of a binary tree
class node 
{ 
    public:
	int data; 
	node* left; 
	node* right; 
}; 

// function to create a new node of the binary tree
// it takes the data as the parameter
node* newNode(int data) 
{ 
	node* Node = new node();
	Node->data = data; 
	
	// we set left and right pointers to null since there are no child nodes now
	Node->left = Node->right = NULL; 
	
	return Node; 
} 

// function to calculate the diagonalSum
void diagonalSumUtil(node* root, 
				int vd, map<int, int> &diagonalSum) 
{ 
	if(!root) 
		return; 
		
	diagonalSum[vd] += root -> data; 

    // we increase the vertical distance in case of left child
	diagonalSumUtil(root->left, vd + 1, diagonalSum); 

    // no need to increase vertical distance in case of right child
	diagonalSumUtil(root->right, vd, diagonalSum); 
	
} 

void diagonalSum(node* root) 
{ 
 
	map<int, int> diagonalSum; 
	
	diagonalSumUtil(root, 0, diagonalSum); 

	map<int, int>::iterator it; 
	
	cout << "Diagonal sum of the binary tree is - "; 
	
	for(it = diagonalSum.begin(); it != diagonalSum.end(); it++) 
	{ 
		cout << it->second << " "; 
	} 
} 

int main() 
{ 
	node* root = newNode(1); 
	root->left = newNode(2); 
	root->right = newNode(3); 
	root->left->left = newNode(9); 
	root->left->right = newNode(6); 
	root->right->left = newNode(4); 
	root->right->right = newNode(5); 
	root->right->left->right = newNode(7); 
	root->right->left->left = newNode(12); 
	root->left->right->left = newNode(11); 
	root->left->left->right = newNode(10); 

	diagonalSum(root); 

	return 0; 
} 