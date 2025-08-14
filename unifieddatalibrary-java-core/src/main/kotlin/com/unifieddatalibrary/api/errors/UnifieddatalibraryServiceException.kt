// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.errors

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.http.Headers

abstract class UnifieddatalibraryServiceException
protected constructor(message: String, cause: Throwable? = null) :
    UnifieddatalibraryException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
