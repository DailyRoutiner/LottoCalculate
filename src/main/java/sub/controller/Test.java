package sub.controller;


public class Test {
	 public static void main(String[] args) {
	  Trial tt=null;
	  while(Trial.successCnt<10){
	    tt=new Trial();
	    tt.doingTrial();
	  }
	  System.out.println(Trial.caseSet+"\t");
	  System.out.println("==끝==");
	 }
	}