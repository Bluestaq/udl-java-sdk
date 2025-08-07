// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ChannelFull
import com.unifieddatalibrary.api.models.channels.ChannelCountParams
import com.unifieddatalibrary.api.models.channels.ChannelCreateParams
import com.unifieddatalibrary.api.models.channels.ChannelDeleteParams
import com.unifieddatalibrary.api.models.channels.ChannelListPageAsync
import com.unifieddatalibrary.api.models.channels.ChannelListParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpResponse
import com.unifieddatalibrary.api.models.channels.ChannelRetrieveParams
import com.unifieddatalibrary.api.models.channels.ChannelTupleParams
import com.unifieddatalibrary.api.models.channels.ChannelUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelServiceAsync

    /**
     * Service operation to take a single Channel as a POST body and ingest into the database. A
     * Comm payload may have multiple transponders and a transponder may have many channels. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: ChannelCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Channel record by its unique ID passed as a path parameter.
     * A Comm payload may have multiple transponders and a transponder may have many channels.
     */
    fun retrieve(id: String): CompletableFuture<ChannelFull> =
        retrieve(id, ChannelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChannelRetrieveParams = ChannelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChannelRetrieveParams = ChannelRetrieveParams.none(),
    ): CompletableFuture<ChannelFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChannelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelFull>

    /** @see retrieve */
    fun retrieve(params: ChannelRetrieveParams): CompletableFuture<ChannelFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ChannelFull> =
        retrieve(id, ChannelRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Channel. A Comm payload may have multiple transponders
     * and a transponder may have many channels. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: ChannelUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<ChannelListPageAsync> = list(ChannelListParams.none())

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelListPageAsync>

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none()
    ): CompletableFuture<ChannelListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChannelListPageAsync> =
        list(ChannelListParams.none(), requestOptions)

    /**
     * Service operation to delete a Channel object specified by the passed ID path parameter. A
     * Comm payload may have multiple transponders and a transponder may have many channels. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, ChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ChannelDeleteParams = ChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ChannelDeleteParams = ChannelDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChannelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ChannelDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ChannelDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(ChannelCountParams.none())

    /** @see count */
    fun count(
        params: ChannelCountParams = ChannelCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: ChannelCountParams = ChannelCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(ChannelCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<ChannelQueryhelpResponse> =
        queryhelp(ChannelQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ChannelQueryhelpParams = ChannelQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: ChannelQueryhelpParams = ChannelQueryhelpParams.none()
    ): CompletableFuture<ChannelQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ChannelQueryhelpResponse> =
        queryhelp(ChannelQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ChannelTupleParams): CompletableFuture<List<ChannelFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ChannelTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ChannelFull>>

    /**
     * A view of [ChannelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/channel`, but is otherwise the same as
         * [ChannelServiceAsync.create].
         */
        fun create(params: ChannelCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChannelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/channel/{id}`, but is otherwise the same as
         * [ChannelServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ChannelFull>> =
            retrieve(id, ChannelRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChannelRetrieveParams = ChannelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChannelRetrieveParams = ChannelRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChannelFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChannelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelFull>>

        /** @see retrieve */
        fun retrieve(
            params: ChannelRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChannelFull>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelFull>> =
            retrieve(id, ChannelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/channel/{id}`, but is otherwise the same as
         * [ChannelServiceAsync.update].
         */
        fun update(pathId: String, params: ChannelUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: ChannelUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/channel`, but is otherwise the same as
         * [ChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(ChannelListParams.none())

        /** @see list */
        fun list(
            params: ChannelListParams = ChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>>

        /** @see list */
        fun list(
            params: ChannelListParams = ChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(ChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/channel/{id}`, but is otherwise the same as
         * [ChannelServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ChannelDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ChannelDeleteParams = ChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ChannelDeleteParams = ChannelDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChannelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ChannelDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ChannelDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/channel/count`, but is otherwise the same as
         * [ChannelServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(ChannelCountParams.none())

        /** @see count */
        fun count(
            params: ChannelCountParams = ChannelCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: ChannelCountParams = ChannelCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(ChannelCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/channel/queryhelp`, but is otherwise the same
         * as [ChannelServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ChannelQueryhelpResponse>> =
            queryhelp(ChannelQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: ChannelQueryhelpParams = ChannelQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: ChannelQueryhelpParams = ChannelQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<ChannelQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChannelQueryhelpResponse>> =
            queryhelp(ChannelQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/channel/tuple`, but is otherwise the same as
         * [ChannelServiceAsync.tuple].
         */
        fun tuple(
            params: ChannelTupleParams
        ): CompletableFuture<HttpResponseFor<List<ChannelFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: ChannelTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ChannelFull>>>
    }
}
