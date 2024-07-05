package com.abreu.magalu_ms.repositories;

import com.abreu.magalu_ms.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
