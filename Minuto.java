public class Minuto {
	public static void main(String[] args) {
		
		int segundo=0, minuto=0; // Se declaran las variables y se inician con 0
		                         // Como se declaran dentro del metodo main se les 
		                         // llama variables locales
		
		while(segundo<60){ // este es un ciclo, y se ejecuta lo 
			               // que este dentro de el mientras se 
			               // cumpla la condicion que esta entre parentesis.			
			System.out.println("Segundo : " + segundo);
			try {
				Thread.sleep(1000);// Detiene cualquier ejecucion del 
				                   // programa durante el tiempo que 
				                   // pones en los parentesis, el tiempo 
				                   // lo pones en milisegundos 1000 milisegundos es = a un segundo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			segundo+=1; // es lo mismo que segundo = segundo + 1 o puedes usar segundo++;
		}
		
		System.out.println("Se completo el minuto"); // Se imprime el resultado hasta que 
		                                             // la condicion del buble de arriba ya no se cumple
	}
}
