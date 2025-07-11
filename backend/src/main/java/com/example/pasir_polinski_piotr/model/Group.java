package com.example.pasir_polinski_piotr.model;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "`groups`")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Membership> memberships;

}