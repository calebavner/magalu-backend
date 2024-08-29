package app.dto;

import app.entity.Channel;
import app.entity.Notification;
import app.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(
        LocalDateTime localDateTime,
        String destination,
        String message,
        Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                localDateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
