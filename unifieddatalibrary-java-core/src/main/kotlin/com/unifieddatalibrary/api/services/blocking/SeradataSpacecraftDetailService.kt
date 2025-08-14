// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCountParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCreateParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailDeleteParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListPage
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailUpdateParams
import java.util.function.Consumer

interface SeradataSpacecraftDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSpacecraftDetailService

    /**
     * Service operation to take a single SeradataSpacecraftDetails as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: SeradataSpacecraftDetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataSpacecraftDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an SeradataSpacecraftDetails. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeradataSpacecraftDetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataSpacecraftDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataSpacecraftDetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataSpacecraftDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SeradataSpacecraftDetailListPage = list(SeradataSpacecraftDetailListParams.none())

    /** @see list */
    fun list(
        params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSpacecraftDetailListPage

    /** @see list */
    fun list(
        params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none()
    ): SeradataSpacecraftDetailListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SeradataSpacecraftDetailListPage =
        list(SeradataSpacecraftDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataSpacecraftDetails specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, SeradataSpacecraftDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSpacecraftDetailDeleteParams = SeradataSpacecraftDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSpacecraftDetailDeleteParams = SeradataSpacecraftDetailDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataSpacecraftDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SeradataSpacecraftDetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SeradataSpacecraftDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SeradataSpacecraftDetailCountParams.none())

    /** @see count */
    fun count(
        params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SeradataSpacecraftDetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataSpacecraftDetails by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SeradataSpacecraftDetailGetResponse =
        get(id, SeradataSpacecraftDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSpacecraftDetailGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
    ): SeradataSpacecraftDetailGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataSpacecraftDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSpacecraftDetailGetResponse

    /** @see get */
    fun get(params: SeradataSpacecraftDetailGetParams): SeradataSpacecraftDetailGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeradataSpacecraftDetailGetResponse =
        get(id, SeradataSpacecraftDetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SeradataSpacecraftDetailQueryhelpResponse =
        queryhelp(SeradataSpacecraftDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSpacecraftDetailQueryhelpParams =
            SeradataSpacecraftDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSpacecraftDetailQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSpacecraftDetailQueryhelpParams =
            SeradataSpacecraftDetailQueryhelpParams.none()
    ): SeradataSpacecraftDetailQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeradataSpacecraftDetailQueryhelpResponse =
        queryhelp(SeradataSpacecraftDetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: SeradataSpacecraftDetailTupleParams
    ): List<SeradataSpacecraftDetailTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataSpacecraftDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SeradataSpacecraftDetailTupleResponse>

    /**
     * A view of [SeradataSpacecraftDetailService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeradataSpacecraftDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradataspacecraftdetails`, but is otherwise
         * the same as [SeradataSpacecraftDetailService.create].
         */
        @MustBeClosed
        fun create(params: SeradataSpacecraftDetailCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SeradataSpacecraftDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SeradataSpacecraftDetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SeradataSpacecraftDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SeradataSpacecraftDetailUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SeradataSpacecraftDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails`, but is otherwise
         * the same as [SeradataSpacecraftDetailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SeradataSpacecraftDetailListPage> =
            list(SeradataSpacecraftDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSpacecraftDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataSpacecraftDetailListParams = SeradataSpacecraftDetailListParams.none()
        ): HttpResponseFor<SeradataSpacecraftDetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeradataSpacecraftDetailListPage> =
            list(SeradataSpacecraftDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(id, SeradataSpacecraftDetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataSpacecraftDetailDeleteParams =
                SeradataSpacecraftDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataSpacecraftDetailDeleteParams =
                SeradataSpacecraftDetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SeradataSpacecraftDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeradataSpacecraftDetailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SeradataSpacecraftDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/count`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeradataSpacecraftDetailCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataSpacecraftDetailCountParams =
                SeradataSpacecraftDetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataSpacecraftDetailCountParams = SeradataSpacecraftDetailCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SeradataSpacecraftDetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/{id}`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeradataSpacecraftDetailGetResponse> =
            get(id, SeradataSpacecraftDetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSpacecraftDetailGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataSpacecraftDetailGetParams = SeradataSpacecraftDetailGetParams.none(),
        ): HttpResponseFor<SeradataSpacecraftDetailGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataSpacecraftDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSpacecraftDetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataSpacecraftDetailGetParams
        ): HttpResponseFor<SeradataSpacecraftDetailGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataSpacecraftDetailGetResponse> =
            get(id, SeradataSpacecraftDetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/queryhelp`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse> =
            queryhelp(SeradataSpacecraftDetailQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataSpacecraftDetailQueryhelpParams =
                SeradataSpacecraftDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataSpacecraftDetailQueryhelpParams =
                SeradataSpacecraftDetailQueryhelpParams.none()
        ): HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse> =
            queryhelp(SeradataSpacecraftDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataspacecraftdetails/tuple`, but is
         * otherwise the same as [SeradataSpacecraftDetailService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SeradataSpacecraftDetailTupleParams
        ): HttpResponseFor<List<SeradataSpacecraftDetailTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SeradataSpacecraftDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SeradataSpacecraftDetailTupleResponse>>
    }
}
