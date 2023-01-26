package com.hexagonal.simplified.adapter.out.database;

import com.hexagonal.simplified.application.port.out.ExampleOneDatabasePort;
import com.hexagonal.simplified.domain.entity.ExampleOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleOneRepository extends JpaRepository<ExampleOne, Long>, ExampleOneDatabasePort {

    @Query("SELECT eo FROM ExampleOne eo ORDER BY eo.fieldExampleOne DESC LIMIT 1")
    ExampleOne getExampleOne();

}
