// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.rfemitter

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCountParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCreateParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListPage
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailUpdateParams
import java.util.function.Consumer

interface DetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailService

    /**
     * Service operation to take a single RFEmitterDetails as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: DetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single RFEmitterDetails record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: DetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: DetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): DetailListPage = list(DetailListParams.none())

    /** @see list */
    fun list(
        params: DetailListParams = DetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailListPage

    /** @see list */
    fun list(params: DetailListParams = DetailListParams.none()): DetailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DetailListPage =
        list(DetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a single RFEmitterDetails record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, DetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DetailDeleteParams = DetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: DetailDeleteParams = DetailDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, DetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(DetailCountParams.none())

    /** @see count */
    fun count(
        params: DetailCountParams = DetailCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: DetailCountParams = DetailCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(DetailCountParams.none(), requestOptions)

    /**
     * Service operation to get a single RFEmitterDetails record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): DetailGetResponse = get(id, DetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: DetailGetParams = DetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: DetailGetParams = DetailGetParams.none()): DetailGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailGetResponse

    /** @see get */
    fun get(params: DetailGetParams): DetailGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): DetailGetResponse =
        get(id, DetailGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): DetailQueryhelpResponse = queryhelp(DetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DetailQueryhelpParams = DetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: DetailQueryhelpParams = DetailQueryhelpParams.none()
    ): DetailQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): DetailQueryhelpResponse =
        queryhelp(DetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DetailTupleParams): List<DetailTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DetailTupleResponse>

    /** A view of [DetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitterdetails`, but is otherwise the same
         * as [DetailService.create].
         */
        @MustBeClosed
        fun create(params: DetailCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: DetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: DetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DetailUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails`, but is otherwise the same as
         * [DetailService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DetailListPage> = list(DetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailListParams = DetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailListParams = DetailListParams.none()
        ): HttpResponseFor<DetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DetailListPage> =
            list(DetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, DetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DetailDeleteParams = DetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DetailDeleteParams = DetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DetailDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, DetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/count`, but is otherwise the
         * same as [DetailService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(DetailCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: DetailCountParams = DetailCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: DetailCountParams = DetailCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(DetailCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/{id}`, but is otherwise the
         * same as [DetailService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<DetailGetResponse> = get(id, DetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: DetailGetParams = DetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: DetailGetParams = DetailGetParams.none(),
        ): HttpResponseFor<DetailGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: DetailGetParams): HttpResponseFor<DetailGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<DetailGetResponse> =
            get(id, DetailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/queryhelp`, but is otherwise
         * the same as [DetailService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<DetailQueryhelpResponse> =
            queryhelp(DetailQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: DetailQueryhelpParams = DetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: DetailQueryhelpParams = DetailQueryhelpParams.none()
        ): HttpResponseFor<DetailQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<DetailQueryhelpResponse> =
            queryhelp(DetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterdetails/tuple`, but is otherwise the
         * same as [DetailService.tuple].
         */
        @MustBeClosed
        fun tuple(params: DetailTupleParams): HttpResponseFor<List<DetailTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: DetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DetailTupleResponse>>
    }
}
