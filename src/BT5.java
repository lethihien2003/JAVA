import java.util.Scanner;

public class BT5 {
	public static void main(String[] args) {
		int m,n,k, s=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao m = ");
		m = sc.nextInt();
		System.out.println("Nhap vao n (voi n<=m) = ");
		n = sc.nextInt();
		System.out.println("Nhap vao k = ");
		k = sc.nextInt();

		if(m>=n) {
			for(int i=n; i<=m; i++) {
				if(i%k == 0) {
					s+=i;
				}
			}
			System.out.println("Tong ca so chia het cho k trong khoang tu n den m la: "+s);
		}else System.out.println("Khong thoa man");
	}
}
