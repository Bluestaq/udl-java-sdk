// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.sensor

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCountParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateBulkParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationListPageAsync
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationListParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.sensor.calibration.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CalibrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single SensorCalibration as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: CalibrationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CalibrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single SensorCalibration by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<CalibrationRetrieveResponse> =
        retrieve(id, CalibrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalibrationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(),
    ): CompletableFuture<CalibrationRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CalibrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalibrationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CalibrationRetrieveParams
    ): CompletableFuture<CalibrationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalibrationRetrieveResponse> =
        retrieve(id, CalibrationRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: CalibrationListParams): CompletableFuture<CalibrationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CalibrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalibrationListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: CalibrationCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: CalibrationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of SensorCalibrations
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: CalibrationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CalibrationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<CalibrationQueryHelpResponse> =
        queryHelp(CalibrationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalibrationQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none()
    ): CompletableFuture<CalibrationQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<CalibrationQueryHelpResponse> =
        queryHelp(CalibrationQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: CalibrationTupleParams): CompletableFuture<List<CalibrationTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CalibrationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CalibrationTupleResponse>>

    /**
     * Service operation to take multiple sensorcalibration records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CalibrationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CalibrationServiceAsync] that provides access to raw HTTP responses for each
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
        ): CalibrationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensorcalibration`, but is otherwise the same
         * as [CalibrationServiceAsync.create].
         */
        fun create(params: CalibrationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CalibrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensorcalibration/{id}`, but is otherwise the
         * same as [CalibrationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> =
            retrieve(id, CalibrationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CalibrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CalibrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> =
            retrieve(id, CalibrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorcalibration`, but is otherwise the same
         * as [CalibrationServiceAsync.list].
         */
        fun list(
            params: CalibrationListParams
        ): CompletableFuture<HttpResponseFor<CalibrationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CalibrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalibrationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/sensorcalibration/count`, but is otherwise the
         * same as [CalibrationServiceAsync.count].
         */
        fun count(params: CalibrationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: CalibrationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/sensorcalibration/createBulk`, but is
         * otherwise the same as [CalibrationServiceAsync.createBulk].
         */
        fun createBulk(params: CalibrationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: CalibrationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensorcalibration/queryhelp`, but is otherwise
         * the same as [CalibrationServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<CalibrationQueryHelpResponse>> =
            queryHelp(CalibrationQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalibrationQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<CalibrationQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CalibrationQueryHelpResponse>> =
            queryHelp(CalibrationQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorcalibration/tuple`, but is otherwise the
         * same as [CalibrationServiceAsync.tuple].
         */
        fun tuple(
            params: CalibrationTupleParams
        ): CompletableFuture<HttpResponseFor<List<CalibrationTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: CalibrationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CalibrationTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sensorcalibration`, but is otherwise
         * the same as [CalibrationServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: CalibrationUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: CalibrationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
