import java.util.Scanner;

public class BT7 {
	public static void main(String[] args) {
		double a,b,c,x1,x2,delta;
		
		System.out.println("\nGIAI PT BAC HAI ax^2 + bx +c =0\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextFloat();
		System.out.println("Nhap b = ");
		b = sc.nextFloat();
		System.out.println("Nhap c = ");
		c = sc.nextFloat();
		
		delta = Math.pow(b, 2) - 4*a*c;
	
		if(delta > 0) {
			System.out.println("PT co 2 nghiem: ");
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
		}else if(delta == 0){
			x1 = -b/(2*a);
			System.out.println("PT co nghiem kep x1 = x2 = "+x1);
		}else System.out.println("PT vo nghiem");
	}
}
