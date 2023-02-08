package com.sofmo.TokGit.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@DynamicInsert
public class User {
    @Id
    @Column(name = "user_id")
    private String userId; // Email or github id

    @Column(name = "user_name")
    private String userName; // user name

    @Column(name = "user_nick")
    private String nickName; // user nickname

    @Column(name = "created_at")
    private LocalDateTime createdAt; // 생성일

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // 수정일

    @OneToOne(mappedBy = "user")
    private Characters character;


}
