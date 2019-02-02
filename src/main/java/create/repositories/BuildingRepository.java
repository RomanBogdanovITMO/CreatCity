package create.repositories;

import create.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
    Building findByBuilding(String building);
}

