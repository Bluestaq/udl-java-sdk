// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.EopFull
import com.unifieddatalibrary.api.models.eop.EopAbridged
import com.unifieddatalibrary.api.models.eop.EopCountParams
import com.unifieddatalibrary.api.models.eop.EopCreateParams
import com.unifieddatalibrary.api.models.eop.EopDeleteParams
import com.unifieddatalibrary.api.models.eop.EopListPageAsync
import com.unifieddatalibrary.api.models.eop.EopListParams
import com.unifieddatalibrary.api.models.eop.EopListTupleParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpResponse
import com.unifieddatalibrary.api.models.eop.EopRetrieveParams
import com.unifieddatalibrary.api.models.eop.EopUpdateParams
import com.unifieddatalibrary.api.services.async.eop.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.eop.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * This service provides operations for manipulation and querying of earth orientation parameter
 * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
 * Rotation and Reference Systems Service). Earth Orientation Parameters describe the irregularities
 * of the earth's rotation. Technically, they are the parameters which provide the rotation of the
 * ITRS (International Terrestrial Reference System) to the ICRS (International Celestial Reference
 * System) as a function of time. Universal time -- Universal time (UT1) is the time of the earth
 * clock, which performs one revolution in about 24h. It is practically proportional to the sidereal
 * time. The excess revolution time is called length of day (LOD). Coordinates of the pole -- x and
 * y are the coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS
 * Reference Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
 * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
 * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole offsets
 * -- Celestial pole offsets are described in the IAU Precession and Nutation models. The observed
 * differences with respect to the conventional celestial pole position defined by the models are
 * monitored and reported by the IERS. IERS Bulletins A and B provide current information on the
 * Earth's orientation in the IERS Reference System. This includes Universal Time, coordinates of
 * the terrestrial pole, and celestial pole offsets. Bulletin A gives an advanced solution updated
 * weekly; the standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are
 * Bulletin B values. All solutions are continuous within their respective uncertainties. Bulletin A
 * is issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
 * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
 * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation offsets at
 * daily intervals based on a combination of contributed analysis results using data from Very Long
 * Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global Positioning System (GPS)
 * satellites, and Lunar Laser Ranging (LLR). Predictions for variations a year into the future are
 * also provided. Meteorological predictions of variations in Atmospheric Angular Momentum (AAM) are
 * used to aid in the prediction of near-term UT1-UTC changes. This publication is prepared by the
 * IERS Rapid Service/Prediction Center.
 */
class EopServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EopServiceAsync {

    private val withRawResponse: EopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EopServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EopServiceAsync =
        EopServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: EopCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/eop
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: EopRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EopFull> =
        // get /udl/eop/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EopUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/eop/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: EopListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EopListPageAsync> =
        // get /udl/eop
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EopDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/eop/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: EopCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/eop/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun listTuple(
        params: EopListTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<EopFull>> =
        // get /udl/eop/tuple
        withRawResponse().listTuple(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: EopQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EopQueryhelpResponse> =
        // get /udl/eop/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EopServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EopServiceAsync.WithRawResponse =
            EopServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EopCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val retrieveHandler: Handler<EopFull> =
            jsonHandler<EopFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EopRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EopFull>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: EopUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<List<EopAbridged>> =
            jsonHandler<List<EopAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EopListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EopListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                EopListPageAsync.builder()
                                    .service(EopServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EopDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EopCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { countHandler.handle(it) }
                    }
                }
        }

        private val listTupleHandler: Handler<List<EopFull>> =
            jsonHandler<List<EopFull>>(clientOptions.jsonMapper)

        override fun listTuple(
            params: EopListTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<EopFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", "tuple")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTupleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val queryhelpHandler: Handler<EopQueryhelpResponse> =
            jsonHandler<EopQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EopQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EopQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "eop", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryhelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
