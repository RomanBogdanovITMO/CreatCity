package create.repositories;

import create.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("playerRepository")
public interface PlayerRepository extends JpaRepository<Player,Long> {
    Player findByEmail(String email);
}
