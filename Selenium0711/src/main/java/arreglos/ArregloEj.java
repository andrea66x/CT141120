package arreglos;

public class ArregloEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int [] intArray2;
		
		short shortArray[];
		String array[];
		
		array = new String[6];	// Asignando memoria para 5 Strings
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		array[5] = "Cinco";
		
//		System.out.println("Elemento en la posicion 1: " + array[1]);
//		System.out.println("Elemento en la posicion 3: " + array[3]);
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + array[i]);
		}
		
		int[] intArrayDinamico = new int[] {1,2,3,4,3,4,12};
	}

}
