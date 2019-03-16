package com.crud.intive.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "velocity")
public class Velocity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "velocity")
    private Long velocity;

    @Column(name = "distance")
    private Long distance;

    @Column(name = "time")
    private Long time;


}
