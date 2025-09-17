// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateBulkParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceDeleteParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListCurrentPage
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListCurrentParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListPage
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryHelpParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryHelpResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceUpdateParams
import com.unifieddatalibrary.api.services.blocking.sensormaintenance.HistoryService
import java.util.function.Consumer

interface SensorMaintenanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorMaintenanceService

    fun history(): HistoryService

    /**
     * Service operation to take a single SensorMaintenance as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SensorMaintenanceCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SensorMaintenanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single SensorMaintenance. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SensorMaintenanceUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SensorMaintenanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SensorMaintenanceUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorMaintenanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SensorMaintenanceListPage = list(SensorMaintenanceListParams.none())

    /** @see list */
    fun list(
        params: SensorMaintenanceListParams = SensorMaintenanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorMaintenanceListPage

    /** @see list */
    fun list(
        params: SensorMaintenanceListParams = SensorMaintenanceListParams.none()
    ): SensorMaintenanceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SensorMaintenanceListPage =
        list(SensorMaintenanceListParams.none(), requestOptions)

    /**
     * Service operation to delete a SensorMaintenance object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, SensorMaintenanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SensorMaintenanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SensorMaintenanceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SensorMaintenanceDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SensorMaintenanceCountParams.none())

    /** @see count */
    fun count(
        params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SensorMaintenanceCountParams.none(), requestOptions)

    /**
     * Service operation to take multiple SensorMaintenance as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: SensorMaintenanceCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SensorMaintenanceCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single SensorMaintenance record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SensorMaintenanceGetResponse = get(id, SensorMaintenanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorMaintenanceGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
    ): SensorMaintenanceGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorMaintenanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorMaintenanceGetResponse

    /** @see get */
    fun get(params: SensorMaintenanceGetParams): SensorMaintenanceGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SensorMaintenanceGetResponse =
        get(id, SensorMaintenanceGetParams.none(), requestOptions)

    /**
     * Service operation to get current Sensor Maintenance records using any number of additional
     * parameters.
     */
    fun listCurrent(): SensorMaintenanceListCurrentPage =
        listCurrent(SensorMaintenanceListCurrentParams.none())

    /** @see listCurrent */
    fun listCurrent(
        params: SensorMaintenanceListCurrentParams = SensorMaintenanceListCurrentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorMaintenanceListCurrentPage

    /** @see listCurrent */
    fun listCurrent(
        params: SensorMaintenanceListCurrentParams = SensorMaintenanceListCurrentParams.none()
    ): SensorMaintenanceListCurrentPage = listCurrent(params, RequestOptions.none())

    /** @see listCurrent */
    fun listCurrent(requestOptions: RequestOptions): SensorMaintenanceListCurrentPage =
        listCurrent(SensorMaintenanceListCurrentParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): SensorMaintenanceQueryHelpResponse =
        queryHelp(SensorMaintenanceQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: SensorMaintenanceQueryHelpParams = SensorMaintenanceQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorMaintenanceQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: SensorMaintenanceQueryHelpParams = SensorMaintenanceQueryHelpParams.none()
    ): SensorMaintenanceQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): SensorMaintenanceQueryHelpResponse =
        queryHelp(SensorMaintenanceQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SensorMaintenanceTupleParams): List<SensorMaintenanceTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SensorMaintenanceTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SensorMaintenanceTupleResponse>

    /**
     * A view of [SensorMaintenanceService] that provides access to raw HTTP responses for each
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
        ): SensorMaintenanceService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensormaintenance`, but is otherwise the same
         * as [SensorMaintenanceService.create].
         */
        @MustBeClosed
        fun create(params: SensorMaintenanceCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SensorMaintenanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/sensormaintenance/{id}`, but is otherwise the
         * same as [SensorMaintenanceService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SensorMaintenanceUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SensorMaintenanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SensorMaintenanceUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SensorMaintenanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance`, but is otherwise the same
         * as [SensorMaintenanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SensorMaintenanceListPage> =
            list(SensorMaintenanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorMaintenanceListParams = SensorMaintenanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorMaintenanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorMaintenanceListParams = SensorMaintenanceListParams.none()
        ): HttpResponseFor<SensorMaintenanceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SensorMaintenanceListPage> =
            list(SensorMaintenanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sensormaintenance/{id}`, but is otherwise
         * the same as [SensorMaintenanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SensorMaintenanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorMaintenanceDeleteParams = SensorMaintenanceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SensorMaintenanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SensorMaintenanceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SensorMaintenanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/count`, but is otherwise the
         * same as [SensorMaintenanceService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SensorMaintenanceCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SensorMaintenanceCountParams = SensorMaintenanceCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SensorMaintenanceCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/sensormaintenance/createBulk`, but is
         * otherwise the same as [SensorMaintenanceService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SensorMaintenanceCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SensorMaintenanceCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/{id}`, but is otherwise the
         * same as [SensorMaintenanceService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SensorMaintenanceGetResponse> =
            get(id, SensorMaintenanceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorMaintenanceGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorMaintenanceGetParams = SensorMaintenanceGetParams.none(),
        ): HttpResponseFor<SensorMaintenanceGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorMaintenanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorMaintenanceGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SensorMaintenanceGetParams): HttpResponseFor<SensorMaintenanceGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorMaintenanceGetResponse> =
            get(id, SensorMaintenanceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/current`, but is otherwise
         * the same as [SensorMaintenanceService.listCurrent].
         */
        @MustBeClosed
        fun listCurrent(): HttpResponseFor<SensorMaintenanceListCurrentPage> =
            listCurrent(SensorMaintenanceListCurrentParams.none())

        /** @see listCurrent */
        @MustBeClosed
        fun listCurrent(
            params: SensorMaintenanceListCurrentParams = SensorMaintenanceListCurrentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorMaintenanceListCurrentPage>

        /** @see listCurrent */
        @MustBeClosed
        fun listCurrent(
            params: SensorMaintenanceListCurrentParams = SensorMaintenanceListCurrentParams.none()
        ): HttpResponseFor<SensorMaintenanceListCurrentPage> =
            listCurrent(params, RequestOptions.none())

        /** @see listCurrent */
        @MustBeClosed
        fun listCurrent(
            requestOptions: RequestOptions
        ): HttpResponseFor<SensorMaintenanceListCurrentPage> =
            listCurrent(SensorMaintenanceListCurrentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/queryhelp`, but is otherwise
         * the same as [SensorMaintenanceService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<SensorMaintenanceQueryHelpResponse> =
            queryHelp(SensorMaintenanceQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: SensorMaintenanceQueryHelpParams = SensorMaintenanceQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorMaintenanceQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: SensorMaintenanceQueryHelpParams = SensorMaintenanceQueryHelpParams.none()
        ): HttpResponseFor<SensorMaintenanceQueryHelpResponse> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SensorMaintenanceQueryHelpResponse> =
            queryHelp(SensorMaintenanceQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensormaintenance/tuple`, but is otherwise the
         * same as [SensorMaintenanceService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SensorMaintenanceTupleParams
        ): HttpResponseFor<List<SensorMaintenanceTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SensorMaintenanceTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SensorMaintenanceTupleResponse>>
    }
}
