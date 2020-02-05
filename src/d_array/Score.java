package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS JQuery, JSP 점수를 50 ~ 100까지 랜덤으로 생성하고
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 석차	이름	 java   oracle   HTML   CSS   JQuery   JSP  총점   평균
		 *   
		 */
		String[] name = new String[]{"유웅","전영현","박희찬","김다슬","김덕년","김재석","김태진","서동미","서한별","신나라","심윤희","옥혜원","이명현","이수아","이승민","이용춘","임종원","차완호","홍성하","이재호"};
		int[][] list = new int[20][6];  //점수
		int[] sum = new int[name.length];
		double[] avg = new double[name.length];	
		int[] suk = new int[name.length];
		
		
		for (int i = 0; i < suk.length; i++) {
			suk[i] = 1;
		}
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {			
				
				list[i][j] = (int) (Math.random() * 100) + 1;
				while(list[i][j]<50){
					list[i][j] = (int) (Math.random() * 100) + 1;	
				}
				sum[i] = sum[i] + list[i][j];					
			}			
			avg[i] = (double) sum[i] / list[i].length;		
			System.out.println(Arrays.toString(list[i]));			
		}		//sum, avg
			
	
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					suk[i] += 1;
				}
			}
		} //석차
		
		
		
		int tmp = 0;
		String tmps;
		double avgs;
		int jum[];
		for (int i = 0; i < suk.length - 1; i++) { // 0 1 2 3 4 5 6 7 8 9
			for (int j = i + 1; j < suk.length; j++) {
				if (suk[i] > suk[j]) {
					tmp = suk[i];
					suk[i] = suk[j];
					suk[j] = tmp;
					
					tmps = name[i];
					name[i] = name[j];
					name[j] = tmps;
					
					tmp = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp;
					
					avgs = avg[i];
					avg[i] = avg[j];
					avg[j] = avgs;		
					
					jum = list[i];
					list[i] = list[j];
					list[j] = jum;					
				}
			}
		}
		
	
		
		//정렬
		System.out.println("석차\t이름\tjava\toracle\t html \t css\tjquery \t jsp\t총점\t평균 \t 등급");
		
		for (int i = 0; i < suk.length; i++) {	
			System.out.print(suk[i] + "\t" + name[i] + "\t" );
			for (int j = 0; j < list[i].length; j++) {				
				System.out.print(list[i][j] + "\t");				
			}			
			System.out.print(sum[i] + "\t" + Math.round(avg[i]*100)/100.0);
			if(avg[i] > 85){
				System.out.print("\tA");
			}
			else if( avg[i] >70 && avg[i]<85){
				System.out.print("\tB");
			}
			else if( avg[i]>50 && avg[i]<70){
				System.out.print("\tC");
			}
			else{
				System.out.println("\tF");
			}
			System.out.println();
		}
		double[] kmavg = new double[list.length];
		int[] kmsum = new int[6];
		System.out.print("과목별\t 평균 :\t");
		for (int i = 0; i < list[i].length; i++) {
			for (int j = 0; j < list.length; j++) {
				kmsum[i] = kmsum[i] + list[j][i];
				kmavg[i] = (double)kmsum[i] / list.length;
			}
			
			System.out.print(Math.round(kmavg[i]*100)/100.0 + "\t"  );
		}
		
		
		
		
		
		}//main
}
