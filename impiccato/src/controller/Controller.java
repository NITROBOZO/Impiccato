package controller;
import java.awt.event.*;
import view.*;
import model.*;
public class Controller implements ActionListener{
	private FrameImpiccato frameImpiccato = new FrameImpiccato(); 
	private SecretFrame secretFrame = new SecretFrame();
	private Impiccato impiccato = new Impiccato();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == secretFrame.getBtnConfirm() || e.getSource() == secretFrame.getFieldParolaSegreta()) {
			secretFrame.setVisible(false);
			frameImpiccato.setVisible(true);
			impiccato.setParolaSegreta(secretFrame.getFieldParolaSegreta().getText().toUpperCase());
			frameImpiccato.setLabelParolaAttuale(impiccato.getParolaAttuale());
		}
		else if(e.getSource() == frameImpiccato.getBtnConferma() || e.getSource() == frameImpiccato.getFieldParola()) {
			if(impiccato.verificaLettera(frameImpiccato.getFieldParola().getText().toUpperCase().charAt(0))) {
				frameImpiccato.setLabelParolaAttuale(impiccato.getParolaAttuale());
			}
			else {
				frameImpiccato.setLabelTentativi(impiccato.getTentativiRimanenti());
				frameImpiccato.setLabelImmagine(impiccato.getTentativiRimanenti());
				String str = frameImpiccato.getAlfabeto().replace(String.valueOf(frameImpiccato.getFieldParola().getText().toUpperCase().charAt(0)), "<s>"+frameImpiccato.getFieldParola().getText().toUpperCase().charAt(0)+"</s>");
				frameImpiccato.setAlfabeto(str);
				frameImpiccato.updateAlfabeto();
			}
			
		}
		if(impiccato.isGiocoFinito()) {
			if (impiccato.getTentativiRimanenti() <= 0) {
				frameImpiccato.setLabelVittoria("<html>hai perso!</br> la parola era: " + "impiccato.getParolaAttuale()</html>");
				
			} else {
				frameImpiccato.setLabelVittoria("<html>GG<br> hai vinto!</html>");
			}
			
			frameImpiccato.getFieldParola().setEditable(false);
			frameImpiccato.getBtnConferma().setEnabled(false);
		}
		
	}
	public Controller() {
		frameImpiccato.getBtnConferma().addActionListener(this);
		frameImpiccato.getFieldParola().addActionListener(this);
	    secretFrame.getBtnConfirm().addActionListener(this);
	    secretFrame.getFieldParolaSegreta().addActionListener(this);
		frameImpiccato.setVisible(false);
		secretFrame.setVisible(true);
		
		
		
	}
}
