package Ahorcado1;

import java.util.Random;
import java.util.Scanner;
        
public class AHORCADO 
{
    
    private String palabra = "", Solucion = "";
	private int posicion = -1, intentos = 0, maxintentos = 15;
	public String [] PALABRAS={"MUNDO","ESCUELA","TELEVISION","PROGRAMACION","JEFERSSON","UNITEC"};//new String[7];
	public int Gano = -1;

	public void Iniciar()
	{
		Random R = new Random();
		int x = -1;
		do{
			x = R.nextInt(PALABRAS.length);
		}while(posicion == x);
		posicion = x;
		palabra = PALABRAS[posicion];

		for(x = 0; x < palabra.length(); x++)
		{
			if(palabra.charAt(x) != ' ')
				Solucion += "_";
			else
				Solucion += " ";			
		}
		Dibujar();			
	}

        public  String[] AgregarPalabras(){
       Scanner Leer=new Scanner(System.in);
          
            for(int i=0;i<PALABRAS.length;i++){
System.out.println("Ingrese la palabra "+"["+i+"]");
palabra=Leer.next();
            PALABRAS[i]=new String(palabra);
            }
        return PALABRAS;
            
       
        
        
        }
        
	public void BuscarLetra(char pal)
	{
		String Sol1 = Solucion;
		Solucion = "";
		for(int x = 0; x < palabra.length(); x++)
		{
			if(palabra.charAt(x) != ' ')
			{
				if(pal == palabra.charAt(x))
					Solucion += pal;
				else				
					Solucion += Sol1.charAt(x);				
			}else
				Solucion += ' ';
		}

		if(Sol1.compareTo(Solucion) == 0 && Solucion.indexOf(pal) == -1)
			intentos++;

		Dibujar();
		if(Solucion.compareTo(palabra) == 0)
		{
			Gano = 0;
			SOP("Usted ha GANADO!!!!");
		}else if(intentos == maxintentos){
			Gano = 1;
			SOP("Usted ha perdido!!! ");
		}
	}

    public void setPALABRAS(String[] PALABRAS) {
        this.PALABRAS = PALABRAS;
    }



    public String[] getPALABRAS() {
        return PALABRAS;
    }

	private void Dibujar()
	{
		for(char c: Solucion.toCharArray())
			System.out.print(c + " ");
		SOP("");
		SOP("\nIntentos restantes: " + (maxintentos - intentos));
	}
	public void SOP(String msj)
	{
		System.out.println(msj);	
	}

}
