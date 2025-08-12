// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EngineDetailsFull
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailCreateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailDeleteParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListPage
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailRetrieveParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.EngineDetailService
import java.util.function.Consumer

interface EngineDetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineDetailService

    /** Service operation to take a single EngineDetails as a POST body and ingest into the database. EngineDetails are launch vehicle engine details and performance characteristics/limits compiled by a particular source. A launch vehicle engine may have several details records from multiple sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EngineDetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EngineDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EngineDetails record by its unique ID passed as a path parameter. EngineDetails are launch vehicle engine details and performance characteristics/limits compiled by a particular source. A launch vehicle engine may have several details records from multiple sources. */
    fun retrieve(id: String): EngineDetailsFull =
        retrieve(
          id, EngineDetailRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EngineDetailsFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none()): EngineDetailsFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EngineDetailRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EngineDetailsFull

    /** @see retrieve */
    fun retrieve(params: EngineDetailRetrieveParams): EngineDetailsFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EngineDetailsFull =
        retrieve(
          id,
          EngineDetailRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single EngineDetails. EngineDetails are launch vehicle engine details and performance characteristics/limits compiled by a particular source. A launch vehicle engine may have several details records from multiple sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: EngineDetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: EngineDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: EngineDetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: EngineDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): EngineDetailListPage = list(EngineDetailListParams.none())

    /** @see list */
    fun list(params: EngineDetailListParams = EngineDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EngineDetailListPage

    /** @see list */
    fun list(params: EngineDetailListParams = EngineDetailListParams.none()): EngineDetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): EngineDetailListPage =
        list(
          EngineDetailListParams.none(), requestOptions
        )

    /** Service operation to delete a EngineDetails object specified by the passed ID path parameter. EngineDetails are launch vehicle engine details and performance characteristics/limits compiled by a particular source. A launch vehicle engine may have several details records from multiple sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, EngineDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: EngineDetailDeleteParams = EngineDetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: EngineDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EngineDetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          EngineDetailDeleteParams.none(),
          requestOptions,
        )

    /** A view of [EngineDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineDetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/enginedetails`, but is otherwise the same as [EngineDetailService.create]. */
        @MustBeClosed
        fun create(params: EngineDetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EngineDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/enginedetails/{id}`, but is otherwise the same as [EngineDetailService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EngineDetailsFull> =
            retrieve(
              id, EngineDetailRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EngineDetailsFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none()): HttpResponseFor<EngineDetailsFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EngineDetailRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EngineDetailsFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EngineDetailRetrieveParams): HttpResponseFor<EngineDetailsFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EngineDetailsFull> =
            retrieve(
              id,
              EngineDetailRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/enginedetails/{id}`, but is otherwise the same as [EngineDetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: EngineDetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: EngineDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: EngineDetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: EngineDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/enginedetails`, but is otherwise the same as [EngineDetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<EngineDetailListPage> = list(EngineDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: EngineDetailListParams = EngineDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EngineDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EngineDetailListParams = EngineDetailListParams.none()): HttpResponseFor<EngineDetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EngineDetailListPage> =
            list(
              EngineDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/enginedetails/{id}`, but is otherwise the same as [EngineDetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, EngineDetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: EngineDetailDeleteParams = EngineDetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: EngineDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EngineDetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              EngineDetailDeleteParams.none(),
              requestOptions,
            )
    }
}
