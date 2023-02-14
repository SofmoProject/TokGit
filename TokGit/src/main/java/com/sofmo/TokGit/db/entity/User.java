package com.sofmo.TokGit.db.entity;

import com.sofmo.TokGit.common.AuthProvider;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id

    @Column(unique = true, nullable = false)
    private String userOAuthId;

    private String userEmail;

    private String userName; // user name

    private String nickName; // user nickname

    @Column(name = "user_img")
    private String img;

    @Column(name = "github_url")
    private String githubUrl;

    @Enumerated(EnumType.STRING)
    private AuthProvider authProvider;

    @Column(name = "refresh_token")
    private String refreshToken;

    @OneToOne(mappedBy = "user")
    private Characters character;



}
