// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scientific.ScientificCountParams
import com.unifieddatalibrary.api.models.scientific.ScientificCreateParams
import com.unifieddatalibrary.api.models.scientific.ScientificDeleteParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetResponse
import com.unifieddatalibrary.api.models.scientific.ScientificListPage
import com.unifieddatalibrary.api.models.scientific.ScientificListParams
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpParams
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpResponse
import com.unifieddatalibrary.api.models.scientific.ScientificTupleParams
import com.unifieddatalibrary.api.models.scientific.ScientificTupleResponse
import com.unifieddatalibrary.api.models.scientific.ScientificUpdateParams
import com.unifieddatalibrary.api.services.blocking.ScientificService
import java.util.function.Consumer

interface ScientificService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificService

    /** Service operation to take a single Scientific as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ScientificCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ScientificCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Scientific. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ScientificUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ScientificUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): ScientificListPage = list(ScientificListParams.none())

    /** @see list */
    fun list(params: ScientificListParams = ScientificListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ScientificListPage

    /** @see list */
    fun list(params: ScientificListParams = ScientificListParams.none()): ScientificListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): ScientificListPage =
        list(
          ScientificListParams.none(), requestOptions
        )

    /** Service operation to delete a Scientific object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, ScientificDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ScientificDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          ScientificDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(ScientificCountParams.none())

    /** @see count */
    fun count(params: ScientificCountParams = ScientificCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: ScientificCountParams = ScientificCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          ScientificCountParams.none(), requestOptions
        )

    /** Service operation to get a single Scientific record by its unique ID passed as a path parameter. */
    fun get(id: String): ScientificGetResponse =
        get(
          id, ScientificGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ScientificGetParams = ScientificGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ScientificGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ScientificGetParams = ScientificGetParams.none()): ScientificGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ScientificGetParams, requestOptions: RequestOptions = RequestOptions.none()): ScientificGetResponse

    /** @see get */
    fun get(params: ScientificGetParams): ScientificGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ScientificGetResponse =
        get(
          id,
          ScientificGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): ScientificQueryhelpResponse = queryhelp(ScientificQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ScientificQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none()): ScientificQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ScientificQueryhelpResponse =
        queryhelp(
          ScientificQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ScientificTupleParams): List<ScientificTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<ScientificTupleResponse>

    /** A view of [ScientificService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/scientific`, but is otherwise the same as [ScientificService.create]. */
        @MustBeClosed
        fun create(params: ScientificCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: ScientificCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/scientific/{id}`, but is otherwise the same as [ScientificService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: ScientificUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ScientificUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/scientific`, but is otherwise the same as [ScientificService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<ScientificListPage> = list(ScientificListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: ScientificListParams = ScientificListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ScientificListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ScientificListParams = ScientificListParams.none()): HttpResponseFor<ScientificListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ScientificListPage> =
            list(
              ScientificListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/scientific/{id}`, but is otherwise the same as [ScientificService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, ScientificDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ScientificDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              ScientificDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/scientific/count`, but is otherwise the same as [ScientificService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(ScientificCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: ScientificCountParams = ScientificCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: ScientificCountParams = ScientificCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              ScientificCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/scientific/{id}`, but is otherwise the same as [ScientificService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ScientificGetResponse> =
            get(
              id, ScientificGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ScientificGetParams = ScientificGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ScientificGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ScientificGetParams = ScientificGetParams.none()): HttpResponseFor<ScientificGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: ScientificGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ScientificGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ScientificGetParams): HttpResponseFor<ScientificGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ScientificGetResponse> =
            get(
              id,
              ScientificGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/scientific/queryhelp`, but is otherwise the same as [ScientificService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ScientificQueryhelpResponse> = queryhelp(ScientificQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ScientificQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none()): HttpResponseFor<ScientificQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ScientificQueryhelpResponse> =
            queryhelp(
              ScientificQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/scientific/tuple`, but is otherwise the same as [ScientificService.tuple]. */
        @MustBeClosed
        fun tuple(params: ScientificTupleParams): HttpResponseFor<List<ScientificTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<ScientificTupleResponse>>
    }
}
