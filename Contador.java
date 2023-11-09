package contar;

import java.rmi.AccessException;
import java.util.Scanner;

public class Contador{

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		if(parametroUm>parametroDois) {
			
			System.out.println("O parametro um e: "+parametroUm+"E o parametro dois e: " +parametroDois);
			
		}else {
			System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
		
		}
		}
	}

	
