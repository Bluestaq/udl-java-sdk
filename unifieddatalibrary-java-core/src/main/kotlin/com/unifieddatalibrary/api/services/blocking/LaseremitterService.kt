// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCountParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCreateParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterDeleteParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListPage
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterUpdateParams
import java.util.function.Consumer

interface LaseremitterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaseremitterService

    /**
     * Service operation to take a single LaserEmitter record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaseremitterCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaseremitterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single LaserEmitter record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaseremitterUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaseremitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaseremitterUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaseremitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LaseremitterListPage = list(LaseremitterListParams.none())

    /** @see list */
    fun list(
        params: LaseremitterListParams = LaseremitterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaseremitterListPage

    /** @see list */
    fun list(params: LaseremitterListParams = LaseremitterListParams.none()): LaseremitterListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LaseremitterListPage =
        list(LaseremitterListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaserEmitter record specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String) = delete(id, LaseremitterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: LaseremitterDeleteParams = LaseremitterDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaseremitterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LaseremitterDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LaseremitterDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(LaseremitterCountParams.none())

    /** @see count */
    fun count(
        params: LaseremitterCountParams = LaseremitterCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: LaseremitterCountParams = LaseremitterCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(LaseremitterCountParams.none(), requestOptions)

    /**
     * Service operation to get a single LaserEmitter record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): LaseremitterGetResponse = get(id, LaseremitterGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaseremitterGetParams = LaseremitterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaseremitterGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaseremitterGetParams = LaseremitterGetParams.none(),
    ): LaseremitterGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaseremitterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaseremitterGetResponse

    /** @see get */
    fun get(params: LaseremitterGetParams): LaseremitterGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaseremitterGetResponse =
        get(id, LaseremitterGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LaseremitterQueryhelpResponse = queryhelp(LaseremitterQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaseremitterQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none()
    ): LaseremitterQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LaseremitterQueryhelpResponse =
        queryhelp(LaseremitterQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaseremitterTupleParams): List<LaseremitterTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaseremitterTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LaseremitterTupleResponse>

    /**
     * A view of [LaseremitterService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaseremitterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/laseremitter`, but is otherwise the same as
         * [LaseremitterService.create].
         */
        @MustBeClosed
        fun create(params: LaseremitterCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LaseremitterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/laseremitter/{id}`, but is otherwise the same
         * as [LaseremitterService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LaseremitterUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LaseremitterUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter`, but is otherwise the same as
         * [LaseremitterService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LaseremitterListPage> = list(LaseremitterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaseremitterListParams = LaseremitterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaseremitterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaseremitterListParams = LaseremitterListParams.none()
        ): HttpResponseFor<LaseremitterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaseremitterListPage> =
            list(LaseremitterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/laseremitter/{id}`, but is otherwise the
         * same as [LaseremitterService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LaseremitterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LaseremitterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaseremitterDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LaseremitterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/count`, but is otherwise the same
         * as [LaseremitterService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(LaseremitterCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaseremitterCountParams = LaseremitterCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaseremitterCountParams = LaseremitterCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(LaseremitterCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/{id}`, but is otherwise the same
         * as [LaseremitterService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaseremitterGetResponse> =
            get(id, LaseremitterGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaseremitterGetParams = LaseremitterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaseremitterGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaseremitterGetParams = LaseremitterGetParams.none(),
        ): HttpResponseFor<LaseremitterGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaseremitterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaseremitterGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaseremitterGetParams): HttpResponseFor<LaseremitterGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaseremitterGetResponse> =
            get(id, LaseremitterGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/queryhelp`, but is otherwise the
         * same as [LaseremitterService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LaseremitterQueryhelpResponse> =
            queryhelp(LaseremitterQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaseremitterQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none()
        ): HttpResponseFor<LaseremitterQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<LaseremitterQueryhelpResponse> =
            queryhelp(LaseremitterQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/tuple`, but is otherwise the same
         * as [LaseremitterService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: LaseremitterTupleParams
        ): HttpResponseFor<List<LaseremitterTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LaseremitterTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LaseremitterTupleResponse>>
    }
}
