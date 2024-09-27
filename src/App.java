import webTree.*;
import g2.*;


import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import g2.SubWebquery;
import g2.googleSearch;

public class App {
    public static ArrayList<WebPage> webPageList=new ArrayList<WebPage>();
    public static void main(String[] args) throws Exception {
        ArrayList<webTreeConstruct> treeList=new ArrayList<webTreeConstruct>();
        //System.out.println("Hello, World!");
        //webTreeConstruct.contructTree();
        //google.App.google("coffe");
        //for()

        /* webTreeConstruct tree1=new webTreeConstruct("https://kaldiscoffee.com/pages/cafe-blog-series", "Kaldi");
        SubWebquery sub1=new SubWebquery("https://kaldiscoffee.com/pages/cafe-blog-series");
        Elements links1=sub1.listlinks();          
        for(int i=0;i<=20;i++){
            tree1.addChild(links1.get(i).attr("abs:href"), String.valueOf(i));
        } */



        webTreeConstruct tree1=new webTreeConstruct("https://kaldiscoffee.com/pages/cafe-blog-series", "Kaldi");
        SubWebquery sub1=new SubWebquery("https://kaldiscoffee.com/pages/cafe-blog-series");
        Elements links1=sub1.listlinks();          
        for(int i=0;i<=20;i++){
            tree1.addChild(links1.get(i).attr("abs:href"), String.valueOf(i));
        }


        webTreeConstruct tree2=new webTreeConstruct("https://hazeldiary.com/2017/08/cafe-hopping-in-taipei-taiwan/", "haze");
        SubWebquery sub2=new SubWebquery("https://hazeldiary.com/2017/08/cafe-hopping-in-taipei-taiwan/");
        Elements links2=sub2.listlinks();
        for(int i=0;i<=20;i++){
            tree2.addChild(links2.get(i).attr("abs:href"), String.valueOf(i));
        }

        webTreeConstruct tree3=new webTreeConstruct("https://sya.tw/ting-tao-cafe/", "SYA");
        SubWebquery sub3=new SubWebquery("https://sya.tw/ting-tao-cafe/");
        Elements links3=sub3.listlinks();      
        for(int i=0;i<=20;i++){
            tree3.addChild(links3.get(i).attr("abs:href"), String.valueOf(i));
        }

        webTreeConstruct tree4=new webTreeConstruct("https://kellyrosie12.com/blog/post/469412900", "Blog");
        SubWebquery sub4=new SubWebquery("https://kellyrosie12.com/blog/post/469412900");
        Elements links4=sub4.listlinks();       
        for(int i=0;i<=20;i++){
            tree4.addChild(links4.get(i).attr("abs:href"), String.valueOf(i));
        }

        treeList.add(tree1);
        treeList.add(tree2);
        treeList.add(tree3);
        treeList.add(tree4);
        /* HashMap map=googleSearch.google("coffee");
        for(Object value: map.keySet()){
            String key=String.valueOf(value);
            String url=(String) map.get(key);
            url=url.split("=")[1];
            System.out.println(key+url);
            webTreeConstruct tree=new webTreeConstruct(url, key);
            SubWebquery sub=new SubWebquery(url);
            Elements links=sub.listlinks();
            try{       
            for(int i=0;i<=20;i++){  
                    tree.addChild(links.get(i).attr("abs:href"), String.valueOf(i));
            }
            }catch(Exception e){

            }
            treeList.add(tree);
        } */
        //tree1.rooPage.score;
        System.out.println(treeList.size());
        int i=0;
        for(webTreeConstruct tree:treeList){
            System.out.print(i);
            i++;
            tree.contructTree();
            webPageList.add(tree.rooPage);
        }
        Collections.sort(webPageList, new Comparator<WebPage>() {

            public int compare(WebPage w1, WebPage w2) {

                return Double.compare(w1.getScore(),w2.getScore());

            }

        });
        Collections.reverse(webPageList);
        for(WebPage webpage:webPageList){
            System.out.printf("Title:%s score: %10f\n",webpage.name,webpage.score);
        }
    }
}

