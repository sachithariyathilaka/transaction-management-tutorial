package io.github.sachithariyathilaka.resource.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Resource class for the user request.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/19
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String contactNo;

    private String username;

    private String password;
}
