import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
		int n, tong=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap vao n so nguyen duong:  ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Nhap so nguyen duong thu "+i+ " = ");
			int j = sc.nextInt();
			
			if(j%4==0 || j/100==3) {
				tong+=j;
			}
		}System.out.println("Tong cac so chia het cho 4 hoac co chu so o hang tram la 3 la: "+tong);
	}
}
