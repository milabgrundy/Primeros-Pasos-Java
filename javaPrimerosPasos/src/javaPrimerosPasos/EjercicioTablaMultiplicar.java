package javaPrimerosPasos;

public class EjercicioTablaMultiplicar {
	public static void main(String[] args) {
		
		 for (int contador = 0; contador <= 10 ; contador++) {
			 
			 for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				 System.out.print(contador * multiplicador); // en la misma linea
				 System.out.print(" ");
				
			 }
			 System.out.println(); // salto de linea cuando cambie de numero
		 }
	}

}
