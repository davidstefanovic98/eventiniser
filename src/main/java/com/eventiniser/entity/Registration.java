package com.eventiniser.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "registration")
public class Registration extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="participant_fk", referencedColumnName = "user_id")
    private User participant;

    @ManyToOne
    @JoinColumn(name="event_fk", referencedColumnName = "event_id")
    private Event event;
}
