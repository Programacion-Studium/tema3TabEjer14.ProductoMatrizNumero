package es.Studium.tabEjer14;

import java.util.Scanner;

public class ProductoMatrizNumero 
{

	public static void main(String[] args) 
	{
		int tabla1[][] = new int[3][3];
		int mult;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el numero a multiplicar: ");
		mult=teclado.nextInt();
		//Llamamos al Metodo para introduccir datos a la matriz
		introducirDatos1(tabla1, teclado);
		//multiplicamos la matriz por el número
		multiplicarMatriz(tabla1, mult);
		teclado.close();
	}
	//Metodo para multiplicar la matriz por un numero introducido por teclado
	private static void multiplicarMatriz(int[][] tabla1, int mult) {
		int i, e;
		//ponemos un for para recorrer la fila del array
		System.out.println("El resultado de la multiplicacion es");
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//multiplicamos cada numero de la tabla por el numero
				System.out.print(tabla1 [i][e] * mult+" ");
			}
			System.out.println();
		}
	}
	// Metodo para introducir los Datos de la matriz por el teclado
	private static void introducirDatos1(int[][] tabla1, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir de la tabla 1 el valor " + i + " , " + e + " : ");
				tabla1 [i][e] = teclado.nextInt();
			}
		}
	}
}
