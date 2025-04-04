public class CalculadoraSencilla{
	//Instancias
	double numero1 = 0.0;
	double numero2 = 0.0;
	
	//Método Constructor
	public CalculadoraSencilla (double numero1, double numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//Métodos
	//Para sumar
	public double suma (double numero1, double numero2){
		double resultado = numero1 + numero2;
		return resultado;
	}
	//Para Restar
	public double resta (double numero1, double numero2){
		double resultado = numero1 - numero2;
		return resultado;
	}
	//Para multiplicar
	public double multiplicacion (double numero1, double numero2){
		double resultado = numero1 * numero2;
		return resultado;
	}
	//Para dividir
	public double division (double numero1, double numero2){
		double resultado = numero1 / numero2;
		return resultado;
	}
	//Para saber si son pares o impares
	public String parOImpar (double numero1, double numero2){
		String resultado = "";
		if (numero1 % 2 == 0){
			resultado = "El primer número es par \n";
		}
		else if (numero1 % 2 != 0){
			resultado = "El primer número es impar \n";
		}
		if (numero2 % 2 == 0){
			resultado += " " + "El segundo número es par \n";
		}
		else if (numero2 % 2 != 0){
			resultado += " " + "El segundo número es impar \n";
		}
		return resultado;
	}
	
}