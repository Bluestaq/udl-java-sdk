// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onorbit

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AntennaDetailsFull
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailDeleteParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListPage
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.onorbit.AntennaDetailService
import java.util.function.Consumer

interface AntennaDetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailService

    /** Service operation to take a single AntennaDetails as a POST body and ingest into the database. An antenna may have multiple details records compiled by various sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AntennaDetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single AntennaDetails record by its unique ID passed as a path parameter. An antenna may have multiple details records compiled by various sources. */
    fun retrieve(id: String): AntennaDetailsFull =
        retrieve(
          id, AntennaDetailRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AntennaDetailsFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none()): AntennaDetailsFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AntennaDetailsFull

    /** @see retrieve */
    fun retrieve(params: AntennaDetailRetrieveParams): AntennaDetailsFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AntennaDetailsFull =
        retrieve(
          id,
          AntennaDetailRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single AntennaDetails. An antenna may have multiple details records compiled by various sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AntennaDetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AntennaDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AntennaDetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AntennaDetailListPage = list(AntennaDetailListParams.none())

    /** @see list */
    fun list(params: AntennaDetailListParams = AntennaDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AntennaDetailListPage

    /** @see list */
    fun list(params: AntennaDetailListParams = AntennaDetailListParams.none()): AntennaDetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AntennaDetailListPage =
        list(
          AntennaDetailListParams.none(), requestOptions
        )

    /** Service operation to delete a AntennaDetails object specified by the passed ID path parameter. An antenna may have multiple details records compiled by various sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AntennaDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AntennaDetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AntennaDetailDeleteParams.none(),
          requestOptions,
        )

    /** A view of [AntennaDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/antennadetails`, but is otherwise the same as [AntennaDetailService.create]. */
        @MustBeClosed
        fun create(params: AntennaDetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/antennadetails/{id}`, but is otherwise the same as [AntennaDetailService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AntennaDetailsFull> =
            retrieve(
              id, AntennaDetailRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaDetailsFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none()): HttpResponseFor<AntennaDetailsFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaDetailsFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AntennaDetailRetrieveParams): HttpResponseFor<AntennaDetailsFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AntennaDetailsFull> =
            retrieve(
              id,
              AntennaDetailRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/antennadetails/{id}`, but is otherwise the same as [AntennaDetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AntennaDetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AntennaDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AntennaDetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/antennadetails`, but is otherwise the same as [AntennaDetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AntennaDetailListPage> = list(AntennaDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AntennaDetailListParams = AntennaDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AntennaDetailListParams = AntennaDetailListParams.none()): HttpResponseFor<AntennaDetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AntennaDetailListPage> =
            list(
              AntennaDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/antennadetails/{id}`, but is otherwise the same as [AntennaDetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AntennaDetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AntennaDetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AntennaDetailDeleteParams.none(),
              requestOptions,
            )
    }
}
