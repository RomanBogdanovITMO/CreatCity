package create.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "map")
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "map_id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "imgPath")
    private String imgPath;

    @ManyToMany(mappedBy = "map")
    private Set<Building> buildingSet = new HashSet<>();

    public Set<Building> getBuildingSet() {
        return buildingSet;
    }

    public void setBuildingSet(Set<Building> buildingSet) {
        this.buildingSet = buildingSet;
    }
    //    @ManyToOne()
//    @JoinColumn(name = "playerCreateMap_id")
//    private Player players;
//
//    public Player getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(Player players) {
//        this.players = players;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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


}
