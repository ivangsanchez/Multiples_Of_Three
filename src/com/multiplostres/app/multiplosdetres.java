package com.multiplostres.app;

public class multiplosdetres 
{

	public static void main(String[] args) 
	{
		int cont=0;
		
		for (int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
				cont++;
			}
			
		}
		System.out.println("Numero de multiplos: "+cont);

	}

}
