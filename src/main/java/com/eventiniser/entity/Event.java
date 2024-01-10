package com.eventiniser.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
public class Event extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "date_time")
    private Instant time;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "capacity")
    private Integer capacity;

    @ManyToOne
    @JoinColumn(name="organizer_fk", referencedColumnName = "user_id")
    private User organizer;
}
