package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	public static int catidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		if (this.registro != this.motor.registro) {
			return "Las piezas no son originales";
		}
		
		for (int i = 0; i < asientos.length; i++) {
			if (this.registro != this.asientos[i].registro) {
				return "Las piezas no son originales";
			}
		}
		
		return "Auto original";
	}

}
