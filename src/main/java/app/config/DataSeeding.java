package app.config;

import app.entity.Channel;
import app.entity.Status;
import app.repository.ChannelRepo;
import app.repository.StatusRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataSeeding implements CommandLineRunner {

    private final StatusRepo statusRepo;
    private final ChannelRepo channelRepo;

    public DataSeeding(StatusRepo statusRepo, ChannelRepo channelRepo) {
        this.statusRepo = statusRepo;
        this.channelRepo = channelRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Arrays.stream(Channel.Values.values())
                .map(Channel.Values::toChannel)
                .forEach(channelRepo::save);

        Arrays.stream(Status.Values.values())
                .map(Status.Values::toStatus)
                .forEach(statusRepo::save);
    }
}
