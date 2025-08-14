// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCountParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCreateParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportGetParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListPageAsync
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportTupleParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherreport.history.WeatherReportFull
import com.unifieddatalibrary.api.services.async.weatherreport.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WeatherReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single WeatherReport as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: WeatherReportCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WeatherReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: WeatherReportListParams): CompletableFuture<WeatherReportListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WeatherReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WeatherReportListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: WeatherReportCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: WeatherReportCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to get a single WeatherReport by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<WeatherReportFull> =
        get(id, WeatherReportGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: WeatherReportGetParams = WeatherReportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WeatherReportFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: WeatherReportGetParams = WeatherReportGetParams.none(),
    ): CompletableFuture<WeatherReportFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WeatherReportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WeatherReportFull>

    /** @see get */
    fun get(params: WeatherReportGetParams): CompletableFuture<WeatherReportFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<WeatherReportFull> =
        get(id, WeatherReportGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<WeatherReportQueryhelpResponse> =
        queryhelp(WeatherReportQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WeatherReportQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none()
    ): CompletableFuture<WeatherReportQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<WeatherReportQueryhelpResponse> =
        queryhelp(WeatherReportQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: WeatherReportTupleParams): CompletableFuture<List<WeatherReportFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: WeatherReportTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<WeatherReportFull>>

    /**
     * Service operation to take a list of WeatherReports as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: WeatherReportUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: WeatherReportUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [WeatherReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): WeatherReportServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/weatherreport`, but is otherwise the same as
         * [WeatherReportServiceAsync.create].
         */
        fun create(params: WeatherReportCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WeatherReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport`, but is otherwise the same as
         * [WeatherReportServiceAsync.list].
         */
        fun list(
            params: WeatherReportListParams
        ): CompletableFuture<HttpResponseFor<WeatherReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: WeatherReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WeatherReportListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/count`, but is otherwise the same
         * as [WeatherReportServiceAsync.count].
         */
        fun count(params: WeatherReportCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: WeatherReportCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/{id}`, but is otherwise the same
         * as [WeatherReportServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<WeatherReportFull>> =
            get(id, WeatherReportGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: WeatherReportGetParams = WeatherReportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WeatherReportFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: WeatherReportGetParams = WeatherReportGetParams.none(),
        ): CompletableFuture<HttpResponseFor<WeatherReportFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: WeatherReportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WeatherReportFull>>

        /** @see get */
        fun get(
            params: WeatherReportGetParams
        ): CompletableFuture<HttpResponseFor<WeatherReportFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WeatherReportFull>> =
            get(id, WeatherReportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/queryhelp`, but is otherwise the
         * same as [WeatherReportServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<WeatherReportQueryhelpResponse>> =
            queryhelp(WeatherReportQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WeatherReportQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<WeatherReportQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WeatherReportQueryhelpResponse>> =
            queryhelp(WeatherReportQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/tuple`, but is otherwise the same
         * as [WeatherReportServiceAsync.tuple].
         */
        fun tuple(
            params: WeatherReportTupleParams
        ): CompletableFuture<HttpResponseFor<List<WeatherReportFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: WeatherReportTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<WeatherReportFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-weatherreport`, but is otherwise the
         * same as [WeatherReportServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: WeatherReportUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: WeatherReportUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
