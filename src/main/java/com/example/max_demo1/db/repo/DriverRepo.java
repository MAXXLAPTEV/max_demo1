package com.example.max_demo1.db.repo;

import com.example.max_demo1.db.ent.DriverEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<DriverEnt, Long> {
}
