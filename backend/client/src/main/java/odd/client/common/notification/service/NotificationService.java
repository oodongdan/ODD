package odd.client.common.notification.service;

import lombok.RequiredArgsConstructor;
import odd.client.common.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
}
