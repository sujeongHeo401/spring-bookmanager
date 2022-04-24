package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest extends Object{
    @Test
    void test(){
        User user = new User();
        user.setEmail("martin@fastcampus.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user2 = new User("martin", "martin@fastcampus.com");

        User user3 = User.builder().name("martin").email("martin@fastcapus.com").build();
        System.out.println(">>> " + user.toString());
    }

}