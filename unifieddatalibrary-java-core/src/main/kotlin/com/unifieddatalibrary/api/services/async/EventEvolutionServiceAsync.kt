// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EventEvolutionFull
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCountParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateBulkParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListPageAsync
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpResponse
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionRetrieveParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionTupleParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.eventevolution.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventEvolutionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventEvolutionServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single EventEvolution object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: EventEvolutionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventEvolutionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single EventEvolution by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EventEvolutionFull> =
        retrieve(id, EventEvolutionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventEvolutionFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(),
    ): CompletableFuture<EventEvolutionFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventEvolutionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventEvolutionFull>

    /** @see retrieve */
    fun retrieve(params: EventEvolutionRetrieveParams): CompletableFuture<EventEvolutionFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventEvolutionFull> =
        retrieve(id, EventEvolutionRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<EventEvolutionListPageAsync> =
        list(EventEvolutionListParams.none())

    /** @see list */
    fun list(
        params: EventEvolutionListParams = EventEvolutionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventEvolutionListPageAsync>

    /** @see list */
    fun list(
        params: EventEvolutionListParams = EventEvolutionListParams.none()
    ): CompletableFuture<EventEvolutionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventEvolutionListPageAsync> =
        list(EventEvolutionListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(EventEvolutionCountParams.none())

    /** @see count */
    fun count(
        params: EventEvolutionCountParams = EventEvolutionCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: EventEvolutionCountParams = EventEvolutionCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(EventEvolutionCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of EventEvolution
     * records as a POST body and ingest into the database. Requires specific roles, please contact
     * the UDL team to gain access. This operation is not intended to be used for automated feeds
     * into UDL...data providers should contact the UDL team for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: EventEvolutionCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EventEvolutionCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<EventEvolutionQueryhelpResponse> =
        queryhelp(EventEvolutionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventEvolutionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none()
    ): CompletableFuture<EventEvolutionQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<EventEvolutionQueryhelpResponse> =
        queryhelp(EventEvolutionQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EventEvolutionTupleParams): CompletableFuture<List<EventEvolutionFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EventEvolutionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EventEvolutionFull>>

    /**
     * Service operation to take a list of EventEvolution records as a POST body and ingest into the
     * database. Requires a specific role, please contact the UDL team to gain access. This
     * operation is intended to be used for automated feeds into UDL.
     */
    fun unvalidatedPublish(
        params: EventEvolutionUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EventEvolutionUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EventEvolutionServiceAsync] that provides access to raw HTTP responses for each
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
        ): EventEvolutionServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/eventevolution`, but is otherwise the same as
         * [EventEvolutionServiceAsync.create].
         */
        fun create(params: EventEvolutionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EventEvolutionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/eventevolution/{id}`, but is otherwise the same
         * as [EventEvolutionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EventEvolutionFull>> =
            retrieve(id, EventEvolutionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventEvolutionFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventEvolutionFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EventEvolutionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventEvolutionFull>>

        /** @see retrieve */
        fun retrieve(
            params: EventEvolutionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventEvolutionFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventEvolutionFull>> =
            retrieve(id, EventEvolutionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/eventevolution`, but is otherwise the same as
         * [EventEvolutionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventEvolutionListPageAsync>> =
            list(EventEvolutionListParams.none())

        /** @see list */
        fun list(
            params: EventEvolutionListParams = EventEvolutionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventEvolutionListPageAsync>>

        /** @see list */
        fun list(
            params: EventEvolutionListParams = EventEvolutionListParams.none()
        ): CompletableFuture<HttpResponseFor<EventEvolutionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventEvolutionListPageAsync>> =
            list(EventEvolutionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/eventevolution/count`, but is otherwise the
         * same as [EventEvolutionServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(EventEvolutionCountParams.none())

        /** @see count */
        fun count(
            params: EventEvolutionCountParams = EventEvolutionCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: EventEvolutionCountParams = EventEvolutionCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(EventEvolutionCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/eventevolution/createBulk`, but is otherwise
         * the same as [EventEvolutionServiceAsync.createBulk].
         */
        fun createBulk(params: EventEvolutionCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EventEvolutionCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/eventevolution/queryhelp`, but is otherwise the
         * same as [EventEvolutionServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EventEvolutionQueryhelpResponse>> =
            queryhelp(EventEvolutionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventEvolutionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<EventEvolutionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventEvolutionQueryhelpResponse>> =
            queryhelp(EventEvolutionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/eventevolution/tuple`, but is otherwise the
         * same as [EventEvolutionServiceAsync.tuple].
         */
        fun tuple(
            params: EventEvolutionTupleParams
        ): CompletableFuture<HttpResponseFor<List<EventEvolutionFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EventEvolutionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EventEvolutionFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-eventevolution`, but is otherwise the
         * same as [EventEvolutionServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EventEvolutionUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EventEvolutionUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
