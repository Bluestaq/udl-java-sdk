// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkstatusDeleteParams
import com.unifieddatalibrary.api.models.linkstatus.LinkstatusUpdateParams
import java.util.function.Consumer

interface LinkstatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkstatusService

    /**
     * Service operation to update a single LinkStatus. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LinkstatusUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LinkstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LinkstatusUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LinkstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to delete a LinkStatus object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, LinkstatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LinkstatusDeleteParams = LinkstatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: LinkstatusDeleteParams = LinkstatusDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LinkstatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LinkstatusDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LinkstatusDeleteParams.none(), requestOptions)

    /** A view of [LinkstatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkstatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /udl/linkstatus/{id}`, but is otherwise the same as
         * [LinkstatusService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LinkstatusUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LinkstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LinkstatusUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LinkstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /udl/linkstatus/{id}`, but is otherwise the same
         * as [LinkstatusService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LinkstatusDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LinkstatusDeleteParams = LinkstatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LinkstatusDeleteParams = LinkstatusDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LinkstatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LinkstatusDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LinkstatusDeleteParams.none(), requestOptions)
    }
}
