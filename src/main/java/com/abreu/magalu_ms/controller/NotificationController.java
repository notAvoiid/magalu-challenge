package com.abreu.magalu_ms.controller;

import com.abreu.magalu_ms.models.Notification;
import com.abreu.magalu_ms.models.dto.ScheduleNotificationDTO;
import com.abreu.magalu_ms.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> scheduleNotification(@RequestBody ScheduleNotificationDTO dto) {
        return ResponseEntity.accepted().body(notificationService.scheduleNotification(dto));
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable Long notificationId) {
        var notification = notificationService.findById(notificationId);

        if (notification.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(notification.get());
    }

    @DeleteMapping("/{notificationId}")
    public ResponseEntity<Void> cancelNotification(@PathVariable Long notificationId) {
        notificationService.cancelNotification(notificationId);
        return ResponseEntity.noContent().build();
    }
}
