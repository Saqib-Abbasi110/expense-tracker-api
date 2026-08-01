package com.saqib.ExpenseTracker.Repository;

import com.saqib.ExpenseTracker.Entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseEntityRepository extends JpaRepository<ExpenseEntity, Long> {

}
