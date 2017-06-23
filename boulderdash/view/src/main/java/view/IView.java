package view;
/**
 * <h1>The Class Window.</h1>
 *
 * @author Charles
 * @version 1.0
 */
import java.awt.Graphics;

public interface IView {

		public void UpdateDrawElements(Graphics graphics);
		public void DrawElements(Graphics graphics);
		void displayMessage(String message);
		
}
