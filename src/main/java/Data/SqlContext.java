package Data;
import Entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

public class SqlContext {
private static String url = "studmysql01.fhict.local";
private static String username = "dbi368998";
private static String password = "Wachtwoord1";


    //? is a parameter that you can fill with the right variable just put statement.setString(index,value);
    public SqlContext(){}
    public void getEntitiesTest() throws SQLException{
            String query = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(query);
            //ResultSet set = statement.executeQuery(); Use for select statement to get dataset from the query.
            //To to do an insert or update or delete you can just use statement.executeQuery(); and it will work fin if your query is fine ofcourse.


    }

    public void getUserById(int id) throws SQLException{
        String query = "SELECT * FROM USERS WHERE ID = ?";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        User user = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        user = em.find(User.class,1);

    }
}
