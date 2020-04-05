package Controller;

//LLamar de librerias el ActionEvent y ActionListener
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//importo las clases del modelo y la vista que voy a utilizar para ejecutar en el controlador
import Model.Registraduria;
import View.Vista;

public class Controller {

//Defino las clases de vista y registraduria en nulo para crear un constructor
	public Vista vista=null;
	public Registraduria registraduria=null;


//se crea el constructor llamo el actionListener de vista y registraduria

	public Controller(Vista vista, Registraduria registraduria) {
		super();
		this.vista = vista;
		this.registraduria = registraduria;
		actionListener(this);
	}
//defino un actionListener vacio para llenarlo luego con un procedimiento
	//que me permita realizar una acción
	public void actionListener(ActionListener esc) {
		
		
	}
	//al igual que arriba se define un actionPerformed vacio para luego de
	//tener mas codigo 
	public void actionPerformed(ActionEvent evento) {
		
	}
	
}
