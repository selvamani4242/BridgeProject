package com.example.Bridgeproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "bridge")
public class BridgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="Name" ,nullable = false)
    private String Name;
    @Column(name="Email" ,nullable = false)
    private String Email;
    @Column(name="Subject" ,nullable = false)
    private String Subject;
    @Column(name="Message" ,nullable = false)
    private String Message;

}
