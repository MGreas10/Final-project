package com.promineotech.flight.entity;

import com.promineotech.flight.Constants;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class Phone {
    @NotNull
    @Length(min = Constants.PHONE_MIN_LENGTH, max = Constants.PHONE_MAX_LENGTH)
    @Pattern(regexp = Constants.PHONE_REGEX)
    private String phone;
}
