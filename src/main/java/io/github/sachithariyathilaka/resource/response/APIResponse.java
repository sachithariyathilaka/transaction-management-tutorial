package io.github.sachithariyathilaka.resource.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Resource class for the api response.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/08/19
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class APIResponse<T> {

    private int code;

    private String message;

    private T data;
}
