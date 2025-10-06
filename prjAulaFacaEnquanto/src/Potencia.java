import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int b,e,p,i=1;
		Scanner in =new Scanner(System.in);
		System.out.println("coloque a base");
		b = in.nextInt();
		System.out.println("coloque o expoente");
		e = in.nextInt();
		
		do {
			p=b;
			p=p*b;
			i++;
		}while(i<=e);
        System.out.println(p);
        in.close();
	}

}
