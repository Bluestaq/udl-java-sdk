// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSet
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCountParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCreateParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetFileRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListPageAsync
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetTupleParams
import com.unifieddatalibrary.api.services.async.ephemerissets.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EphemerisSetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisSetServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation intended for initial integration only. Takes a single EphemerisSet as a
     * POST body and ingest into the database. This operation does not persist any Ephemeris Points
     * that may be present in the body of the request. This operation is not intended to be used for
     * automated feeds into UDL.A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance. </br> The following rules apply to this
     * operation:
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
    fun create(params: EphemerisSetCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EphemerisSetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Ephemeris Set by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EphemerisSet> =
        retrieve(id, EphemerisSetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisSet> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
    ): CompletableFuture<EphemerisSet> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EphemerisSetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisSet>

    /** @see retrieve */
    fun retrieve(params: EphemerisSetRetrieveParams): CompletableFuture<EphemerisSet> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EphemerisSet> =
        retrieve(id, EphemerisSetRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<EphemerisSetListPageAsync> = list(EphemerisSetListParams.none())

    /** @see list */
    fun list(
        params: EphemerisSetListParams = EphemerisSetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisSetListPageAsync>

    /** @see list */
    fun list(
        params: EphemerisSetListParams = EphemerisSetListParams.none()
    ): CompletableFuture<EphemerisSetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EphemerisSetListPageAsync> =
        list(EphemerisSetListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(EphemerisSetCountParams.none())

    /** @see count */
    fun count(
        params: EphemerisSetCountParams = EphemerisSetCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: EphemerisSetCountParams = EphemerisSetCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(EphemerisSetCountParams.none(), requestOptions)

    /**
     * Service operation to get the original raw flat file, if any, associated with the
     * EphemerisSet. The file is returned as an attachment Content-Disposition.
     */
    fun fileRetrieve(id: String): CompletableFuture<HttpResponse> =
        fileRetrieve(id, EphemerisSetFileRetrieveParams.none())

    /** @see fileRetrieve */
    fun fileRetrieve(
        id: String,
        params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        fileRetrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see fileRetrieve */
    fun fileRetrieve(
        id: String,
        params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
    ): CompletableFuture<HttpResponse> = fileRetrieve(id, params, RequestOptions.none())

    /** @see fileRetrieve */
    fun fileRetrieve(
        params: EphemerisSetFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see fileRetrieve */
    fun fileRetrieve(params: EphemerisSetFileRetrieveParams): CompletableFuture<HttpResponse> =
        fileRetrieve(params, RequestOptions.none())

    /** @see fileRetrieve */
    fun fileRetrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        fileRetrieve(id, EphemerisSetFileRetrieveParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<EphemerisSetQueryhelpResponse> =
        queryhelp(EphemerisSetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemerisSetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none()
    ): CompletableFuture<EphemerisSetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<EphemerisSetQueryhelpResponse> =
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
    fun tuple(params: EphemerisSetTupleParams): CompletableFuture<List<EphemerisSet>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EphemerisSetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EphemerisSet>>

    /**
     * A view of [EphemerisSetServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisSetServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ephemerisset`, but is otherwise the same as
         * [EphemerisSetServiceAsync.create].
         */
        fun create(params: EphemerisSetCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EphemerisSetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/{id}`, but is otherwise the same
         * as [EphemerisSetServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EphemerisSet>> =
            retrieve(id, EphemerisSetRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisSet>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EphemerisSetRetrieveParams = EphemerisSetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisSet>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EphemerisSetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisSet>>

        /** @see retrieve */
        fun retrieve(
            params: EphemerisSetRetrieveParams
        ): CompletableFuture<HttpResponseFor<EphemerisSet>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EphemerisSet>> =
            retrieve(id, EphemerisSetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset`, but is otherwise the same as
         * [EphemerisSetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EphemerisSetListPageAsync>> =
            list(EphemerisSetListParams.none())

        /** @see list */
        fun list(
            params: EphemerisSetListParams = EphemerisSetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisSetListPageAsync>>

        /** @see list */
        fun list(
            params: EphemerisSetListParams = EphemerisSetListParams.none()
        ): CompletableFuture<HttpResponseFor<EphemerisSetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EphemerisSetListPageAsync>> =
            list(EphemerisSetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/count`, but is otherwise the same
         * as [EphemerisSetServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(EphemerisSetCountParams.none())

        /** @see count */
        fun count(
            params: EphemerisSetCountParams = EphemerisSetCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: EphemerisSetCountParams = EphemerisSetCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(EphemerisSetCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/getFile/{id}`, but is otherwise
         * the same as [EphemerisSetServiceAsync.fileRetrieve].
         */
        fun fileRetrieve(id: String): CompletableFuture<HttpResponse> =
            fileRetrieve(id, EphemerisSetFileRetrieveParams.none())

        /** @see fileRetrieve */
        fun fileRetrieve(
            id: String,
            params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            fileRetrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see fileRetrieve */
        fun fileRetrieve(
            id: String,
            params: EphemerisSetFileRetrieveParams = EphemerisSetFileRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = fileRetrieve(id, params, RequestOptions.none())

        /** @see fileRetrieve */
        fun fileRetrieve(
            params: EphemerisSetFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see fileRetrieve */
        fun fileRetrieve(params: EphemerisSetFileRetrieveParams): CompletableFuture<HttpResponse> =
            fileRetrieve(params, RequestOptions.none())

        /** @see fileRetrieve */
        fun fileRetrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            fileRetrieve(id, EphemerisSetFileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/queryhelp`, but is otherwise the
         * same as [EphemerisSetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EphemerisSetQueryhelpResponse>> =
            queryhelp(EphemerisSetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemerisSetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: EphemerisSetQueryhelpParams = EphemerisSetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<EphemerisSetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EphemerisSetQueryhelpResponse>> =
            queryhelp(EphemerisSetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ephemerisset/tuple`, but is otherwise the same
         * as [EphemerisSetServiceAsync.tuple].
         */
        fun tuple(
            params: EphemerisSetTupleParams
        ): CompletableFuture<HttpResponseFor<List<EphemerisSet>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EphemerisSetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EphemerisSet>>>
    }
}
