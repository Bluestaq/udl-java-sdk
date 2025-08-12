// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCountParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCreateParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningDeleteParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListPage
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import java.util.function.Consumer

interface SeraDataEarlyWarningService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningService

    /** Service operation to take a single SeradataEarlyWarning as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SeraDataEarlyWarningCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an SeradataEarlyWarning. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SeraDataEarlyWarningUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SeraDataEarlyWarningListPage = list(SeraDataEarlyWarningListParams.none())

    /** @see list */
    fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeraDataEarlyWarningListPage

    /** @see list */
    fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none()): SeraDataEarlyWarningListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SeraDataEarlyWarningListPage =
        list(
          SeraDataEarlyWarningListParams.none(), requestOptions
        )

    /** Service operation to delete an SeradataEarlyWarning specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SeraDataEarlyWarningDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SeraDataEarlyWarningDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SeraDataEarlyWarningDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SeraDataEarlyWarningCountParams.none())

    /** @see count */
    fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SeraDataEarlyWarningCountParams.none(), requestOptions
        )

    /** Service operation to get a single SeradataEarlyWarning by its unique ID passed as a path parameter. */
    fun get(id: String): SeraDataEarlyWarningGetResponse =
        get(
          id, SeraDataEarlyWarningGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeraDataEarlyWarningGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none()): SeraDataEarlyWarningGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions = RequestOptions.none()): SeraDataEarlyWarningGetResponse

    /** @see get */
    fun get(params: SeraDataEarlyWarningGetParams): SeraDataEarlyWarningGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeraDataEarlyWarningGetResponse =
        get(
          id,
          SeraDataEarlyWarningGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SeraDataEarlyWarningQueryhelpResponse = queryhelp(SeraDataEarlyWarningQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SeraDataEarlyWarningQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none()): SeraDataEarlyWarningQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeraDataEarlyWarningQueryhelpResponse =
        queryhelp(
          SeraDataEarlyWarningQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SeraDataEarlyWarningTupleParams): List<SeraDataEarlyWarningTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SeraDataEarlyWarningTupleResponse>

    /** A view of [SeraDataEarlyWarningService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/seradataearlywarning`, but is otherwise the same as [SeraDataEarlyWarningService.create]. */
        @MustBeClosed
        fun create(params: SeraDataEarlyWarningCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SeraDataEarlyWarningUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning`, but is otherwise the same as [SeraDataEarlyWarningService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SeraDataEarlyWarningListPage> = list(SeraDataEarlyWarningListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeraDataEarlyWarningListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none()): HttpResponseFor<SeraDataEarlyWarningListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningListPage> =
            list(
              SeraDataEarlyWarningListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SeraDataEarlyWarningDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeraDataEarlyWarningDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SeraDataEarlyWarningDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/count`, but is otherwise the same as [SeraDataEarlyWarningService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeraDataEarlyWarningCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SeraDataEarlyWarningCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeraDataEarlyWarningGetResponse> =
            get(
              id, SeraDataEarlyWarningGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeraDataEarlyWarningGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none()): HttpResponseFor<SeraDataEarlyWarningGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeraDataEarlyWarningGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SeraDataEarlyWarningGetParams): HttpResponseFor<SeraDataEarlyWarningGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningGetResponse> =
            get(
              id,
              SeraDataEarlyWarningGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/queryhelp`, but is otherwise the same as [SeraDataEarlyWarningService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse> = queryhelp(SeraDataEarlyWarningQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none()): HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse> =
            queryhelp(
              SeraDataEarlyWarningQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/tuple`, but is otherwise the same as [SeraDataEarlyWarningService.tuple]. */
        @MustBeClosed
        fun tuple(params: SeraDataEarlyWarningTupleParams): HttpResponseFor<List<SeraDataEarlyWarningTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SeraDataEarlyWarningTupleResponse>>
    }
}
