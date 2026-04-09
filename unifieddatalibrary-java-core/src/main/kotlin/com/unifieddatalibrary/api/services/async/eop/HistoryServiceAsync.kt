// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.eop

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.eop.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.eop.history.HistoryCountParams
import com.unifieddatalibrary.api.models.eop.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.eop.history.HistoryListParams
import java.util.concurrent.CompletableFuture
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
interface HistoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun list(params: HistoryListParams): CompletableFuture<HistoryListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HistoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HistoryListPageAsync>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (`/udl/<datatype>/queryhelp`) for more details on valid/required
     * query parameter information.
     */
    fun aodr(params: HistoryAodrParams): CompletableFuture<Void?> =
        aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(
        params: HistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun count(params: HistoryCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * A view of [HistoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/eop/history`, but is otherwise the same as
         * [HistoryServiceAsync.list].
         */
        fun list(
            params: HistoryListParams
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/eop/history/aodr`, but is otherwise the same as
         * [HistoryServiceAsync.aodr].
         */
        fun aodr(params: HistoryAodrParams): CompletableFuture<HttpResponse> =
            aodr(params, RequestOptions.none())

        /** @see aodr */
        fun aodr(
            params: HistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/eop/history/count`, but is otherwise the same
         * as [HistoryServiceAsync.count].
         */
        fun count(params: HistoryCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>
    }
}
