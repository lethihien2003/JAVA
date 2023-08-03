import java.util.Scanner;

public class BT6 {
	public static void main(String[] args) {
		int n, dem=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap vao so phan tu cua day N so nguyen : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Nhap phan tu thu "+i+ " = ");
			int j = sc.nextInt();
			
			if(j<0) {
				dem+=j;
				System.out.println("So luong so nguyen am la: "+dem);
			}
		}
		
	}
}
