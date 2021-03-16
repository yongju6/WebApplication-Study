package chapter01;

public class CalculatorEx03 {
	public static void main(String[] args) {
		int addResult = 1+1;
		System.out.println("addResult : " + addResult);
		double divResult =10.0/3.0;
		
		System.out.println("divResult : " + divResult);
		char num = '0' + '1';
		System.out.println("char Num : " + num);
		int cNum = num;
		System.out.println("cNum : " + cNum);
		int num1 = 31;
		num1 +=1;
		System.out.println("num1 + 1 : " + num1);
		int add=0;
		for(int i=1; i<11; i++) {
			add += i;
		}
		
		System.out.println("add : " + add);
			
	} // end main
}
