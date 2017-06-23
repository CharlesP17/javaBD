package model;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.Jdbc;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

	@Override
	public void UpdatePositionX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdatePostitionY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetPositionX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetPositionY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Elements> GetIDElements() {
		// TODO Auto-generated method stub
		return null;
	}

	public String readMapFromDB(final int idlevel) throws SQLException {
        return Jdbc.readMapFromDB(idlevel);
    }
	
    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
  /*  @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
/*    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
  /*  @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }
    public ArrayList<Elements> IDElements;
*/
}
