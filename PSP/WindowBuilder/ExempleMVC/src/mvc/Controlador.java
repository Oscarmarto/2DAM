package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

	Model m;
	Vista v;
	ActionListener actionListenerBoto, actionListenerBoto2;
	
	Controlador(Model m, Vista v) {
		this.m = m;
		this.v = v;
		control();
	}
	
	void control() {
		
		actionListenerBoto = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String missatge1 = m.getMsg1();
				//v.getTextField().setText(missatge);
				
				v.posarText(missatge1);
			}	
		};
		v.getBoto().addActionListener(actionListenerBoto);
		
		
		actionListenerBoto2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String missatge2 = m.getMsg2();
				//v.getTextField().setText(missatge);
				
				v.posarText(missatge2);
			}	
		};
		v.getBoto2().addActionListener(actionListenerBoto2);
	}
	
	
}
