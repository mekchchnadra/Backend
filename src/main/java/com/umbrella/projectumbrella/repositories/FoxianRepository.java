package com.umbrella.projectumbrella.repositories;

import com.umbrella.projectumbrella.entities.Foxian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxianRepository extends JpaRepository<Foxian, Integer> {
}
