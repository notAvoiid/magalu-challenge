package com.abreu.magalu_ms.repositories;

import com.abreu.magalu_ms.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
