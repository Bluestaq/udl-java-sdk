// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitBatteryFull
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryCreateParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryDeleteParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryGetParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListPage
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import java.util.function.Consumer

interface OnorbitbatteryService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitbatteryService

    /** Service operation to take a single OnorbitBattery as a POST body and ingest into the database. OnorbitBattery is the association between on-orbit spacecraft batteries and a particular on-orbit spacecraft. A Battery may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitbatteryCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitbatteryCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single OnorbitBattery. OnorbitBattery is the association between on-orbit spacecraft batteries and a particular on-orbit spacecraft. A Battery may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitbatteryUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitbatteryUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OnorbitbatteryListPage = list(OnorbitbatteryListParams.none())

    /** @see list */
    fun list(params: OnorbitbatteryListParams = OnorbitbatteryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitbatteryListPage

    /** @see list */
    fun list(params: OnorbitbatteryListParams = OnorbitbatteryListParams.none()): OnorbitbatteryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitbatteryListPage =
        list(
          OnorbitbatteryListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitBattery object specified by the passed ID path parameter. OnorbitBattery is the association between on-orbit spacecraft batteries and a particular on-orbit spacecraft. A Battery may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OnorbitbatteryDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitbatteryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbitbatteryDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OnorbitbatteryDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitBattery record by its unique ID passed as a path parameter. OnorbitBattery is the association between on-orbit spacecraft batteries and a particular on-orbit spacecraft. A Battery may be associated with many different on-orbit spacecraft. */
    fun get(id: String): OnorbitBatteryFull =
        get(
          id, OnorbitbatteryGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitBatteryFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none()): OnorbitBatteryFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitbatteryGetParams, requestOptions: RequestOptions = RequestOptions.none()): OnorbitBatteryFull

    /** @see get */
    fun get(params: OnorbitbatteryGetParams): OnorbitBatteryFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitBatteryFull =
        get(
          id,
          OnorbitbatteryGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitbatteryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitbatteryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitbattery`, but is otherwise the same as [OnorbitbatteryService.create]. */
        @MustBeClosed
        fun create(params: OnorbitbatteryCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OnorbitbatteryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/onorbitbattery/{id}`, but is otherwise the same as [OnorbitbatteryService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitbatteryUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitbatteryUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/onorbitbattery`, but is otherwise the same as [OnorbitbatteryService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitbatteryListPage> = list(OnorbitbatteryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitbatteryListParams = OnorbitbatteryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitbatteryListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitbatteryListParams = OnorbitbatteryListParams.none()): HttpResponseFor<OnorbitbatteryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitbatteryListPage> =
            list(
              OnorbitbatteryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitbattery/{id}`, but is otherwise the same as [OnorbitbatteryService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OnorbitbatteryDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitbatteryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitbatteryDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OnorbitbatteryDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitbattery/{id}`, but is otherwise the same as [OnorbitbatteryService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitBatteryFull> =
            get(
              id, OnorbitbatteryGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitBatteryFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none()): HttpResponseFor<OnorbitBatteryFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitbatteryGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitBatteryFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitbatteryGetParams): HttpResponseFor<OnorbitBatteryFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitBatteryFull> =
            get(
              id,
              OnorbitbatteryGetParams.none(),
              requestOptions,
            )
    }
}
