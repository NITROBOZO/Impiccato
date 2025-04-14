import controller.Controller;
import view.SecretFrame;
public class Main {
	public static void main(String[] args) {
		// Avvio del gioco
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Crea e mostra il frame principale
				Controller controller = new Controller();
				
			}
		});
		
		

		System.out.println("Gioco avviato");
		
	}
}
