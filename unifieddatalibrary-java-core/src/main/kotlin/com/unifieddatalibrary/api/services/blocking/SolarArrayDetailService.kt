// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SolarArrayDetailsFull
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailCreateParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailDeleteParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailGetParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListPage
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailService
import java.util.function.Consumer

interface SolarArrayDetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailService

    /** Service operation to take a single SolarArrayDetails as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun create(params: SolarArrayDetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single SolarArrayDetails. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun update(pathId: String, params: SolarArrayDetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SolarArrayDetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SolarArrayDetailListPage = list(SolarArrayDetailListParams.none())

    /** @see list */
    fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SolarArrayDetailListPage

    /** @see list */
    fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none()): SolarArrayDetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SolarArrayDetailListPage =
        list(
          SolarArrayDetailListParams.none(), requestOptions
        )

    /** Service operation to delete a SolarArrayDetails object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun delete(id: String) =
        delete(
          id, SolarArrayDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SolarArrayDetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SolarArrayDetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single SolarArrayDetails record by its unique ID passed as a path parameter. A SolarArray may have multiple details records compiled by various sources. */
    fun get(id: String): SolarArrayDetailsFull =
        get(
          id, SolarArrayDetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SolarArrayDetailsFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none()): SolarArrayDetailsFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): SolarArrayDetailsFull

    /** @see get */
    fun get(params: SolarArrayDetailGetParams): SolarArrayDetailsFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SolarArrayDetailsFull =
        get(
          id,
          SolarArrayDetailGetParams.none(),
          requestOptions,
        )

    /** A view of [SolarArrayDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/solararraydetails`, but is otherwise the same as [SolarArrayDetailService.create]. */
        @MustBeClosed
        fun create(params: SolarArrayDetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SolarArrayDetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SolarArrayDetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/solararraydetails`, but is otherwise the same as [SolarArrayDetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SolarArrayDetailListPage> = list(SolarArrayDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none()): HttpResponseFor<SolarArrayDetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SolarArrayDetailListPage> =
            list(
              SolarArrayDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SolarArrayDetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SolarArrayDetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SolarArrayDetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SolarArrayDetailsFull> =
            get(
              id, SolarArrayDetailGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayDetailsFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none()): HttpResponseFor<SolarArrayDetailsFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayDetailsFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SolarArrayDetailGetParams): HttpResponseFor<SolarArrayDetailsFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SolarArrayDetailsFull> =
            get(
              id,
              SolarArrayDetailGetParams.none(),
              requestOptions,
            )
    }
}
