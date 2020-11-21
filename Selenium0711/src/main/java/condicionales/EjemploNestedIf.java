package condicionales;

public class EjemploNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 14;
		
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("A la playa!");
			} else {
				System.out.println("A la montania");
			}
		} else {
			System.out.println("A descansar...");
		}
	}

}
