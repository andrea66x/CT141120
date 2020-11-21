package arreglos;

public class ArregloMultiEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		// La primera posicion es el array y la segunda posicion es dentro de nuestro array
		// System.out.println(arr[2][1]);
		// System.out.println(arr[0][0]);
		// System.out.println(arr[1][2]);
		
		// Imprimir arreglo de dos dimensiones
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");				
			}
			System.out.println();
		}
		
		
		// ========= Ejemplo con varios tamanios de arreglos ======
		
		
		int arr2[][] = {{2,7,9},{3,6,1},{5,3}};
		
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print("Arreglo multi posicio. " + i + " ," + j + ": " + arr2[i][j]);				
			}
			System.out.println();
		}
		
	}

}
