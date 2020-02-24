package z_exam;

public class Exam07 {
	/*1.
	class SutdaCard(){
		int num = (int)(Math.random()*10)+1;
		boolean isKwang = false;
	}
	
	2.
	public SutdaCard(int i, boolean a){
		num = i;
		isKwang = a;
	}
	void info(){
		
	}
	3.
	public class Student(){
		String name;
		int ban,no,kor,eng,math;
	}
		
	4.
	int getTotal(){
		int sum = 0;
		return sum = kor+eng+math;
	}
	float getAverage(){
		int sum = this.getTotal();
		float avg = (flaot)sum/3;
		
		return avg;
	}
	5.
	Student(String name, int a,int b,int c,int d,int e){
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;		
	}
	info(){
		int sum = c+d+e;
		double avg = (double)sum/3;
		System.out.println(name+ "," + a + "," + b + "," + c + "," + sum + "," + avg);
	}
	
	6. //그리스 철학자 피타고라스의 정리를 이용해 두 점의 거리를 구할 수 있다.
	int _X;
	int _y;
	if(x < x1){
		_x = x1 - x;			//두 점의 x좌표가 큰것에서 작은것을 빼 x의 거리를 구한다.
	}
	else{
		_x = x - x1;
	}
	if(y<y1){
		_y = y1 - y;			//두 점의 y좌표가 큰것에서 작은것을 빼 y의 거리를 구한다.
	}
	else{
		_y = y - y1;
	}
	double result;
	result = Math.sqrt((double)(_x*_x)+(_y*_y));	피타고라스 정리 공식이다. 
	*
	*
	7.
	double getDistance(int x1, int y1)
	int _x;
	int _y;	
	if(x < x1){
		_x = x1 - x;
	}
	else{
		_x = x - x1;
	}
	if(y<y1){
		_y = y1 - y;
	}
	else{
		_y = y - y1;
	}
	double result;
	return result = Math.sqrt((double)(_x*_x)+(_y*_y));
	
	8.
	클래스변수(static 변수) : width, height
	인스턴스변수 : kind, num
	지역변수 : k,n,args[], card
	
	9.
	weapon, armor;
	*
	18.
	d = static매소드가 아니기 때문에 this로 접근해야한다.
	
	19.abc123
	 after change : abc123  
	*
	20.
	int[] shuffle(int[] a){
		int[] arr = new int[a.length];
		int idx = 0;
		int tmp = 0;
		for(int i = 0; i < arr.length; i++){
			idx = (int)(Math.random()*arr.length);
			tmp = a[i];
			a[i] = a[idx];			
			a[idx] = tmp;
		}
		arr = a;
		return arr;
	}
	22.
	boolean isNumber(String str){
		boolean b =false;
		for (int i = 0; i < str.length(); i++) {
			if( 0<=str.charAt(i) && str.charAt(i) <=9){
				b = true;
			}
		}
		return b;
	}
	*
	23.
	int Max(int[] arr){
		int max = 0;
		if(arr.length == 0 || arr == null){
			return -999999;
		}
		else{
			max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if(max < arr[i]){
					max = arr[i];
				}
			}
			return max;
		}   
	}
	*
	24.
	public static int abs(int value) {
		
		if (0 < value) {
			return value;
		} 
		else {
			return value * -1;
		}
	}
	*
	*/
	
	
	
	
	
	
	
	
	
	
}
