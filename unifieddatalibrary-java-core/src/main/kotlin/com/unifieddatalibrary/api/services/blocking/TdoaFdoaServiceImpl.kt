// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.DiffofarrivalService
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.DiffofarrivalServiceImpl
import java.util.function.Consumer

class TdoaFdoaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TdoaFdoaService {

    private val withRawResponse: TdoaFdoaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val diffofarrival: DiffofarrivalService by lazy {
        DiffofarrivalServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TdoaFdoaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaService =
        TdoaFdoaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    override fun diffofarrival(): DiffofarrivalService = diffofarrival

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TdoaFdoaService.WithRawResponse {

        private val diffofarrival: DiffofarrivalService.WithRawResponse by lazy {
            DiffofarrivalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TdoaFdoaService.WithRawResponse =
            TdoaFdoaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        override fun diffofarrival(): DiffofarrivalService.WithRawResponse = diffofarrival
    }
}
