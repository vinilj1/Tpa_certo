import java.util.Scanner;
public class ImparOuPar {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		double numero,resto;
		System.out.println("coloque o n�mero");
		numero = in.nextInt();
		System.out.println(numero);
		resto = numero % 2;
		if(resto != 0) {
		  System.out.println("�mpar");
		}else if( resto == 0){
			System.out.println("par");
		}
	}

}
