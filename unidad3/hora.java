package unidad3;

public class hora 
{

	public static void main(String[] args)
	{
		int segundo=0,minuto=0;
		while (segundo<60)
			segundo=segundo+1;

			System.out.println("el minuto se completo");
		if(minuto<60)
		minuto=segundo+1;
		else
			System.out.println("la hora se completo");

	}

}

