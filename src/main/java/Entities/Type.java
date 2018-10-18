
package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name = "type")
public class Type {
    @Id
    private int id;
    @Column
    private String name;

    public Type(){

    }
}
