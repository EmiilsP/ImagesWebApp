package Images_WebApp.Images_WebApp;


import javax.persistence.*;

@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    String tag; //manytoone???
    @Column
    String objectLocation;

    public Image(){}

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
