package algoritmosbusqueda;

import java.util.Scanner;

public class DemoBusquedaLineal 
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		System.out.println("Tamaño de arreglo: ");
		int n = lector.nextInt();
		
		int A = [];
		
		System.out.println("Ingrese los elementos del arreglo: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Elemento [" + i + "] =");
			A[i] = lector.nextInt();
		}
		

	}
	
}
