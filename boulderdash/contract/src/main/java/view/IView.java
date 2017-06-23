package view;

import java.awt.Graphics;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author GourbiliereVictor
 * @version 1.0
 */
public interface IView {

	/** 
	 * Allow to call the operation paintComponent(Graphics graphics) and update this one to refresh the map.
	 * @param graphics
	 */
	void UpdatepaintComponent(Graphics graphics);
}
