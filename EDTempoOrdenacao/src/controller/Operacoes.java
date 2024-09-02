package controller;

public class Operacoes 
{

	public Operacoes() 
	{
		super();
	}
	
	public void ordenacao(int[]vet)
	{
		br.edu.fateczl.bubblesort.Operacoes bubble = new br.edu.fateczl.bubblesort.Operacoes();
		br.edu.fateczl.megesort.Operacoes merge = new br.edu.fateczl.megesort.Operacoes();
		br.edu.fateczl.quicksort.Operacoes quick = new br.edu.fateczl.quicksort.Operacoes();
		int inicio=0;
		int fim=vet.length-1;
		
		double tInicial=0;
		
		
		tInicial=System.nanoTime();
		bubble.bubbleSort(vet);
		double tFinal=System.nanoTime();
		double res=(tFinal-tInicial);
		res=res/Math.pow(10, 9);
		
		System.out.println("\nTempo de ordenação BubbleSort :"+res);
		
		tInicial=System.nanoTime();
		merge.megeSort(vet, inicio, fim);
		tFinal=System.nanoTime();
		res=(tFinal-tInicial);
		res=res/Math.pow(10, 9);
		
		System.out.println("\nTempo de ordenação MergeSort :"+res);
		
		tInicial=System.nanoTime();
		quick.quickSort(vet, inicio, fim);
		tFinal=System.nanoTime();
		res=(tFinal-tInicial);
		res=res/Math.pow(10, 9);
		
		System.out.println("\nTempo de ordenação QuickSort :"+res);
	}
	
	

	
	
	

}
