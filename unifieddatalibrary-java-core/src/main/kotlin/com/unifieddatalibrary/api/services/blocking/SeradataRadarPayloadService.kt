// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCountParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListPage
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadService
import java.util.function.Consumer

interface SeradataRadarPayloadService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataRadarPayloadService

    /** Service operation to take a single SeradataRadarPayload as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SeradataRadarPayloadCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SeradataRadarPayloadCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an SeradataRadarPayload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SeradataRadarPayloadUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SeradataRadarPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SeradataRadarPayloadUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SeradataRadarPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SeradataRadarPayloadListPage = list(SeradataRadarPayloadListParams.none())

    /** @see list */
    fun list(params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeradataRadarPayloadListPage

    /** @see list */
    fun list(params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none()): SeradataRadarPayloadListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SeradataRadarPayloadListPage =
        list(
          SeradataRadarPayloadListParams.none(), requestOptions
        )

    /** Service operation to delete an SeradataRadarPayload specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SeradataRadarPayloadDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SeradataRadarPayloadDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SeradataRadarPayloadDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SeradataRadarPayloadDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SeradataRadarPayloadCountParams.none())

    /** @see count */
    fun count(params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SeradataRadarPayloadCountParams.none(), requestOptions
        )

    /** Service operation to get a single SeradataRadarPayload by its unique ID passed as a path parameter. */
    fun get(id: String): SeradataRadarPayloadGetResponse =
        get(
          id, SeradataRadarPayloadGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeradataRadarPayloadGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none()): SeradataRadarPayloadGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SeradataRadarPayloadGetParams, requestOptions: RequestOptions = RequestOptions.none()): SeradataRadarPayloadGetResponse

    /** @see get */
    fun get(params: SeradataRadarPayloadGetParams): SeradataRadarPayloadGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeradataRadarPayloadGetResponse =
        get(
          id,
          SeradataRadarPayloadGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SeradataRadarPayloadQueryhelpResponse = queryhelp(SeradataRadarPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeradataRadarPayloadQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none()): SeradataRadarPayloadQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeradataRadarPayloadQueryhelpResponse =
        queryhelp(
          SeradataRadarPayloadQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SeradataRadarPayloadTupleParams): List<SeradataRadarPayloadTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SeradataRadarPayloadTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SeradataRadarPayloadTupleResponse>

    /** A view of [SeradataRadarPayloadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataRadarPayloadService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/seradataradarpayload`, but is otherwise the same as [SeradataRadarPayloadService.create]. */
        @MustBeClosed
        fun create(params: SeradataRadarPayloadCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SeradataRadarPayloadCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/seradataradarpayload/{id}`, but is otherwise the same as [SeradataRadarPayloadService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SeradataRadarPayloadUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SeradataRadarPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SeradataRadarPayloadUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SeradataRadarPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/seradataradarpayload`, but is otherwise the same as [SeradataRadarPayloadService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SeradataRadarPayloadListPage> = list(SeradataRadarPayloadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeradataRadarPayloadListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none()): HttpResponseFor<SeradataRadarPayloadListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeradataRadarPayloadListPage> =
            list(
              SeradataRadarPayloadListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/seradataradarpayload/{id}`, but is otherwise the same as [SeradataRadarPayloadService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SeradataRadarPayloadDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeradataRadarPayloadDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeradataRadarPayloadDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SeradataRadarPayloadDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataradarpayload/count`, but is otherwise the same as [SeradataRadarPayloadService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeradataRadarPayloadCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SeradataRadarPayloadCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataradarpayload/{id}`, but is otherwise the same as [SeradataRadarPayloadService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeradataRadarPayloadGetResponse> =
            get(
              id, SeradataRadarPayloadGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeradataRadarPayloadGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none()): HttpResponseFor<SeradataRadarPayloadGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SeradataRadarPayloadGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeradataRadarPayloadGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SeradataRadarPayloadGetParams): HttpResponseFor<SeradataRadarPayloadGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SeradataRadarPayloadGetResponse> =
            get(
              id,
              SeradataRadarPayloadGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataradarpayload/queryhelp`, but is otherwise the same as [SeradataRadarPayloadService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeradataRadarPayloadQueryhelpResponse> = queryhelp(SeradataRadarPayloadQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeradataRadarPayloadQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none()): HttpResponseFor<SeradataRadarPayloadQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SeradataRadarPayloadQueryhelpResponse> =
            queryhelp(
              SeradataRadarPayloadQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataradarpayload/tuple`, but is otherwise the same as [SeradataRadarPayloadService.tuple]. */
        @MustBeClosed
        fun tuple(params: SeradataRadarPayloadTupleParams): HttpResponseFor<List<SeradataRadarPayloadTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SeradataRadarPayloadTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SeradataRadarPayloadTupleResponse>>
    }
}
