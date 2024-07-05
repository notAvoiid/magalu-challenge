package com.abreu.magalu_ms.models.dto;

import com.abreu.magalu_ms.models.Channel;
import com.abreu.magalu_ms.models.Notification;
import com.abreu.magalu_ms.models.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel
) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
                );
    }

}
