import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		//declaração de variável
		int idade1,idade2,idade3,idade4,idade5,maior,menor,p1,p2;
		//Scanner
		Scanner in = new Scanner(System.in);
		//leitura
		System.out.println("coloque a primeira idade");
		idade1 = in.nextInt();
		System.out.println("coloque a segunda idade");
		idade2 = in.nextInt();
		System.out.println("coloque a terceira idade");
		idade3 = in.nextInt();
		System.out.println("coloque a quarta idade");
		idade4 = in.nextInt();
		System.out.println("coloque a quinta idade");
		idade5 = in.nextInt();
		//processamento1
		maior = 0;
		menor = 0;
		//escolha
		if(idade1>=18) {
			System.out.println("maior de idade");
		    maior = maior + 1;
		}else {
			System.out.println("menor de idade");
			menor = menor + 1;
		}
		if(idade2>=18) {
			System.out.println("maior de idade");
		    maior = maior + 1;
		}else {
			System.out.println("menor de idade");
			menor = menor + 1;
		}
		if(idade3>=18) {
			System.out.println("maior de idade");
		    maior = maior + 1;
		}else {
			System.out.println("menor de idade");
			menor = menor + 1;
		}
		if(idade4>=18) {
			System.out.println("maior de idade");
		    maior = maior + 1;
		}else {
			System.out.println("menor de idade");
			menor = menor + 1;
		}
		if(idade5>=18) {
			System.out.println("maior de idade");
		    maior = maior + 1;
		}else {
			System.out.println("menor de idade");
			menor = menor + 1;
		}
		p1 = (maior/5)*100;
		System.out.println(p1);
		p2 = (menor/5)*100;
		System.out.println(p2);
		
 in.close();
	}
   
}
