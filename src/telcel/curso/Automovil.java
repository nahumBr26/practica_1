package telcel.curso;

public class Automovil {
	private String fabricante; 
	private String modelo;
	private String color; 
	private double clindrada; 
	private int capacidadTanque = 40;
	
	
	
	public String detalle() {		
		StringBuilder sb = new StringBuilder();
		sb.append("Auto Fabricante: " + this.fabricante);
		sb.append("\nAuto Model: " + this.modelo);
		sb.append("\nAuto Color: " + this.color);
		sb.append("\nAuto cilindrada: " + this.clindrada + "\n");		
		return sb.toString();		
	}
	
	public String acelerar(int rpm) {
				
		return "El auto" + this.fabricante + "aceletando a: " + rpm + "rpm";
	}
	
	
	public String frenar() {				
		return "El auto " + this.fabricante + " " + this.modelo + " frenando";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar; 
	}
	
	
	public float calcularConsumo(int km, float procentajeGasolina) {
		
		return km/(capacidadTanque * procentajeGasolina);
		
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getClindrada() {
		return clindrada;
	}

	public void setClindrada(double clindrada) {
		this.clindrada = clindrada;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	
	
	
}
