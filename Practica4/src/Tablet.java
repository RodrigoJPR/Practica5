
public class Tablet extends DispositivoMovil{

	public Tablet() {
		super(0);
		velocidadProcesador= 3.65f;
		cargaBateria=91;
		memoria=5000;
		sistemaOperativo="Android 13";
		marca="Samsung";
		modelo="Tab S6";
		
	}
	
	public void reproducirVideo() {
		System.out.println("Reproduciendo video");
	}
	
	public void tomarFoto() {
		System.out.println("Tomando foto");
	}
}
