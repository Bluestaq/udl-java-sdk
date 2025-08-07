// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCountParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCreateParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailDeleteParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListPage
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailUpdateParams
import java.util.function.Consumer

interface SeraDataCommDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataCommDetailService

    /**
     * Service operation to take a single SeradataCommDetails as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeraDataCommDetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeraDataCommDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an SeradataCommDetails. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeraDataCommDetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeraDataCommDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeraDataCommDetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeraDataCommDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SeraDataCommDetailListPage = list(SeraDataCommDetailListParams.none())

    /** @see list */
    fun list(
        params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataCommDetailListPage

    /** @see list */
    fun list(
        params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none()
    ): SeraDataCommDetailListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SeraDataCommDetailListPage =
        list(SeraDataCommDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataCommDetails specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String) = delete(id, SeraDataCommDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeraDataCommDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SeraDataCommDetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SeraDataCommDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SeraDataCommDetailCountParams.none())

    /** @see count */
    fun count(
        params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SeraDataCommDetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataCommDetails by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SeraDataCommDetailGetResponse = get(id, SeraDataCommDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataCommDetailGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
    ): SeraDataCommDetailGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeraDataCommDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataCommDetailGetResponse

    /** @see get */
    fun get(params: SeraDataCommDetailGetParams): SeraDataCommDetailGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeraDataCommDetailGetResponse =
        get(id, SeraDataCommDetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SeraDataCommDetailQueryhelpResponse =
        queryhelp(SeraDataCommDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataCommDetailQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none()
    ): SeraDataCommDetailQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeraDataCommDetailQueryhelpResponse =
        queryhelp(SeraDataCommDetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SeraDataCommDetailTupleParams): List<SeraDataCommDetailTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeraDataCommDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SeraDataCommDetailTupleResponse>

    /**
     * A view of [SeraDataCommDetailService] that provides access to raw HTTP responses for each
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
        ): SeraDataCommDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradatacommdetails`, but is otherwise the
         * same as [SeraDataCommDetailService.create].
         */
        @MustBeClosed
        fun create(params: SeraDataCommDetailCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SeraDataCommDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/seradatacommdetails/{id}`, but is otherwise the
         * same as [SeraDataCommDetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SeraDataCommDetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SeraDataCommDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SeraDataCommDetailUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SeraDataCommDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails`, but is otherwise the same
         * as [SeraDataCommDetailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SeraDataCommDetailListPage> =
            list(SeraDataCommDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataCommDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeraDataCommDetailListParams = SeraDataCommDetailListParams.none()
        ): HttpResponseFor<SeraDataCommDetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeraDataCommDetailListPage> =
            list(SeraDataCommDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradatacommdetails/{id}`, but is otherwise
         * the same as [SeraDataCommDetailService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SeraDataCommDetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeraDataCommDetailDeleteParams = SeraDataCommDetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SeraDataCommDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeraDataCommDetailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SeraDataCommDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/count`, but is otherwise
         * the same as [SeraDataCommDetailService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeraDataCommDetailCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeraDataCommDetailCountParams = SeraDataCommDetailCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SeraDataCommDetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/{id}`, but is otherwise the
         * same as [SeraDataCommDetailService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeraDataCommDetailGetResponse> =
            get(id, SeraDataCommDetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataCommDetailGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeraDataCommDetailGetParams = SeraDataCommDetailGetParams.none(),
        ): HttpResponseFor<SeraDataCommDetailGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeraDataCommDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataCommDetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeraDataCommDetailGetParams
        ): HttpResponseFor<SeraDataCommDetailGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeraDataCommDetailGetResponse> =
            get(id, SeraDataCommDetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/queryhelp`, but is
         * otherwise the same as [SeraDataCommDetailService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeraDataCommDetailQueryhelpResponse> =
            queryhelp(SeraDataCommDetailQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataCommDetailQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeraDataCommDetailQueryhelpParams = SeraDataCommDetailQueryhelpParams.none()
        ): HttpResponseFor<SeraDataCommDetailQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeraDataCommDetailQueryhelpResponse> =
            queryhelp(SeraDataCommDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatacommdetails/tuple`, but is otherwise
         * the same as [SeraDataCommDetailService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SeraDataCommDetailTupleParams
        ): HttpResponseFor<List<SeraDataCommDetailTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SeraDataCommDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SeraDataCommDetailTupleResponse>>
    }
}
