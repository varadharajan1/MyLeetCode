package com.leetcode.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Html2TextWithRegExp {
	   private Html2TextWithRegExp() {}

	   public static void main (String[] args) throws Exception{
	     StringBuilder sb = new StringBuilder();
	     BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\svaradha\\Desktop\\Cloud\\AWS\\SysOps\\AWS-SysOps6.txt"));
	     String line;
	     while ( (line=br.readLine()) != null) {
	       sb.append(line).append(System.getProperty("line.separator"));
	     }
	     String nohtml = null;
		 if(sb != null) {
		     Html2TextWithRegExp exp = new Html2TextWithRegExp();
		     nohtml = exp.removeScriptContent(sb.toString());
	     }else {
		     System.out.println("Files looks empty");
	     }
	     nohtml = nohtml.replaceAll("\\<.*?>","");
	     
	     BufferedWriter bw = null;
	     FileWriter fw = new FileWriter("C:\\Users\\svaradha\\Desktop\\Cloud\\AWS\\SysOps\\AWS-SysOps6_Updated.txt");
		 bw = new BufferedWriter(fw);
		 bw.write(nohtml);
		 
		 bw.close();
	     System.out.println("Files updated successfully.");
	   }
	   public String removeScriptContent(String html) {
		   if(html != null) {
				String re = "<style>(.*)</style>";
				
				Pattern pattern = Pattern.compile(re);
				Matcher matcher = pattern.matcher(html);
				while (matcher.find()) {
				    html = html.replace(matcher.group(), "");
				    matcher = pattern.matcher(html);
			    }
			}
			return html;
	   }
}
