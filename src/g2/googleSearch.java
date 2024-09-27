package g2;

import java.io.IOException;
import java.util.HashMap;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

public class googleSearch
{
	public static HashMap google(String searchKeyword) 
	{
		try 
		{
			/*
			 * Using different keyword depends on the last number of your student ID
			 * 0,1:Tomato
			 * 2,3:Liver
			 * 4,5:Pokemon
			 * 6,7:Tissue
			 * 8,9:Process
			 */
			HashMap map=new GoogleQuery(searchKeyword).query();
			//System.out.println(map);
//			GoogleQuery g = new GoogleQuery("NCCU");
//			g.query();
			//System.out.println("F");
			return map;
		} 
		catch (IOException e) 
		{
			//e.printStackTrace();
			return null;
		}
	}
}