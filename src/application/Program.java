package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Contador;
import excecao.ParametrosInvalidosException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Parâmetro um: ");
		int parametroUm = sc.nextInt();
		System.out.println("Parâmetro dois: ");
		int parametroDois = sc.nextInt();
		
		Contador contador = new Contador(parametroUm, parametroDois);
		
		try {
		contador.contar(parametroUm, parametroDois);
		
		sc.close();
		}
		catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

}
