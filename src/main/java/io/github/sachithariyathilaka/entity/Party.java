package io.github.sachithariyathilaka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class for the party.
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
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;

    private String password;
}
