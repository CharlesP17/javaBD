package model;

import java.sql.SQLException;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Florentin
 * @version 1.0
 */
public interface IModel {

    /*
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
 //   Example getExampleById(int id) throws SQLException;

    /*
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
  //  Example getExampleByName(String name) throws SQLException;

    /*
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
   // List<Example> getAllExamples() throws SQLException;

    /**
     * Gets the map by id.
     *
     * @param id
     *            the id
     * @return the map by id
     * @throws SQLException
     *             the SQL exception
     */



	Object readMapFromDB(int i);
}
