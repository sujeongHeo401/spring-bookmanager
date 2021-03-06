package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
/// no args contructor μ λμΌν¨
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
