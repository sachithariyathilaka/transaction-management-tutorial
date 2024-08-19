package io.github.sachithariyathilaka.repository;

import io.github.sachithariyathilaka.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for the user details.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/17
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
