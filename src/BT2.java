import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println("Tong la: "+tong);
		
		int hieu = a - b;
		System.out.println("Hieu la: "+hieu);
		
		int tich = a * b;
		System.out.println("Tich la: "+tich);
		
		float thuong = (float)a / b;
		System.out.println("Thuong la: "+thuong);
		
		int phanDu = a % b;
		System.out.println("Phan du la: "+phanDu);
		
	}
}
