import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int anoNas,anoAtual,idade;
		System.out.println("coloque o ano de nascimento");
		anoNas = in.nextInt();
				System.out.println("colque o ano atual");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNas;
		System.out.println("sua idade é " + idade + " anos");
		if(idade<18) {
			System.out.println("você é menor de idade");
		}else if(idade>18){
			System.out.println("você é maior de idade");
		}
	}
 
}
