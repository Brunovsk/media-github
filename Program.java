package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double  media=0;
		
		System.out.println("Digite o numero de alunos:");
		int a = sc.nextInt();
		System.out.println("Digite o numero de notas:");
		int n = sc.nextInt();
		
		String [] aluno = new String[a];
		double []nota = new double [n];

		for (int i=0; i <aluno.length;i++) {
			System.out.println("Digite o NOME do aluno #"+(i+1)+":");
			String nome = sc.next();
			aluno[i] = nome;
			double soma=0;

			for (int j=0; j <nota.length;j++) {
				System.out.println("Digite a NOTA #"+ (j+1)+ " do aluno "+aluno[i]);
				double nota1 = sc.nextInt();
				soma = soma + nota1;
				media = soma / n;
				nota [i]=media;
			}
			
		}
		for(int i=0;i<aluno.length;i++) {
			System.out.println("O aluno "+aluno[i]+ " tem media de "+ nota[i]+"!");
		}
			
		sc.close();
	}

}
