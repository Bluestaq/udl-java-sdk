// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SortiePprFull
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCountParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateBulkParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprDeleteParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprGetParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListPageAsync
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpResponse
import com.unifieddatalibrary.api.models.sortieppr.SortiePprTupleParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUpdateParams
import com.unifieddatalibrary.api.services.async.sortieppr.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SortiePprServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SortiePprServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single sortieppr record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SortiePprCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SortiePprCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single sortieppr record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SortiePprUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SortiePprUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SortiePprUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SortiePprUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: SortiePprListParams): CompletableFuture<SortiePprListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SortiePprListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SortiePprListPageAsync>

    /**
     * Service operation to delete a sortieppr record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SortiePprDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SortiePprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SortiePprDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SortiePprDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SortiePprCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SortiePprCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of SortiePPR records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: SortiePprCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SortiePprCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single sortieppr record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SortiePprFull> = get(id, SortiePprGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SortiePprGetParams = SortiePprGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SortiePprFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SortiePprGetParams = SortiePprGetParams.none(),
    ): CompletableFuture<SortiePprFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SortiePprGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SortiePprFull>

    /** @see get */
    fun get(params: SortiePprGetParams): CompletableFuture<SortiePprFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SortiePprFull> =
        get(id, SortiePprGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SortiePprQueryhelpResponse> =
        queryhelp(SortiePprQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SortiePprQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none()
    ): CompletableFuture<SortiePprQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SortiePprQueryhelpResponse> =
        queryhelp(SortiePprQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SortiePprTupleParams): CompletableFuture<List<SortiePprFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SortiePprTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SortiePprFull>>

    /**
     * Service operation to take SortiePPR as a POST body and ingest into the database. This
     * operation is intended to be used for automated feeds into UDL. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: SortiePprUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SortiePprUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SortiePprServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SortiePprServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sortieppr`, but is otherwise the same as
         * [SortiePprServiceAsync.create].
         */
        fun create(params: SortiePprCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SortiePprCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/sortieppr/{id}`, but is otherwise the same as
         * [SortiePprServiceAsync.update].
         */
        fun update(pathId: String, params: SortiePprUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SortiePprUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SortiePprUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SortiePprUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr`, but is otherwise the same as
         * [SortiePprServiceAsync.list].
         */
        fun list(
            params: SortiePprListParams
        ): CompletableFuture<HttpResponseFor<SortiePprListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SortiePprListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SortiePprListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/sortieppr/{id}`, but is otherwise the same
         * as [SortiePprServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SortiePprDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SortiePprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SortiePprDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SortiePprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/count`, but is otherwise the same as
         * [SortiePprServiceAsync.count].
         */
        fun count(params: SortiePprCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: SortiePprCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/sortieppr/createBulk`, but is otherwise the
         * same as [SortiePprServiceAsync.createBulk].
         */
        fun createBulk(params: SortiePprCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: SortiePprCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/{id}`, but is otherwise the same as
         * [SortiePprServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SortiePprFull>> =
            get(id, SortiePprGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SortiePprGetParams = SortiePprGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SortiePprFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SortiePprGetParams = SortiePprGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SortiePprFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SortiePprGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SortiePprFull>>

        /** @see get */
        fun get(params: SortiePprGetParams): CompletableFuture<HttpResponseFor<SortiePprFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SortiePprFull>> =
            get(id, SortiePprGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/queryhelp`, but is otherwise the same
         * as [SortiePprServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SortiePprQueryhelpResponse>> =
            queryhelp(SortiePprQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SortiePprQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SortiePprQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SortiePprQueryhelpResponse>> =
            queryhelp(SortiePprQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/tuple`, but is otherwise the same as
         * [SortiePprServiceAsync.tuple].
         */
        fun tuple(
            params: SortiePprTupleParams
        ): CompletableFuture<HttpResponseFor<List<SortiePprFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SortiePprTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SortiePprFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sortieppr`, but is otherwise the same
         * as [SortiePprServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SortiePprUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SortiePprUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
