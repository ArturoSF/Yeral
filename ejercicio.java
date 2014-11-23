
public class ejercicio 
{

	public static void main(String[] args) 
	{
		int cal;
		cal=40;
		if(cal<50)
		{
			while (cal>20)
			{
				cal=cal-2;
			}
			System.out.println("calificacion:"+cal);
			do
			{
				cal=cal+3;
			}
			while(cal<80);
		}
		if (cal>50)
		{
			do
			{
				cal=cal-1;
			}
			while(cal>70);
			System.out.println("calificacion:"+cal);
			while (cal<90)
			{
				cal=cal+4;
			}
			System.out.println("calificacion:"+cal);
		}
		if(cal==50)
			System.out.println("calificacion:"+cal);
			}

	}

