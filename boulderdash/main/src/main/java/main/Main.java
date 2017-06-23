package main;

import java.sql.SQLException;

import controller.ControllerFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author GourbiliereVictor
 * @version 1.0
 */
public class Main {

    /**
     * The main method.Allow to instantiate a new ControllerFacade and begin operations.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) 
    {
    	 ControllerFacade controller = new ControllerFacade(null, null);
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }
}

