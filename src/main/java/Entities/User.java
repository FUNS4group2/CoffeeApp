package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "USERS")
public class User {
    @Id
    private int id;
    private String name;
    private Order[] orders;
    private Badge[] badge;
    User(){};
}
