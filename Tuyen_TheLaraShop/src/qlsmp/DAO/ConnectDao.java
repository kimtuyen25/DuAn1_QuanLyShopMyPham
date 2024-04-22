
package qlsmp.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import qlsmp.Model.Connect;

/**
 *
 * @author My Laptop
 */
public class ConnectDao implements Serializable{
     
    private ArrayList<Connect> list = new ArrayList<>();

    public ArrayList<Connect> getList() {
        return list;
    }
}
