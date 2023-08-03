import java.util.Scanner;

public class BT8 {
	public static void main(String[] args) {
		float a,b,x;
		
		System.out.println("\nGIAI PT BAC NHAT ax + b = 0\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextFloat();
		System.out.println("Nhap b = ");
		b = sc.nextFloat();
		
		if(a==0) {
			if(b==0) {
				System.out.println("PT co VSN");
			}else System.out.println("PT VN");
		}else { 
			x = -b/a;
			System.out.println("Phuong trinh co nghiem x = -b/a la: "+x);
		
		}
	}
}
