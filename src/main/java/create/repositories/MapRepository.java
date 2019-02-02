package create.repositories;

import create.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapRepository extends JpaRepository<Map,Integer> {
    Map findByMap(String map);
}
