// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCountParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCreateParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListPageAsync
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUpdateParams
import com.unifieddatalibrary.api.services.async.sensorplan.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorPlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorPlanServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single sensor plan as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SensorPlanCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SensorPlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single SensorPlan. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SensorPlanUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SensorPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SensorPlanUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: SensorPlanListParams): CompletableFuture<SensorPlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SensorPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorPlanListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SensorPlanCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SensorPlanCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Service operation to get a single SensorPlan by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SensorPlanGetResponse> =
        get(id, SensorPlanGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorPlanGetParams = SensorPlanGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorPlanGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorPlanGetParams = SensorPlanGetParams.none(),
    ): CompletableFuture<SensorPlanGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorPlanGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorPlanGetResponse>

    /** @see get */
    fun get(params: SensorPlanGetParams): CompletableFuture<SensorPlanGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SensorPlanGetResponse> =
        get(id, SensorPlanGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SensorPlanQueryhelpResponse> =
        queryhelp(SensorPlanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorPlanQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none()
    ): CompletableFuture<SensorPlanQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SensorPlanQueryhelpResponse> =
        queryhelp(SensorPlanQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SensorPlanTupleParams): CompletableFuture<List<SensorPlanTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SensorPlanTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SensorPlanTupleResponse>>

    /**
     * Service operation to take one or more sensorplan record(s) as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: SensorPlanUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SensorPlanUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SensorPlanServiceAsync] that provides access to raw HTTP responses for each
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
        ): SensorPlanServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensorplan`, but is otherwise the same as
         * [SensorPlanServiceAsync.create].
         */
        fun create(params: SensorPlanCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SensorPlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/sensorplan/{id}`, but is otherwise the same as
         * [SensorPlanServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SensorPlanUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SensorPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SensorPlanUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SensorPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensorplan`, but is otherwise the same as
         * [SensorPlanServiceAsync.list].
         */
        fun list(
            params: SensorPlanListParams
        ): CompletableFuture<HttpResponseFor<SensorPlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SensorPlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorPlanListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/sensorplan/count`, but is otherwise the same as
         * [SensorPlanServiceAsync.count].
         */
        fun count(params: SensorPlanCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: SensorPlanCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/sensorplan/{id}`, but is otherwise the same as
         * [SensorPlanServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>> =
            get(id, SensorPlanGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SensorPlanGetParams = SensorPlanGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SensorPlanGetParams = SensorPlanGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SensorPlanGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>>

        /** @see get */
        fun get(
            params: SensorPlanGetParams
        ): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorPlanGetResponse>> =
            get(id, SensorPlanGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorplan/queryhelp`, but is otherwise the
         * same as [SensorPlanServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SensorPlanQueryhelpResponse>> =
            queryhelp(SensorPlanQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorPlanQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SensorPlanQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorPlanQueryhelpResponse>> =
            queryhelp(SensorPlanQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorplan/tuple`, but is otherwise the same as
         * [SensorPlanServiceAsync.tuple].
         */
        fun tuple(
            params: SensorPlanTupleParams
        ): CompletableFuture<HttpResponseFor<List<SensorPlanTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SensorPlanTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SensorPlanTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sensorplan`, but is otherwise the
         * same as [SensorPlanServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SensorPlanUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SensorPlanUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
