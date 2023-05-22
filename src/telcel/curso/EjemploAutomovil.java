package telcel.curso;

public class EjemploAutomovil {
	
	public static void main (String[] args) {
		Automovil auto = new Automovil();
		
		auto.setFabricante("Porsche");
		auto.setModelo("911");
		auto.setColor("Azul");
		auto.setClindrada(3.0);
		
		Automovil mazda = new Automovil();
		
		mazda.setFabricante("Mazda");
		mazda.setModelo("C-50");
		mazda.setColor("Rojo");
		mazda.setClindrada(1.6);
		
		/*
		 * auto.detalle(); mazda.detalle();
		 */
		
		System.out.println(auto.detalle());
		System.out.println(mazda.detalle());
		
		System.out.println(auto.acelerar(150));
		System.out.println(auto.frenar());
		
		System.out.println(mazda.acelerarFrenar(250));
		
		
		System.out.println("Kilometros por litro: " + mazda.calcularConsumo(100, 0.75f));
	}

}
