package create.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "building_id")
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "*Please provide building name")
    private String name;

    @Column(name = "imgPath")
    @NotEmpty(message = "*Please provide imgPath")
    private String imgPath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "map_id")
    private Set<Map> mapSet;

    public Set<Map> getMapSet() {
        return mapSet;
    }

    public void setMapSet(Set<Map> mapSet) {
        this.mapSet = mapSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


}
