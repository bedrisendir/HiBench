package com.intel.hibench.streambench.storm.util;

import java.io.*;

public class BenchLogUtil{
  private static PrintWriter out;
  
  public static void init() throws Exception{
    File file=new File("/tmp/benchlog-storm.txt");
	out=new PrintWriter(file);
  }
  
  public static void logMsg(String msg){
    try{
      if(out==null)
	    init();
	}catch(Exception e){
	  e.printStackTrace();
	}
  
    out.println(msg);
	out.flush();
	System.out.println(msg);
  }
  
  public static void close(){
    if(out!=null) out.close();
  }
  
  public static void handleError(String msg){
    System.err.println(msg);
	System.exit(1);
  }
}