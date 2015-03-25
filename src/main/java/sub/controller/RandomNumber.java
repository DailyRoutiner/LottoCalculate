package sub.controller;
//import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		
		int nArr[] = new int[45];  // 뽑을 판
		int nResultArr[] = new int[6];
		int nRan = 0;
		Random ran = new Random(); //
		int temp;
		int i = 0 ;
		int k = 0 ;
		for( i = 0 ; i < 45 ; i++)  // 1~ 45 입력
			nArr[i]= i+1;
		
		for( k = 0 ; k < 6 ; k++ )
		{			
			temp = ran.nextInt(44-k);			
			nRan = nArr[temp];  // 45개중 1번째 추첨		
			nResultArr[k] = nArr[nRan];   // 결과 저장
		
			for(i = 0 ; i < 44 ; i++)
			{
				if( i >= nRan)
					nArr[i] = nArr[i+1];	// 한칸씩 민다			
			}
		}
		
		
		for(i = 0 ; i < 6 ; i++)  // 출력
			System.out.print(nResultArr[i] + "/");
		System.out.println("");
		System.out.println("번호 추출 끝");
		
		
		
				
	}
	public RandomNumber()
	{
		
	}

}
