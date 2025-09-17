// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.core.ClientOptions
import java.util.function.Consumer

class RangeParameterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RangeParameterService {

    private val withRawResponse: RangeParameterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RangeParameterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterService =
        RangeParameterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RangeParameterService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RangeParameterService.WithRawResponse =
            RangeParameterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
