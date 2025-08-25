package com.example.SprintBoot_01;

import org.springframework.stereotype.Component;

        // TO give this class to spring
@Component
public class Pulsar {

    public void speed() {
        System.out.println("Speed of pulsar is 150 kmph.");
    }
}
