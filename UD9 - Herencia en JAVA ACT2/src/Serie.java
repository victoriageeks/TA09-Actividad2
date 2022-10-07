
public class Serie implements Entregable{
	private String titulo;
	private int num_de_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	// constantes
	private final int num_de_temporadas_D = 3;
	private final boolean entregado_D = false;
	
	
	// constructores
	// constructor por defecto
	public Serie() {
		this.titulo = "";
		this.num_de_temporadas = num_de_temporadas_D;
		this.entregado = entregado_D;
		this.genero = "";
		this.creador = "";
	}
	
	
	// constructor con título y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.num_de_temporadas = num_de_temporadas_D;
		this.entregado = entregado_D;
		this.genero = "";
		this.creador = creador;
	}
	
	// constructor con todos los atributos, excepto entregado
	public Serie(String titulo, int num_de_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_de_temporadas = num_de_temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//método que me compara 2 series segun su numero de temporadas
		public String compareTo(Serie a) {
			if(this.num_de_temporadas == a.getNumDeTemporadas()){
				return "El número de temporadas comparado es el mismo";
			}else if(this.num_de_temporadas > a.getNumDeTemporadas()) {
				return "La serie "+this.titulo +" tiene más temporadas que " + a.getTitulo();
			}else {
				return "La serie "+this.titulo +" tiene menos temporadas que " + a.getTitulo();
			}
			
		}
	
	// getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumDeTemporadas() {
		return num_de_temporadas;
	}
	public void setNumDeTemporadas(int num_de_temporadas) {
		this.num_de_temporadas = num_de_temporadas;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	//método toString()
	@Override
	public String toString() {
		return ("Título de la serie: " +this.titulo+"\nNúmero de temporadas: "+ this.num_de_temporadas+"\nGénero: "+this.genero
                +"\nEstado de entregado: "+this.entregado+"\nCreador: "+ this.creador);
	}


	@Override
	public void entregar() {
		this.entregado = true;
	}


	@Override
	public void devolver() {
		this.entregado = false;
	}


	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	
	
	
}
