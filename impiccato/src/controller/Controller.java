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
			impiccato.setParolaSegreta(secretFrame.getFieldParolaSegreta().getText());
			frameImpiccato.setLabelParolaAttuale(impiccato.getParolaAttuale());
		}
		else if(e.getSource() == frameImpiccato.getBtnConferma() || e.getSource() == frameImpiccato.getFieldParola()) {
			if(impiccato.verificaLettera(frameImpiccato.getFieldParola().getText().charAt(0))) {
				frameImpiccato.setLabelParolaAttuale(impiccato.getParolaAttuale());
			}
			else {
				frameImpiccato.setLabelTentativi(impiccato.getTentativiRimanenti());
				frameImpiccato.setLabelImmagine(impiccato.getTentativiRimanenti());
			}
			
		}
		if(impiccato.isGiocoFinito()) {
			frameImpiccato.setLabelVittoria("GG");
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
