package create.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
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

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name ="building_map",joinColumns = {@JoinColumn(name = "building_id")},
            inverseJoinColumns = {@JoinColumn(name = "map_id")})
    private Set<Map> map = new HashSet<>();

    public Set<Map> getMapSet() {
        return map;
    }

    public void setMapSet(Set<Map> mapSet) {
        this.map = mapSet;
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
