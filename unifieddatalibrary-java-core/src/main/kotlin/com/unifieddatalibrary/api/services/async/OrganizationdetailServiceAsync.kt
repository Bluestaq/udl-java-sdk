// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OrganizationDetailsFull
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailCreateParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailDeleteParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailFindBySourceParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailFindBySourceResponse
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailGetParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListPageAsync
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailUpdateParams
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrganizationdetailServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationdetailServiceAsync

    /** Service operation to take a single OrganizationDetails as a POST body and ingest into the database. OrganizationDetails represent details of organizations such as a corporation, manufacturer, consortium, government, etc. An organization can have detail records from several sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OrganizationdetailCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OrganizationdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update an OrganizationDetails object. OrganizationDetails represent details of organizations such as a corporation, manufacturer, consortium, government, etc. An organization can have detail records from several sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OrganizationdetailUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OrganizationdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OrganizationdetailUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OrganizationdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: OrganizationdetailListParams): CompletableFuture<OrganizationdetailListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: OrganizationdetailListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OrganizationdetailListPageAsync>

    /** Service operation to delete an OrganizationDetails specified by the passed ID path parameter. OrganizationDetails represent details of organizations such as a corporation, manufacturer, consortium, government, etc. An organization can have detail records from several sources. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OrganizationdetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OrganizationdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OrganizationdetailDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OrganizationdetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OrganizationDetails by a source passed as a query parameter. OrganizationDetails represent details of organizations such as a corporation, manufacturer, consortium, government, etc. An organization can have detail records from several sources. */
    fun findBySource(params: OrganizationdetailFindBySourceParams): CompletableFuture<List<OrganizationdetailFindBySourceResponse>> =
        findBySource(
          params, RequestOptions.none()
        )

    /** @see findBySource */
    fun findBySource(params: OrganizationdetailFindBySourceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OrganizationdetailFindBySourceResponse>>

    /** Service operation to get a single OrganizationDetails by its unique ID passed as a path parameter. OrganizationDetails represent details of organizations such as a corporation, manufacturer, consortium, government, etc. An organization can have detail records from several sources. */
    fun get(id: String): CompletableFuture<OrganizationDetailsFull> =
        get(
          id, OrganizationdetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OrganizationDetailsFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OrganizationdetailGetParams = OrganizationdetailGetParams.none()): CompletableFuture<OrganizationDetailsFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OrganizationdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OrganizationDetailsFull>

    /** @see get */
    fun get(params: OrganizationdetailGetParams): CompletableFuture<OrganizationDetailsFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OrganizationDetailsFull> =
        get(
          id,
          OrganizationdetailGetParams.none(),
          requestOptions,
        )

    /** A view of [OrganizationdetailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationdetailServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/organizationdetails`, but is otherwise the same as [OrganizationdetailServiceAsync.create]. */
        fun create(params: OrganizationdetailCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OrganizationdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/organizationdetails/{id}`, but is otherwise the same as [OrganizationdetailServiceAsync.update]. */
        fun update(pathId: String, params: OrganizationdetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OrganizationdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OrganizationdetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OrganizationdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/organizationdetails`, but is otherwise the same as [OrganizationdetailServiceAsync.list]. */
        fun list(params: OrganizationdetailListParams): CompletableFuture<HttpResponseFor<OrganizationdetailListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: OrganizationdetailListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OrganizationdetailListPageAsync>>

        /** Returns a raw HTTP response for `delete /udl/organizationdetails/{id}`, but is otherwise the same as [OrganizationdetailServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OrganizationdetailDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OrganizationdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OrganizationdetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OrganizationdetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/organizationdetails/findBySource`, but is otherwise the same as [OrganizationdetailServiceAsync.findBySource]. */
        fun findBySource(params: OrganizationdetailFindBySourceParams): CompletableFuture<HttpResponseFor<List<OrganizationdetailFindBySourceResponse>>> =
            findBySource(
              params, RequestOptions.none()
            )

        /** @see findBySource */
        fun findBySource(params: OrganizationdetailFindBySourceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OrganizationdetailFindBySourceResponse>>>

        /** Returns a raw HTTP response for `get /udl/organizationdetails/{id}`, but is otherwise the same as [OrganizationdetailServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>> =
            get(
              id, OrganizationdetailGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OrganizationdetailGetParams = OrganizationdetailGetParams.none()): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OrganizationdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>>

        /** @see get */
        fun get(params: OrganizationdetailGetParams): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrganizationDetailsFull>> =
            get(
              id,
              OrganizationdetailGetParams.none(),
              requestOptions,
            )
    }
}
