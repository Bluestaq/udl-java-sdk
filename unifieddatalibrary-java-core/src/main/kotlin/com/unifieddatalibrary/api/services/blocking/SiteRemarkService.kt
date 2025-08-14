// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListPage
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleResponse
import java.util.function.Consumer

interface SiteRemarkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteRemarkService

    /**
     * Service operation to take a single remark record as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: SiteRemarkCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiteRemarkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SiteRemarkListPage = list(SiteRemarkListParams.none())

    /** @see list */
    fun list(
        params: SiteRemarkListParams = SiteRemarkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteRemarkListPage

    /** @see list */
    fun list(params: SiteRemarkListParams = SiteRemarkListParams.none()): SiteRemarkListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SiteRemarkListPage =
        list(SiteRemarkListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SiteRemarkCountParams.none())

    /** @see count */
    fun count(
        params: SiteRemarkCountParams = SiteRemarkCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SiteRemarkCountParams = SiteRemarkCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SiteRemarkCountParams.none(), requestOptions)

    /**
     * Service operation to get a single remark record by its unique ID passed as a path parameter.
     */
    fun get(id: String): SiteRemarkGetResponse = get(id, SiteRemarkGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteRemarkGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
    ): SiteRemarkGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SiteRemarkGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteRemarkGetResponse

    /** @see get */
    fun get(params: SiteRemarkGetParams): SiteRemarkGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SiteRemarkGetResponse =
        get(id, SiteRemarkGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SiteRemarkQueryhelpResponse = queryhelp(SiteRemarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteRemarkQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none()
    ): SiteRemarkQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SiteRemarkQueryhelpResponse =
        queryhelp(SiteRemarkQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SiteRemarkTupleParams): List<SiteRemarkTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SiteRemarkTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SiteRemarkTupleResponse>

    /** A view of [SiteRemarkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteRemarkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/siteremark`, but is otherwise the same as
         * [SiteRemarkService.create].
         */
        @MustBeClosed
        fun create(params: SiteRemarkCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SiteRemarkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/siteremark`, but is otherwise the same as
         * [SiteRemarkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SiteRemarkListPage> = list(SiteRemarkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SiteRemarkListParams = SiteRemarkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteRemarkListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SiteRemarkListParams = SiteRemarkListParams.none()
        ): HttpResponseFor<SiteRemarkListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SiteRemarkListPage> =
            list(SiteRemarkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/count`, but is otherwise the same as
         * [SiteRemarkService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(SiteRemarkCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SiteRemarkCountParams = SiteRemarkCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SiteRemarkCountParams = SiteRemarkCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SiteRemarkCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/{id}`, but is otherwise the same as
         * [SiteRemarkService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SiteRemarkGetResponse> =
            get(id, SiteRemarkGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteRemarkGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
        ): HttpResponseFor<SiteRemarkGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SiteRemarkGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteRemarkGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SiteRemarkGetParams): HttpResponseFor<SiteRemarkGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteRemarkGetResponse> =
            get(id, SiteRemarkGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/queryhelp`, but is otherwise the
         * same as [SiteRemarkService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SiteRemarkQueryhelpResponse> =
            queryhelp(SiteRemarkQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteRemarkQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none()
        ): HttpResponseFor<SiteRemarkQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SiteRemarkQueryhelpResponse> =
            queryhelp(SiteRemarkQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/tuple`, but is otherwise the same as
         * [SiteRemarkService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SiteRemarkTupleParams): HttpResponseFor<List<SiteRemarkTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SiteRemarkTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SiteRemarkTupleResponse>>
    }
}
