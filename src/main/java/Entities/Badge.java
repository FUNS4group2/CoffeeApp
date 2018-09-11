package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "BADGES")
public class Badge {
    @Id
    private String id;
    private String name;

    Badge(){};

}
