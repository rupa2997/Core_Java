import java.util.Scanner;
class ArrayDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		for(int i=0;i<3;i++){
			System.out.println("Enter ele");
			ar[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.println(ar[i]);
		}
	}
}