package create.repositories;

import create.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
}

