// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateBulkParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceDeleteParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListPageAsync
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryhelpParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryhelpResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceUpdateParams
import com.unifieddatalibrary.api.services.async.sensormaintenance.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorMaintenanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorMaintenanceServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single SensorMaintenance as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SensorMaintenanceCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SensorMaintenanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single SensorMaintenance. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SensorMaintenanceUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SensorMaintenanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SensorMaintenanceUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorMaintenanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SensorMaintenanceListPageAsync> =
        list(SensorMaintenanceListParams.none())

    /** @see list */
    fun list(
        params: SensorMaintenanceListParams = SensorMaintenanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorMaintenanceListPageAsync>

    /** @see list */
    fun list(
        params: SensorMaintenanceListParams = SensorMaintenanceListParams.none()
    ): CompletableFuture<SensorMaintenanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SensorMaintenanceListPageAsync> =
        list(SensorMaintenanceListParams.none(), requestOptions)

    /**
     * Service operation to delete a SensorMaintenance object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SensorMaintenanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SensorMaintenanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SensorMaintenanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SensorMaintenanceDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SensorMaintenanceCountParams.none())

    /** @see count */
    fun count(
        params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SensorMaintenanceCountParams.none(), requestOptions)

    /**
     * Service operation to take multiple SensorMaintenance as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: SensorMaintenanceCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SensorMaintenanceCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get current Sensor Maintenance records using any number of additional
     * parameters.
     */
    fun current(): CompletableFuture<List<SensorMaintenanceCurrentResponse>> =
        current(SensorMaintenanceCurrentParams.none())

    /** @see current */
    fun current(
        params: SensorMaintenanceCurrentParams = SensorMaintenanceCurrentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SensorMaintenanceCurrentResponse>>

    /** @see current */
    fun current(
        params: SensorMaintenanceCurrentParams = SensorMaintenanceCurrentParams.none()
    ): CompletableFuture<List<SensorMaintenanceCurrentResponse>> =
        current(params, RequestOptions.none())

    /** @see current */
    fun current(
        requestOptions: RequestOptions
    ): CompletableFuture<List<SensorMaintenanceCurrentResponse>> =
        current(SensorMaintenanceCurrentParams.none(), requestOptions)

    /**
     * Service operation to get a single SensorMaintenance record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SensorMaintenanceGetResponse> =
        get(id, SensorMaintenanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorMaintenanceGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
    ): CompletableFuture<SensorMaintenanceGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorMaintenanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorMaintenanceGetResponse>

    /** @see get */
    fun get(params: SensorMaintenanceGetParams): CompletableFuture<SensorMaintenanceGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorMaintenanceGetResponse> =
        get(id, SensorMaintenanceGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SensorMaintenanceQueryhelpResponse> =
        queryhelp(SensorMaintenanceQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorMaintenanceQueryhelpParams = SensorMaintenanceQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorMaintenanceQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SensorMaintenanceQueryhelpParams = SensorMaintenanceQueryhelpParams.none()
    ): CompletableFuture<SensorMaintenanceQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SensorMaintenanceQueryhelpResponse> =
        queryhelp(SensorMaintenanceQueryhelpParams.none(), requestOptions)

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
        params: SensorMaintenanceTupleParams
    ): CompletableFuture<List<SensorMaintenanceTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SensorMaintenanceTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SensorMaintenanceTupleResponse>>

    /**
     * A view of [SensorMaintenanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): SensorMaintenanceServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensormaintenance`, but is otherwise the same
         * as [SensorMaintenanceServiceAsync.create].
         */
        fun create(params: SensorMaintenanceCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SensorMaintenanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/sensormaintenance/{id}`, but is otherwise the
         * same as [SensorMaintenanceServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SensorMaintenanceUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SensorMaintenanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SensorMaintenanceUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SensorMaintenanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance`, but is otherwise the same
         * as [SensorMaintenanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SensorMaintenanceListPageAsync>> =
            list(SensorMaintenanceListParams.none())

        /** @see list */
        fun list(
            params: SensorMaintenanceListParams = SensorMaintenanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceListPageAsync>>

        /** @see list */
        fun list(
            params: SensorMaintenanceListParams = SensorMaintenanceListParams.none()
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceListPageAsync>> =
            list(SensorMaintenanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sensormaintenance/{id}`, but is otherwise
         * the same as [SensorMaintenanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SensorMaintenanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SensorMaintenanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SensorMaintenanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SensorMaintenanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/count`, but is otherwise the
         * same as [SensorMaintenanceServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SensorMaintenanceCountParams.none())

        /** @see count */
        fun count(
            params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SensorMaintenanceCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/sensormaintenance/createBulk`, but is
         * otherwise the same as [SensorMaintenanceServiceAsync.createBulk].
         */
        fun createBulk(params: SensorMaintenanceCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: SensorMaintenanceCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/current`, but is otherwise
         * the same as [SensorMaintenanceServiceAsync.current].
         */
        fun current(): CompletableFuture<HttpResponseFor<List<SensorMaintenanceCurrentResponse>>> =
            current(SensorMaintenanceCurrentParams.none())

        /** @see current */
        fun current(
            params: SensorMaintenanceCurrentParams = SensorMaintenanceCurrentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SensorMaintenanceCurrentResponse>>>

        /** @see current */
        fun current(
            params: SensorMaintenanceCurrentParams = SensorMaintenanceCurrentParams.none()
        ): CompletableFuture<HttpResponseFor<List<SensorMaintenanceCurrentResponse>>> =
            current(params, RequestOptions.none())

        /** @see current */
        fun current(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SensorMaintenanceCurrentResponse>>> =
            current(SensorMaintenanceCurrentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/{id}`, but is otherwise the
         * same as [SensorMaintenanceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>> =
            get(id, SensorMaintenanceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SensorMaintenanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>>

        /** @see get */
        fun get(
            params: SensorMaintenanceGetParams
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceGetResponse>> =
            get(id, SensorMaintenanceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/queryhelp`, but is otherwise
         * the same as [SensorMaintenanceServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SensorMaintenanceQueryhelpResponse>> =
            queryhelp(SensorMaintenanceQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SensorMaintenanceQueryhelpParams = SensorMaintenanceQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SensorMaintenanceQueryhelpParams = SensorMaintenanceQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorMaintenanceQueryhelpResponse>> =
            queryhelp(SensorMaintenanceQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/tuple`, but is otherwise the
         * same as [SensorMaintenanceServiceAsync.tuple].
         */
        fun tuple(
            params: SensorMaintenanceTupleParams
        ): CompletableFuture<HttpResponseFor<List<SensorMaintenanceTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SensorMaintenanceTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SensorMaintenanceTupleResponse>>>
    }
}
