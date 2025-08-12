// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCountParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateBulkParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogDeleteParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListPage
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUpdateParams
import com.unifieddatalibrary.api.services.blocking.StarCatalogService
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryService
import java.util.function.Consumer

interface StarCatalogService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StarCatalogService

    fun history(): HistoryService

    /** Service operation to take a single StarCatalog record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: StarCatalogCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: StarCatalogCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single starcatalog record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: StarCatalogUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: StarCatalogUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): StarCatalogListPage = list(StarCatalogListParams.none())

    /** @see list */
    fun list(params: StarCatalogListParams = StarCatalogListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StarCatalogListPage

    /** @see list */
    fun list(params: StarCatalogListParams = StarCatalogListParams.none()): StarCatalogListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): StarCatalogListPage =
        list(
          StarCatalogListParams.none(), requestOptions
        )

    /** Service operation to delete a dataset specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, StarCatalogDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: StarCatalogDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: StarCatalogDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          StarCatalogDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(StarCatalogCountParams.none())

    /** @see count */
    fun count(params: StarCatalogCountParams = StarCatalogCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: StarCatalogCountParams = StarCatalogCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          StarCatalogCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of StarCatalog records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: StarCatalogCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: StarCatalogCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single StarCatalog record by its unique ID passed as a path parameter. */
    fun get(id: String): StarCatalogGetResponse =
        get(
          id, StarCatalogGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StarCatalogGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none()): StarCatalogGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: StarCatalogGetParams, requestOptions: RequestOptions = RequestOptions.none()): StarCatalogGetResponse

    /** @see get */
    fun get(params: StarCatalogGetParams): StarCatalogGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): StarCatalogGetResponse =
        get(
          id,
          StarCatalogGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): StarCatalogQueryhelpResponse = queryhelp(StarCatalogQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StarCatalogQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none()): StarCatalogQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): StarCatalogQueryhelpResponse =
        queryhelp(
          StarCatalogQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: StarCatalogTupleParams): List<StarCatalogTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: StarCatalogTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<StarCatalogTupleResponse>

    /** Service operation to take multiple StarCatalog records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [StarCatalogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StarCatalogService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/starcatalog`, but is otherwise the same as [StarCatalogService.create]. */
        @MustBeClosed
        fun create(params: StarCatalogCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: StarCatalogCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: StarCatalogUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StarCatalogUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/starcatalog`, but is otherwise the same as [StarCatalogService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<StarCatalogListPage> = list(StarCatalogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: StarCatalogListParams = StarCatalogListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StarCatalogListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: StarCatalogListParams = StarCatalogListParams.none()): HttpResponseFor<StarCatalogListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StarCatalogListPage> =
            list(
              StarCatalogListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, StarCatalogDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: StarCatalogDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: StarCatalogDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              StarCatalogDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/count`, but is otherwise the same as [StarCatalogService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(StarCatalogCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: StarCatalogCountParams = StarCatalogCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: StarCatalogCountParams = StarCatalogCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              StarCatalogCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/starcatalog/createBulk`, but is otherwise the same as [StarCatalogService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: StarCatalogCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: StarCatalogCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<StarCatalogGetResponse> =
            get(
              id, StarCatalogGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StarCatalogGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none()): HttpResponseFor<StarCatalogGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: StarCatalogGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StarCatalogGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: StarCatalogGetParams): HttpResponseFor<StarCatalogGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<StarCatalogGetResponse> =
            get(
              id,
              StarCatalogGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/queryhelp`, but is otherwise the same as [StarCatalogService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<StarCatalogQueryhelpResponse> = queryhelp(StarCatalogQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StarCatalogQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none()): HttpResponseFor<StarCatalogQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<StarCatalogQueryhelpResponse> =
            queryhelp(
              StarCatalogQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/tuple`, but is otherwise the same as [StarCatalogService.tuple]. */
        @MustBeClosed
        fun tuple(params: StarCatalogTupleParams): HttpResponseFor<List<StarCatalogTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: StarCatalogTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StarCatalogTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-starcatalog`, but is otherwise the same as [StarCatalogService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
