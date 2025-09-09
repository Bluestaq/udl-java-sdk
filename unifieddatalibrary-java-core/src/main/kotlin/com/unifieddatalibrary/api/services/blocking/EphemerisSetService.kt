// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSet
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCountParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCreateParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetFileRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListPage
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetTupleParams
import com.unifieddatalibrary.api.services.blocking.ephemerissets.HistoryService
import java.util.function.Consumer

interface EphemerisSetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisSetService

    fun history(): HistoryService

    /**
     * Service operation intended for initial integration only. Takes a single EphemerisSet as a
     * POST body and ingest into the database. This operation does not persist any Ephemeris Points
     * that may be present in the body of the request. This operation is not intended to be used for
     * automated feeds into UDL.A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     *
     * The following rules apply to this operation:
     *
     * <h3>
     * * Ephemeris Set numPoints value must correspond exactly to the number of Ephemeris states
     *   associated with that Ephemeris Set. The numPoints value is checked against the actual
     *   posted number of states and mismatch will result in the post being rejected.
     * * Ephemeris Set pointStartTime and pointEndTime must correspond to the earliest and latest
     *   state times, respectively, of the associated Ephemeris states.
     * * Either satNo, idOnOrbit, or origObjectId must be provided. The preferred option is to post
     *   with satNo for a cataloged object, and with (only) origObjectId for an unknown,
     *   uncatalogued, or internal/test object. There are several cases for the logic associated
     *   with these fields:
     *     + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will
     *       be populated appropriately in addition to the satNo.
     *     + If satNo is provided and does not correlate to a known UDL sat number then the provided
     *       satNo value will be moved to the origObjectId field and satNo left null.
     *     + If origObjectId and a valid satNo or idOnOrbit are provided then both the
     *       satNo/idOnOrbit and origObjectId will maintain the provided values.
     *     + If only origObjectId is provided then origObjectId will be populated with the posted
     *       value. In this case, no checks are made against existing UDL sat numbers. </h3>
     */
    fun create(params: EphemerisSetCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EphemerisSetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single Ephemeris Set by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): EphemerisSet = retrieve(id, EphemerisSetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EphemerisSet = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
    ): EphemerisSet = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EphemerisSetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EphemerisSet

    /** @see retrieve */
    fun retrieve(params: EphemerisSetRetrieveParams): EphemerisSet =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EphemerisSet =
        retrieve(id, EphemerisSetRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): EphemerisSetListPage = list(EphemerisSetListParams.none())

    /** @see list */
    fun list(
        params: EphemerisSetListParams = EphemerisSetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EphemerisSetListPage

    /** @see list */
    fun list(params: EphemerisSetListParams = EphemerisSetListParams.none()): EphemerisSetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EphemerisSetListPage =
        list(EphemerisSetListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(EphemerisSetCountParams.none())

    /** @see count */
    fun count(
        params: EphemerisSetCountParams = EphemerisSetCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: EphemerisSetCountParams = EphemerisSetCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(EphemerisSetCountParams.none(), requestOptions)

    /**
     * Service operation to get the original raw flat file, if any, associated with the
     * EphemerisSet. The file is returned as an attachment Content-Disposition.
     */
    @MustBeClosed
    fun fileRetrieve(id: String): HttpResponse =
        fileRetrieve(id, EphemerisSetFileRetrieveParams.none())

    /** @see fileRetrieve */
    @MustBeClosed
    fun fileRetrieve(
        id: String,
        params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = fileRetrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see fileRetrieve */
    @MustBeClosed
    fun fileRetrieve(
        id: String,
        params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
    ): HttpResponse = fileRetrieve(id, params, RequestOptions.none())

    /** @see fileRetrieve */
    @MustBeClosed
    fun fileRetrieve(
        params: EphemerisSetFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see fileRetrieve */
    @MustBeClosed
    fun fileRetrieve(params: EphemerisSetFileRetrieveParams): HttpResponse =
        fileRetrieve(params, RequestOptions.none())

    /** @see fileRetrieve */
    @MustBeClosed
    fun fileRetrieve(id: String, requestOptions: RequestOptions): HttpResponse =
        fileRetrieve(id, EphemerisSetFileRetrieveParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): EphemerisSetQueryhelpResponse = queryhelp(EphemerisSetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EphemerisSetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none()
    ): EphemerisSetQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EphemerisSetQueryhelpResponse =
        queryhelp(EphemerisSetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EphemerisSetTupleParams): List<EphemerisSet> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EphemerisSetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EphemerisSet>

    /**
     * A view of [EphemerisSetService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisSetService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ephemerisset`, but is otherwise the same as
         * [EphemerisSetService.create].
         */
        @MustBeClosed
        fun create(params: EphemerisSetCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EphemerisSetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/{id}`, but is otherwise the same
         * as [EphemerisSetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EphemerisSet> =
            retrieve(id, EphemerisSetRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EphemerisSet> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
        ): HttpResponseFor<EphemerisSet> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EphemerisSetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EphemerisSet>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EphemerisSetRetrieveParams): HttpResponseFor<EphemerisSet> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EphemerisSet> =
            retrieve(id, EphemerisSetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset`, but is otherwise the same as
         * [EphemerisSetService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EphemerisSetListPage> = list(EphemerisSetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EphemerisSetListParams = EphemerisSetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EphemerisSetListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EphemerisSetListParams = EphemerisSetListParams.none()
        ): HttpResponseFor<EphemerisSetListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EphemerisSetListPage> =
            list(EphemerisSetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/count`, but is otherwise the same
         * as [EphemerisSetService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(EphemerisSetCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EphemerisSetCountParams = EphemerisSetCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: EphemerisSetCountParams = EphemerisSetCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(EphemerisSetCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/getFile/{id}`, but is otherwise
         * the same as [EphemerisSetService.fileRetrieve].
         */
        @MustBeClosed
        fun fileRetrieve(id: String): HttpResponse =
            fileRetrieve(id, EphemerisSetFileRetrieveParams.none())

        /** @see fileRetrieve */
        @MustBeClosed
        fun fileRetrieve(
            id: String,
            params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = fileRetrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see fileRetrieve */
        @MustBeClosed
        fun fileRetrieve(
            id: String,
            params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
        ): HttpResponse = fileRetrieve(id, params, RequestOptions.none())

        /** @see fileRetrieve */
        @MustBeClosed
        fun fileRetrieve(
            params: EphemerisSetFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see fileRetrieve */
        @MustBeClosed
        fun fileRetrieve(params: EphemerisSetFileRetrieveParams): HttpResponse =
            fileRetrieve(params, RequestOptions.none())

        /** @see fileRetrieve */
        @MustBeClosed
        fun fileRetrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            fileRetrieve(id, EphemerisSetFileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/queryhelp`, but is otherwise the
         * same as [EphemerisSetService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EphemerisSetQueryhelpResponse> =
            queryhelp(EphemerisSetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EphemerisSetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none()
        ): HttpResponseFor<EphemerisSetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<EphemerisSetQueryhelpResponse> =
            queryhelp(EphemerisSetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/tuple`, but is otherwise the same
         * as [EphemerisSetService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EphemerisSetTupleParams): HttpResponseFor<List<EphemerisSet>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EphemerisSetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EphemerisSet>>
    }
}
