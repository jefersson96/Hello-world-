/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado1;
import java.util.Scanner; 
/**
 *
 * @author Jefersson
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner Leer = new Scanner(System.in);
int opcion=0;

while(opcion!=3){
    System.out.println("************ Menu *************");
System.out.println("[1]- Jugar ahorcado");
System.out.println("[2]- Inicializar repositorio");
System.out.println("[3]- Salir");
System.out.println("Ingrese el numero de opcion :");
opcion=Leer.nextInt();
  

switch(opcion){
    case 1:		




AHORCADO A = new AHORCADO();
		String letra = "";
		char Letra;
		int op = -1;
		do{	
			if(op == -1)
				op = 1;
			else{
				A.SOP("\n[1] - Jugar de Nuevo\n[0] - Salir");
				op = Leer.nextInt();
			}

			switch(op)
			{
				case 1:
					A.Iniciar();
					while(A.Gano == -1)
					{
						letra = Leer.next().toUpperCase();
						Letra = letra.charAt(0);
						A.BuscarLetra(Letra);
					}
					break;
				case 0:
					break;
				default:
					A.SOP("Opcion Indefinida!");
			}

		}while(op != 0);
                break;
    case 2: 
        AHORCADO palabra=new AHORCADO();
       
palabra.AgregarPalabras();

        break;
        
        
    case 3: System.exit(0);
break;

}




    
}
    }
}
   
