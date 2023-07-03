package javaPrimerosPasos;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hola jeje");

		int edad = 21;
		int cantidadPersonas = 2; // declarar variables para que sean auto explicativas
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >=18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);
		
		 if (puedeEntrar) {
				System.out.println("Sea bienvenido");
			} else
				System.out.println("Usted no esta permitido a entrar");
		}
}
		
		
		/* Ejemplo 1
		 
		 if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else
			System.out.println("Usted no esta permitido a entrar");
	}
} 

 Ejemplo 2
		 
		 if (edad >= 18 && cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else
			System.out.println("Usted no esta permitido a entrar");
	}
} 

*/
