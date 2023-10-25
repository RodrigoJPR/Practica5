
public class Controladora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tablet t = new Tablet();
		System.out.println("Inicializando Tablet");
		
		t.encender();
		t.verCargaBateria();
		t.reproducirVideo();
		t.tomarFoto();
		t.apagar();
		
		
		System.out.println("Sincronizando Smartwatch");
		Smartwatch sw= new Smartwatch();
		sw.hora="10:00 am";
		sw.encender();
		sw.verCargaBateria();
		sw.mostrarHora();
		sw.medirRitmoCardiaco();
		sw.apagar();
		
		
	}

}
