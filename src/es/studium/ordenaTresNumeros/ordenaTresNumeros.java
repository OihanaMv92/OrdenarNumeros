package es.studium.ordenaTresNumeros;

import java.util.Scanner;

public class ordenaTresNumeros
{
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Indicar el n�mero 1:");
		a = teclado.nextInt();
		System.out.println("Indicar el n�mero 2:");
		b = teclado.nextInt();
		System.out.println("Indicar el n�mero 3:");
		c = teclado.nextInt();
		if ((a>=b) && (b>=c))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+a+" ,"+b+" ,"+c);
		}
		if ((a>=c) && (c>=b))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+a+" ,"+c+" ,"+b);
		}
		if ((b>=a) && (a>=c))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+b+" ,"+a+" ,"+c);
		}
		if ((b>=c) && (c>=a))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+b+" ,"+c+" ,"+a);
		}
		if ((c>=a) && (a>=b))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+c+" ,"+a+" ,"+b);
		}
		if ((c>=b) && (b>=a))
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: "+c+" ,"+b+" ,"+a);
		}
		teclado.close();
	}
}



