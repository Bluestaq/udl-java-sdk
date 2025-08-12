// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.manifold.ManifoldCountParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateBulkParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateParams
import com.unifieddatalibrary.api.models.manifold.ManifoldDeleteParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldListPage
import com.unifieddatalibrary.api.models.manifold.ManifoldListParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleParams
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldUpdateParams
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import java.util.function.Consumer

interface ManifoldService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldService

    /** Service operation to take a single Manifold as a POST body and ingest into the database. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ManifoldCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ManifoldCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Manifold. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ManifoldUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ManifoldUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): ManifoldListPage = list(ManifoldListParams.none())

    /** @see list */
    fun list(params: ManifoldListParams = ManifoldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ManifoldListPage

    /** @see list */
    fun list(params: ManifoldListParams = ManifoldListParams.none()): ManifoldListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): ManifoldListPage =
        list(
          ManifoldListParams.none(), requestOptions
        )

    /** Service operation to delete a Manifold object specified by the passed ID path parameter. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, ManifoldDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ManifoldDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          ManifoldDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(ManifoldCountParams.none())

    /** @see count */
    fun count(params: ManifoldCountParams = ManifoldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: ManifoldCountParams = ManifoldCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          ManifoldCountParams.none(), requestOptions
        )

    /** Service operation to take multiple Manifolds as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createBulk(params: ManifoldCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Manifold record by its unique ID passed as a path parameter. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. */
    fun get(id: String): ManifoldGetResponse =
        get(
          id, ManifoldGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ManifoldGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none()): ManifoldGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ManifoldGetParams, requestOptions: RequestOptions = RequestOptions.none()): ManifoldGetResponse

    /** @see get */
    fun get(params: ManifoldGetParams): ManifoldGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ManifoldGetResponse =
        get(
          id,
          ManifoldGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): ManifoldQueryhelpResponse = queryhelp(ManifoldQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ManifoldQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none()): ManifoldQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ManifoldQueryhelpResponse =
        queryhelp(
          ManifoldQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ManifoldTupleParams): List<ManifoldTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<ManifoldTupleResponse>

    /** A view of [ManifoldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/manifold`, but is otherwise the same as [ManifoldService.create]. */
        @MustBeClosed
        fun create(params: ManifoldCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: ManifoldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/manifold/{id}`, but is otherwise the same as [ManifoldService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: ManifoldUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ManifoldUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/manifold`, but is otherwise the same as [ManifoldService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<ManifoldListPage> = list(ManifoldListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: ManifoldListParams = ManifoldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManifoldListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ManifoldListParams = ManifoldListParams.none()): HttpResponseFor<ManifoldListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ManifoldListPage> =
            list(
              ManifoldListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/manifold/{id}`, but is otherwise the same as [ManifoldService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, ManifoldDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ManifoldDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              ManifoldDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/manifold/count`, but is otherwise the same as [ManifoldService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(ManifoldCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: ManifoldCountParams = ManifoldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: ManifoldCountParams = ManifoldCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              ManifoldCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/manifold/createBulk`, but is otherwise the same as [ManifoldService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: ManifoldCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/manifold/{id}`, but is otherwise the same as [ManifoldService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ManifoldGetResponse> =
            get(
              id, ManifoldGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManifoldGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none()): HttpResponseFor<ManifoldGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: ManifoldGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManifoldGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ManifoldGetParams): HttpResponseFor<ManifoldGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ManifoldGetResponse> =
            get(
              id,
              ManifoldGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/manifold/queryhelp`, but is otherwise the same as [ManifoldService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ManifoldQueryhelpResponse> = queryhelp(ManifoldQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManifoldQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none()): HttpResponseFor<ManifoldQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ManifoldQueryhelpResponse> =
            queryhelp(
              ManifoldQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/manifold/tuple`, but is otherwise the same as [ManifoldService.tuple]. */
        @MustBeClosed
        fun tuple(params: ManifoldTupleParams): HttpResponseFor<List<ManifoldTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<ManifoldTupleResponse>>
    }
}
