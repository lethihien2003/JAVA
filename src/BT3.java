import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		System.out.println("Nhap b = ");
		int b = sc.nextInt();
		
		int max = (a>b)?a:b;
		System.out.println("So lon hon la: 2"+max);
	}
}
