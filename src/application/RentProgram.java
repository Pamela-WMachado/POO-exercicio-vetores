package application;

import java.util.Scanner;
import entities.Registration;

public class RentProgram {

	public static void main(String[] args) {
		// pensão com 10 quartos livres - quartos numerados de 0 a 9
		//leia um número N para indicar quantos estudantes querem alugar um quarto
		//faça um registro para salvar o nome, email e quarto de cada estudante
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("How many bedrooms will be rented?");
		int n = sc.nextInt();
		
		Registration[] rent = new Registration [10];
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i);
			
			System.out.print("Name: ");
			sc.nextLine(); //<-- POR QUE?
			String name = sc.nextLine();
			
			System.out.print("Email:");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			//instancio o objeto rent e faço os valores depositados em room ocupares as respectivas posições do vetor
			rent[room] = new Registration (name, email);
		}
	 System.out.println();
	 System.out.println("Busy rooms:");
	 for (int i = 0; i<10; i++)
		 if (rent[i] != null) {
			 System.out.println(i + ": " + rent[i]);
		 }
		
		
		sc.close();
	}

}
