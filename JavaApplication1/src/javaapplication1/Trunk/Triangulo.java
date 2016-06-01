package javaapplication1.Trunk;

public class Triangulo{
	int lado1;
	int lado2;
	int lado3;
	
public void TipoTriangulo(int l1, int l2, int l3){
	if(l1 == l2 && l2 == l3 && l1==l3){
		System.out.print("El triangulo es equilatero\n");
	}else if((l1 == l2) || (l2 == l3) || (l1==l3)){
		System.out.print("El triangulo es isoceles\n");
	}else{
		System.out.print("El triangulo es escaleno\n");
	}
	
}
void ValidacionTriangulo(int l1){
	if((l1)<0){
		System.out.print("Ingrese numero mayor a 0\n");
	}
}

void ValidacionTriangulo2(int l1, int l2, int l3){
	if ((l1 + l2)<l3){
		System.out.print("No es posible generar un triangulo");
	}
	if ((l1 + l3)<l2){
		System.out.print("No es posible generar un triangulo");
	}
	if ((l3 + l2)<l1){
		System.out.print("No es posible generar un triangulo");
	}
}
} //close main