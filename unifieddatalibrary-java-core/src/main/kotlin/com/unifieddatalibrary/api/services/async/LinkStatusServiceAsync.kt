// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCountParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCreateParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListPageAsync
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleResponse
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsync
import com.unifieddatalibrary.api.services.async.linkstatus.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LinkStatusServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusServiceAsync

    fun datalink(): DatalinkServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single LinkStatus as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: LinkStatusCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<LinkStatusListPageAsync> = list(LinkStatusListParams.none())

    /** @see list */
    fun list(params: LinkStatusListParams = LinkStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LinkStatusListPageAsync>

    /** @see list */
    fun list(params: LinkStatusListParams = LinkStatusListParams.none()): CompletableFuture<LinkStatusListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LinkStatusListPageAsync> =
        list(
          LinkStatusListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(LinkStatusCountParams.none())

    /** @see count */
    fun count(params: LinkStatusCountParams = LinkStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: LinkStatusCountParams = LinkStatusCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          LinkStatusCountParams.none(), requestOptions
        )

    /** Service operation to get a single LinkStatus record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<LinkStatusGetResponse> =
        get(
          id, LinkStatusGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LinkStatusGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none()): CompletableFuture<LinkStatusGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: LinkStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LinkStatusGetResponse>

    /** @see get */
    fun get(params: LinkStatusGetParams): CompletableFuture<LinkStatusGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<LinkStatusGetResponse> =
        get(
          id,
          LinkStatusGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<LinkStatusQueryhelpResponse> = queryhelp(LinkStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LinkStatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none()): CompletableFuture<LinkStatusQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<LinkStatusQueryhelpResponse> =
        queryhelp(
          LinkStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: LinkStatusTupleParams): CompletableFuture<List<LinkStatusTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<LinkStatusTupleResponse>>

    /** A view of [LinkStatusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusServiceAsync.WithRawResponse

        fun datalink(): DatalinkServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/linkstatus`, but is otherwise the same as [LinkStatusServiceAsync.create]. */
        fun create(params: LinkStatusCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/linkstatus`, but is otherwise the same as [LinkStatusServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<LinkStatusListPageAsync>> = list(LinkStatusListParams.none())

        /** @see list */
        fun list(params: LinkStatusListParams = LinkStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LinkStatusListPageAsync>>

        /** @see list */
        fun list(params: LinkStatusListParams = LinkStatusListParams.none()): CompletableFuture<HttpResponseFor<LinkStatusListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusListPageAsync>> =
            list(
              LinkStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/count`, but is otherwise the same as [LinkStatusServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(LinkStatusCountParams.none())

        /** @see count */
        fun count(params: LinkStatusCountParams = LinkStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: LinkStatusCountParams = LinkStatusCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              LinkStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/{id}`, but is otherwise the same as [LinkStatusServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> =
            get(
              id, LinkStatusGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none()): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: LinkStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>>

        /** @see get */
        fun get(params: LinkStatusGetParams): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> =
            get(
              id,
              LinkStatusGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/queryhelp`, but is otherwise the same as [LinkStatusServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LinkStatusQueryhelpResponse>> = queryhelp(LinkStatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LinkStatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none()): CompletableFuture<HttpResponseFor<LinkStatusQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusQueryhelpResponse>> =
            queryhelp(
              LinkStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/tuple`, but is otherwise the same as [LinkStatusServiceAsync.tuple]. */
        fun tuple(params: LinkStatusTupleParams): CompletableFuture<HttpResponseFor<List<LinkStatusTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<LinkStatusTupleResponse>>>
    }
}
