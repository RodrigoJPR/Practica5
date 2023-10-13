// Clase Unidad de Control

public class UC {

	private ALU []  alus = new ALU [2];
	
	public void setALUS( ALU alu1, ALU alu2) {
		alus[0]= alu1;
		alus[1]= alu2;
		
	}
	
	public void imprimeTipoAlu() {
		System.out.println(alus[0].unidad);
		System.out.println(alus[1].unidad);
	}
	
}
