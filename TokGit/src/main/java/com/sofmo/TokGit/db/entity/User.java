package com.sofmo.TokGit.db.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id

    @Column(unique = true, nullable = false, name = "user_email")
    private String userEmail;

    @Column(name = "user_name")
    private String userName; // user name

    @Column(name = "user_nick")
    private String nickName; // user nickname

    @Column(name = "user_img")
    private String img;

    @Column(name = "github_url")
    private String githubUrl;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "created_at")
    private LocalDateTime createdAt; // 생성일

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // 수정일

    @OneToOne(mappedBy = "user")
    private Characters character;



}
