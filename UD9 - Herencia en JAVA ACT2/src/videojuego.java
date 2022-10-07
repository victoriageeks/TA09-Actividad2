
public class videojuego implements Entregable{
	//Atributos
	private String titulo="";
	private int horasEstimadas=10;
	private boolean entregado=false;
	private String genero="";
	private String compania="";
	
	
	public videojuego() {
	}


	
	public videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}



	public videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getHorasEstimadas() {
		return horasEstimadas;
	}



	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getCompania() {
		return compania;
	}



	public void setCompania(String compania) {
		this.compania = compania;
	}



	@Override
	public String toString() {
		return "---VIDEOJUEGO---\nTítulo: " + titulo + "\nHorasEstimadas: " + horasEstimadas + "\nentregado: " + entregado
				+ "\nGenero: " + genero + "\nCompañia: " + compania;
	}



	@Override
	public void entregar() {
		this.entregado=true;
	}



	@Override
	public void devolver() {
		this.entregado=false;
	}



	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	
	public int compareTo (videojuego v) {
		if (v.getHorasEstimadas() == (this.horasEstimadas) ) {
			return 0;
		}else if (v.getHorasEstimadas() < (this.horasEstimadas)){
			return -1;

		}else{
			return 1;
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

