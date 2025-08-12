// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailCreateParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailDeleteParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListPage
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailService
import java.util.function.Consumer

interface LaunchSiteDetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteDetailService

    /** Service operation to take a single LaunchSiteDetails as a POST body and ingest into the database. A LaunchSiteDetails represents details compiled/collected on a launch site by a particular source. A launch site may have several details records. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: LaunchSiteDetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: LaunchSiteDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a LaunchSiteDetails. A LaunchSiteDetails represents details compiled/collected on a launch site by a particular source. A launch site may have several details records. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: LaunchSiteDetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: LaunchSiteDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: LaunchSiteDetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: LaunchSiteDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): LaunchSiteDetailListPage = list(LaunchSiteDetailListParams.none())

    /** @see list */
    fun list(params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LaunchSiteDetailListPage

    /** @see list */
    fun list(params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none()): LaunchSiteDetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): LaunchSiteDetailListPage =
        list(
          LaunchSiteDetailListParams.none(), requestOptions
        )

    /** Service operation to delete a LaunchSiteDetails specified by the passed ID path parameter. A LaunchSiteDetails represents details compiled/collected on a launch site by a particular source. A launch site may have several details records. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, LaunchSiteDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: LaunchSiteDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: LaunchSiteDetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          LaunchSiteDetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single LaunchSiteDetails by a source passed as a query parameter. A LaunchSiteDetails represents details compiled/collected on a launch site by a particular source. A launch site may have several details records. */
    fun findBySource(params: LaunchSiteDetailFindBySourceParams): List<LaunchSiteDetailFindBySourceResponse> =
        findBySource(
          params, RequestOptions.none()
        )

    /** @see findBySource */
    fun findBySource(params: LaunchSiteDetailFindBySourceParams, requestOptions: RequestOptions = RequestOptions.none()): List<LaunchSiteDetailFindBySourceResponse>

    /** Service operation to get a single LaunchSiteDetails by its unique ID passed as a path parameter. A LaunchSiteDetails represents details compiled/collected on a launch site by a particular source. A launch site may have several details records. */
    fun get(id: String): LaunchSiteDetailGetResponse =
        get(
          id, LaunchSiteDetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LaunchSiteDetailGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none()): LaunchSiteDetailGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: LaunchSiteDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): LaunchSiteDetailGetResponse

    /** @see get */
    fun get(params: LaunchSiteDetailGetParams): LaunchSiteDetailGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchSiteDetailGetResponse =
        get(
          id,
          LaunchSiteDetailGetParams.none(),
          requestOptions,
        )

    /** A view of [LaunchSiteDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteDetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/launchsitedetails`, but is otherwise the same as [LaunchSiteDetailService.create]. */
        @MustBeClosed
        fun create(params: LaunchSiteDetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: LaunchSiteDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/launchsitedetails/{id}`, but is otherwise the same as [LaunchSiteDetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: LaunchSiteDetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: LaunchSiteDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchSiteDetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchSiteDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/launchsitedetails`, but is otherwise the same as [LaunchSiteDetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<LaunchSiteDetailListPage> = list(LaunchSiteDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchSiteDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none()): HttpResponseFor<LaunchSiteDetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaunchSiteDetailListPage> =
            list(
              LaunchSiteDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/launchsitedetails/{id}`, but is otherwise the same as [LaunchSiteDetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, LaunchSiteDetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchSiteDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchSiteDetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              LaunchSiteDetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/launchsitedetails/findBySource`, but is otherwise the same as [LaunchSiteDetailService.findBySource]. */
        @MustBeClosed
        fun findBySource(params: LaunchSiteDetailFindBySourceParams): HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>> =
            findBySource(
              params, RequestOptions.none()
            )

        /** @see findBySource */
        @MustBeClosed
        fun findBySource(params: LaunchSiteDetailFindBySourceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>>

        /** Returns a raw HTTP response for `get /udl/launchsitedetails/{id}`, but is otherwise the same as [LaunchSiteDetailService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchSiteDetailGetResponse> =
            get(
              id, LaunchSiteDetailGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchSiteDetailGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none()): HttpResponseFor<LaunchSiteDetailGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchSiteDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchSiteDetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchSiteDetailGetParams): HttpResponseFor<LaunchSiteDetailGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<LaunchSiteDetailGetResponse> =
            get(
              id,
              LaunchSiteDetailGetParams.none(),
              requestOptions,
            )
    }
}
