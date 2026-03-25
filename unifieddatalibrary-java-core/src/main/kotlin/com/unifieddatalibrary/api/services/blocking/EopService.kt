// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EopFull
import com.unifieddatalibrary.api.models.eop.EopCountParams
import com.unifieddatalibrary.api.models.eop.EopCreateParams
import com.unifieddatalibrary.api.models.eop.EopDeleteParams
import com.unifieddatalibrary.api.models.eop.EopListPage
import com.unifieddatalibrary.api.models.eop.EopListParams
import com.unifieddatalibrary.api.models.eop.EopListTupleParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpResponse
import com.unifieddatalibrary.api.models.eop.EopRetrieveParams
import com.unifieddatalibrary.api.models.eop.EopUpdateParams
import com.unifieddatalibrary.api.services.blocking.eop.HistoryService
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
interface EopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EopService

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
    fun history(): HistoryService

    /**
     * Service operation to take a single EOP Record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: EopCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EopCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EOP record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EopFull = retrieve(id, EopRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EopRetrieveParams = EopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EopFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: EopRetrieveParams = EopRetrieveParams.none()): EopFull =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EopFull

    /** @see retrieve */
    fun retrieve(params: EopRetrieveParams): EopFull = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EopFull =
        retrieve(id, EopRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single EOP Record. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: EopUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: EopUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: EopUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: EopUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EopListParams): EopListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EopListPage

    /**
     * Service operation to delete an EOP Record specified by the passed ID path parameter. Note,
     * delete operations do not remove data from historical or publish/subscribe stores. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, EopDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EopDeleteParams = EopDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EopDeleteParams = EopDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EopDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EopDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EopDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EopCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EopCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun listTuple(params: EopListTupleParams): List<EopFull> =
        listTuple(params, RequestOptions.none())

    /** @see listTuple */
    fun listTuple(
        params: EopListTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EopFull>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): EopQueryhelpResponse = queryhelp(EopQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EopQueryhelpParams = EopQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EopQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: EopQueryhelpParams = EopQueryhelpParams.none()): EopQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EopQueryhelpResponse =
        queryhelp(EopQueryhelpParams.none(), requestOptions)

    /** A view of [EopService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EopService.WithRawResponse

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
        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/eop`, but is otherwise the same as
         * [EopService.create].
         */
        @MustBeClosed
        fun create(params: EopCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EopCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/eop/{id}`, but is otherwise the same as
         * [EopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EopFull> = retrieve(id, EopRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EopRetrieveParams = EopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EopFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EopRetrieveParams = EopRetrieveParams.none(),
        ): HttpResponseFor<EopFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EopFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EopRetrieveParams): HttpResponseFor<EopFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EopFull> =
            retrieve(id, EopRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/eop/{id}`, but is otherwise the same as
         * [EopService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: EopUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: EopUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EopUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EopUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/eop`, but is otherwise the same as
         * [EopService.list].
         */
        @MustBeClosed
        fun list(params: EopListParams): HttpResponseFor<EopListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EopListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EopListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/eop/{id}`, but is otherwise the same as
         * [EopService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, EopDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EopDeleteParams = EopDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: EopDeleteParams = EopDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EopDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EopDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EopDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/eop/count`, but is otherwise the same as
         * [EopService.count].
         */
        @MustBeClosed
        fun count(params: EopCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EopCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/eop/tuple`, but is otherwise the same as
         * [EopService.listTuple].
         */
        @MustBeClosed
        fun listTuple(params: EopListTupleParams): HttpResponseFor<List<EopFull>> =
            listTuple(params, RequestOptions.none())

        /** @see listTuple */
        @MustBeClosed
        fun listTuple(
            params: EopListTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EopFull>>

        /**
         * Returns a raw HTTP response for `get /udl/eop/queryhelp`, but is otherwise the same as
         * [EopService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EopQueryhelpResponse> =
            queryhelp(EopQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EopQueryhelpParams = EopQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EopQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EopQueryhelpParams = EopQueryhelpParams.none()
        ): HttpResponseFor<EopQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EopQueryhelpResponse> =
            queryhelp(EopQueryhelpParams.none(), requestOptions)
    }
}
