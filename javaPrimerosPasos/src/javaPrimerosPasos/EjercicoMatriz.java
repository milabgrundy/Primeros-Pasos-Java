package javaPrimerosPasos;

public class EjercicoMatriz {
	
	public static void main(String[] args) {
		
		
		// rectangular 
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// triangular
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				if (columna > fila) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// triangular de otra forma
			for (int fila = 0; fila <= 10; fila++) {
				for (int columna = 0; columna < fila; columna++) {
					 
						System.out.print("*");
						System.out.print(" ");
					}
					System.out.println();
				}
			
			
				
	}

}
