// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCountParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCreateParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListPage
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleResponse
import com.unifieddatalibrary.api.services.blocking.LinkStatusService
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkService
import com.unifieddatalibrary.api.services.blocking.linkstatus.HistoryService
import java.util.function.Consumer

interface LinkStatusService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusService

    fun datalink(): DatalinkService

    fun history(): HistoryService

    /** Service operation to take a single LinkStatus as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: LinkStatusCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): LinkStatusListPage = list(LinkStatusListParams.none())

    /** @see list */
    fun list(params: LinkStatusListParams = LinkStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LinkStatusListPage

    /** @see list */
    fun list(params: LinkStatusListParams = LinkStatusListParams.none()): LinkStatusListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): LinkStatusListPage =
        list(
          LinkStatusListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(LinkStatusCountParams.none())

    /** @see count */
    fun count(params: LinkStatusCountParams = LinkStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: LinkStatusCountParams = LinkStatusCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          LinkStatusCountParams.none(), requestOptions
        )

    /** Service operation to get a single LinkStatus record by its unique ID passed as a path parameter. */
    fun get(id: String): LinkStatusGetResponse =
        get(
          id, LinkStatusGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LinkStatusGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none()): LinkStatusGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: LinkStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): LinkStatusGetResponse

    /** @see get */
    fun get(params: LinkStatusGetParams): LinkStatusGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LinkStatusGetResponse =
        get(
          id,
          LinkStatusGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): LinkStatusQueryhelpResponse = queryhelp(LinkStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LinkStatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none()): LinkStatusQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LinkStatusQueryhelpResponse =
        queryhelp(
          LinkStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: LinkStatusTupleParams): List<LinkStatusTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<LinkStatusTupleResponse>

    /** A view of [LinkStatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusService.WithRawResponse

        fun datalink(): DatalinkService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/linkstatus`, but is otherwise the same as [LinkStatusService.create]. */
        @MustBeClosed
        fun create(params: LinkStatusCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/linkstatus`, but is otherwise the same as [LinkStatusService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<LinkStatusListPage> = list(LinkStatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: LinkStatusListParams = LinkStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LinkStatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: LinkStatusListParams = LinkStatusListParams.none()): HttpResponseFor<LinkStatusListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LinkStatusListPage> =
            list(
              LinkStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/count`, but is otherwise the same as [LinkStatusService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(LinkStatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: LinkStatusCountParams = LinkStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: LinkStatusCountParams = LinkStatusCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              LinkStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/{id}`, but is otherwise the same as [LinkStatusService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LinkStatusGetResponse> =
            get(
              id, LinkStatusGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LinkStatusGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LinkStatusGetParams = LinkStatusGetParams.none()): HttpResponseFor<LinkStatusGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: LinkStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LinkStatusGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LinkStatusGetParams): HttpResponseFor<LinkStatusGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<LinkStatusGetResponse> =
            get(
              id,
              LinkStatusGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/queryhelp`, but is otherwise the same as [LinkStatusService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LinkStatusQueryhelpResponse> = queryhelp(LinkStatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LinkStatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: LinkStatusQueryhelpParams = LinkStatusQueryhelpParams.none()): HttpResponseFor<LinkStatusQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<LinkStatusQueryhelpResponse> =
            queryhelp(
              LinkStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/linkstatus/tuple`, but is otherwise the same as [LinkStatusService.tuple]. */
        @MustBeClosed
        fun tuple(params: LinkStatusTupleParams): HttpResponseFor<List<LinkStatusTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<LinkStatusTupleResponse>>
    }
}
