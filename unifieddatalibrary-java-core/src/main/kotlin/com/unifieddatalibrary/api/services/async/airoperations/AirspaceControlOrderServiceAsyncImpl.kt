// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.airoperations.airspacecontrolorders.AirspaceControlOrderUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
 * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
 * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking Order,
 * Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation Risk
 * Management data. Aircraft Sortie information contains static and dynamic aircraft assignments,
 * departure and arrival times, and remarks. Aircraft Mission information contains static data for
 * mission planning to include assigned aircraft and crews, cargo pickup and dropoff locations,
 * unique identifiers, and prioritization. Item Tracking information contains data for tracking an
 * item from its origin to destination and how it may be configured during transport. Flight Plan
 * information contains schedule and route details. Air Event provides information concerning
 * various aerial events such as fuel transfer and air drops, as well as the associated aircraft
 * involved. Sortie PPR information contains details on operational access to a runway, taxiway, or
 * airport service. Diplomatic Clearance information contains details on the issuance and
 * coordination of aircraft clearance requests. Diplomatic Clearance Country provides information
 * such as entry/exit points, requirements, and points of contact for countries diplomatic
 * clearances are being created for. Airspace Control Order provides information concerning the
 * allocation, restriction, and deconfliction of airspace. Air Tasking Order information contains
 * details on the coordination of air missions and their tasks, resources, and timelines.
 * Navigational Obstruction provides the locations, characteristics, and boundaries of obstacles and
 * structures that can restrict or interfere with navigation. Logistics Support contains information
 * regarding the transport and maintenance of resources and equipment to sustain air operations.
 * Track Route information defines specific flight paths used by aircraft during the transport of
 * fuel and other resources. Air Load Plan information provides mission actuals concerning the
 * loading and air transport of cargo and passengers. Aviation Risk Management information help aid
 * in mission planning by accounting for factors such as mission complexity and crew fatigue.
 */
class AirspaceControlOrderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AirspaceControlOrderServiceAsync {

    private val withRawResponse: AirspaceControlOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AirspaceControlOrderServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AirspaceControlOrderServiceAsync =
        AirspaceControlOrderServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun unvalidatedPublish(
        params: AirspaceControlOrderUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-airspacecontrolorder
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirspaceControlOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirspaceControlOrderServiceAsync.WithRawResponse =
            AirspaceControlOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: AirspaceControlOrderUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-airspacecontrolorder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unvalidatedPublishHandler.handle(it) }
                    }
                }
        }
    }
}
