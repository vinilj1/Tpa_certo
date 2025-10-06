
public class Altura {

	public static void main(String[] args) {
		int i = 0;
        double p = 145, j = 134;

        do {
            j = j + 2.5;
            p = p + 2;
            i++;
        } while (j < p);

        System.out.println("João ultrapassa Pedro em " + i + " anos");
        System.out.println("Altura final de João: " + j/100 + " m");
        System.out.println("Altura final de Pedro: " + p/100 + " m");

	}

}
