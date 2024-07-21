package tn.teams.lmselearning.validator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;
import tn.teams.lmselearning.Exception.ObjectValidatorException;

import java.util.Set;
import java.util.stream.Collectors;
@Component
public class ObjectValidator <T>{
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = factory.getValidator();

    public void validate(T objectValidateReference){
        Set<ConstraintViolation<T>> violations = validator.validate(objectValidateReference);
        if(!violations.isEmpty()){
            Set<String> errorMessages = violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
            throw new ObjectValidatorException(errorMessages,objectValidateReference.getClass().getSimpleName());
        }
    }
}
