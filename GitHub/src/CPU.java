import java.util.Set;
import java.util.HashSet;
/* Clase CPU */
public class CPU {

	private UC uc;
	private Set<ALU> listaAlus;
	private Set<REGISTRO> listaRegs;
	
	public CPU() {
		
		uc= new UC();
		listaAlus= new HashSet<ALU>(2);
		listaRegs = new HashSet<REGISTRO>();
		REGISTRO reg = new REGISTRO();
		reg.tipo = "PG 1";
		listaRegs.add(reg);
		ALU alu1 = new ALU();
		alu1.unidad="Suma";
		ALU alu2 = new ALU();
		alu2.unidad ="Resta";
		listaAlus.add(alu1);
		listaAlus.add(alu2);
		
		uc.setALUS(alu1, alu2);
		uc.imprimeTipoAlu();
		
	}
	
}
