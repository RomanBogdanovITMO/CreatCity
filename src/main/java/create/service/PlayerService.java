package create.service;

import create.entity.Player;
import create.entity.Role;
import create.repositories.PlayerRepository;
import create.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;


@Service("playerService")
public class PlayerService {
    private PlayerRepository playerRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public PlayerService(PlayerRepository playerRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.playerRepository = playerRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    public Player findPlayerByEmail(String email) {
        return playerRepository.findByEmail(email);
    }

    public void savePlayer(Player player) {
        player.setPassword(bCryptPasswordEncoder.encode(player.getPassword()));
        player.setActive(1);
        Role playerRole = roleRepository.findByRole("USER");
        player.setRoles(new HashSet<Role>(Arrays.asList(playerRole)));
        playerRepository.save(player);
    }

}
