package javaapplication1.Trunk;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
			ingresarlados();
	}
		
//-----------Methods-----------
private static void ingresarlados(){
	int lado1, lado2, lado3;
	Scanner sc = new Scanner(System.in);
	Triangulo T = new Triangulo();
		
	System.out.print("Introduzca Lado 1: \n");
	lado1 = sc.nextInt();
	T.ValidacionTriangulo(lado1);
	System.out.print("Introduzca Lado 2: \n");
	lado2 = sc.nextInt();
	T.ValidacionTriangulo(lado2);
	System.out.print("Introduzca Lado 3: \n");
	lado3 = sc.nextInt();
	T.ValidacionTriangulo(lado3);
		
	T.ValidacionTriangulo2(lado1, lado2, lado3);
	T.TipoTriangulo(lado1, lado2, lado3);
	sc.close();				
}
}

