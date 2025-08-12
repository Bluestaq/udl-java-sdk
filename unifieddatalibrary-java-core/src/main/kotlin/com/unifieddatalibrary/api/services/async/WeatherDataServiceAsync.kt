// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCountParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateBulkParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataGetParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListPageAsync
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataTupleParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherdata.history.WeatherDataFull
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import com.unifieddatalibrary.api.services.async.weatherdata.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WeatherDataServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherDataServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single WeatherData as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: WeatherDataCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: WeatherDataCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: WeatherDataListParams): CompletableFuture<WeatherDataListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: WeatherDataListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WeatherDataListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: WeatherDataCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: WeatherDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to take multiple WeatherData as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createBulk(params: WeatherDataCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: WeatherDataCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single WeatherData by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<WeatherDataFull> =
        get(
          id, WeatherDataGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: WeatherDataGetParams = WeatherDataGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WeatherDataFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: WeatherDataGetParams = WeatherDataGetParams.none()): CompletableFuture<WeatherDataFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: WeatherDataGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WeatherDataFull>

    /** @see get */
    fun get(params: WeatherDataGetParams): CompletableFuture<WeatherDataFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<WeatherDataFull> =
        get(
          id,
          WeatherDataGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<WeatherDataQueryhelpResponse> = queryhelp(WeatherDataQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WeatherDataQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none()): CompletableFuture<WeatherDataQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<WeatherDataQueryhelpResponse> =
        queryhelp(
          WeatherDataQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: WeatherDataTupleParams): CompletableFuture<List<WeatherDataFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: WeatherDataTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<WeatherDataFull>>

    /** Service operation to take a list of WeatherData as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [WeatherDataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherDataServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/weatherdata`, but is otherwise the same as [WeatherDataServiceAsync.create]. */
        fun create(params: WeatherDataCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: WeatherDataCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/weatherdata`, but is otherwise the same as [WeatherDataServiceAsync.list]. */
        fun list(params: WeatherDataListParams): CompletableFuture<HttpResponseFor<WeatherDataListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: WeatherDataListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WeatherDataListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/weatherdata/count`, but is otherwise the same as [WeatherDataServiceAsync.count]. */
        fun count(params: WeatherDataCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: WeatherDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/weatherdata/createBulk`, but is otherwise the same as [WeatherDataServiceAsync.createBulk]. */
        fun createBulk(params: WeatherDataCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: WeatherDataCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/weatherdata/{id}`, but is otherwise the same as [WeatherDataServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<WeatherDataFull>> =
            get(
              id, WeatherDataGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: WeatherDataGetParams = WeatherDataGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WeatherDataFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: WeatherDataGetParams = WeatherDataGetParams.none()): CompletableFuture<HttpResponseFor<WeatherDataFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: WeatherDataGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WeatherDataFull>>

        /** @see get */
        fun get(params: WeatherDataGetParams): CompletableFuture<HttpResponseFor<WeatherDataFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<WeatherDataFull>> =
            get(
              id,
              WeatherDataGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/weatherdata/queryhelp`, but is otherwise the same as [WeatherDataServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<WeatherDataQueryhelpResponse>> = queryhelp(WeatherDataQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WeatherDataQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: WeatherDataQueryhelpParams = WeatherDataQueryhelpParams.none()): CompletableFuture<HttpResponseFor<WeatherDataQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<WeatherDataQueryhelpResponse>> =
            queryhelp(
              WeatherDataQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/weatherdata/tuple`, but is otherwise the same as [WeatherDataServiceAsync.tuple]. */
        fun tuple(params: WeatherDataTupleParams): CompletableFuture<HttpResponseFor<List<WeatherDataFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: WeatherDataTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<WeatherDataFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-weatherdata`, but is otherwise the same as [WeatherDataServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
