package com.Grupo32.reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
;

@Entity
@Table(name = "Message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message")
    private int idMessage;
    @Column(name="message_text",length = 250)
    private String messageText;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car",nullable = false)
    @JsonIgnoreProperties({"message","reservation"})
    private CarModel car;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client",nullable = false)
    @JsonIgnoreProperties({"message","reservation"})
    private ClientModel client;
}
