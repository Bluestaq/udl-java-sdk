// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.poi.PoiCountParams
import com.unifieddatalibrary.api.models.poi.PoiCreateBulkParams
import com.unifieddatalibrary.api.models.poi.PoiCreateParams
import com.unifieddatalibrary.api.models.poi.PoiGetParams
import com.unifieddatalibrary.api.models.poi.PoiGetResponse
import com.unifieddatalibrary.api.models.poi.PoiListPage
import com.unifieddatalibrary.api.models.poi.PoiListParams
import com.unifieddatalibrary.api.models.poi.PoiQueryhelpParams
import com.unifieddatalibrary.api.models.poi.PoiQueryhelpResponse
import com.unifieddatalibrary.api.models.poi.PoiTupleParams
import com.unifieddatalibrary.api.models.poi.PoiTupleResponse
import com.unifieddatalibrary.api.models.poi.PoiUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.PoiService
import java.util.function.Consumer

interface PoiService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService

    /** Service operation to take a single POI as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: PoiCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: PoiCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: PoiListParams): PoiListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: PoiListParams, requestOptions: RequestOptions = RequestOptions.none()): PoiListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: PoiCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: PoiCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of POIs as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: PoiCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: PoiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single POI by its unique ID passed as a path parameter. */
    fun get(id: String): PoiGetResponse =
        get(
          id, PoiGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: PoiGetParams = PoiGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): PoiGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: PoiGetParams = PoiGetParams.none()): PoiGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: PoiGetParams, requestOptions: RequestOptions = RequestOptions.none()): PoiGetResponse

    /** @see get */
    fun get(params: PoiGetParams): PoiGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): PoiGetResponse =
        get(
          id,
          PoiGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): PoiQueryhelpResponse = queryhelp(PoiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: PoiQueryhelpParams = PoiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): PoiQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: PoiQueryhelpParams = PoiQueryhelpParams.none()): PoiQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): PoiQueryhelpResponse =
        queryhelp(
          PoiQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: PoiTupleParams): List<PoiTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: PoiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<PoiTupleResponse>

    /** Service operation to take a list of POIs as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: PoiUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: PoiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [PoiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/poi`, but is otherwise the same as [PoiService.create]. */
        @MustBeClosed
        fun create(params: PoiCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: PoiCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/poi`, but is otherwise the same as [PoiService.list]. */
        @MustBeClosed
        fun list(params: PoiListParams): HttpResponseFor<PoiListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: PoiListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PoiListPage>

        /** Returns a raw HTTP response for `get /udl/poi/count`, but is otherwise the same as [PoiService.count]. */
        @MustBeClosed
        fun count(params: PoiCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: PoiCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/poi/createBulk`, but is otherwise the same as [PoiService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: PoiCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: PoiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/poi/{id}`, but is otherwise the same as [PoiService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<PoiGetResponse> =
            get(
              id, PoiGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: PoiGetParams = PoiGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PoiGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: PoiGetParams = PoiGetParams.none()): HttpResponseFor<PoiGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: PoiGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PoiGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: PoiGetParams): HttpResponseFor<PoiGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<PoiGetResponse> =
            get(
              id,
              PoiGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/poi/queryhelp`, but is otherwise the same as [PoiService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<PoiQueryhelpResponse> = queryhelp(PoiQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: PoiQueryhelpParams = PoiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PoiQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: PoiQueryhelpParams = PoiQueryhelpParams.none()): HttpResponseFor<PoiQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<PoiQueryhelpResponse> =
            queryhelp(
              PoiQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/poi/tuple`, but is otherwise the same as [PoiService.tuple]. */
        @MustBeClosed
        fun tuple(params: PoiTupleParams): HttpResponseFor<List<PoiTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: PoiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<PoiTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-poi`, but is otherwise the same as [PoiService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: PoiUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: PoiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
