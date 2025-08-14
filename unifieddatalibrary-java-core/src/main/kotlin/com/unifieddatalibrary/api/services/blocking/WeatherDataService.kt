// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCountParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateBulkParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataGetParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListPage
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataTupleParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherdata.history.WeatherDataFull
import com.unifieddatalibrary.api.services.blocking.weatherdata.HistoryService
import java.util.function.Consumer

interface WeatherDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherDataService

    fun history(): HistoryService

    /**
     * Service operation to take a single WeatherData as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: WeatherDataCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WeatherDataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: WeatherDataListParams): WeatherDataListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WeatherDataListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WeatherDataListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: WeatherDataCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: WeatherDataCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to take multiple WeatherData as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun createBulk(params: WeatherDataCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: WeatherDataCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single WeatherData by its unique ID passed as a path parameter.
     */
    fun get(id: String): WeatherDataFull = get(id, WeatherDataGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: WeatherDataGetParams = WeatherDataGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WeatherDataFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: WeatherDataGetParams = WeatherDataGetParams.none(),
    ): WeatherDataFull = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WeatherDataGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WeatherDataFull

    /** @see get */
    fun get(params: WeatherDataGetParams): WeatherDataFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): WeatherDataFull =
        get(id, WeatherDataGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): WeatherDataQueryhelpResponse = queryhelp(WeatherDataQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WeatherDataQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none()
    ): WeatherDataQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): WeatherDataQueryhelpResponse =
        queryhelp(WeatherDataQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: WeatherDataTupleParams): List<WeatherDataFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: WeatherDataTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<WeatherDataFull>

    /**
     * Service operation to take a list of WeatherData as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: WeatherDataUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [WeatherDataService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WeatherDataService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/weatherdata`, but is otherwise the same as
         * [WeatherDataService.create].
         */
        @MustBeClosed
        fun create(params: WeatherDataCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WeatherDataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/weatherdata`, but is otherwise the same as
         * [WeatherDataService.list].
         */
        @MustBeClosed
        fun list(params: WeatherDataListParams): HttpResponseFor<WeatherDataListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WeatherDataListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WeatherDataListPage>

        /**
         * Returns a raw HTTP response for `get /udl/weatherdata/count`, but is otherwise the same
         * as [WeatherDataService.count].
         */
        @MustBeClosed
        fun count(params: WeatherDataCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: WeatherDataCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/weatherdata/createBulk`, but is otherwise the
         * same as [WeatherDataService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: WeatherDataCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: WeatherDataCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/weatherdata/{id}`, but is otherwise the same as
         * [WeatherDataService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<WeatherDataFull> = get(id, WeatherDataGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: WeatherDataGetParams = WeatherDataGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WeatherDataFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: WeatherDataGetParams = WeatherDataGetParams.none(),
        ): HttpResponseFor<WeatherDataFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: WeatherDataGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WeatherDataFull>

        /** @see get */
        @MustBeClosed
        fun get(params: WeatherDataGetParams): HttpResponseFor<WeatherDataFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<WeatherDataFull> =
            get(id, WeatherDataGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/weatherdata/queryhelp`, but is otherwise the
         * same as [WeatherDataService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<WeatherDataQueryhelpResponse> =
            queryhelp(WeatherDataQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WeatherDataQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none()
        ): HttpResponseFor<WeatherDataQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<WeatherDataQueryhelpResponse> =
            queryhelp(WeatherDataQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/weatherdata/tuple`, but is otherwise the same
         * as [WeatherDataService.tuple].
         */
        @MustBeClosed
        fun tuple(params: WeatherDataTupleParams): HttpResponseFor<List<WeatherDataFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: WeatherDataTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<WeatherDataFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-weatherdata`, but is otherwise the
         * same as [WeatherDataService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: WeatherDataUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
