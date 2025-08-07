// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListPage
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailUpdateParams
import java.util.function.Consumer

interface OrganizationdetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationdetailService

    /**
     * Service operation to take a single OrganizationDetails as a POST body and ingest into the
     * database. OrganizationDetails represent details of organizations such as a corporation,
     * manufacturer, consortium, government, etc. An organization can have detail records from
     * several sources. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: OrganizationdetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrganizationdetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an OrganizationDetails object. OrganizationDetails represent
     * details of organizations such as a corporation, manufacturer, consortium, government, etc. An
     * organization can have detail records from several sources. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OrganizationdetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OrganizationdetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OrganizationdetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrganizationdetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: OrganizationdetailListParams): OrganizationdetailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: OrganizationdetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationdetailListPage

    /**
     * Service operation to delete an OrganizationDetails specified by the passed ID path parameter.
     * OrganizationDetails represent details of organizations such as a corporation, manufacturer,
     * consortium, government, etc. An organization can have detail records from several sources. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, OrganizationdetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrganizationdetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OrganizationdetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OrganizationdetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single OrganizationDetails by a source passed as a query
     * parameter. OrganizationDetails represent details of organizations such as a corporation,
     * manufacturer, consortium, government, etc. An organization can have detail records from
     * several sources.
     */
    fun findBySource(
        params: OrganizationdetailFindBySourceParams
    ): List<OrganizationdetailFindBySourceResponse> = findBySource(params, RequestOptions.none())

    /** @see findBySource */
    fun findBySource(
        params: OrganizationdetailFindBySourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationdetailFindBySourceResponse>

    /**
     * Service operation to get a single OrganizationDetails by its unique ID passed as a path
     * parameter. OrganizationDetails represent details of organizations such as a corporation,
     * manufacturer, consortium, government, etc. An organization can have detail records from
     * several sources.
     */
    fun get(id: String): OrganizationDetailsFull = get(id, OrganizationdetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationDetailsFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(),
    ): OrganizationDetailsFull = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrganizationdetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationDetailsFull

    /** @see get */
    fun get(params: OrganizationdetailGetParams): OrganizationDetailsFull =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OrganizationDetailsFull =
        get(id, OrganizationdetailGetParams.none(), requestOptions)

    /**
     * A view of [OrganizationdetailService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationdetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/organizationdetails`, but is otherwise the
         * same as [OrganizationdetailService.create].
         */
        @MustBeClosed
        fun create(params: OrganizationdetailCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrganizationdetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/organizationdetails/{id}`, but is otherwise the
         * same as [OrganizationdetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: OrganizationdetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: OrganizationdetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OrganizationdetailUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OrganizationdetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/organizationdetails`, but is otherwise the same
         * as [OrganizationdetailService.list].
         */
        @MustBeClosed
        fun list(
            params: OrganizationdetailListParams
        ): HttpResponseFor<OrganizationdetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrganizationdetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationdetailListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/organizationdetails/{id}`, but is otherwise
         * the same as [OrganizationdetailService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OrganizationdetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OrganizationdetailDeleteParams = OrganizationdetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OrganizationdetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrganizationdetailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OrganizationdetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organizationdetails/findBySource`, but is
         * otherwise the same as [OrganizationdetailService.findBySource].
         */
        @MustBeClosed
        fun findBySource(
            params: OrganizationdetailFindBySourceParams
        ): HttpResponseFor<List<OrganizationdetailFindBySourceResponse>> =
            findBySource(params, RequestOptions.none())

        /** @see findBySource */
        @MustBeClosed
        fun findBySource(
            params: OrganizationdetailFindBySourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationdetailFindBySourceResponse>>

        /**
         * Returns a raw HTTP response for `get /udl/organizationdetails/{id}`, but is otherwise the
         * same as [OrganizationdetailService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OrganizationDetailsFull> =
            get(id, OrganizationdetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationDetailsFull> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OrganizationdetailGetParams = OrganizationdetailGetParams.none(),
        ): HttpResponseFor<OrganizationDetailsFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OrganizationdetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationDetailsFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OrganizationdetailGetParams): HttpResponseFor<OrganizationDetailsFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationDetailsFull> =
            get(id, OrganizationdetailGetParams.none(), requestOptions)
    }
}
