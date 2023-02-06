package com.sofmo.TokGit.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@DynamicInsert
public class User {
    @Id
    @Column(name = "user_id", length = 255)
    private String userId; // Email or github id

    @Column(name = "user_name", length = 255)
    private String userName; // user name

    @Column(name = "user_nick", length = 255)
    private String nickName; // user nickname

}
