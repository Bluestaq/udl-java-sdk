// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sgi.SgiCountParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateBulkParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateParams
import com.unifieddatalibrary.api.models.sgi.SgiDeleteParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateResponse
import com.unifieddatalibrary.api.models.sgi.SgiGetParams
import com.unifieddatalibrary.api.models.sgi.SgiGetResponse
import com.unifieddatalibrary.api.models.sgi.SgiListPageAsync
import com.unifieddatalibrary.api.models.sgi.SgiListParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpResponse
import com.unifieddatalibrary.api.models.sgi.SgiTupleParams
import com.unifieddatalibrary.api.models.sgi.SgiTupleResponse
import com.unifieddatalibrary.api.models.sgi.SgiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sgi.SgiUpdateParams
import com.unifieddatalibrary.api.services.async.sgi.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SgiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single SGI record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SgiCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SgiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single SGI record. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SgiUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SgiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SgiUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SgiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SgiListPageAsync> = list(SgiListParams.none())

    /** @see list */
    fun list(
        params: SgiListParams = SgiListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SgiListPageAsync>

    /** @see list */
    fun list(params: SgiListParams = SgiListParams.none()): CompletableFuture<SgiListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SgiListPageAsync> =
        list(SgiListParams.none(), requestOptions)

    /**
     * Service operation to delete a SGI record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SgiDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SgiDeleteParams = SgiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SgiDeleteParams = SgiDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SgiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SgiDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SgiDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SgiCountParams.none())

    /** @see count */
    fun count(
        params: SgiCountParams = SgiCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: SgiCountParams = SgiCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SgiCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of SGI as a POST body
     * and ingest into the database. This operation is not intended to be used for automated feeds
     * into UDL. Data providers should contact the UDL team for specific role assignments and for
     * instructions on setting up a permanent feed through an alternate mechanism.
     */
    fun createBulk(params: SgiCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SgiCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Service operation to get a single SGI record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SgiGetResponse> = get(id, SgiGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SgiGetParams = SgiGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SgiGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SgiGetParams = SgiGetParams.none(),
    ): CompletableFuture<SgiGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SgiGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SgiGetResponse>

    /** @see get */
    fun get(params: SgiGetParams): CompletableFuture<SgiGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SgiGetResponse> =
        get(id, SgiGetParams.none(), requestOptions)

    /** Service to return matching SGI records as of the effective date. */
    fun getDataByEffectiveAsOfDate(): CompletableFuture<SgiGetDataByEffectiveAsOfDateResponse> =
        getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none())

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(
        params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SgiGetDataByEffectiveAsOfDateResponse>

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(
        params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none()
    ): CompletableFuture<SgiGetDataByEffectiveAsOfDateResponse> =
        getDataByEffectiveAsOfDate(params, RequestOptions.none())

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(
        requestOptions: RequestOptions
    ): CompletableFuture<SgiGetDataByEffectiveAsOfDateResponse> =
        getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SgiQueryhelpResponse> = queryhelp(SgiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SgiQueryhelpParams = SgiQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SgiQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SgiQueryhelpParams = SgiQueryhelpParams.none()
    ): CompletableFuture<SgiQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SgiQueryhelpResponse> =
        queryhelp(SgiQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SgiTupleParams): CompletableFuture<List<SgiTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SgiTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SgiTupleResponse>>

    /**
     * Service operation to take multiple SGI as a POST body and ingest into the database. This
     * operation is intended to be used for automated feeds into UDL. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: SgiUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SgiUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [SgiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sgi`, but is otherwise the same as
         * [SgiServiceAsync.create].
         */
        fun create(params: SgiCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SgiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/sgi/{id}`, but is otherwise the same as
         * [SgiServiceAsync.update].
         */
        fun update(pathId: String, params: SgiUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SgiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SgiUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SgiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sgi`, but is otherwise the same as
         * [SgiServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SgiListPageAsync>> =
            list(SgiListParams.none())

        /** @see list */
        fun list(
            params: SgiListParams = SgiListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SgiListPageAsync>>

        /** @see list */
        fun list(
            params: SgiListParams = SgiListParams.none()
        ): CompletableFuture<HttpResponseFor<SgiListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SgiListPageAsync>> =
            list(SgiListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sgi/{id}`, but is otherwise the same as
         * [SgiServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, SgiDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SgiDeleteParams = SgiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SgiDeleteParams = SgiDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SgiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SgiDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SgiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sgi/count`, but is otherwise the same as
         * [SgiServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SgiCountParams.none())

        /** @see count */
        fun count(
            params: SgiCountParams = SgiCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SgiCountParams = SgiCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SgiCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/sgi/createBulk`, but is otherwise the same as
         * [SgiServiceAsync.createBulk].
         */
        fun createBulk(params: SgiCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: SgiCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sgi/{id}`, but is otherwise the same as
         * [SgiServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SgiGetResponse>> =
            get(id, SgiGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SgiGetParams = SgiGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SgiGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SgiGetParams = SgiGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SgiGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SgiGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SgiGetResponse>>

        /** @see get */
        fun get(params: SgiGetParams): CompletableFuture<HttpResponseFor<SgiGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SgiGetResponse>> =
            get(id, SgiGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sgi/getSGIDataByEffectiveAsOfDate`, but is
         * otherwise the same as [SgiServiceAsync.getDataByEffectiveAsOfDate].
         */
        fun getDataByEffectiveAsOfDate():
            CompletableFuture<HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>> =
            getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none())

        /** @see getDataByEffectiveAsOfDate */
        fun getDataByEffectiveAsOfDate(
            params: SgiGetDataByEffectiveAsOfDateParams =
                SgiGetDataByEffectiveAsOfDateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>>

        /** @see getDataByEffectiveAsOfDate */
        fun getDataByEffectiveAsOfDate(
            params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none()
        ): CompletableFuture<HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>> =
            getDataByEffectiveAsOfDate(params, RequestOptions.none())

        /** @see getDataByEffectiveAsOfDate */
        fun getDataByEffectiveAsOfDate(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>> =
            getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sgi/queryhelp`, but is otherwise the same as
         * [SgiServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SgiQueryhelpResponse>> =
            queryhelp(SgiQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SgiQueryhelpParams = SgiQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SgiQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SgiQueryhelpParams = SgiQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SgiQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SgiQueryhelpResponse>> =
            queryhelp(SgiQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sgi/tuple`, but is otherwise the same as
         * [SgiServiceAsync.tuple].
         */
        fun tuple(
            params: SgiTupleParams
        ): CompletableFuture<HttpResponseFor<List<SgiTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SgiTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SgiTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sgi`, but is otherwise the same as
         * [SgiServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SgiUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SgiUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
