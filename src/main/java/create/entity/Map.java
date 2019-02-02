package create.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "map")
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "map_id")
    private int id;

    @Column(name = "title")
    @NotEmpty(message = "*Please enter a card name")
    private String title;

    @Column(name = "imgPath")
    @NotEmpty(message = "*Please provide imgPath")
    private String imgPath;

    @OneToMany(mappedBy = "map", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Building> buildingList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerCreateMap_id")
    private Set<Player> playerset;

    public Set<Player> getPlayerset() {
        return playerset;
    }

    public void setPlayerset(Set<Player> playerset) {
        this.playerset = playerset;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Set<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(Set<Building> buildingList) {
        this.buildingList = buildingList;
    }
}
