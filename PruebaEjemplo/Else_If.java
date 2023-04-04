package PruebaEjemplo;

public class Else_If {

	public static void main(String[] args) {
		
		int h = 20;

		if(h>=0 && h<=12)
			System.out.println("Buen dia");
		else {
			if(h>12 && h<=18)
				System.out.println("Buenas tardes");
			else
				System.out.println("Buenas noches");
		     }


	}

}
