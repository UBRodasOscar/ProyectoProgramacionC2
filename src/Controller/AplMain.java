package Controller;

//Las librerias que llamo me permite globalizar las excepciones que se puedan presentar al inicio del programa unicamente
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//Importe los paquetes del proyecto que necesito iniciar en el Main (Inicializador del programa)

import Model.Registraduria;
import View.Vista;

//inicializar la clase AplMain
public class AplMain {

	//Constructor main que invoca primero las excepciones, si encuentra las clase registraduria 
	//La ejecuta, al igual que la vista en forma conjunta.
	public static void main(String[] args) {
		//las excepciones listadas son Caracteres no soportados, clases no encontrados
		//clases sin instanciar
		//acceso no autorizado sin inpresiones o acciones aún
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
		} 
		catch (ClassNotFoundException e) {
		}
		catch (InstantiationException e) {
		} 
		catch (IllegalAccessException e) {
		}
		//El programa se encarga de crear los procesos Registraduria() y vista().
	Registraduria registraduria=new Registraduria();
	Vista vista = new Vista();
	Controller controller = new Controller(vista,registraduria);

	}

}
