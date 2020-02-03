package z_exam;

public class Exam04 {

	public static void main(String[] args) {
		// 1.
		int x = 1;
		if (x > 10 && x < 20) {
			System.out.println("true");
		}
		// 2. !(ch == ' '|| ch=='\t')
		// 3. ch == 'x' || ch == 'X'
		// 4. ch >= 0 && ch <=9
		// 5. (ch >= 'a'&& ch<='z')||(ch >= 'A'&& ch<='Z')
		// 6. year%400 == 0 || (year%4 ==0 && year%100 !=0)
		// 7. powerOn ==false
		// 8. str.equlse("yes")

		// 2.
		/*
		 * int sum = 0; for (int i = 1; i <= 20; i++) { if (i % 2 != 0) { sum =
		 * sum + i; } else if (i % 3 != 0) { sum = sum + i; } }
		 */

		// 3.
		/*
		 * int sum = 0; int sum1= 0; 
		 * for(int i = 1; i<=10; i++){
		 *  sum = sum +  i*1; // 1 3 6 10 15 21 
		 *  sum1 = sum1 + sum; // 1 4 10 20 35 56 }
		 * System.out.println(sum1);
		 */

		// 4.
		
		/*int sum = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}
			if(sum >=100){
				System.out.println(sum);
				System.out.println(i+"까지 더해야됩니다.");
				break;
			}
		}*/

		// 5.
		/*
		 * int i = 0; int j = 0; 
		 * while (i <= 10) { 
		 * j = 0; 
		 * while (j <= i) {
		 * System.out.print("*"); 
		 * j++; } 
		 * System.out.println(); i++; 
		 * }
		 */
		
		//6. 
		/*for(int i = 1; i<7; i++){
			for(int j = 6; j>=1; j--){
				if(i+j == 6){
				System.out.println(i+"와"+j);
				}
			}
		}*/
		     
		/*
      7.
      int value = (int)(Math.random()*6)+1;
      
      8.
      for(int x =0; x<=10; x++){
         for(int y =0; y<=10; y++){
            if((2*x+4*y)==10){
               System.out.println("x = "+ x + " , "+ "y = " + y);
      			}
      	 }
      }
      
      10.
      int num = 12345;
      int sum = 0;
      
      while(num>0){
         sum = sum+ num%10;
         num = num/10;       
      }
      System.out.println(sum);
      
      11.
      int num1 =1;
      int num2 = 1;
      int num3 =0;
      System.out.print(num1+ ", "+num2);
      for(int i=0;i<8;i++){
         num3 = num1+num2;
         System.out.print(", "+num3);
         num1=num2;
         num2=num3;
      }
      
            }
         }
     
     14.      
      int answer = (int)(math.random()*100)+1
      
      if(input<answer){
      sysout (input보다 작아여"")
      }
      
      
      15.
      result = result*10 + tmp%10; 
      
      tmp = tmp/10;
      
      */
	 /*
	  * 428
		278 1s 1b 1o
		287 0s 2b 1o
		872 0s 2b 1o
		928 2s 0b 1o
		528 2s 0b 1o
		134 0s 1b 2o
		428 3s 0b 0o
      */ 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
