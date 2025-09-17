// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import java.util.function.Consumer

class ClassificationMarkingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ClassificationMarkingServiceAsync {

    private val withRawResponse: ClassificationMarkingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClassificationMarkingServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ClassificationMarkingServiceAsync =
        ClassificationMarkingServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassificationMarkingServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassificationMarkingServiceAsync.WithRawResponse =
            ClassificationMarkingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
