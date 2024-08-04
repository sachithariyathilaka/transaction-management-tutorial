package io.github.sachithariyathilaka.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class for the user details.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/04
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToOne
    private Party party;

    private String firstName;

    private String lastName;

    private String email;

    private String contactNo;
}
