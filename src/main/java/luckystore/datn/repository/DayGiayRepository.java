package luckystore.datn.repository;

import luckystore.datn.entity.DayGiay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayGiayRepository extends JpaRepository<DayGiay, Long> {
}
