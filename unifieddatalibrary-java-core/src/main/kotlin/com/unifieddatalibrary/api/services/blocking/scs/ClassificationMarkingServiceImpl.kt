// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.core.ClientOptions
import java.util.function.Consumer

class ClassificationMarkingServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ClassificationMarkingService {

    private val withRawResponse: ClassificationMarkingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClassificationMarkingService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ClassificationMarkingService =
        ClassificationMarkingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassificationMarkingService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassificationMarkingService.WithRawResponse =
            ClassificationMarkingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
