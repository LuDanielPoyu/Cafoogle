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


/* public class webTreeConstruct {
	public static void contructTree() throws IOException {
		//root node
		WebPage rootPage = new WebPage("http://soslab.nccu.edu.tw/Welcome.html", "Soslab");		
		WebTree tree = new WebTree(rootPage);
		ArrayList<Keyword> keywords = new ArrayList<Keyword>();
		
		//build childnode
		tree.root.addChild(new WebNode(new WebPage("https://tc.trip.com/blog/taipei-coffee/","Trip")));
		tree.root.addChild(new WebNode(new WebPage("https://www.beauty321.com/post/49180","Beauty")));
		tree.root.addChild(new WebNode(new WebPage("https://sya.tw/ting-tao-cafe/", "SYA")));
		tree.root.addChild(new WebNode(new WebPage("https://kellyrosie12.com/blog/post/469412900", "Blog")));
		
		//System.out.println("Please input (1)num of keywords (2)name and weight:");
		//Scanner scanner = new Scanner(System.in);
		
		keywords.add(new Keyword("評論", 3));
		keywords.add(new Keyword("部落格", 2));
		keywords.add(new Keyword("推薦指數", 5));
		keywords.add(new Keyword("美食札記", 1));

		keywords.add(new Keyword("線上訂餐", -1));
		keywords.add(new Keyword("線上訂位", -1));
		keywords.add(new Keyword("聯絡方式", -3));
		keywords.add(new Keyword("交通方式", -2));
		keywords.add(new Keyword("咖啡廳官網", -2));
 */

		/* while(scanner.hasNext()){
			int numOfKeywords = scanner.nextInt();
			
			for(int i = 0; i < numOfKeywords; i++)
			{
				String name = scanner.next();
				double weight = scanner.nextDouble();
				Keyword k = new Keyword(name, weight);
				keywords.add(k);
			}
			tree.setPostOrderScore(keywords);
			tree.eularPrintTree();
		}
		System.out.println("F");
		scanner.close(); */
	
