package odd.client.common.point.repository;

import odd.client.common.point.model.UserPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserPointRepository extends JpaRepository<UserPoint, Long> {
    Optional<UserPoint> findByUserId(Long userId);
}
