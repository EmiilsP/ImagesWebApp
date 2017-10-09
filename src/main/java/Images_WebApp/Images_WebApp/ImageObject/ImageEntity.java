package Images_WebApp.Images_WebApp.ImageObject;


import javax.persistence.*;

@Entity
@Table(name = "Image")
public class ImageEntity {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    String tag; //manytoone???
    @Column
    String objectLocation;

    public ImageEntity(){}

    public ImageEntity(String objectLocation, String name) {
        this.objectLocation = objectLocation;
        this.name = name;
        this.tag = null;
    }

    public ImageEntity(String objectLocation, String name, String tag) {
        this.objectLocation = objectLocation;
        this.name = name;
        this.tag = tag;
    }
}
