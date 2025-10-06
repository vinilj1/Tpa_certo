import java.util.Scanner;
public class Numero {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
				int n;
				System.out.println("escreva o número");
				n = in.nextInt();
						if(n<0) {
							System.out.println("negativo");
						}else if(n>0) {
							System.out.println("positivo");
						}
	}

}
