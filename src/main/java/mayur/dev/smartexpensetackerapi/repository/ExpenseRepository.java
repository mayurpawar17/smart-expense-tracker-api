package mayur.dev.smartexpensetackerapi.repository;

import mayur.dev.smartexpensetackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
