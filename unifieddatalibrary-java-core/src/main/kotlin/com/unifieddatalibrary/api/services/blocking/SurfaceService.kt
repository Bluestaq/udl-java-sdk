// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.surface.SurfaceCountParams
import com.unifieddatalibrary.api.models.surface.SurfaceCreateParams
import com.unifieddatalibrary.api.models.surface.SurfaceDeleteParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetResponse
import com.unifieddatalibrary.api.models.surface.SurfaceListPage
import com.unifieddatalibrary.api.models.surface.SurfaceListParams
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpParams
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpResponse
import com.unifieddatalibrary.api.models.surface.SurfaceTupleParams
import com.unifieddatalibrary.api.models.surface.SurfaceTupleResponse
import com.unifieddatalibrary.api.models.surface.SurfaceUpdateParams
import com.unifieddatalibrary.api.services.blocking.SurfaceService
import java.util.function.Consumer

interface SurfaceService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceService

    /** Service operation to take a single Surface as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SurfaceCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SurfaceCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Surface. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SurfaceUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SurfaceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SurfaceUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SurfaceUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SurfaceListPage = list(SurfaceListParams.none())

    /** @see list */
    fun list(params: SurfaceListParams = SurfaceListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceListPage

    /** @see list */
    fun list(params: SurfaceListParams = SurfaceListParams.none()): SurfaceListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SurfaceListPage =
        list(
          SurfaceListParams.none(), requestOptions
        )

    /** Service operation to delete a Surface object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SurfaceDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SurfaceDeleteParams = SurfaceDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SurfaceDeleteParams = SurfaceDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SurfaceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SurfaceDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SurfaceDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SurfaceCountParams.none())

    /** @see count */
    fun count(params: SurfaceCountParams = SurfaceCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SurfaceCountParams = SurfaceCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SurfaceCountParams.none(), requestOptions
        )

    /** Service operation to get a single Surface record by its unique ID passed as a path parameter. */
    fun get(id: String): SurfaceGetResponse =
        get(
          id, SurfaceGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SurfaceGetParams = SurfaceGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SurfaceGetParams = SurfaceGetParams.none()): SurfaceGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SurfaceGetParams, requestOptions: RequestOptions = RequestOptions.none()): SurfaceGetResponse

    /** @see get */
    fun get(params: SurfaceGetParams): SurfaceGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SurfaceGetResponse =
        get(
          id,
          SurfaceGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SurfaceQueryhelpResponse = queryhelp(SurfaceQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SurfaceQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none()): SurfaceQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SurfaceQueryhelpResponse =
        queryhelp(
          SurfaceQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SurfaceTupleParams): List<SurfaceTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SurfaceTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SurfaceTupleResponse>

    /** A view of [SurfaceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/surface`, but is otherwise the same as [SurfaceService.create]. */
        @MustBeClosed
        fun create(params: SurfaceCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SurfaceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/surface/{id}`, but is otherwise the same as [SurfaceService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SurfaceUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SurfaceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SurfaceUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SurfaceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/surface`, but is otherwise the same as [SurfaceService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SurfaceListPage> = list(SurfaceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SurfaceListParams = SurfaceListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SurfaceListParams = SurfaceListParams.none()): HttpResponseFor<SurfaceListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SurfaceListPage> =
            list(
              SurfaceListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/surface/{id}`, but is otherwise the same as [SurfaceService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SurfaceDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SurfaceDeleteParams = SurfaceDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SurfaceDeleteParams = SurfaceDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SurfaceDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SurfaceDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SurfaceDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/surface/count`, but is otherwise the same as [SurfaceService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SurfaceCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SurfaceCountParams = SurfaceCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SurfaceCountParams = SurfaceCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SurfaceCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/surface/{id}`, but is otherwise the same as [SurfaceService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SurfaceGetResponse> =
            get(
              id, SurfaceGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SurfaceGetParams = SurfaceGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SurfaceGetParams = SurfaceGetParams.none()): HttpResponseFor<SurfaceGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SurfaceGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SurfaceGetParams): HttpResponseFor<SurfaceGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SurfaceGetResponse> =
            get(
              id,
              SurfaceGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/surface/queryhelp`, but is otherwise the same as [SurfaceService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SurfaceQueryhelpResponse> = queryhelp(SurfaceQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SurfaceQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none()): HttpResponseFor<SurfaceQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SurfaceQueryhelpResponse> =
            queryhelp(
              SurfaceQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/surface/tuple`, but is otherwise the same as [SurfaceService.tuple]. */
        @MustBeClosed
        fun tuple(params: SurfaceTupleParams): HttpResponseFor<List<SurfaceTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SurfaceTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SurfaceTupleResponse>>
    }
}
