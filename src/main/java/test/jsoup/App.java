package test.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

//        Document doc = Jsoup.connect("http://tw.hjwzw.com/Book/2210/").get();

//        Elements content = doc.select("#form1 > table:nth-child(10) > tbody > tr > td:nth-child(3) > table:nth-child(14) > tbody > tr > td:nth-child(1) > table");

//        System.out.println();
//        for (Element link : content) {
//        	Elements linkHref = link.select("a[href]");
//        	System.out.println(linkHref.get(0).attr("href"));
//
//        	System.err.println(link.select("a").get(1).text());
//        }
        
        
        Document doc = Jsoup.connect("http://www.cwb.gov.tw/V7/forecast/f_index.htm").get();
        Elements conter=doc.select("body > div:nth-child(4)");
        for (Element link : conter) {
        	Elements test=link.select("td");
        	System.out.println(test.get(0).attr("href"));
        	
        }
        
        
        
    }
}
