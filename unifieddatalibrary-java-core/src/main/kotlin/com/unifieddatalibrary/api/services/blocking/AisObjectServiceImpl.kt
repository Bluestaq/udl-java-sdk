// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.aisobjects.AisObjectUnvalidatedPublishParams
import java.util.function.Consumer

/**
 * These services provide for posting and querying of self-reported information obtained from the
 * Automatic Identification System (AIS) equipment. This contains information such as unique
 * identification, status, position, course, and speed. The AIS is an automatic tracking system that
 * uses transceivers on ships and is used by vessel traffic services. Although technically and
 * operationally distinct, the AIS system is analogous to ADS-B which performs a similar function
 * for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow maritime
 * authorities to track and monitor vessel movements. AIS integrates a standardized VHF transceiver
 * with a positioning system, such as Global Positioning System receiver, with other electronic
 * navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted with AIS
 * transceivers can be tracked by AIS base stations located along coastlines or, when out of range
 * of terrestrial networks, through a growing number of satellites that are fitted with special AIS
 * receivers that are capable of deconflicting a large number of signatures.
 */
class AisObjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AisObjectService {

    private val withRawResponse: AisObjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AisObjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AisObjectService =
        AisObjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unvalidatedPublish(
        params: AisObjectUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-ais
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AisObjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AisObjectService.WithRawResponse =
            AisObjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: AisObjectUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-ais")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
