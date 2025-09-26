// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.rfemitter

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCountParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCreateParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListPageAsync
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailServiceAsync

    /**
     * Service operation to take a single RFEmitterDetails as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single RFEmitterDetails record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: DetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<DetailListPageAsync> = list(DetailListParams.none())

    /** @see list */
    fun list(
        params: DetailListParams = DetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailListPageAsync>

    /** @see list */
    fun list(
        params: DetailListParams = DetailListParams.none()
    ): CompletableFuture<DetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DetailListPageAsync> =
        list(DetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a single RFEmitterDetails record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, DetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DetailDeleteParams = DetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DetailDeleteParams = DetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, DetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(DetailCountParams.none())

    /** @see count */
    fun count(
        params: DetailCountParams = DetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: DetailCountParams = DetailCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(DetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single RFEmitterDetails record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<DetailGetResponse> = get(id, DetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: DetailGetParams = DetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: DetailGetParams = DetailGetParams.none(),
    ): CompletableFuture<DetailGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailGetResponse>

    /** @see get */
    fun get(params: DetailGetParams): CompletableFuture<DetailGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<DetailGetResponse> =
        get(id, DetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<DetailQueryhelpResponse> =
        queryhelp(DetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DetailQueryhelpParams = DetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: DetailQueryhelpParams = DetailQueryhelpParams.none()
    ): CompletableFuture<DetailQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<DetailQueryhelpResponse> =
        queryhelp(DetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DetailTupleParams): CompletableFuture<List<DetailTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DetailTupleResponse>>

    /**
     * A view of [DetailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitterdetails`, but is otherwise the same
         * as [DetailServiceAsync.create].
         */
        fun create(params: DetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailServiceAsync.update].
         */
        fun update(pathId: String, params: DetailUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: DetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: DetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails`, but is otherwise the same as
         * [DetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(DetailListParams.none())

        /** @see list */
        fun list(
            params: DetailListParams = DetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>>

        /** @see list */
        fun list(
            params: DetailListParams = DetailListParams.none()
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(DetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, DetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DetailDeleteParams = DetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DetailDeleteParams = DetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, DetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/count`, but is otherwise the
         * same as [DetailServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(DetailCountParams.none())

        /** @see count */
        fun count(
            params: DetailCountParams = DetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: DetailCountParams = DetailCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(DetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<DetailGetResponse>> =
            get(id, DetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: DetailGetParams = DetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: DetailGetParams = DetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailGetResponse>>

        /** @see get */
        fun get(params: DetailGetParams): CompletableFuture<HttpResponseFor<DetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetailGetResponse>> =
            get(id, DetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/queryhelp`, but is otherwise
         * the same as [DetailServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DetailQueryhelpResponse>> =
            queryhelp(DetailQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: DetailQueryhelpParams = DetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: DetailQueryhelpParams = DetailQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<DetailQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailQueryhelpResponse>> =
            queryhelp(DetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/tuple`, but is otherwise the
         * same as [DetailServiceAsync.tuple].
         */
        fun tuple(
            params: DetailTupleParams
        ): CompletableFuture<HttpResponseFor<List<DetailTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DetailTupleResponse>>>
    }
}
