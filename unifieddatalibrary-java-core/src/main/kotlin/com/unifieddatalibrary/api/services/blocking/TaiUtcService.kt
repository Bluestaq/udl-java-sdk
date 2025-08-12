// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCountParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcDeleteParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcGetParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListPage
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcTupleParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcUpdateParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import com.unifieddatalibrary.api.services.blocking.TaiUtcService
import com.unifieddatalibrary.api.services.blocking.taiutc.HistoryService
import java.util.function.Consumer

interface TaiUtcService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcService

    fun history(): HistoryService

    /** Service operation to take a single TAIUTC object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: TaiUtcCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: TaiUtcCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single TAIUTC object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: TaiUtcUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: TaiUtcUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: TaiUtcUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: TaiUtcUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: TaiUtcListParams): TaiUtcListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: TaiUtcListParams, requestOptions: RequestOptions = RequestOptions.none()): TaiUtcListPage

    /** Service operation to delete an TAIUTC object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. Note, delete operations do not remove data from historical or publish/subscribe stores. */
    fun delete(id: String) =
        delete(
          id, TaiUtcDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: TaiUtcDeleteParams = TaiUtcDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: TaiUtcDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TaiUtcDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          TaiUtcDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: TaiUtcCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: TaiUtcCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to get a single TAIUTC record by its unique ID passed as a path parameter. */
    fun get(id: String): TaiutcFull =
        get(
          id, TaiUtcGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: TaiUtcGetParams = TaiUtcGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): TaiutcFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: TaiUtcGetParams = TaiUtcGetParams.none()): TaiutcFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: TaiUtcGetParams, requestOptions: RequestOptions = RequestOptions.none()): TaiutcFull

    /** @see get */
    fun get(params: TaiUtcGetParams): TaiutcFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): TaiutcFull =
        get(
          id,
          TaiUtcGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): TaiUtcQueryhelpResponse = queryhelp(TaiUtcQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): TaiUtcQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none()): TaiUtcQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): TaiUtcQueryhelpResponse =
        queryhelp(
          TaiUtcQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: TaiUtcTupleParams): List<TaiutcFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: TaiUtcTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<TaiutcFull>

    /** A view of [TaiUtcService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/taiutc`, but is otherwise the same as [TaiUtcService.create]. */
        @MustBeClosed
        fun create(params: TaiUtcCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: TaiUtcCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/taiutc/{id}`, but is otherwise the same as [TaiUtcService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: TaiUtcUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: TaiUtcUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: TaiUtcUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: TaiUtcUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/taiutc`, but is otherwise the same as [TaiUtcService.list]. */
        @MustBeClosed
        fun list(params: TaiUtcListParams): HttpResponseFor<TaiUtcListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: TaiUtcListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TaiUtcListPage>

        /** Returns a raw HTTP response for `delete /udl/taiutc/{id}`, but is otherwise the same as [TaiUtcService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, TaiUtcDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: TaiUtcDeleteParams = TaiUtcDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaiUtcDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaiUtcDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              TaiUtcDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/taiutc/count`, but is otherwise the same as [TaiUtcService.count]. */
        @MustBeClosed
        fun count(params: TaiUtcCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: TaiUtcCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/taiutc/{id}`, but is otherwise the same as [TaiUtcService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<TaiutcFull> =
            get(
              id, TaiUtcGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: TaiUtcGetParams = TaiUtcGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TaiutcFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: TaiUtcGetParams = TaiUtcGetParams.none()): HttpResponseFor<TaiutcFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: TaiUtcGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TaiutcFull>

        /** @see get */
        @MustBeClosed
        fun get(params: TaiUtcGetParams): HttpResponseFor<TaiutcFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<TaiutcFull> =
            get(
              id,
              TaiUtcGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/taiutc/queryhelp`, but is otherwise the same as [TaiUtcService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<TaiUtcQueryhelpResponse> = queryhelp(TaiUtcQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TaiUtcQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none()): HttpResponseFor<TaiUtcQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<TaiUtcQueryhelpResponse> =
            queryhelp(
              TaiUtcQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/taiutc/tuple`, but is otherwise the same as [TaiUtcService.tuple]. */
        @MustBeClosed
        fun tuple(params: TaiUtcTupleParams): HttpResponseFor<List<TaiutcFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: TaiUtcTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<TaiutcFull>>
    }
}
