
public class contraseña 
{

	public static void main(String[] args) 
	{
      String pass_sis, pass_us;
      pass_sis="ABCD";
      pass_us="abcd";
      System.out.println("la contraseña del sistema:"+pass_sis);
      System.out.println("la contraseña del usuario es:"+pass_us);
      for(int i=0;i<3;i++)
      {
    	  if(pass_sis.equals(pass_us.toUpperCase()))
    	  {
    		  System.out.println("Acceso correcto!!!");
    		  System.exit(0);
    	  }
    	  else
    		  System.out.println("acceso denegado..."+(i+1));
      }
	}

}
