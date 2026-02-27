// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.tdoafdoa.DiffofarrivalServiceAsync
import com.unifieddatalibrary.api.services.async.tdoafdoa.DiffofarrivalServiceAsyncImpl
import java.util.function.Consumer

class TdoaFdoaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TdoaFdoaServiceAsync {

    private val withRawResponse: TdoaFdoaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val diffofarrival: DiffofarrivalServiceAsync by lazy {
        DiffofarrivalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TdoaFdoaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaServiceAsync =
        TdoaFdoaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    override fun diffofarrival(): DiffofarrivalServiceAsync = diffofarrival

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TdoaFdoaServiceAsync.WithRawResponse {

        private val diffofarrival: DiffofarrivalServiceAsync.WithRawResponse by lazy {
            DiffofarrivalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TdoaFdoaServiceAsync.WithRawResponse =
            TdoaFdoaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        override fun diffofarrival(): DiffofarrivalServiceAsync.WithRawResponse = diffofarrival
    }
}
