import java.util.Scanner;
/*nombre de la clase
 */
public class Principal {
	
	/*metodo principal
	 */
public static void main(String[] args) {
	
	int opcion;
	/*menu para seleccionar una opcion
	 */
	System.out.println("a cual base de datos desea conocer la capacidad de respuesta?\n ");
	
	System.out.println("1: oracle");
	
	System.out.println("2: microsoft");
	
	Scanner entrada = new Scanner(System.in);

	opcion = entrada.nextInt();
	switch(opcion) {
	case 1:
	System.out.println(Microsoft);
	break;
	case 2:
	System.out.println(Oracle);
	break;
	default:
	System.out.println("opcion invalida");
	break;
	}
}
}
