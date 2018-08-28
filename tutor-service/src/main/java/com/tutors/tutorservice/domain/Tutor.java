package com.tutors.tutorservice.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutorId;
    private String name;
    private String surname;
    @ElementCollection
    private List<String> degrees;
}
