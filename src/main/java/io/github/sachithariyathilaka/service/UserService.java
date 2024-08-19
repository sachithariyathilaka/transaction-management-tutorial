package io.github.sachithariyathilaka.service;

import io.github.sachithariyathilaka.entity.UserDetails;
import io.github.sachithariyathilaka.resource.request.UserRequest;
import io.github.sachithariyathilaka.resource.response.APIResponse;

/**
 * Service interface for the user service.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/19
 */
public interface UserService {
    APIResponse<UserDetails> save(UserRequest userRequest);
    APIResponse<UserDetails> saveWithoutTransactionManagement(UserRequest userRequest);
    APIResponse<UserDetails> saveWithTransactionManagement(UserRequest userRequest);
}
