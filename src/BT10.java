
public class BT10 {
	public static void main(String[] args) {
		int dem =0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%7==0) {
				dem+=1;
			}
		}
		System.out.println(" So luong cac so nguyen chia het cho 3 hoac 7 nam trong doan 1 den 100 la: "+dem);
	}
}
