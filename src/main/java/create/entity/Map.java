package create.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

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
    private List<Building> buildingList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerCreateMap_id")
    private Player player;



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

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
