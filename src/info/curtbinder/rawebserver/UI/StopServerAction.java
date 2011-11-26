package info.curtbinder.rawebserver.UI;

import info.curtbinder.rawebserver.Classes.RAWebServerApp;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class StopServerAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	public StopServerAction() {
		putValue(NAME, "Stop Server");
	}
	
	@Override
	public void actionPerformed ( ActionEvent arg0 ) {
		RAWebServerApp.server.stop();
		RAWebServerApp.ui.getMainMenu().enableStart(true);
		RAWebServerApp.ui.getMainMenu().enableStop(false);
	}
}
