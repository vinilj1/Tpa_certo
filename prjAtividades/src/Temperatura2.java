import java.util.Scanner;
public class Temperatura2 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double f,c;
		System.out.println("escreva a temperatura em fahrenhelt");
		f = in.nextDouble();
        System.out.println(f);
        c = (f-32)/1.8;
        System.out.println("temperatura em graus celcius =" + c);
        if(c<0) {
        	System.out.println("frio extremo");
        }else if( c<= 10) {
        	System.out.println("frio");
        }else if(c<=20) {
        	System.out.println("frio moderado");
        }else if(c<=24) {
        	System.out.println("ameno");
        }else if(c>24) {
        	System.out.println("calor");
        }
        in.close();
	}

}
