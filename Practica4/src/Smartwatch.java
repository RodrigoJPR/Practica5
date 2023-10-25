
public class Smartwatch extends DispositivoMovil{

	public String  hora;

	
	public Smartwatch() {
		super(0);
		velocidadProcesador= 2.05f;
		cargaBateria=70;
		memoria=1000;
		sistemaOperativo="Android 10";
		marca="Casio";
		modelo="GSW-H1000";
			
		
	}
	
	public void medirRitmoCardiaco() {
		System.out.println("Midiendo ritmo cardiaco..." );
	}
	
	public void mostrarHora() {
		System.out.println("Son las "+hora);
	}
}
