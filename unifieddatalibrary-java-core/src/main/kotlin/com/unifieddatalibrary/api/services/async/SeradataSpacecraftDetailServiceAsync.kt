// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCountParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCreateParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailDeleteParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListPageAsync
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeradataSpacecraftDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSpacecraftDetailServiceAsync

    /**
     * Service operation to take a single SeradataSpacecraftDetails as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: SeradataSpacecraftDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataSpacecraftDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an SeradataSpacecraftDetails. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(
        pathId: String,
        params: SeradataSpacecraftDetailUpdateParams,
    ): CompletableFuture<Void?> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataSpacecraftDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataSpacecraftDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataSpacecraftDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SeradataSpacecraftDetailListPageAsync> =
        list(SeradataSpacecraftDetailListParams.none())

    /** @see list */
    fun list(
        params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataSpacecraftDetailListPageAsync>

    /** @see list */
    fun list(
        params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none()
    ): CompletableFuture<SeradataSpacecraftDetailListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<SeradataSpacecraftDetailListPageAsync> =
        list(SeradataSpacecraftDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataSpacecraftDetails specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SeradataSpacecraftDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSpacecraftDetailDeleteParams = SeradataSpacecraftDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSpacecraftDetailDeleteParams = SeradataSpacecraftDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataSpacecraftDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeradataSpacecraftDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SeradataSpacecraftDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SeradataSpacecraftDetailCountParams.none())

    /** @see count */
    fun count(
        params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SeradataSpacecraftDetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataSpacecraftDetails by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SeradataSpacecraftDetailGetResponse> =
        get(id, SeradataSpacecraftDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataSpacecraftDetailGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
    ): CompletableFuture<SeradataSpacecraftDetailGetResponse> =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataSpacecraftDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataSpacecraftDetailGetResponse>

    /** @see get */
    fun get(
        params: SeradataSpacecraftDetailGetParams
    ): CompletableFuture<SeradataSpacecraftDetailGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataSpacecraftDetailGetResponse> =
        get(id, SeradataSpacecraftDetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SeradataSpacecraftDetailQueryhelpResponse> =
        queryhelp(SeradataSpacecraftDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSpacecraftDetailQueryhelpParams =
            SeradataSpacecraftDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataSpacecraftDetailQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSpacecraftDetailQueryhelpParams =
            SeradataSpacecraftDetailQueryhelpParams.none()
    ): CompletableFuture<SeradataSpacecraftDetailQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SeradataSpacecraftDetailQueryhelpResponse> =
        queryhelp(SeradataSpacecraftDetailQueryhelpParams.none(), requestOptions)

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
        params: SeradataSpacecraftDetailTupleParams
    ): CompletableFuture<List<SeradataSpacecraftDetailTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataSpacecraftDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SeradataSpacecraftDetailTupleResponse>>

    /**
     * A view of [SeradataSpacecraftDetailServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeradataSpacecraftDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradataspacecraftdetails`, but is otherwise
         * the same as [SeradataSpacecraftDetailServiceAsync.create].
         */
        fun create(params: SeradataSpacecraftDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SeradataSpacecraftDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SeradataSpacecraftDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SeradataSpacecraftDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SeradataSpacecraftDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SeradataSpacecraftDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails`, but is otherwise
         * the same as [SeradataSpacecraftDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailListPageAsync>> =
            list(SeradataSpacecraftDetailListParams.none())

        /** @see list */
        fun list(
            params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailListPageAsync>>

        /** @see list */
        fun list(
            params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailListPageAsync>> =
            list(SeradataSpacecraftDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SeradataSpacecraftDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataSpacecraftDetailDeleteParams =
                SeradataSpacecraftDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataSpacecraftDetailDeleteParams =
                SeradataSpacecraftDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SeradataSpacecraftDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeradataSpacecraftDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SeradataSpacecraftDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/count`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataSpacecraftDetailCountParams.none())

        /** @see count */
        fun count(
            params: SeradataSpacecraftDetailCountParams =
                SeradataSpacecraftDetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataSpacecraftDetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.get].
         */
        fun get(
            id: String
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>> =
            get(id, SeradataSpacecraftDetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SeradataSpacecraftDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>>

        /** @see get */
        fun get(
            params: SeradataSpacecraftDetailGetParams
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailGetResponse>> =
            get(id, SeradataSpacecraftDetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/queryhelp`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.queryhelp].
         */
        fun queryhelp():
            CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse>> =
            queryhelp(SeradataSpacecraftDetailQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataSpacecraftDetailQueryhelpParams =
                SeradataSpacecraftDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataSpacecraftDetailQueryhelpParams =
                SeradataSpacecraftDetailQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse>> =
            queryhelp(SeradataSpacecraftDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/tuple`, but is
         * otherwise the same as [SeradataSpacecraftDetailServiceAsync.tuple].
         */
        fun tuple(
            params: SeradataSpacecraftDetailTupleParams
        ): CompletableFuture<HttpResponseFor<List<SeradataSpacecraftDetailTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SeradataSpacecraftDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SeradataSpacecraftDetailTupleResponse>>>
    }
}
