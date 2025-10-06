import java.util.Scanner;

public class SequenciaDeAlguem {

	public static void main(String[] args) {
		int p, se,n,pr,i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("insira até onde precisa fazer");
		n = in.nextInt();
		p=1;
		System.out.println(p);
		se=0;
		i=1;
		do {
			pr=p+se;
			System.out.println(pr);
			se=p;
			p=pr;
			i++;
		}while(i<=n);
		in.close();
	}

}
