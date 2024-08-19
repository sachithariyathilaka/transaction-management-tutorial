package io.github.sachithariyathilaka.service.Impl;

import io.github.sachithariyathilaka.entity.Party;
import io.github.sachithariyathilaka.entity.UserDetails;
import io.github.sachithariyathilaka.repository.PartyRepository;
import io.github.sachithariyathilaka.repository.UserDetailsRepository;
import io.github.sachithariyathilaka.resource.request.UserRequest;
import io.github.sachithariyathilaka.resource.response.APIResponse;
import io.github.sachithariyathilaka.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for the user service.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/19
 */
@Service
public class UserServiceImpl implements UserService {

    private final PartyRepository partyRepository;
    private final UserDetailsRepository userDetailsRepository;

    public UserServiceImpl(PartyRepository partyRepository, UserDetailsRepository userDetailsRepository) {
        this.partyRepository = partyRepository;
        this.userDetailsRepository = userDetailsRepository;
    }

    /**
     * User saving service method.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @Override
    public APIResponse<UserDetails> save(UserRequest userRequest) {
        Party party = saveParty(userRequest);
        UserDetails userDetails = saveUserDetails(userRequest, party);

        return new APIResponse<>(HttpStatus.OK.value(), "User saved successfully!", userDetails);
    }


    /**
     * User saving service method without transaction management.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @Override
    public APIResponse<UserDetails> saveWithoutTransactionManagement(UserRequest userRequest) {
        Party party = saveParty(userRequest);
        UserDetails userDetails = saveUserDetails(userRequest, null);

        return new APIResponse<>(HttpStatus.OK.value(), "User saved successfully!", userDetails);
    }

    /**
     * User saving service method with transaction management.
     *
     * @param   userRequest the user request
     *
     * @return  the user details api response
     */
    @Transactional
    @Override
    public APIResponse<UserDetails> saveWithTransactionManagement(UserRequest userRequest) {
        Party party = saveParty(userRequest);
        UserDetails userDetails = saveUserDetails(userRequest, null);

        return new APIResponse<>(HttpStatus.OK.value(), "User saved successfully!", userDetails);
    }

    /**
     * Save party.
     *
     * @param   userRequest the user request
     *
     * @return  the party
     */
    private Party saveParty(UserRequest userRequest) {
        Party party = new Party();
        party.setUsername(userRequest.getUsername());
        party.setPassword(userRequest.getPassword());

        return partyRepository.saveAndFlush(party);
    }

    /**
     * Save user details.
     *
     * @param   userRequest the user request
     * @param   party the party
     *
     * @return  the user details
     */
    private UserDetails saveUserDetails(UserRequest userRequest, Party party) {
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(userRequest.getFirstName());
        userDetails.setLastName(userRequest.getLastName());
        userDetails.setEmail(userRequest.getEmail());
        userDetails.setContactNo(userRequest.getContactNo());
        userDetails.setParty(party);

        return userDetailsRepository.saveAndFlush(userDetails);
    }
}