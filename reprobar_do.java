package unidad3;

public class reprobar_do 
{

	public static void main(String[] args) 
	{
		boolean bandera=true;
				int calificacion;
				calificacion=0;
		do
		{
			if (calificacion<70)
			{
				System.out.println("la calificacion es:"+calificacion);
				calificacion=calificacion+1;
						bandera=true;			
			}
			else
				bandera=false;
		}
		while(bandera);
		System.err.println("mensaje");

	}

}
