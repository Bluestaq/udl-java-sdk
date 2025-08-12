// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCountParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCreateParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetFileParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryHistoryAodrParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListPageAsync
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryUploadZipParams
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import com.unifieddatalibrary.api.services.async.groundimagery.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroundImageryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroundImageryServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single GroundImagery object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: GroundImageryCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: GroundImageryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: GroundImageryListParams): CompletableFuture<GroundImageryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: GroundImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GroundImageryListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: GroundImageryCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: GroundImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to get a single GroundImagery record by its unique ID passed as a path parameter. GroundImagery represents metadata about a ground image, as well as the actual binary image data. */
    fun get(id: String): CompletableFuture<GroundImageryGetResponse> =
        get(
          id, GroundImageryGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: GroundImageryGetParams = GroundImageryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GroundImageryGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: GroundImageryGetParams = GroundImageryGetParams.none()): CompletableFuture<GroundImageryGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: GroundImageryGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GroundImageryGetResponse>

    /** @see get */
    fun get(params: GroundImageryGetParams): CompletableFuture<GroundImageryGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<GroundImageryGetResponse> =
        get(
          id,
          GroundImageryGetParams.none(),
          requestOptions,
        )

    /** Service operation to get a single GroundImagery binary image by its unique ID passed as a path parameter. The image is returned as an attachment Content-Disposition. */
    fun getFile(id: String): CompletableFuture<HttpResponse> =
        getFile(
          id, GroundImageryGetFileParams.none()
        )

    /** @see getFile */
    fun getFile(id: String, params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
        getFile(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see getFile */
    fun getFile(id: String, params: GroundImageryGetFileParams = GroundImageryGetFileParams.none()): CompletableFuture<HttpResponse> =
        getFile(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see getFile */
    fun getFile(params: GroundImageryGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

    /** @see getFile */
    fun getFile(params: GroundImageryGetFileParams): CompletableFuture<HttpResponse> =
        getFile(
          params, RequestOptions.none()
        )

    /** @see getFile */
    fun getFile(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getFile(
          id,
          GroundImageryGetFileParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun historyAodr(params: GroundImageryHistoryAodrParams): CompletableFuture<Void?> =
        historyAodr(
          params, RequestOptions.none()
        )

    /** @see historyAodr */
    fun historyAodr(params: GroundImageryHistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<GroundImageryQueryhelpResponse> = queryhelp(GroundImageryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GroundImageryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none()): CompletableFuture<GroundImageryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<GroundImageryQueryhelpResponse> =
        queryhelp(
          GroundImageryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: GroundImageryTupleParams): CompletableFuture<List<GroundImageryTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: GroundImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<GroundImageryTupleResponse>>

    /**
     * Upload a new image with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\
     * 1\) A file with the `.json` file extension whose content conforms to the `GroundImagery_Ingest` schema.
     * 2\) A binary image file of the allowed types for this service.
     *
     * The JSON and image files will be associated with each other via the `id` field. Query the metadata via `GET /udl/groundimagery` and use `GET /udl/groundimagery/getFile/{id}` to retrieve the binary image file.
     *
     * This operation only accepts application/zip media. The application/json request body is documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadZip(params: GroundImageryUploadZipParams): CompletableFuture<Void?> =
        uploadZip(
          params, RequestOptions.none()
        )

    /** @see uploadZip */
    fun uploadZip(params: GroundImageryUploadZipParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [GroundImageryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroundImageryServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/groundimagery`, but is otherwise the same as [GroundImageryServiceAsync.create]. */
        fun create(params: GroundImageryCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: GroundImageryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/groundimagery`, but is otherwise the same as [GroundImageryServiceAsync.list]. */
        fun list(params: GroundImageryListParams): CompletableFuture<HttpResponseFor<GroundImageryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: GroundImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GroundImageryListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/groundimagery/count`, but is otherwise the same as [GroundImageryServiceAsync.count]. */
        fun count(params: GroundImageryCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: GroundImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/groundimagery/{id}`, but is otherwise the same as [GroundImageryServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>> =
            get(
              id, GroundImageryGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: GroundImageryGetParams = GroundImageryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: GroundImageryGetParams = GroundImageryGetParams.none()): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: GroundImageryGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>>

        /** @see get */
        fun get(params: GroundImageryGetParams): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GroundImageryGetResponse>> =
            get(
              id,
              GroundImageryGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/groundimagery/getFile/{id}`, but is otherwise the same as [GroundImageryServiceAsync.getFile]. */
        fun getFile(id: String): CompletableFuture<HttpResponse> =
            getFile(
              id, GroundImageryGetFileParams.none()
            )

        /** @see getFile */
        fun getFile(id: String, params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            getFile(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see getFile */
        fun getFile(id: String, params: GroundImageryGetFileParams = GroundImageryGetFileParams.none()): CompletableFuture<HttpResponse> =
            getFile(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see getFile */
        fun getFile(params: GroundImageryGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see getFile */
        fun getFile(params: GroundImageryGetFileParams): CompletableFuture<HttpResponse> =
            getFile(
              params, RequestOptions.none()
            )

        /** @see getFile */
        fun getFile(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getFile(
              id,
              GroundImageryGetFileParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/groundimagery/history/aodr`, but is otherwise the same as [GroundImageryServiceAsync.historyAodr]. */
        fun historyAodr(params: GroundImageryHistoryAodrParams): CompletableFuture<HttpResponse> =
            historyAodr(
              params, RequestOptions.none()
            )

        /** @see historyAodr */
        fun historyAodr(params: GroundImageryHistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/groundimagery/queryhelp`, but is otherwise the same as [GroundImageryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<GroundImageryQueryhelpResponse>> = queryhelp(GroundImageryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GroundImageryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<GroundImageryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GroundImageryQueryhelpResponse>> =
            queryhelp(
              GroundImageryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/groundimagery/tuple`, but is otherwise the same as [GroundImageryServiceAsync.tuple]. */
        fun tuple(params: GroundImageryTupleParams): CompletableFuture<HttpResponseFor<List<GroundImageryTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: GroundImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<GroundImageryTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-groundimagery`, but is otherwise the same as [GroundImageryServiceAsync.uploadZip]. */
        fun uploadZip(params: GroundImageryUploadZipParams): CompletableFuture<HttpResponse> =
            uploadZip(
              params, RequestOptions.none()
            )

        /** @see uploadZip */
        fun uploadZip(params: GroundImageryUploadZipParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
