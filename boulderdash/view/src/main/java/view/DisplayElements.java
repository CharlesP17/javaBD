package view;

import java.awt.Graphics;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class DisplayElements implements IView {

    /**
     * Instantiates a new view facade.
     */
    public DisplayElements() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	@Override
	public void UpdateDrawElements(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DrawElements(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

}
