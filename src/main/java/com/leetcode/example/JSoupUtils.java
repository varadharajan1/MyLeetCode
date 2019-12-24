package com.leetcode.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.jsoup.Jsoup;

public class JSoupUtils {
	public JSoupUtils() {}
	
	public static String extractText(Reader reader) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    BufferedReader br = new BufferedReader(reader);
		    String line;
		    while ( (line=br.readLine()) != null) {
		      sb.append(line);
		      sb.append("\n");
		    }
		    String textOnly = Jsoup.parse(sb.toString()).text();
		    return textOnly;
		  }

		  public final static void main(String[] args) throws Exception{
		    FileReader reader = new FileReader
		          ("C:/RealHowTo/topics/java-language.html");
		    System.out.println(HTMLUtils.extractText(reader));
		  }
}
