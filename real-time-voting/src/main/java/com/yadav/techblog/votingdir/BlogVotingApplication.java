package com.yadav.techblog.votingdir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class BlogVotingApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogVotingApplication.class, args);
    }
}
