package io.github.sachithariyathilaka.controller;

import io.github.sachithariyathilaka.resource.request.UserRequest;
import io.github.sachithariyathilaka.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller layer of the user operations.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/19
 */
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Save user rest endpoint.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @PostMapping("/")
    public ResponseEntity<?> save(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.save(userRequest), HttpStatus.OK);
    }

    /**
     * Save user rest endpoint without the transaction management.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @PostMapping("/without-transaction-management")
    public ResponseEntity<?> saveWithoutTransactionManagement(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveWithoutTransactionManagement(userRequest), HttpStatus.OK);
    }

    /**
     * Save user rest endpoint with the transaction management.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @PostMapping("/with-transaction-management")
    public ResponseEntity<?> saveWithTransactionManagement(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveWithTransactionManagement(userRequest), HttpStatus.OK);
    }
}
