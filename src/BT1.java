import java.util.Scanner;

public class BT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thong tin sinh vien\n");
		
		System.out.println("Ho va ten: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Lop: ");
		String lop = sc.nextLine();
		
		System.out.println("Truong: ");
		String truong = sc.nextLine();
		
		System.out.println("Gioi tinh: ");
		String gioiTinh = sc.nextLine();
		
		System.out.println("Ngay sinh: ");
		byte ngaySinh = sc.nextByte();
		
		System.out.println("Que quan: ");
		String queQuan = sc.nextLine();
		
		System.out.println("\n\nThong tin sinh vien da nhap la: \n");
		System.out.println("Ho va ten: "+ hoVaTen);
		System.out.println("Lop: "+ lop);
		System.out.println("Truong: "+truong);
		System.out.println("Gioi tinh: "+gioiTinh);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Que quan: "+queQuan);
		
	}
}
