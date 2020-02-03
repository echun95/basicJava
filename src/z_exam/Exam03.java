package z_exam;

 

public class Exam03 {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub
/*

 *  [3-1] 다음 연산의 결과를 적으시오

 *  int x = 2;
 *  int y = 5;
 *  char c= 'A' // 'A'의 문자코드는 65 

 *  System.out.println(y >= 5 || x < 0 && x > 2);
 *    true  

 *   System.out.println(y+=10 - x++);
 *    13

 *   

 *   System.out.println(x+=2);  x = x+2
 *    5

 *   

 *   System.out.println(!('A' <= c  && c<='Z'));
 *    false

 *   

 *   System.out.println('C'-c);
 *   2

 *   

 *   System.out.println('5'-'0');
 *   5

 *   

 *   System.out.println(c+1);
 *   66

 *   

 *   System.out.println(++c);
 *   B

 *   

 *   System.out.println(c++);
 *   B

 *   System.out.println(c);
 *   C

 *   

 *   [3-2](1)에 알맞은 코드를 넣으시오

 *  	

 *  int numofBucket = mod(numOfApples, sizeOfBucket) > 0 ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket ;

 

	 [3-3] num에 따라 '양수', '음수', '0' 출력

	 (1) = num >0 ? "양수" : num<0 ? "음수" : "0"

	 

	 [3-4] 100의 자리 이하 버림

	 (1) = System.out.println((num/100)*100);

	 

	 [3-5] 일의 자리를 1로 바꾸는 코드
	 (1) = (num/10)*10 +1

	 

	 [3-6] 1의 자리에서 반올림해서 num 값 빼기
	 (1) (num+9)/10 *10 - num

	 

	 [3-7] 소수점 셋쨰자리에서 반올림
	 

	 

	 [3-8] 

	  1)  int c = a+b;

	  2) ch =  (char)(ch+2);  -> ch+2가 int형이기 때문에 char형태인 ch에 넣기위해서는 형변환 필요

	  3) float f = 3f/2;

      4) long l = 3000L * 3000 * 3000; 

	  

	 [3-9]

	                대  문자                                   소문자                                      숫자(0~9)

	 (65<=ch&&ch<=90)||(97<=ch&&ch<=122)||(48<=ch&&ch<=57)

	 

	 [3-10]

	  (1)= 'A'<=ch && ch<='Z' 

	  (2)= ch+32

 */ 
		

		int numOfApples= 120;
		int sizeOfBucket =10;
		
		int numofBucket =numOfApples % sizeOfBucket > 0 ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket ;
		System.out.println(numofBucket);
		
		char ch = '2'; 
		boolean b = (('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')||('0'<=ch&&ch<='9')); 
		System.out.println(b);

		
		/*int x = 2;

		int y= 5;

		char c = 'A';

		System.out.println(y >= 5 || x <0 && x>2);

		System.out.println(y+=10 - x++);

		System.out.println(x);

		System.out.println(x+=2);

		System.out.println(!('A' <= c  && c<='Z'));

		System.out.println('C'-c);

		System.out.println('5'-'0');

		System.out.println(c+1);

		System.out.println(c++);

		

		int numOfApples= 123;

		int sizeOfBucket =10;

		//int numofBucket = (int)(numOfApples/(double)sizeOfBucket +0.5);

		int numofBucket = (int)Math.ceil((double)numOfApples/sizeOfBucket) ;

		System.out.println(numofBucket);

		

		int num = -1;

		System.out.println(num >0 ? "양수" : num<0 ? "음수" : "0");

		

		num = 111;

		System.out.println((num/100)*100);

		

		num = 24;

		System.out.println((num+9)/10 *10 - num);

		

		System.out.println(Math.round(5/9 * (100-32)));

		 int f = 100;

		 //float d = (float)5/9 * (f-32) ;

		 float d = (float) (Math.round(((float)5/9 * (f-32))*100) /100.0);

		 System.out.println(d);

		 

		 // 65<=ch && ch<=90 ch+32

		 byte aa= 10;

		 byte bb= 20;

		 int cc =  (aa+bb);

		 System.out.println(cc);

		 

		 char ch = 'A';

		  int h =  (ch+2);

		 System.out.println(h);

		 

		 float ff = 3f/2;

		 long l =3000L*3000*3000;

		 float fff = 0.1f;

		 double dd = 0.1;

		 

		 boolean result = (float)d == fff;

		 System.out.println("ff="+ff);

		 System.out.println("l="+l);

		 System.out.println("result="+result);
*/
		 

	}

 

}