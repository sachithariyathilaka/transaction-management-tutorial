package io.github.sachithariyathilaka.repository;

import io.github.sachithariyathilaka.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for the party.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/17
 */
public interface PartyRepository extends JpaRepository<Party, Long> {
}
