import java.util.ArrayList;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Serie[] series=creaArraysSeries();
		videojuego[] juegos=creaArrayJuegos();
		entregaSeries(series);
		entregaJuegos(juegos);
		devuelveSeries(series);
		devuelveJuegos(juegos);
		
		
		
		
		
		
	}

	private static void devuelveJuegos(videojuego[] juegos) {
		// TODO Auto-generated method stub
		juegos[2].devolver();
		juegos[0].devolver();
		juegos[3].devolver();
	}

	private static void devuelveSeries(Serie[] series) {
		// TODO Auto-generated method stub
		series[0].devolver();
		series[1].devolver();
		series[4].devolver();
		
	}

	private static void entregaJuegos(videojuego[] juegos) {
		// TODO Auto-generated method stub
		
		juegos[2].entregar();
		juegos[0].entregar();
		juegos[3].entregar();
	}

	private static void entregaSeries(Serie[] series) {
		// TODO Auto-generated method stub
		series[0].entregar();
		series[1].entregar();
		series[4].entregar();
	}

	private static videojuego[] creaArrayJuegos() {
		
		videojuego[] fjuegos = new videojuego[5];
		fjuegos[0]=new videojuego();
		fjuegos[1]=new videojuego("Grand Theft Auto V",24);
		fjuegos[2]=new videojuego("Dragon Quest XI",48,"Fantasía"," Square Enix");
		fjuegos[3]=new videojuego("FinalFantasy XV",32);
		fjuegos[4]=new videojuego("Diablo III",52,"RPG","Blizzard");
		return fjuegos;
	}

	private static Serie[] creaArraysSeries() {
		
		Serie[] fseries = new Serie[5];
		fseries[0]=new Serie();
		fseries[1]=new Serie("The Big Bang Theory","Chuck Lorre");
		fseries[2]=new Serie("Game of Thrones",8,"Fantasía","David Benioff");
		fseries[3]=new Serie("Friends"," Kevin S. Bright");
		fseries[4]=new Serie("How I Met Your Mother",9,"Comedia","Carter Bays");
		
		return fseries;
	}
	
}
