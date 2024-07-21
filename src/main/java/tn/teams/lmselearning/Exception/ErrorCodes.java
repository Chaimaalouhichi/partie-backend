package tn.teams.lmselearning.Exception;

public enum ErrorCodes {
    DEPARTMENT_NOT_FOUND(1000),
    DEPARTMENT_NOT_VALID(1001),
    DEPARTMENT_ID_IS_NULL(1002),
    DEPARTMENT_CODE_IS_NULL(1003),
    DEPARTMENT_ALREADY_IN_USE(1004),

    SPECIALITY_NOT_FOUND(2000),
    SPECIALITY_NOT_VALID(2001),
    SPECIALITY_ID_IS_NULL(2002),
    SPECIALITY_CODE_IS_NULL(2003),
    SPECIALITY_ALREADY_IN_USE(2004)

    ;


    private final int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
