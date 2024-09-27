package webTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

//評論、部落格、推薦指數、美食札記
//線上訂餐（Food Panda、Uber Eat）線上訂位（Funnow）、聯絡方式、交通方式、咖啡廳官網

/* sos trip
	Beauty SYA
	Blog */


public class webTreeConstruct {
	public WebPage rooPage;
	private WebTree tree;
	private String name;
	public String url;
	private ArrayList<Keyword> keywords = new ArrayList<Keyword>();
	public webTreeConstruct(String url,String name){
		this.url=url;
		this.name=name;
		this.rooPage = new WebPage(url,name);
		this.tree=new WebTree(rooPage);

		keywords.add(new Keyword("comment", 3));
		keywords.add(new Keyword("blog", 2));
		keywords.add(new Keyword("recommendation", 3));
		keywords.add(new Keyword("experience", 1));
		keywords.add(new Keyword("animal", 1));
		keywords.add(new Keyword("cafe", 1));
		keywords.add(new Keyword("coffee", 2));

		keywords.add(new Keyword("online", -1));
		keywords.add(new Keyword("online order", -1));
		keywords.add(new Keyword("contact", -3));
		keywords.add(new Keyword("direction", -1));
		keywords.add(new Keyword("official page", -2));
		keywords.add(new Keyword("Gin Gin", -4));

	}
	public void contructTree() throws Exception {
		//ArrayList<Keyword> keywords = new ArrayList<Keyword>();
		//build tree and childnode
		/* WebPage rootPage1 = new WebPage("https://kaldiscoffee.com/pages/cafe-blog-series","Kaldi");
		WebTree tree1 = new WebTree(rootPage1);
		

		WebPage rootPage2 = new WebPage("https://hazeldiary.com/2017/08/cafe-hopping-in-taipei-taiwan/","haze");
		WebTree tree2 = new WebTree(rootPage2);
		

		WebPage rootPage3 = new WebPage("https://sya.tw/ting-tao-cafe/", "SYA");
		WebTree tree3 = new WebTree(rootPage3);
		

		WebPage rootPage4 = new WebPage("https://kellyrosie12.com/blog/post/469412900", "Blog");
		WebTree tree4 = new WebTree(rootPage4); */
		
		
		//System.out.println("Please input (1)num of keywords (2)name and weight:");
		//Scanner scanner = new Scanner(System.in);
		
		/* keywords.add(new Keyword("comment", 3));
		keywords.add(new Keyword("blog", 2));
		keywords.add(new Keyword("recommendation", 3));
		keywords.add(new Keyword("experience", 1));

		keywords.add(new Keyword("online", -1));
		keywords.add(new Keyword("online order", -1));
		keywords.add(new Keyword("contact", -3));
		keywords.add(new Keyword("direction", -1));
		keywords.add(new Keyword("official page", -2)); */

		tree.setPostOrderScore(keywords);
		tree.eularPrintTree();
	}
	
	public void addChild(String url, String name){
		this.tree.root.addChild(new WebNode(new WebPage(url, name)));
	}
	
	
//	static {
//		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() 
//		{
//			public boolean verify(String hostname,SSLSession session) 
//			{
//				return true;
//			}
//		});
//	}	
}