// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AnalyticImageryFull
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryAbridged
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryFileGetParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryAodrParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListPageAsync
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryQueryhelpParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryRetrieveParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryTupleParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AnalyticImageryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticImageryServiceAsync

    /** Service operation to get a single AnalyticImagery record by its unique ID passed as a path parameter. AnalyticImagery represents metadata about an image, as well as the actual binary image data. */
    fun retrieve(id: String): CompletableFuture<AnalyticImageryFull> =
        retrieve(
          id, AnalyticImageryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AnalyticImageryFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none()): CompletableFuture<AnalyticImageryFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AnalyticImageryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AnalyticImageryFull>

    /** @see retrieve */
    fun retrieve(params: AnalyticImageryRetrieveParams): CompletableFuture<AnalyticImageryFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AnalyticImageryFull> =
        retrieve(
          id,
          AnalyticImageryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AnalyticImageryListParams): CompletableFuture<AnalyticImageryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AnalyticImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AnalyticImageryListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AnalyticImageryCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AnalyticImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to get a single AnalyticImagery binary image by its unique ID passed as a path parameter. The image is returned as an attachment Content-Disposition. */
    fun fileGet(id: String): CompletableFuture<HttpResponse> =
        fileGet(
          id, AnalyticImageryFileGetParams.none()
        )

    /** @see fileGet */
    fun fileGet(id: String, params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
        fileGet(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see fileGet */
    fun fileGet(id: String, params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none()): CompletableFuture<HttpResponse> =
        fileGet(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see fileGet */
    fun fileGet(params: AnalyticImageryFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

    /** @see fileGet */
    fun fileGet(params: AnalyticImageryFileGetParams): CompletableFuture<HttpResponse> =
        fileGet(
          params, RequestOptions.none()
        )

    /** @see fileGet */
    fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        fileGet(
          id,
          AnalyticImageryFileGetParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun history(params: AnalyticImageryHistoryParams): CompletableFuture<List<AnalyticImageryAbridged>> =
        history(
          params, RequestOptions.none()
        )

    /** @see history */
    fun history(params: AnalyticImageryHistoryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AnalyticImageryAbridged>>

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun historyAodr(params: AnalyticImageryHistoryAodrParams): CompletableFuture<Void?> =
        historyAodr(
          params, RequestOptions.none()
        )

    /** @see historyAodr */
    fun historyAodr(params: AnalyticImageryHistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun historyCount(params: AnalyticImageryHistoryCountParams): CompletableFuture<String> =
        historyCount(
          params, RequestOptions.none()
        )

    /** @see historyCount */
    fun historyCount(params: AnalyticImageryHistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AnalyticImageryQueryhelpResponse> = queryhelp(AnalyticImageryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AnalyticImageryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none()): CompletableFuture<AnalyticImageryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AnalyticImageryQueryhelpResponse> =
        queryhelp(
          AnalyticImageryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AnalyticImageryTupleParams): CompletableFuture<List<AnalyticImageryAbridged>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AnalyticImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AnalyticImageryAbridged>>

    /**
     * Upload a new image with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\
     * 1\) A file with the `.json` file extension whose content conforms to the `AnalyticImagery_Ingest` schema.\
     * 2\) A binary image file of the allowed types for this service.
     *
     * The JSON and image files will be associated with each other via the `id` field. Query the metadata via `GET /udl/analyticimagery` and use `GET /udl/analyticimagery/getFile/{id}` to retrieve the binary image file.
     *
     * This operation only accepts application/zip media. The application/json request body is documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [AnalyticImageryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticImageryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/analyticimagery/{id}`, but is otherwise the same as [AnalyticImageryServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AnalyticImageryFull>> =
            retrieve(
              id, AnalyticImageryRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AnalyticImageryFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none()): CompletableFuture<HttpResponseFor<AnalyticImageryFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AnalyticImageryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AnalyticImageryFull>>

        /** @see retrieve */
        fun retrieve(params: AnalyticImageryRetrieveParams): CompletableFuture<HttpResponseFor<AnalyticImageryFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AnalyticImageryFull>> =
            retrieve(
              id,
              AnalyticImageryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/analyticimagery`, but is otherwise the same as [AnalyticImageryServiceAsync.list]. */
        fun list(params: AnalyticImageryListParams): CompletableFuture<HttpResponseFor<AnalyticImageryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: AnalyticImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AnalyticImageryListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/analyticimagery/count`, but is otherwise the same as [AnalyticImageryServiceAsync.count]. */
        fun count(params: AnalyticImageryCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: AnalyticImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/analyticimagery/getFile/{id}`, but is otherwise the same as [AnalyticImageryServiceAsync.fileGet]. */
        fun fileGet(id: String): CompletableFuture<HttpResponse> =
            fileGet(
              id, AnalyticImageryFileGetParams.none()
            )

        /** @see fileGet */
        fun fileGet(id: String, params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            fileGet(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see fileGet */
        fun fileGet(id: String, params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none()): CompletableFuture<HttpResponse> =
            fileGet(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see fileGet */
        fun fileGet(params: AnalyticImageryFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see fileGet */
        fun fileGet(params: AnalyticImageryFileGetParams): CompletableFuture<HttpResponse> =
            fileGet(
              params, RequestOptions.none()
            )

        /** @see fileGet */
        fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            fileGet(
              id,
              AnalyticImageryFileGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/analyticimagery/history`, but is otherwise the same as [AnalyticImageryServiceAsync.history]. */
        fun history(params: AnalyticImageryHistoryParams): CompletableFuture<HttpResponseFor<List<AnalyticImageryAbridged>>> =
            history(
              params, RequestOptions.none()
            )

        /** @see history */
        fun history(params: AnalyticImageryHistoryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AnalyticImageryAbridged>>>

        /** Returns a raw HTTP response for `get /udl/analyticimagery/history/aodr`, but is otherwise the same as [AnalyticImageryServiceAsync.historyAodr]. */
        fun historyAodr(params: AnalyticImageryHistoryAodrParams): CompletableFuture<HttpResponse> =
            historyAodr(
              params, RequestOptions.none()
            )

        /** @see historyAodr */
        fun historyAodr(params: AnalyticImageryHistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/analyticimagery/history/count`, but is otherwise the same as [AnalyticImageryServiceAsync.historyCount]. */
        fun historyCount(params: AnalyticImageryHistoryCountParams): CompletableFuture<HttpResponseFor<String>> =
            historyCount(
              params, RequestOptions.none()
            )

        /** @see historyCount */
        fun historyCount(params: AnalyticImageryHistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/analyticimagery/queryhelp`, but is otherwise the same as [AnalyticImageryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AnalyticImageryQueryhelpResponse>> = queryhelp(AnalyticImageryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AnalyticImageryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AnalyticImageryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AnalyticImageryQueryhelpResponse>> =
            queryhelp(
              AnalyticImageryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/analyticimagery/tuple`, but is otherwise the same as [AnalyticImageryServiceAsync.tuple]. */
        fun tuple(params: AnalyticImageryTupleParams): CompletableFuture<HttpResponseFor<List<AnalyticImageryAbridged>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AnalyticImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AnalyticImageryAbridged>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-analyticimagery`, but is otherwise the same as [AnalyticImageryServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
