// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCountParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCreateParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventDeleteParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListPage
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbiteventService
import java.util.function.Consumer

interface OnorbiteventService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbiteventService

    /** Service operation to take a single OnorbitEvent as a POST body and ingest into the database. An OnorbitEvent is an event associated with a particular on-orbit spacecraft including insurance related losses, anomalies and incidents. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbiteventCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbiteventCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single OnorbitEvent. An OnorbitEvent is an event associated with a particular on-orbit spacecraft including insurance related losses, anomalies and incidents. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbiteventUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbiteventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbiteventUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbiteventUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OnorbiteventListPage = list(OnorbiteventListParams.none())

    /** @see list */
    fun list(params: OnorbiteventListParams = OnorbiteventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbiteventListPage

    /** @see list */
    fun list(params: OnorbiteventListParams = OnorbiteventListParams.none()): OnorbiteventListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbiteventListPage =
        list(
          OnorbiteventListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitEvent object specified by the passed ID path parameter. An OnorbitEvent is an event associated with a particular on-orbit spacecraft including insurance related losses, anomalies and incidents. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OnorbiteventDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbiteventDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbiteventDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OnorbiteventDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(OnorbiteventCountParams.none())

    /** @see count */
    fun count(params: OnorbiteventCountParams = OnorbiteventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: OnorbiteventCountParams = OnorbiteventCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          OnorbiteventCountParams.none(), requestOptions
        )

    /** Service operation to get a single OnorbitEvent record by its unique ID passed as a path parameter. An OnorbitEvent is an event associated with a particular on-orbit spacecraft including insurance related losses, anomalies and incidents. */
    fun get(id: String): OnorbiteventGetResponse =
        get(
          id, OnorbiteventGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbiteventGetParams = OnorbiteventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbiteventGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbiteventGetParams = OnorbiteventGetParams.none()): OnorbiteventGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbiteventGetParams, requestOptions: RequestOptions = RequestOptions.none()): OnorbiteventGetResponse

    /** @see get */
    fun get(params: OnorbiteventGetParams): OnorbiteventGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbiteventGetResponse =
        get(
          id,
          OnorbiteventGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): OnorbiteventQueryhelpResponse = queryhelp(OnorbiteventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbiteventQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none()): OnorbiteventQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnorbiteventQueryhelpResponse =
        queryhelp(
          OnorbiteventQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OnorbiteventTupleParams): List<OnorbiteventTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OnorbiteventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OnorbiteventTupleResponse>

    /** A view of [OnorbiteventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbiteventService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitevent`, but is otherwise the same as [OnorbiteventService.create]. */
        @MustBeClosed
        fun create(params: OnorbiteventCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OnorbiteventCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/onorbitevent/{id}`, but is otherwise the same as [OnorbiteventService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OnorbiteventUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OnorbiteventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbiteventUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbiteventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/onorbitevent`, but is otherwise the same as [OnorbiteventService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbiteventListPage> = list(OnorbiteventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbiteventListParams = OnorbiteventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbiteventListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbiteventListParams = OnorbiteventListParams.none()): HttpResponseFor<OnorbiteventListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbiteventListPage> =
            list(
              OnorbiteventListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitevent/{id}`, but is otherwise the same as [OnorbiteventService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OnorbiteventDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbiteventDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbiteventDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OnorbiteventDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitevent/count`, but is otherwise the same as [OnorbiteventService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OnorbiteventCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: OnorbiteventCountParams = OnorbiteventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: OnorbiteventCountParams = OnorbiteventCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              OnorbiteventCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitevent/{id}`, but is otherwise the same as [OnorbiteventService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbiteventGetResponse> =
            get(
              id, OnorbiteventGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbiteventGetParams = OnorbiteventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbiteventGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbiteventGetParams = OnorbiteventGetParams.none()): HttpResponseFor<OnorbiteventGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbiteventGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbiteventGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbiteventGetParams): HttpResponseFor<OnorbiteventGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbiteventGetResponse> =
            get(
              id,
              OnorbiteventGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitevent/queryhelp`, but is otherwise the same as [OnorbiteventService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnorbiteventQueryhelpResponse> = queryhelp(OnorbiteventQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbiteventQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none()): HttpResponseFor<OnorbiteventQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OnorbiteventQueryhelpResponse> =
            queryhelp(
              OnorbiteventQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitevent/tuple`, but is otherwise the same as [OnorbiteventService.tuple]. */
        @MustBeClosed
        fun tuple(params: OnorbiteventTupleParams): HttpResponseFor<List<OnorbiteventTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OnorbiteventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OnorbiteventTupleResponse>>
    }
}
