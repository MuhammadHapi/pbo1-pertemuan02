import java.util.Scanner;

public class InputOutput{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String nama;
		int jumlahSks;
		double IPK;

		System.out.println("Masukkan nama anda	: ");
		nama = scanner.nextLine();
		System.out.println("Hai, "+nama);

		System.out.println("Masukkan jumlah SKS yang sudah di tempuh	: ");
		jumlahSks = scanner.nextInt();

		System.out.println("Masukkan IPK Sementara	: ");
		IPK = scanner.nextDouble();

		double jumlah = IPK * jumlahSks;
		System.out.println("Total Nilai = "+jumlah);
	}
}