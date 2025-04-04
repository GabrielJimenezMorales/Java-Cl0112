import java.util.Scanner;
public class EjecutarCalculadora{
	public static void main (String [] args){
		Scanner scanner = new Scanner (System.in);
		
		double num1 = 0;
		
		double num2 = 0;
		
		
		CalculadoraSencilla calculadora = new CalculadoraSencilla (num1, num2);
		int tamañoHistorial = 20;
		int indiceWhile = 0;
		String [] historial = new String [tamañoHistorial];
		boolean otraOperacion = true;
		while (otraOperacion && indiceWhile < tamañoHistorial){
			System.out.println ("_____________________________________________________________________________ \n");
			System.out.println (" Ingrese el primer número: ");
			num1 = scanner.nextDouble();
			
			System.out.println (" Ingrese el segundo número: ");
			num2 = scanner.nextDouble();
			System.out.println ("\n_____________________________________________________________________________ \n");
			System.out.println (" Ingrese la operación que desea hacer:  \nDigite 1 para suma \nDigite 2 para resta \nDigite 3 para multiplicacion \nDigite 4 para division \nDigite 5 para calcular si los números son pares o impares " );
			int opcion = scanner.nextInt();
			System.out.println ("\n_____________________________________________________________________________ \n");
			switch (opcion){
				case 1:
					double respSuma = calculadora.suma(num1, num2);
					String respuestaSuma = "_____ \nLa suma de " + num1 + " + " + num2 + " es " + respSuma+ "\n_____";
					System.out.println (respuestaSuma);
					historial [indiceWhile] = respuestaSuma;
				break;
				case 2:
					double respResta = calculadora.resta(num1, num2);
					String respuestaResta = "_____ \nLa resta de " + num1 + " - " + num2 + " es " + respResta+ "\n_____";
					System.out.println (respuestaResta);
					historial [indiceWhile] = respuestaResta;
				break;
				case 3:
					double respMultiplicacion = calculadora.multiplicacion(num1, num2);
					String respuestaMultiplicacion = "_____ \nLa multiplicacion de " + num1 + " * " + num2 + " es " + respMultiplicacion+ "\n_____";
					System.out.println (respuestaMultiplicacion);
					historial [indiceWhile] = respuestaMultiplicacion;
				break;
				case 4:
					double respDivision = calculadora.division(num1, num2);
					String respuestaDivision = "_____ \nLa division de " + num1 + " / " + num2 + " es " + respDivision+ "\n_____";
					System.out.println (respuestaDivision);
					historial [indiceWhile] = respuestaDivision;
				break;
				case 5:
					String respParOImpar = calculadora.parOImpar(num1, num2);
					String respuestaParOImpar = "_____ \n \nLos números " + num1 + " y " + num2 + " son: \n " + respParOImpar + "\n_____" ;
					System.out.println (respuestaParOImpar);
					historial [indiceWhile] = respuestaParOImpar;
				break;
				default:
				System.out.println("Opcion incorrecta"); 
			}
			
			System.out.println (" ¿Desea hacer otra operación?\nFavor poner true para sí\nFavor poner false para no:   ");
			otraOperacion = scanner.nextBoolean();
			if (otraOperacion){
				otraOperacion = true;
				indiceWhile ++;
			}
			else{
				System.out.println ("_____________________________________________________________________________ \n");
				System.out.println ("El historial es: \n");
				for(int i = 0; i <= indiceWhile;i++){
					System.out.println (historial [i] + "\n");
				}
			}
			System.out.println ("_____________________________________________________________________________ \n");
		}
	}

}