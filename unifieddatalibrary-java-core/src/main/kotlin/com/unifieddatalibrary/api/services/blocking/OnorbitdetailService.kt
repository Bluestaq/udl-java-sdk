// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitDetailsFull
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailCreateParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailDeleteParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailGetParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListPage
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import java.util.function.Consumer

interface OnorbitdetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailService

    /** Service operation to take a single OnorbitDetails as a POST body and ingest into the database. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitdetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single OnorbitDetails. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitdetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitdetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OnorbitdetailListPage = list(OnorbitdetailListParams.none())

    /** @see list */
    fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitdetailListPage

    /** @see list */
    fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none()): OnorbitdetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitdetailListPage =
        list(
          OnorbitdetailListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitDetails object specified by the passed ID path parameter. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OnorbitdetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbitdetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OnorbitdetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitDetails record by its unique ID passed as a path parameter. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. */
    fun get(id: String): OnorbitDetailsFull =
        get(
          id, OnorbitdetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitDetailsFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none()): OnorbitDetailsFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): OnorbitDetailsFull

    /** @see get */
    fun get(params: OnorbitdetailGetParams): OnorbitDetailsFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitDetailsFull =
        get(
          id,
          OnorbitdetailGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitdetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitdetails`, but is otherwise the same as [OnorbitdetailService.create]. */
        @MustBeClosed
        fun create(params: OnorbitdetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitdetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitdetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/onorbitdetails`, but is otherwise the same as [OnorbitdetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitdetailListPage> = list(OnorbitdetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitdetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none()): HttpResponseFor<OnorbitdetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitdetailListPage> =
            list(
              OnorbitdetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OnorbitdetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitdetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OnorbitdetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitDetailsFull> =
            get(
              id, OnorbitdetailGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitDetailsFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none()): HttpResponseFor<OnorbitDetailsFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitDetailsFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitdetailGetParams): HttpResponseFor<OnorbitDetailsFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitDetailsFull> =
            get(
              id,
              OnorbitdetailGetParams.none(),
              requestOptions,
            )
    }
}
