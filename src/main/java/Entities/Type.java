
package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name = "type")
public class Type {
    @Id
    private int id;
    private String name;

    public Type(){

    }
}
