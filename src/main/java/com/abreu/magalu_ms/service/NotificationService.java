package com.abreu.magalu_ms.service;

import com.abreu.magalu_ms.models.Notification;
import com.abreu.magalu_ms.models.dto.ScheduleNotificationDTO;
import com.abreu.magalu_ms.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }
}
