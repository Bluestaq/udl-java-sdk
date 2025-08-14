// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCountParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCreateParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListPage
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterUpdateParams
import java.util.function.Consumer

interface RfEmitterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterService

    /**
     * Service operation to take a single RFEmitter as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: RfEmitterCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RfEmitterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an RFEmitter. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: RfEmitterUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: RfEmitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: RfEmitterUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RfEmitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): RfEmitterListPage = list(RfEmitterListParams.none())

    /** @see list */
    fun list(
        params: RfEmitterListParams = RfEmitterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RfEmitterListPage

    /** @see list */
    fun list(params: RfEmitterListParams = RfEmitterListParams.none()): RfEmitterListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RfEmitterListPage =
        list(RfEmitterListParams.none(), requestOptions)

    /**
     * Service operation to delete an RFEmitter specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, RfEmitterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: RfEmitterDeleteParams = RfEmitterDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RfEmitterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RfEmitterDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RfEmitterDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(RfEmitterCountParams.none())

    /** @see count */
    fun count(
        params: RfEmitterCountParams = RfEmitterCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: RfEmitterCountParams = RfEmitterCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(RfEmitterCountParams.none(), requestOptions)

    /** Service operation to get a single RFEmitter by its unique ID passed as a path parameter. */
    fun get(id: String): RfEmitterGetResponse = get(id, RfEmitterGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterGetParams = RfEmitterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RfEmitterGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterGetParams = RfEmitterGetParams.none(),
    ): RfEmitterGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RfEmitterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RfEmitterGetResponse

    /** @see get */
    fun get(params: RfEmitterGetParams): RfEmitterGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RfEmitterGetResponse =
        get(id, RfEmitterGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): RfEmitterQueryhelpResponse = queryhelp(RfEmitterQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RfEmitterQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none()
    ): RfEmitterQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RfEmitterQueryhelpResponse =
        queryhelp(RfEmitterQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: RfEmitterTupleParams): List<RfEmitterTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RfEmitterTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RfEmitterTupleResponse>

    /** A view of [RfEmitterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitter`, but is otherwise the same as
         * [RfEmitterService.create].
         */
        @MustBeClosed
        fun create(params: RfEmitterCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RfEmitterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/rfemitter/{id}`, but is otherwise the same as
         * [RfEmitterService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: RfEmitterUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: RfEmitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RfEmitterUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RfEmitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter`, but is otherwise the same as
         * [RfEmitterService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RfEmitterListPage> = list(RfEmitterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RfEmitterListParams = RfEmitterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RfEmitterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RfEmitterListParams = RfEmitterListParams.none()
        ): HttpResponseFor<RfEmitterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RfEmitterListPage> =
            list(RfEmitterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitter/{id}`, but is otherwise the same
         * as [RfEmitterService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, RfEmitterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RfEmitterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfEmitterDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RfEmitterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/count`, but is otherwise the same as
         * [RfEmitterService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(RfEmitterCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: RfEmitterCountParams = RfEmitterCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: RfEmitterCountParams = RfEmitterCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(RfEmitterCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/{id}`, but is otherwise the same as
         * [RfEmitterService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RfEmitterGetResponse> =
            get(id, RfEmitterGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: RfEmitterGetParams = RfEmitterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RfEmitterGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: RfEmitterGetParams = RfEmitterGetParams.none(),
        ): HttpResponseFor<RfEmitterGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RfEmitterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RfEmitterGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RfEmitterGetParams): HttpResponseFor<RfEmitterGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RfEmitterGetResponse> =
            get(id, RfEmitterGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/queryhelp`, but is otherwise the same
         * as [RfEmitterService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RfEmitterQueryhelpResponse> =
            queryhelp(RfEmitterQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RfEmitterQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none()
        ): HttpResponseFor<RfEmitterQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RfEmitterQueryhelpResponse> =
            queryhelp(RfEmitterQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/tuple`, but is otherwise the same as
         * [RfEmitterService.tuple].
         */
        @MustBeClosed
        fun tuple(params: RfEmitterTupleParams): HttpResponseFor<List<RfEmitterTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: RfEmitterTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RfEmitterTupleResponse>>
    }
}
