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
			int posYMina = (int)(Math.random() * 5);
			int posXMina = (int)(Math.random() * 7);
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
        
		
        
			while(!valoresCorrectos) {
				System.out.println(" ");
				System.out.println("Ingrese X");
				Scanner scan = null;
                posY = scan.nextInt();
				System.out.println("Ingrese Y");
				posX = scan.nextInt();
				if (posX >= 1 && posX <= 5 && posY >= 1 && posY <= 7) {
					valoresCorrectos = true;
				}
				else{
					valoresCorrectos = false;
                    System.out.println("Coordenada invalida. Fuera del mapa.");
				}
			}

			if(Mapa[posX][posY] == 1){
			Mapa[posX][posY] = 3;
			contadorMinas++;
            System.out.println("Encontraste una mina.");
			}
			else if(Mapa[posX][posY] == 0){
			Mapa[posX][posY]= 2;
            System.out.println("No hay nada aqui");
			}
			else{
			System.out.println("No es correcta esa opcion.");
			}
			
			contadorMapa++;
			if(contadorMinas >= 3) {
				juegoIniciar = false;
				System.out.println("Te has parado en muchas minas. Perdiste.");
			}
			else if(contadorMapa >= 30){
				System.out.println("Ganaste! Has despejado el mapa!");
				juegoIniciar = false;
			}
			else{
				
			}
		}
	}	
		
		
