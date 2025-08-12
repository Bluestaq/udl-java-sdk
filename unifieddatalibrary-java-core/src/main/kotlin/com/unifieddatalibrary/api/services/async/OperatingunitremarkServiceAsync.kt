// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OperatingUnitRemarkFull
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListPageAsync
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OperatingunitremarkServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkServiceAsync

    /** Service operation to take a single operatingunitremark record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OperatingunitremarkCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OperatingunitremarkListPageAsync> = list(OperatingunitremarkListParams.none())

    /** @see list */
    fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperatingunitremarkListPageAsync>

    /** @see list */
    fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none()): CompletableFuture<OperatingunitremarkListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OperatingunitremarkListPageAsync> =
        list(
          OperatingunitremarkListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(OperatingunitremarkCountParams.none())

    /** @see count */
    fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          OperatingunitremarkCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of operatingunitremark records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OperatingunitremarkCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single operatingunitremark record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<OperatingUnitRemarkFull> =
        get(
          id, OperatingunitremarkGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperatingUnitRemarkFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none()): CompletableFuture<OperatingUnitRemarkFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperatingUnitRemarkFull>

    /** @see get */
    fun get(params: OperatingunitremarkGetParams): CompletableFuture<OperatingUnitRemarkFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OperatingUnitRemarkFull> =
        get(
          id,
          OperatingunitremarkGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<OperatingunitremarkQueryhelpResponse> = queryhelp(OperatingunitremarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperatingunitremarkQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none()): CompletableFuture<OperatingunitremarkQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<OperatingunitremarkQueryhelpResponse> =
        queryhelp(
          OperatingunitremarkQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OperatingunitremarkTupleParams): CompletableFuture<List<OperatingUnitRemarkFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OperatingUnitRemarkFull>>

    /** A view of [OperatingunitremarkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/operatingunitremark`, but is otherwise the same as [OperatingunitremarkServiceAsync.create]. */
        fun create(params: OperatingunitremarkCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/operatingunitremark`, but is otherwise the same as [OperatingunitremarkServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OperatingunitremarkListPageAsync>> = list(OperatingunitremarkListParams.none())

        /** @see list */
        fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperatingunitremarkListPageAsync>>

        /** @see list */
        fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none()): CompletableFuture<HttpResponseFor<OperatingunitremarkListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingunitremarkListPageAsync>> =
            list(
              OperatingunitremarkListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/count`, but is otherwise the same as [OperatingunitremarkServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(OperatingunitremarkCountParams.none())

        /** @see count */
        fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              OperatingunitremarkCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/operatingunitremark/createBulk`, but is otherwise the same as [OperatingunitremarkServiceAsync.createBulk]. */
        fun createBulk(params: OperatingunitremarkCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/{id}`, but is otherwise the same as [OperatingunitremarkServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> =
            get(
              id, OperatingunitremarkGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none()): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>>

        /** @see get */
        fun get(params: OperatingunitremarkGetParams): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> =
            get(
              id,
              OperatingunitremarkGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/queryhelp`, but is otherwise the same as [OperatingunitremarkServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OperatingunitremarkQueryhelpResponse>> = queryhelp(OperatingunitremarkQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperatingunitremarkQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none()): CompletableFuture<HttpResponseFor<OperatingunitremarkQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingunitremarkQueryhelpResponse>> =
            queryhelp(
              OperatingunitremarkQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/tuple`, but is otherwise the same as [OperatingunitremarkServiceAsync.tuple]. */
        fun tuple(params: OperatingunitremarkTupleParams): CompletableFuture<HttpResponseFor<List<OperatingUnitRemarkFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OperatingUnitRemarkFull>>>
    }
}
