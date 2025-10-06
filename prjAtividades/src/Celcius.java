import java.util.Scanner;
public class Celcius {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double f,c;
		System.out.println("escreva a temperatura em fahrenhelt");
		f = in.nextDouble();
        System.out.println(f);
        c = (f-32)/1.8;
        System.out.println("temperatura em graus celcius = " + c);
        if(c<15) {
        	System.out.println("frio");
        }else if(c>=22){
        	System.out.println("calor");
        }
        in.close();
	}
 
}
