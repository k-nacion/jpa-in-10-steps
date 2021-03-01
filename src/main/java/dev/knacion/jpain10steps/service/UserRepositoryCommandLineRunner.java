package dev.knacion.jpain10steps.service;

import dev.knacion.jpain10steps.entity.User;
import dev.knacion.jpain10steps.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Operator");
        userRepository.save(user);

        log.info("New user is created : " + user);
    }
}
