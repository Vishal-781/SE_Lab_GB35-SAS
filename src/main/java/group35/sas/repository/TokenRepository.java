package group35.sas.repository;

import group35.sas.models.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repopsitory
public interface TokenRepository extends JpaRepository<Token, Integer> {
    List<Token> findAllTokensByUserId(Integer id);
    Optional<Token> findByToken(String token);
}
