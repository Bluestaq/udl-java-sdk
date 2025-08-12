// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitSolarArrayFull
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayCreateParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayDeleteParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayGetParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListPage
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayService
import java.util.function.Consumer

interface OnorbitsolararrayService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayService

    /** Service operation to take a single OnorbitSolarArray as a POST body and ingest into the database. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitsolararrayCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single OnorbitSolarArray. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitsolararrayUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitsolararrayUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OnorbitsolararrayListPage = list(OnorbitsolararrayListParams.none())

    /** @see list */
    fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitsolararrayListPage

    /** @see list */
    fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none()): OnorbitsolararrayListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitsolararrayListPage =
        list(
          OnorbitsolararrayListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitSolarArray object specified by the passed ID path parameter. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OnorbitsolararrayDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbitsolararrayDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OnorbitsolararrayDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitSolarArray record by its unique ID passed as a path parameter. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. */
    fun get(id: String): OnorbitSolarArrayFull =
        get(
          id, OnorbitsolararrayGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OnorbitSolarArrayFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none()): OnorbitSolarArrayFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): OnorbitSolarArrayFull

    /** @see get */
    fun get(params: OnorbitsolararrayGetParams): OnorbitSolarArrayFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitSolarArrayFull =
        get(
          id,
          OnorbitsolararrayGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitsolararrayService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitsolararray`, but is otherwise the same as [OnorbitsolararrayService.create]. */
        @MustBeClosed
        fun create(params: OnorbitsolararrayCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitsolararrayUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitsolararrayUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/onorbitsolararray`, but is otherwise the same as [OnorbitsolararrayService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitsolararrayListPage> = list(OnorbitsolararrayListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitsolararrayListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none()): HttpResponseFor<OnorbitsolararrayListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitsolararrayListPage> =
            list(
              OnorbitsolararrayListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OnorbitsolararrayDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitsolararrayDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OnorbitsolararrayDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitSolarArrayFull> =
            get(
              id, OnorbitsolararrayGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitSolarArrayFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none()): HttpResponseFor<OnorbitSolarArrayFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OnorbitSolarArrayFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitsolararrayGetParams): HttpResponseFor<OnorbitSolarArrayFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitSolarArrayFull> =
            get(
              id,
              OnorbitsolararrayGetParams.none(),
              requestOptions,
            )
    }
}
