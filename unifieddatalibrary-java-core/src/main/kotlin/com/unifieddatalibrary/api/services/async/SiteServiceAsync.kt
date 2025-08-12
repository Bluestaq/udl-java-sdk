// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.site.SiteCountParams
import com.unifieddatalibrary.api.models.site.SiteCreateParams
import com.unifieddatalibrary.api.models.site.SiteGetParams
import com.unifieddatalibrary.api.models.site.SiteGetResponse
import com.unifieddatalibrary.api.models.site.SiteListPageAsync
import com.unifieddatalibrary.api.models.site.SiteListParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpResponse
import com.unifieddatalibrary.api.models.site.SiteTupleParams
import com.unifieddatalibrary.api.models.site.SiteTupleResponse
import com.unifieddatalibrary.api.models.site.SiteUpdateParams
import com.unifieddatalibrary.api.services.async.SiteServiceAsync
import com.unifieddatalibrary.api.services.async.site.OperationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiteServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteServiceAsync

    fun operations(): OperationServiceAsync

    /** Service operation to take a single Site as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SiteCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SiteCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Site. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SiteUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SiteUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SiteUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SiteUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SiteListPageAsync> = list(SiteListParams.none())

    /** @see list */
    fun list(params: SiteListParams = SiteListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteListPageAsync>

    /** @see list */
    fun list(params: SiteListParams = SiteListParams.none()): CompletableFuture<SiteListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SiteListPageAsync> =
        list(
          SiteListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SiteCountParams.none())

    /** @see count */
    fun count(params: SiteCountParams = SiteCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SiteCountParams = SiteCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SiteCountParams.none(), requestOptions
        )

    /** Service operation to get a single Site record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SiteGetResponse> =
        get(
          id, SiteGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SiteGetParams = SiteGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SiteGetParams = SiteGetParams.none()): CompletableFuture<SiteGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SiteGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteGetResponse>

    /** @see get */
    fun get(params: SiteGetParams): CompletableFuture<SiteGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SiteGetResponse> =
        get(
          id,
          SiteGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SiteQueryhelpResponse> = queryhelp(SiteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SiteQueryhelpParams = SiteQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SiteQueryhelpParams = SiteQueryhelpParams.none()): CompletableFuture<SiteQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SiteQueryhelpResponse> =
        queryhelp(
          SiteQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SiteTupleParams): CompletableFuture<List<SiteTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SiteTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SiteTupleResponse>>

    /** A view of [SiteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteServiceAsync.WithRawResponse

        fun operations(): OperationServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/site`, but is otherwise the same as [SiteServiceAsync.create]. */
        fun create(params: SiteCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SiteCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/site/{id}`, but is otherwise the same as [SiteServiceAsync.update]. */
        fun update(pathId: String, params: SiteUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SiteUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SiteUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SiteUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/site`, but is otherwise the same as [SiteServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SiteListPageAsync>> = list(SiteListParams.none())

        /** @see list */
        fun list(params: SiteListParams = SiteListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteListPageAsync>>

        /** @see list */
        fun list(params: SiteListParams = SiteListParams.none()): CompletableFuture<HttpResponseFor<SiteListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteListPageAsync>> =
            list(
              SiteListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/site/count`, but is otherwise the same as [SiteServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SiteCountParams.none())

        /** @see count */
        fun count(params: SiteCountParams = SiteCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SiteCountParams = SiteCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SiteCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/site/{id}`, but is otherwise the same as [SiteServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SiteGetResponse>> =
            get(
              id, SiteGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SiteGetParams = SiteGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SiteGetParams = SiteGetParams.none()): CompletableFuture<HttpResponseFor<SiteGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SiteGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteGetResponse>>

        /** @see get */
        fun get(params: SiteGetParams): CompletableFuture<HttpResponseFor<SiteGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteGetResponse>> =
            get(
              id,
              SiteGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/site/queryhelp`, but is otherwise the same as [SiteServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SiteQueryhelpResponse>> = queryhelp(SiteQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SiteQueryhelpParams = SiteQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SiteQueryhelpParams = SiteQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SiteQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteQueryhelpResponse>> =
            queryhelp(
              SiteQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/site/tuple`, but is otherwise the same as [SiteServiceAsync.tuple]. */
        fun tuple(params: SiteTupleParams): CompletableFuture<HttpResponseFor<List<SiteTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SiteTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SiteTupleResponse>>>
    }
}
