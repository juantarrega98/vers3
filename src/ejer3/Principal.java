package ejer3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area; double pi=3.1416; double radio; double altura; double perimetro;	
		// volumen= pi*radio al cuadrao* altura
		//area= 2*pi*radio*(radio+altura)
		Scanner sc=new Scanner(System.in);
		System.out.println("¡RECUERDA! LOS NÚMEROS TIENEN QUE ESTAR EN POSITIVO");
		System.out.println("Introduzca el radio");
		radio=sc.nextDouble();
		System.out.println("Introduzca la altura");
		altura=sc.nextDouble();
		cilindro(radio,altura);
	}
	public static void cilindro(double radio, double altura)
	{
	double pi=3.1416; double area; double perimetro; double volumen;
	int num;
	Scanner sc=new Scanner(System.in);

	do {
		System.out.println("Que prefiere hacer; presione '1' si quiere que sea area, presione '2' si quiere que sea volumen, presione '3' si quiere salir");
		num=sc.nextInt();
		switch(num) {
		case 1:
			if (num < 0)
				System.out.println("Introduzca un número superior o igual a 0");
					
			else 
			{
				area=2*pi*radio*(radio+altura);
				System.out.println("El área del cilindro es "+area);
				System.out.println("Que prefiere hacer; presione '1' si quiere que sea area, presione '2' si quiere que sea volumen, presione '3' si quiere salir");
				num=sc.nextInt();
			}
		case 2:
			if (num < 0)
				System.out.println("Introduzca un número superior o igual a 0");
			else 
			{
			double radiete;
			radiete=radio*radio;
			volumen=pi*radiete*altura;
			System.out.println("El volumen del cilindro es "+volumen);
			System.out.println("Que prefiere hacer; presione '1' si quiere que sea area, presione '2' si quiere que sea volumen, presione '3' si quiere salir");
			num=sc.nextInt();
			}
		case 3:
			System.out.println("Hasta luego");
			break;
		}
	}
	while (num>=1 && num<=2);
	
	}
}
