package com.sofmo.TokGit.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@DynamicInsert
public class Logs extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer logId;

    @Column(name = "score")
    private Integer score;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;



}
