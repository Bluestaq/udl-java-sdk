// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListPageAsync
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchSiteDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteDetailServiceAsync

    /**
     * Service operation to take a single LaunchSiteDetails as a POST body and ingest into the
     * database. A LaunchSiteDetails represents details compiled/collected on a launch site by a
     * particular source. A launch site may have several details records. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: LaunchSiteDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchSiteDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a LaunchSiteDetails. A LaunchSiteDetails represents details
     * compiled/collected on a launch site by a particular source. A launch site may have several
     * details records. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchSiteDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchSiteDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchSiteDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchSiteDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaunchSiteDetailListPageAsync> =
        list(LaunchSiteDetailListParams.none())

    /** @see list */
    fun list(
        params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteDetailListPageAsync>

    /** @see list */
    fun list(
        params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none()
    ): CompletableFuture<LaunchSiteDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaunchSiteDetailListPageAsync> =
        list(LaunchSiteDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaunchSiteDetails specified by the passed ID path parameter. A
     * LaunchSiteDetails represents details compiled/collected on a launch site by a particular
     * source. A launch site may have several details records. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, LaunchSiteDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchSiteDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaunchSiteDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaunchSiteDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single LaunchSiteDetails by a source passed as a query parameter.
     * A LaunchSiteDetails represents details compiled/collected on a launch site by a particular
     * source. A launch site may have several details records.
     */
    fun findBySource(
        params: LaunchSiteDetailFindBySourceParams
    ): CompletableFuture<List<LaunchSiteDetailFindBySourceResponse>> =
        findBySource(params, RequestOptions.none())

    /** @see findBySource */
    fun findBySource(
        params: LaunchSiteDetailFindBySourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaunchSiteDetailFindBySourceResponse>>

    /**
     * Service operation to get a single LaunchSiteDetails by its unique ID passed as a path
     * parameter. A LaunchSiteDetails represents details compiled/collected on a launch site by a
     * particular source. A launch site may have several details records.
     */
    fun get(id: String): CompletableFuture<LaunchSiteDetailGetResponse> =
        get(id, LaunchSiteDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteDetailGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(),
    ): CompletableFuture<LaunchSiteDetailGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchSiteDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteDetailGetResponse>

    /** @see get */
    fun get(params: LaunchSiteDetailGetParams): CompletableFuture<LaunchSiteDetailGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchSiteDetailGetResponse> =
        get(id, LaunchSiteDetailGetParams.none(), requestOptions)

    /**
     * A view of [LaunchSiteDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaunchSiteDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchsitedetails`, but is otherwise the same
         * as [LaunchSiteDetailServiceAsync.create].
         */
        fun create(params: LaunchSiteDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchSiteDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/launchsitedetails/{id}`, but is otherwise the
         * same as [LaunchSiteDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaunchSiteDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaunchSiteDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaunchSiteDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaunchSiteDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchsitedetails`, but is otherwise the same
         * as [LaunchSiteDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaunchSiteDetailListPageAsync>> =
            list(LaunchSiteDetailListParams.none())

        /** @see list */
        fun list(
            params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailListPageAsync>>

        /** @see list */
        fun list(
            params: LaunchSiteDetailListParams = LaunchSiteDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailListPageAsync>> =
            list(LaunchSiteDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchsitedetails/{id}`, but is otherwise
         * the same as [LaunchSiteDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaunchSiteDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchSiteDetailDeleteParams = LaunchSiteDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaunchSiteDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaunchSiteDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaunchSiteDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsitedetails/findBySource`, but is
         * otherwise the same as [LaunchSiteDetailServiceAsync.findBySource].
         */
        fun findBySource(
            params: LaunchSiteDetailFindBySourceParams
        ): CompletableFuture<HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>>> =
            findBySource(params, RequestOptions.none())

        /** @see findBySource */
        fun findBySource(
            params: LaunchSiteDetailFindBySourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>>>

        /**
         * Returns a raw HTTP response for `get /udl/launchsitedetails/{id}`, but is otherwise the
         * same as [LaunchSiteDetailServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> =
            get(id, LaunchSiteDetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchSiteDetailGetParams = LaunchSiteDetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchSiteDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>>

        /** @see get */
        fun get(
            params: LaunchSiteDetailGetParams
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> =
            get(id, LaunchSiteDetailGetParams.none(), requestOptions)
    }
}
