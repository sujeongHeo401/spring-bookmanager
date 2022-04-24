package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
/// no args contructor 와 동일함
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
