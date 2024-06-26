// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketUnknownPropertyTypeException extends ApiException {
    public static final Integer ERROR_CODE = 1424;

    public static final String ERROR_DESCRIPTION = "Unknown property type";

    public ApiMarketUnknownPropertyTypeException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketUnknownPropertyTypeException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}