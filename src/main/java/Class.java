
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int temp=n;
		int arm=0;
		while(n!=0) {
		int rem=n%10;
		 arm=rem*rem*rem+arm;
		n=n/10;
		}
		if(arm==temp) {
			System.out.println("ts arm");
		}
		else {
			System.out.println("no arm");
	}

}
}