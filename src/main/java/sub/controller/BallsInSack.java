package sub.controller;

import java.util.HashSet;
import java.util.Random;

class BallsInSack{
	 public static final String[] BALL={"A", "B", "C", "D", "E", "F"}; // 공의 종류
	 public static final int[] NUMBER_OF_BALL_AT_START={1,1,1,1,1,1}; //종류별 최초 공의 갯수
	 public int[] numOfBallNow=new int[NUMBER_OF_BALL_AT_START.length]; //각 시행 후 주머니에 남은 공의 갯수
	}
	class Trial extends BallsInSack{
	 public static final int NUMBER_OF_EACH_TRIAL=3;
	 public int[] choiceBallNumberAfterTrial=new int[BALL.length];
	 public HashSet<String> eachCaseOfTeam1=new HashSet<String>();
	 public HashSet<String> eachCaseOfTeam2=new HashSet<String>();
	 public HashSet<HashSet<String>> eachCaseOfMatch=new HashSet<HashSet<String>>();
	 public static HashSet<HashSet<HashSet<String>>> caseSet = new HashSet<HashSet<HashSet<String>>>();
	 public Random rd=new Random((long)(Math.random()*System.currentTimeMillis()));
	 public static long successCnt;
	 public void doingTrial(){
	  numOfBallNow=NUMBER_OF_BALL_AT_START.clone();
	  choiceBalls();
	 }
	 private void choiceBalls() {
	  for(int i=0;i<BALL.length;i++){
	   choiceBallNumberAfterTrial[i]=0;
	  }
	  for(int i=0;i<NUMBER_OF_EACH_TRIAL;i++){
	   choicingWithNotRestore();
	  }
	  for(int i=0;i<6;i++){
	   if(choiceBallNumberAfterTrial[i]==1){
	    eachCaseOfTeam1.add(BALL[i]);
	   }else{
	    eachCaseOfTeam2.add(BALL[i]);
	   }
	  }
	  eachCaseOfMatch.add(eachCaseOfTeam1);
	  eachCaseOfMatch.add(eachCaseOfTeam2);
	    
	  if(caseSet.add(eachCaseOfMatch)){
	   successCnt++;
	  }
	 }
	 private void choicingWithNotRestore() {
	  int sumOfBallsInSack=0;
	  for(int i=0;i<numOfBallNow.length;i++){
	   sumOfBallsInSack+=numOfBallNow[i];
	  }
	  int ballChoiced=rd.nextInt(sumOfBallsInSack);
	  int index=0;
	  for(int i=0;i<numOfBallNow.length;i++){
	   if(ballChoiced>=index && ballChoiced<index+numOfBallNow[i]){
	    numOfBallNow[i]--;
	    choiceBallNumberAfterTrial[i]++;
	    return;
	   }
	   index+=numOfBallNow[i];
	  }
	  return;
	 }
	}
	
