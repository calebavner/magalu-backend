package app.service;

import app.dto.ScheduleNotificationDto;
import app.repository.NotificationRepo;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepo notificationRepo;

    public NotificationService(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepo.save(dto.toNotification());
    }
}
