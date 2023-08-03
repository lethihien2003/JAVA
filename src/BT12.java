import java.util.Scanner;

public class BT12 {
	public static void main(String[] args) {
		float n, p=1, s=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao n = ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			p*=i;
			s+=i/p;
		}
		System.out.println("Tong S = "+s);
	}
}
