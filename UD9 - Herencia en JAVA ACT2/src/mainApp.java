import java.util.ArrayList;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Serie[] series=creaArraysSeries();
		System.out.println("");
		videojuego[] juegos=creaArrayJuegos();
		System.out.println("");
		entregaSeries(series);
		System.out.println("");
		entregaJuegos(juegos);
		System.out.println("");
		int[] numentregados=compruebaEntregados(juegos,series);
		System.out.println("El numero de juegos entregados es: "+numentregados[1]+
				"\nEl numero de series entregadas es: "+numentregados[0]);
		System.out.println("");
		muestraSeries(series);
		System.out.println("");
		muestraJuegos(juegos);
		System.out.println("");		
		
		
		
	}

	private static void muestraJuegos(videojuego[] juegos) {
		int max= 0;

		for (int i=1;i<juegos.length;i++) {
			if(juegos[max].compareTo(juegos[i])>0) {
				max=i;
			}
		}
		System.out.println("Mostrando juegos con más horas estimadas....\n\n"+juegos[max]);
		
	}

	private static void muestraSeries(Serie[] series) {
		// TODO Auto-generated method stub
		int max=0;
		
		for (int i=1;i<series.length;i++) {
			if(series[max].compareTo(series[i])>0) {
				max=i;
			}
		}
		System.out.println("Mostrando serie con mas temporadas.....\n\n"+series[max]);
	}

	private static int[] compruebaEntregados(videojuego[] juegos, Serie[] series) {
		// TODO Auto-generated method stub
		int[] entregados=new int[2];
		for(int i=0;i<series.length;i++) {
			if(series[i].isEntregado()) {
				entregados[0]+=1;
				System.out.println("La serie "+series[i].getTitulo() + " está entregada.");
				System.out.println("Procediendo a su devolución....");
				series[i].devolver();
				System.out.println("Serie devuelta con éxito\n");
			}
		}
		for(int i=0;i<juegos.length;i++) {
			if(juegos[i].isEntregado()) {
				entregados[1]+=1;
				System.out.println("El juego "+juegos[i].getTitulo() + " está entregado.");
				System.out.println("Procediendo a su devolución....");
				juegos[i].devolver();
				System.out.println("Juego devuelto con éxito\n");
			}
		}
		return entregados;
	}

	private static void entregaJuegos(videojuego[] juegos) {
		// TODO Auto-generated method stub
		System.out.println("Entregando juegos....");
		juegos[2].entregar();
		juegos[0].entregar();
		juegos[3].entregar();
		System.out.println("Juegos entregados.");
	}

	private static void entregaSeries(Serie[] series) {
		// TODO Auto-generated method stub
		System.out.println("Entregando series...");
		series[0].entregar();
		series[1].entregar();
		series[4].entregar();
		System.out.println("Series entregadas.");
	}

	private static videojuego[] creaArrayJuegos() {
		System.out.println("Creando array de juegos...");
		videojuego[] fjuegos = new videojuego[5];
		fjuegos[0]=new videojuego();
		fjuegos[1]=new videojuego("Grand Theft Auto V",24);
		fjuegos[2]=new videojuego("Dragon Quest XI",48,"Fantasía"," Square Enix");
		fjuegos[3]=new videojuego("FinalFantasy XV",32);
		fjuegos[4]=new videojuego("Diablo III",52,"RPG","Blizzard");
		System.out.println("Array de juegos creada");
		return fjuegos;
	}

	private static Serie[] creaArraysSeries() {
		System.out.println("Creando array de series...");
		Serie[] fseries = new Serie[5];
		fseries[0]=new Serie();
		fseries[1]=new Serie("The Big Bang Theory","Chuck Lorre");
		fseries[2]=new Serie("Game of Thrones",8,"Fantasía","David Benioff");
		fseries[3]=new Serie("Friends"," Kevin S. Bright");
		fseries[4]=new Serie("How I Met Your Mother",9,"Comedia","Carter Bays");
		System.out.println("Array de serie creada");
		return fseries;
	}
	
}
