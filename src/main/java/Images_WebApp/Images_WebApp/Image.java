package Images_WebApp.Images_WebApp;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    String tag; //manytoone
    @Column
    String objectLocation;

    public Image(String objectLocation, String name) {
        this.objectLocation = objectLocation;
        this.name = name;
        this.tag = null;
    }

    public Image(String objectLocation, String name, String tag) {
        this.objectLocation = objectLocation;
        this.name = name;
        this.tag = tag;
    }
}
