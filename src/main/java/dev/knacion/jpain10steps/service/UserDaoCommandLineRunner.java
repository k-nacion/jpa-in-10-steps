package dev.knacion.jpain10steps.service;

import dev.knacion.jpain10steps.entity.User;
import dev.knacion.jpain10steps.repository.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Kenn", "Admin");
        userDaoService.insert(user);

        log.info("New user is created : " + user);
    }
}
