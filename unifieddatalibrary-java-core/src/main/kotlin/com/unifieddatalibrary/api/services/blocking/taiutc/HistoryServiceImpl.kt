// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.taiutc

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.taiutc.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.taiutc.history.HistoryCountParams
import com.unifieddatalibrary.api.models.taiutc.history.HistoryListPage
import com.unifieddatalibrary.api.models.taiutc.history.HistoryListParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import java.util.function.Consumer

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
class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): HistoryListPage =
        // get /udl/taiutc/history
        withRawResponse().list(params, requestOptions).parse()

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions) {
        // get /udl/taiutc/history/aodr
        withRawResponse().aodr(params, requestOptions)
    }

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/taiutc/history/count
        withRawResponse().count(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<TaiutcFull>> =
            jsonHandler<List<TaiutcFull>>(clientOptions.jsonMapper)

        override fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HistoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "history")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HistoryListPage.builder()
                            .service(HistoryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { aodrHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "history", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }
    }
}
