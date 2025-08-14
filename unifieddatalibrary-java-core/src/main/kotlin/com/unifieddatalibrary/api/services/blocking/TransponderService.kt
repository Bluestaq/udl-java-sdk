// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.transponder.TransponderCountParams
import com.unifieddatalibrary.api.models.transponder.TransponderCreateParams
import com.unifieddatalibrary.api.models.transponder.TransponderDeleteParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetResponse
import com.unifieddatalibrary.api.models.transponder.TransponderListPage
import com.unifieddatalibrary.api.models.transponder.TransponderListParams
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpParams
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpResponse
import com.unifieddatalibrary.api.models.transponder.TransponderTupleParams
import com.unifieddatalibrary.api.models.transponder.TransponderTupleResponse
import com.unifieddatalibrary.api.models.transponder.TransponderUpdateParams
import java.util.function.Consumer

interface TransponderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransponderService

    /**
     * Service operation to take a single Transponder as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. A Comm payload may have multiple transponders and a transponder may have many
     * channels.
     */
    fun create(params: TransponderCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransponderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single Transponder. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance. A Comm payload may have
     * multiple transponders and a transponder may have many channels.
     */
    fun update(pathId: String, params: TransponderUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: TransponderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: TransponderUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransponderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): TransponderListPage = list(TransponderListParams.none())

    /** @see list */
    fun list(
        params: TransponderListParams = TransponderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransponderListPage

    /** @see list */
    fun list(params: TransponderListParams = TransponderListParams.none()): TransponderListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransponderListPage =
        list(TransponderListParams.none(), requestOptions)

    /**
     * Service operation to delete a Transponder object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. A Comm payload may have multiple transponders and a transponder may have many
     * channels.
     */
    fun delete(id: String) = delete(id, TransponderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TransponderDeleteParams = TransponderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: TransponderDeleteParams = TransponderDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransponderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: TransponderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransponderDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(TransponderCountParams.none())

    /** @see count */
    fun count(
        params: TransponderCountParams = TransponderCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: TransponderCountParams = TransponderCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(TransponderCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Transponder record by its unique ID passed as a path
     * parameter. A Comm payload may have multiple transponders and a transponder may have many
     * channels.
     */
    fun get(id: String): TransponderGetResponse = get(id, TransponderGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: TransponderGetParams = TransponderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransponderGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: TransponderGetParams = TransponderGetParams.none(),
    ): TransponderGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TransponderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransponderGetResponse

    /** @see get */
    fun get(params: TransponderGetParams): TransponderGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): TransponderGetResponse =
        get(id, TransponderGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): TransponderQueryhelpResponse = queryhelp(TransponderQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: TransponderQueryhelpParams = TransponderQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransponderQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: TransponderQueryhelpParams = TransponderQueryhelpParams.none()
    ): TransponderQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): TransponderQueryhelpResponse =
        queryhelp(TransponderQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: TransponderTupleParams): List<TransponderTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: TransponderTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransponderTupleResponse>

    /**
     * A view of [TransponderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransponderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/transponder`, but is otherwise the same as
         * [TransponderService.create].
         */
        @MustBeClosed
        fun create(params: TransponderCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransponderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/transponder/{id}`, but is otherwise the same as
         * [TransponderService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: TransponderUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: TransponderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TransponderUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransponderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/transponder`, but is otherwise the same as
         * [TransponderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransponderListPage> = list(TransponderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransponderListParams = TransponderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransponderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransponderListParams = TransponderListParams.none()
        ): HttpResponseFor<TransponderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransponderListPage> =
            list(TransponderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/transponder/{id}`, but is otherwise the same
         * as [TransponderService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, TransponderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransponderDeleteParams = TransponderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransponderDeleteParams = TransponderDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TransponderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TransponderDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransponderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/transponder/count`, but is otherwise the same
         * as [TransponderService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(TransponderCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: TransponderCountParams = TransponderCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: TransponderCountParams = TransponderCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(TransponderCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/transponder/{id}`, but is otherwise the same as
         * [TransponderService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<TransponderGetResponse> =
            get(id, TransponderGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: TransponderGetParams = TransponderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransponderGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: TransponderGetParams = TransponderGetParams.none(),
        ): HttpResponseFor<TransponderGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TransponderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransponderGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: TransponderGetParams): HttpResponseFor<TransponderGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransponderGetResponse> =
            get(id, TransponderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/transponder/queryhelp`, but is otherwise the
         * same as [TransponderService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<TransponderQueryhelpResponse> =
            queryhelp(TransponderQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TransponderQueryhelpParams = TransponderQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransponderQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TransponderQueryhelpParams = TransponderQueryhelpParams.none()
        ): HttpResponseFor<TransponderQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransponderQueryhelpResponse> =
            queryhelp(TransponderQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/transponder/tuple`, but is otherwise the same
         * as [TransponderService.tuple].
         */
        @MustBeClosed
        fun tuple(params: TransponderTupleParams): HttpResponseFor<List<TransponderTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: TransponderTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransponderTupleResponse>>
    }
}
