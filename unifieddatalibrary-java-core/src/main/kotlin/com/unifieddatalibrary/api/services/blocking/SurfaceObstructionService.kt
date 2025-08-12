// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCountParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCreateParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionDeleteParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListPage
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUpdateParams
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionService
import java.util.function.Consumer

interface SurfaceObstructionService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceObstructionService

    /** Service operation to take a single surfaceobstruction record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SurfaceObstructionCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SurfaceObstructionCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single surfaceobstruction record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SurfaceObstructionUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SurfaceObstructionUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SurfaceObstructionListPage = list(SurfaceObstructionListParams.none())

    /** @see list */
    fun list(params: SurfaceObstructionListParams = SurfaceObstructionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceObstructionListPage

    /** @see list */
    fun list(params: SurfaceObstructionListParams = SurfaceObstructionListParams.none()): SurfaceObstructionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SurfaceObstructionListPage =
        list(
          SurfaceObstructionListParams.none(), requestOptions
        )

    /** Service operation to delete a surfaceobstruction record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SurfaceObstructionDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SurfaceObstructionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SurfaceObstructionDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SurfaceObstructionDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SurfaceObstructionCountParams.none())

    /** @see count */
    fun count(params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SurfaceObstructionCountParams.none(), requestOptions
        )

    /** Service operation to get a single surfaceobstruction record by its unique ID passed as a path parameter. */
    fun get(id: String): SurfaceObstructionGetResponse =
        get(
          id, SurfaceObstructionGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceObstructionGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none()): SurfaceObstructionGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SurfaceObstructionGetParams, requestOptions: RequestOptions = RequestOptions.none()): SurfaceObstructionGetResponse

    /** @see get */
    fun get(params: SurfaceObstructionGetParams): SurfaceObstructionGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SurfaceObstructionGetResponse =
        get(
          id,
          SurfaceObstructionGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SurfaceObstructionQueryhelpResponse = queryhelp(SurfaceObstructionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceObstructionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none()): SurfaceObstructionQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SurfaceObstructionQueryhelpResponse =
        queryhelp(
          SurfaceObstructionQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SurfaceObstructionTupleParams): List<SurfaceObstructionTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SurfaceObstructionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SurfaceObstructionTupleResponse>

    /** Service operation to take multiple surfaceobstruction records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SurfaceObstructionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceObstructionService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/surfaceobstruction`, but is otherwise the same as [SurfaceObstructionService.create]. */
        @MustBeClosed
        fun create(params: SurfaceObstructionCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SurfaceObstructionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/surfaceobstruction/{id}`, but is otherwise the same as [SurfaceObstructionService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SurfaceObstructionUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SurfaceObstructionUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/surfaceobstruction`, but is otherwise the same as [SurfaceObstructionService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SurfaceObstructionListPage> = list(SurfaceObstructionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SurfaceObstructionListParams = SurfaceObstructionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceObstructionListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SurfaceObstructionListParams = SurfaceObstructionListParams.none()): HttpResponseFor<SurfaceObstructionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SurfaceObstructionListPage> =
            list(
              SurfaceObstructionListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/surfaceobstruction/{id}`, but is otherwise the same as [SurfaceObstructionService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SurfaceObstructionDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SurfaceObstructionDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SurfaceObstructionDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SurfaceObstructionDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/surfaceobstruction/count`, but is otherwise the same as [SurfaceObstructionService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SurfaceObstructionCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SurfaceObstructionCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/surfaceobstruction/{id}`, but is otherwise the same as [SurfaceObstructionService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SurfaceObstructionGetResponse> =
            get(
              id, SurfaceObstructionGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceObstructionGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none()): HttpResponseFor<SurfaceObstructionGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SurfaceObstructionGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceObstructionGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SurfaceObstructionGetParams): HttpResponseFor<SurfaceObstructionGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SurfaceObstructionGetResponse> =
            get(
              id,
              SurfaceObstructionGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/surfaceobstruction/queryhelp`, but is otherwise the same as [SurfaceObstructionService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SurfaceObstructionQueryhelpResponse> = queryhelp(SurfaceObstructionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceObstructionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none()): HttpResponseFor<SurfaceObstructionQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SurfaceObstructionQueryhelpResponse> =
            queryhelp(
              SurfaceObstructionQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/surfaceobstruction/tuple`, but is otherwise the same as [SurfaceObstructionService.tuple]. */
        @MustBeClosed
        fun tuple(params: SurfaceObstructionTupleParams): HttpResponseFor<List<SurfaceObstructionTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SurfaceObstructionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SurfaceObstructionTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-surfaceobstruction`, but is otherwise the same as [SurfaceObstructionService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
