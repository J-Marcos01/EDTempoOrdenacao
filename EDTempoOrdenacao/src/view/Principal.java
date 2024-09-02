package view;

import controller.Operacoes;

public class Principal 
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		
		int []vet=new int [1500];
		
		for(int i=0;i<1499;i++)
		{
			vet[i]=1499-i;
		}
		System.out.println("Vetor Original ");
		for(int num:vet)
		{
			System.out.print(num+" ");
		}
		System.out.println("\n");
		op.ordenacao(vet);
	}

}
