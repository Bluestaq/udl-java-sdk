// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AntennaFull
import com.unifieddatalibrary.api.models.AntennaIngest
import com.unifieddatalibrary.api.models.antennas.AntennaCountParams
import com.unifieddatalibrary.api.models.antennas.AntennaCreateParams
import com.unifieddatalibrary.api.models.antennas.AntennaDeleteParams
import com.unifieddatalibrary.api.models.antennas.AntennaListPageAsync
import com.unifieddatalibrary.api.models.antennas.AntennaListParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpResponse
import com.unifieddatalibrary.api.models.antennas.AntennaRetrieveParams
import com.unifieddatalibrary.api.models.antennas.AntennaTupleParams
import com.unifieddatalibrary.api.models.antennas.AntennaUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AntennaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaServiceAsync

    /**
     * Service operation to take a single Antenna as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: AntennaCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AntennaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        antennaIngest: AntennaIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(AntennaCreateParams.builder().antennaIngest(antennaIngest).build(), requestOptions)

    /** @see create */
    fun create(antennaIngest: AntennaIngest): CompletableFuture<Void?> =
        create(antennaIngest, RequestOptions.none())

    /**
     * Service operation to get a single Antenna record by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<AntennaFull> =
        retrieve(id, AntennaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AntennaRetrieveParams = AntennaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AntennaRetrieveParams = AntennaRetrieveParams.none(),
    ): CompletableFuture<AntennaFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AntennaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaFull>

    /** @see retrieve */
    fun retrieve(params: AntennaRetrieveParams): CompletableFuture<AntennaFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AntennaFull> =
        retrieve(id, AntennaRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Antenna. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AntennaUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AntennaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AntennaUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AntennaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<AntennaListPageAsync> = list(AntennaListParams.none())

    /** @see list */
    fun list(
        params: AntennaListParams = AntennaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaListPageAsync>

    /** @see list */
    fun list(
        params: AntennaListParams = AntennaListParams.none()
    ): CompletableFuture<AntennaListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AntennaListPageAsync> =
        list(AntennaListParams.none(), requestOptions)

    /**
     * Service operation to delete a Antenna object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, AntennaDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AntennaDeleteParams = AntennaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AntennaDeleteParams = AntennaDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AntennaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AntennaDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AntennaDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(AntennaCountParams.none())

    /** @see count */
    fun count(
        params: AntennaCountParams = AntennaCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: AntennaCountParams = AntennaCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(AntennaCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<AntennaQueryhelpResponse> =
        queryhelp(AntennaQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AntennaQueryhelpParams = AntennaQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: AntennaQueryhelpParams = AntennaQueryhelpParams.none()
    ): CompletableFuture<AntennaQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AntennaQueryhelpResponse> =
        queryhelp(AntennaQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AntennaTupleParams): CompletableFuture<List<AntennaFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AntennaTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AntennaFull>>

    /**
     * A view of [AntennaServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AntennaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/antenna`, but is otherwise the same as
         * [AntennaServiceAsync.create].
         */
        fun create(params: AntennaCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AntennaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            antennaIngest: AntennaIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                AntennaCreateParams.builder().antennaIngest(antennaIngest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(antennaIngest: AntennaIngest): CompletableFuture<HttpResponse> =
            create(antennaIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/antenna/{id}`, but is otherwise the same as
         * [AntennaServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AntennaFull>> =
            retrieve(id, AntennaRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AntennaRetrieveParams = AntennaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AntennaRetrieveParams = AntennaRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AntennaFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AntennaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaFull>>

        /** @see retrieve */
        fun retrieve(
            params: AntennaRetrieveParams
        ): CompletableFuture<HttpResponseFor<AntennaFull>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AntennaFull>> =
            retrieve(id, AntennaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/antenna/{id}`, but is otherwise the same as
         * [AntennaServiceAsync.update].
         */
        fun update(pathId: String, params: AntennaUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AntennaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AntennaUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AntennaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/antenna`, but is otherwise the same as
         * [AntennaServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AntennaListPageAsync>> =
            list(AntennaListParams.none())

        /** @see list */
        fun list(
            params: AntennaListParams = AntennaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaListPageAsync>>

        /** @see list */
        fun list(
            params: AntennaListParams = AntennaListParams.none()
        ): CompletableFuture<HttpResponseFor<AntennaListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AntennaListPageAsync>> =
            list(AntennaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/antenna/{id}`, but is otherwise the same as
         * [AntennaServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AntennaDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AntennaDeleteParams = AntennaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AntennaDeleteParams = AntennaDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AntennaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AntennaDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AntennaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/antenna/count`, but is otherwise the same as
         * [AntennaServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AntennaCountParams.none())

        /** @see count */
        fun count(
            params: AntennaCountParams = AntennaCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: AntennaCountParams = AntennaCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(AntennaCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/antenna/queryhelp`, but is otherwise the same
         * as [AntennaServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AntennaQueryhelpResponse>> =
            queryhelp(AntennaQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: AntennaQueryhelpParams = AntennaQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: AntennaQueryhelpParams = AntennaQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<AntennaQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AntennaQueryhelpResponse>> =
            queryhelp(AntennaQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/antenna/tuple`, but is otherwise the same as
         * [AntennaServiceAsync.tuple].
         */
        fun tuple(
            params: AntennaTupleParams
        ): CompletableFuture<HttpResponseFor<List<AntennaFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AntennaTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AntennaFull>>>
    }
}
