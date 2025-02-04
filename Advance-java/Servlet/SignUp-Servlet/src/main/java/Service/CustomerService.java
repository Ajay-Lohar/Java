package Service;

import java.sql.SQLException;

public class CustomerService {
    Dao dao = new Dao();
    public void addPlayer(Customer customer) throws SQLException {
        dao.addCustomer(customer);

    }
}
