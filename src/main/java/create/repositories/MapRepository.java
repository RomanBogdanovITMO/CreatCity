package create.repositories;

import create.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MapRepository extends JpaRepository<Map, Long> {
}
