package com.abreu.magalu_ms.repositories;

import com.abreu.magalu_ms.models.Notification;
import com.abreu.magalu_ms.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
