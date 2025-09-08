// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListPageAsync
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RfEmitterDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterDetailServiceAsync

    /**
     * Service operation to take a single RFEmitterDetails as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: RfEmitterDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RfEmitterDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single RFEmitterDetails record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: RfEmitterDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: RfEmitterDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: RfEmitterDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RfEmitterDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<RfEmitterDetailListPageAsync> =
        list(RfEmitterDetailListParams.none())

    /** @see list */
    fun list(
        params: RfEmitterDetailListParams = RfEmitterDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterDetailListPageAsync>

    /** @see list */
    fun list(
        params: RfEmitterDetailListParams = RfEmitterDetailListParams.none()
    ): CompletableFuture<RfEmitterDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RfEmitterDetailListPageAsync> =
        list(RfEmitterDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a single RFEmitterDetails record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, RfEmitterDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RfEmitterDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RfEmitterDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, RfEmitterDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(RfEmitterDetailCountParams.none())

    /** @see count */
    fun count(
        params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(RfEmitterDetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single RFEmitterDetails record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<RfEmitterDetailGetResponse> =
        get(id, RfEmitterDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterDetailGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(),
    ): CompletableFuture<RfEmitterDetailGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RfEmitterDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterDetailGetResponse>

    /** @see get */
    fun get(params: RfEmitterDetailGetParams): CompletableFuture<RfEmitterDetailGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RfEmitterDetailGetResponse> =
        get(id, RfEmitterDetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<RfEmitterDetailQueryhelpResponse> =
        queryhelp(RfEmitterDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterDetailQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none()
    ): CompletableFuture<RfEmitterDetailQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<RfEmitterDetailQueryhelpResponse> =
        queryhelp(RfEmitterDetailQueryhelpParams.none(), requestOptions)

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
        params: RfEmitterDetailTupleParams
    ): CompletableFuture<List<RfEmitterDetailTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RfEmitterDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RfEmitterDetailTupleResponse>>

    /**
     * A view of [RfEmitterDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): RfEmitterDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitterdetails`, but is otherwise the same
         * as [RfEmitterDetailServiceAsync.create].
         */
        fun create(params: RfEmitterDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RfEmitterDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [RfEmitterDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: RfEmitterDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: RfEmitterDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: RfEmitterDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RfEmitterDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails`, but is otherwise the same as
         * [RfEmitterDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RfEmitterDetailListPageAsync>> =
            list(RfEmitterDetailListParams.none())

        /** @see list */
        fun list(
            params: RfEmitterDetailListParams = RfEmitterDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailListPageAsync>>

        /** @see list */
        fun list(
            params: RfEmitterDetailListParams = RfEmitterDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailListPageAsync>> =
            list(RfEmitterDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [RfEmitterDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, RfEmitterDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RfEmitterDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RfEmitterDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, RfEmitterDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/count`, but is otherwise the
         * same as [RfEmitterDetailServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(RfEmitterDetailCountParams.none())

        /** @see count */
        fun count(
            params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(RfEmitterDetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [RfEmitterDetailServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>> =
            get(id, RfEmitterDetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RfEmitterDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>>

        /** @see get */
        fun get(
            params: RfEmitterDetailGetParams
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailGetResponse>> =
            get(id, RfEmitterDetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/queryhelp`, but is otherwise
         * the same as [RfEmitterDetailServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<RfEmitterDetailQueryhelpResponse>> =
            queryhelp(RfEmitterDetailQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfEmitterDetailQueryhelpResponse>> =
            queryhelp(RfEmitterDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/tuple`, but is otherwise the
         * same as [RfEmitterDetailServiceAsync.tuple].
         */
        fun tuple(
            params: RfEmitterDetailTupleParams
        ): CompletableFuture<HttpResponseFor<List<RfEmitterDetailTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: RfEmitterDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RfEmitterDetailTupleResponse>>>
    }
}
