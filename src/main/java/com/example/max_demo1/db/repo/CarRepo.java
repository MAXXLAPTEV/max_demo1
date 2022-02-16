package com.example.max_demo1.db.repo;

import com.example.max_demo1.db.ent.CarEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<CarEnt, Long> {
}
