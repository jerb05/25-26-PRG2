import java.util.Scanner;

public class ExamenMina{

		
	static int[][] Mapa = 	
		{

			{ 0, 	0, 	0, 	0, 	0, 	0,	0},
			{ 0, 	0,	0, 	0, 	0, 	0,	0},
			{ 0, 	0, 	0,	0, 	0, 	0,	0},
			{ 0, 	0,	0, 	0, 	0, 	0,	0},
			{ 0, 	0,	0, 	0, 	0, 	0,	0}
		};

	public static void main(String[] args){	
	Scanner scan = new Scanner(System.in);
		
    int cantidadMinas = 0;	
		while ( cantidadMinas < 5){
			int posYMina = (int)(Math.random()*5);
			int posXMina = (int)(Math.random()*7);
			if(Mapa[posXMina][posYMina] == 1) {

            } else{
                Mapa[posXMina][posYMina] = 1;
                 cantidadMinas++;
            }
			
                }
			
			
		}
	
		int posX= 0;
        int posY= 0;
        int contadorMapa = 0;
        int contadorMinas = 0;
         
        boolean valoresCorrectos;
         boolean juegoIniciar = true; {

            while (juegoIniciar) {
			for( int i = 0; i<Mapa.length; i++){            
				for (int j = 0; j<=Mapa.length+1; j++) {                                     
					System.out.print(Mapa[i][j]);
				}
				System.out.println(" ");
			}

        }
        
		
        
			valoresCorrectos=0;
			while(valoresCorrectos==0){
				System.out.println(" ");
				System.out.println("Ingrese X");
				posY = scan.nextInt();
				System.out.println("Ingrese Y");
				posX = scan.nextInt();
				if(posX>5){
					valoresCorrectos=0;
				}
				else if(posY>7){
					valoresCorrectos=0;
				}
				else{
					valoresCorrectos=1;
				}
			}

			if(Mapa[posX][posY]=="1"){
			Mapa[posX][posY]="x";
			contadorMinas++;
			}
			else if(Mapa[posX][posY]=="0"){
			Mapa[posX][posY]=".";
			}
			else{
			System.out.println("No es correcta esa opcion.");
			}
			
			contadorMapa++;
			if(contadorMinas>2){
				juegoEncendido=0;
				System.out.println("Has perdido");
			}
			else if(contadorMapa>=31){
				System.out.println("Felicidades Ganador!");
				juegoEncendido=0;
			}
			else{
				
			}
		}
	}	
		
		
