// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EphemerisFull
import com.unifieddatalibrary.api.models.ephemeris.EphemerisCountParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisFileUploadParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListPageAsync
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemeris.EphemerisTupleParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.ephemeris.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.ephemeris.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EphemerisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisServiceAsync

    fun attitudeData(): AttitudeDataServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EphemerisListParams): CompletableFuture<EphemerisListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EphemerisListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EphemerisCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EphemerisCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to post/store Ephemeris data. This operation is intended to be used for
     * automated feeds into UDL. The payload is in Ephemeris format as described by the "Flight
     * Safety Handbook" published by 18th Space Command. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     *
     * </br> **Example:**
     * /filedrop/ephem?classification=U&dataMode=TEST&source=Bluestaq&satNo=25544&ephemFormatType=NASA&hasMnvr=false&type=ROUTINE&category=EXTERNAL&origin=NASA&tags=tag1,tag2
     */
    fun fileUpload(params: EphemerisFileUploadParams): CompletableFuture<Void?> =
        fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        params: EphemerisFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<EphemerisQueryhelpResponse> =
        queryhelp(EphemerisQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisQueryhelpParams = EphemerisQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisQueryhelpParams = EphemerisQueryhelpParams.none()
    ): CompletableFuture<EphemerisQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<EphemerisQueryhelpResponse> =
        queryhelp(EphemerisQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EphemerisTupleParams): CompletableFuture<List<EphemerisFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EphemerisTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EphemerisFull>>

    /**
     * Service operation to take a single EphemerisSet and many associated Ephemeris records as a
     * POST body for ingest into the database. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance. </br> The following rules apply to
     * this operation:
     *
     * <h3>
     * * Ephemeris Set numPoints value must correspond exactly to the number of Ephemeris states
     *   associated with that Ephemeris Set. The numPoints value is checked against the actual
     *   posted number of states, and a mismatch will result in the post being rejected.
     * * Ephemeris Set pointStartTime and pointEndTime must correspond to the earliest and latest
     *   state times, respectively, of the associated Ephemeris states.
     * * Either satNo, idOnOrbit, or origObjectId must be provided. The preferred option is to post
     *   with satNo for a cataloged object, and with (only) origObjectId for an unknown,
     *   uncataloged, or internal/test object. There are several cases for the logic associated with
     *   these fields:
     *     + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will
     *       be populated appropriately in addition to the satNo.
     *     + If satNo is provided and does not correlate to a known UDL sat number then the provided
     *       satNo value will be moved to the origObjectId field and satNo left null.
     *     + If origObjectId and a valid satNo or idOnOrbit are provided then both the
     *       satNo/idOnOrbit and origObjectId will maintain the provided values.
     *     + If only origObjectId is provided then origObjectId will be populated with the posted
     *       value. In this case, no checks are made against existing UDL sat numbers. </h3>
     */
    fun unvalidatedPublish(params: EphemerisUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EphemerisUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EphemerisServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisServiceAsync.WithRawResponse

        fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/ephemeris`, but is otherwise the same as
         * [EphemerisServiceAsync.list].
         */
        fun list(
            params: EphemerisListParams
        ): CompletableFuture<HttpResponseFor<EphemerisListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EphemerisListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/ephemeris/count`, but is otherwise the same as
         * [EphemerisServiceAsync.count].
         */
        fun count(params: EphemerisCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EphemerisCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /filedrop/ephem`, but is otherwise the same as
         * [EphemerisServiceAsync.fileUpload].
         */
        fun fileUpload(params: EphemerisFileUploadParams): CompletableFuture<HttpResponse> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        fun fileUpload(
            params: EphemerisFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ephemeris/queryhelp`, but is otherwise the same
         * as [EphemerisServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EphemerisQueryhelpResponse>> =
            queryhelp(EphemerisQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: EphemerisQueryhelpParams = EphemerisQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: EphemerisQueryhelpParams = EphemerisQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<EphemerisQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EphemerisQueryhelpResponse>> =
            queryhelp(EphemerisQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemeris/tuple`, but is otherwise the same as
         * [EphemerisServiceAsync.tuple].
         */
        fun tuple(
            params: EphemerisTupleParams
        ): CompletableFuture<HttpResponseFor<List<EphemerisFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EphemerisTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EphemerisFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-ephset`, but is otherwise the same as
         * [EphemerisServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EphemerisUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EphemerisUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
