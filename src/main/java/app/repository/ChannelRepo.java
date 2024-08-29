package app.repository;

import app.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepo extends JpaRepository<Channel, Long> {
}
