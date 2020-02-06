package z_exam;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
	/*	
	 *  a : 됩니다. 2차원배열은 []를 앞에써도되고 뒤에써도된다.
	 *  b : 안됩니다. 배열안에 값을 끝까지 초기화하지 않음 
	 *  c : 됩니다. 배열선언과 동시에 크기를 지정해주는방법입니다.
	 * 	d : 안됩니다. 선언과 동시에 초기화를 할 시 배열의 크기는 적어주지않습니다.
	 *  e : 됩니다. 선언만 한 경우입니다.
	 *  f : 됩니다. 2차원배열은 행크기만 적어줘도됩니다.
	 * 
	 * 
	 * 2. 2
	 *	  arr이 행크기는 4이고 열의 크기는 다 다른데 arr[3].length가 뜻하는것은
	 *	  배열 인덱스가 3인 행의 열의 크기를 말하는것으로 2가 나옵니다. 
	 * 
	 * 3.
	 * for(int i = 0; i<arr.length; i++){
	 * 	sum = sum + arr[i];     arr에 들어있는 숫자들을 하나씩 뽑아 sum변수에 누적해주는부분
	 * }
	 * 
	 * 4.
	 * for(int i = 0; i<arr.length; i++){
	 * 		for(int j = 0; j < arr[i].length; j++){	
	 * 			
	 * 			total = total + arr[i][j];    arr배열에 담긴 숫자들을 하나씩 뽑아 total 변수에 누적 
	 * 		}
	 * 	average = (float)total/(arr.length*arr[i].length); 누적된 합계를 총 숫자갯수만큼 나눠 평균을 구해준다.
	 * }
	 * 
	 * 5. 
	 * tmp = ballArr[i];
	 * ballArr[i] = ballArr[j];
	 * ballArr[j] = tmp;           //i번째 수자와 j번째 숫자를 서로 바꾸는작업
	 * 
	 * 
	 * for(int i = 0; i < ball3.length; i++){
	 * 		ball3[i] = ballArr[i]	ballarr배열의 앞자리부터 3개의수를 빼내어 ball3배열에 넣는작업
 	 * }
	 * 
	 * 
	 * 6.
		int[] coinUnit = {500, 100, 50, 10}; 
		
		int money = 2680; 			
		System.out.println("money="+money); 
		
		for(int i=0;i<coinUnit.length;i++)
		{ 
			int count = 0;
			while(true){   돈을 다 거슬을때까지 무한루프
				if(money < coinUnit[i]){   거슬러야하는 돈이 동전보다 작으면 들어감 
					System.out.println(coinUnit[i] + "원 : " + count); 지금 순번의 동전크기로 몇개 줬는지 알려줌
					break;
				}
				else{
					money =  money - coinUnit[i]; 동전으로 거스르고 거슬러야하는돈에서 차감			
					count++; 동전갯수 ++
				}
			}	
			
		}
	 * 
	 * 7.
	 * 
            coinNum = money / coinUnit[i]; money를 현재 동전크기로 나눠 몫을 구해 동전 갯수를 구한다.
            if (coin[i] >= coinNum) {
            coin[i] -= coinNum; coin배열에서 현재 동전크기의 동전개수에서 사용된 동전갯수를 뺀다
               } else {
               coinNum = coin[i]; 동전을 다 썼을경우 그 동전에 갯수를 0으로 만든다.
               coin[i] = 0;
               }
            money = money - coinUnit[i] * coinNum; 거스를돈에서 거슬러준만큼 돈을 차감

	 * 8.
	 *      counter[answer[i]-1]++; answer배열에 현재 순번의 숫자를 counter 배열에 누적한다.
         
            System.out.print(counter[i]); 1부터 4까지 숫자의 누적 개수를 출력 
            for(int j =0; j < counter[i]; j++){  
            System.out.print("*");     누적된 개수만큼 별출력
            }

	 * 
	 * 9.
	 * 	 result[j][star.length - 1 - i] = star[i][j];  (0,0) -> (0,3)
	 * 												   (0,1) -> (1,3)
												   	   (0,2) -> (2,3)
												   	      이러한 공식으로 식을 써준다.

	   10.
		   if(ch>='a'&&ch<='z'){
         result += abcCode[ch-'a'];    아스키코드로 바꿔서 계산한 그 차이가 abcCode배열의 인덱스와 같아서 이렇게 식을 도출
            }else{
         result += numCode[ch-'0'];
         }

		11.
	 *   result[i][j] = score[i][j];  기존배열을 더큰 배열에 넣는작업
         result[i][score[0].length] += result[i][j];  현재 행 숫자들의 합을 마지막 열에 넣는작업 
         result[score.length][j] += result[i][j];   현재 열의 합을 마지막 행에 넣어주는작업
         result[score.length][score[0].length] += result[i][j]; 총합을 마지막칸에 넣어줌

	 *  
	 *  
	 *  		
	 *  12.
		String[][] words = {{"chair","의자"},
					        {"computer","컴퓨터"},
						    {"integer","정수"}};
		
		Scanner scan = new Scanner(System.in);
		int count = 0;	맞춘문제 갯수 변수
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d.%s의 뜻은?",i+1,words[i][0]);
			String temp = scan.nextLine();
			
			if(temp.equals(words[i][1])){
				System.out.println("정답입니다.");		
				count++;	맞출때마다 갯수 증가
				
			}
			else{
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);   틀렸을 때 정답 공개
			}
		}
		System.out.println("총" + words.length + "문제 중 " + count + "개 맞추셨습니다.");  총 문자갯수(배열의 행 크기) 
		
			
	 *
	 * 13.
	      for(int j =0; j < question.length; j++){
         int idx = (int)(Math.random() % question.length); 
         
         char tmp;

         tmp = question[j];
         question[j] = question[idx];
         question[idx] = tmp;  //글자 위치를 바꿔주는작업
         
}
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
