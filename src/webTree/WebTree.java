package webTree;

import java.io.IOException;
import java.util.ArrayList;

public class WebTree {
	public WebNode root;
	
	public WebTree(WebPage rootPage){
		this.root = new WebNode(rootPage);
	}
	
	public void setPostOrderScore(ArrayList<Keyword> keywords) throws Exception{
		setPostOrderScore(root, keywords);
	}
	
	private void setPostOrderScore(WebNode startNode, ArrayList<Keyword> keywords) throws Exception{
		//2. compute the score of children nodes via post-order, then setNodeScore for startNode
		//for(int j=0; j<startNode.; j++){
		if(startNode.isTheLastChild() || !startNode.children.isEmpty()){
			for(int i=0; i<startNode.children.size(); i++){
				this.root=startNode.children.get(i);
				setPostOrderScore(keywords);
			}
		}
		startNode.setNodeScore(keywords);
		this.root=startNode;
	}
	
	public void eularPrintTree(){
		System.out.println(" computing...");
		//eularPrintTree(root);
	}
	
	private void eularPrintTree(WebNode startNode){
		int nodeDepth = startNode.getDepth();
		
		if(nodeDepth > 1) System.out.print("\n" + repeat("\t", nodeDepth-1));

		System.out.print("(");
		System.out.print(startNode.webPage.name + "," + startNode.nodeScore);
		
		//3. print child via pre-order
		if(!startNode.children.isEmpty()){
			for(int i=0; i<startNode.children.size(); i++){
				if(!startNode.children.get(i).isTheLastChild() || !startNode.children.isEmpty()){
					this.root=startNode.children.get(i);
					eularPrintTree();
				}else{
					this.root=startNode.parent;
				}
			}
		}
		System.out.print(")");
				
		if(startNode.isTheLastChild()) System.out.print("\n" + repeat("\t", nodeDepth-2));	
	}
	
	private String repeat(String str, int repeat){
		String retVal = "";
		for(int i = 0; i < repeat; i++){
			retVal += str;
		}
		return retVal;
	}
}