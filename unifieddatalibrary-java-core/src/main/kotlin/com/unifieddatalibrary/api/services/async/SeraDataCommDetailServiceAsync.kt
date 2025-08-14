// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCountParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCreateParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailDeleteParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListPageAsync
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeraDataCommDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataCommDetailServiceAsync

    /**
     * Service operation to take a single SeradataCommDetails as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeraDataCommDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeraDataCommDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an SeradataCommDetails. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeraDataCommDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeraDataCommDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeraDataCommDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeraDataCommDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SeraDataCommDetailListPageAsync> =
        list(SeraDataCommDetailListParams.none())

    /** @see list */
    fun list(
        params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeraDataCommDetailListPageAsync>

    /** @see list */
    fun list(
        params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none()
    ): CompletableFuture<SeraDataCommDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SeraDataCommDetailListPageAsync> =
        list(SeraDataCommDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataCommDetails specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SeraDataCommDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeraDataCommDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeraDataCommDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SeraDataCommDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SeraDataCommDetailCountParams.none())

    /** @see count */
    fun count(
        params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SeraDataCommDetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataCommDetails by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SeraDataCommDetailGetResponse> =
        get(id, SeraDataCommDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeraDataCommDetailGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
    ): CompletableFuture<SeraDataCommDetailGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeraDataCommDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeraDataCommDetailGetResponse>

    /** @see get */
    fun get(params: SeraDataCommDetailGetParams): CompletableFuture<SeraDataCommDetailGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeraDataCommDetailGetResponse> =
        get(id, SeraDataCommDetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SeraDataCommDetailQueryhelpResponse> =
        queryhelp(SeraDataCommDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeraDataCommDetailQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none()
    ): CompletableFuture<SeraDataCommDetailQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SeraDataCommDetailQueryhelpResponse> =
        queryhelp(SeraDataCommDetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: SeraDataCommDetailTupleParams
    ): CompletableFuture<List<SeraDataCommDetailTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeraDataCommDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SeraDataCommDetailTupleResponse>>

    /**
     * A view of [SeraDataCommDetailServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeraDataCommDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradatacommdetails`, but is otherwise the
         * same as [SeraDataCommDetailServiceAsync.create].
         */
        fun create(params: SeraDataCommDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SeraDataCommDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/seradatacommdetails/{id}`, but is otherwise the
         * same as [SeraDataCommDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SeraDataCommDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SeraDataCommDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SeraDataCommDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SeraDataCommDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails`, but is otherwise the same
         * as [SeraDataCommDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SeraDataCommDetailListPageAsync>> =
            list(SeraDataCommDetailListParams.none())

        /** @see list */
        fun list(
            params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailListPageAsync>>

        /** @see list */
        fun list(
            params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailListPageAsync>> =
            list(SeraDataCommDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradatacommdetails/{id}`, but is otherwise
         * the same as [SeraDataCommDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SeraDataCommDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SeraDataCommDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeraDataCommDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SeraDataCommDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/count`, but is otherwise
         * the same as [SeraDataCommDetailServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SeraDataCommDetailCountParams.none())

        /** @see count */
        fun count(
            params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SeraDataCommDetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/{id}`, but is otherwise the
         * same as [SeraDataCommDetailServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> =
            get(id, SeraDataCommDetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SeraDataCommDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>>

        /** @see get */
        fun get(
            params: SeraDataCommDetailGetParams
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> =
            get(id, SeraDataCommDetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/queryhelp`, but is
         * otherwise the same as [SeraDataCommDetailServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SeraDataCommDetailQueryhelpResponse>> =
            queryhelp(SeraDataCommDetailQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailQueryhelpResponse>> =
            queryhelp(SeraDataCommDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/tuple`, but is otherwise
         * the same as [SeraDataCommDetailServiceAsync.tuple].
         */
        fun tuple(
            params: SeraDataCommDetailTupleParams
        ): CompletableFuture<HttpResponseFor<List<SeraDataCommDetailTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SeraDataCommDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SeraDataCommDetailTupleResponse>>>
    }
}
