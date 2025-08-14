// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ir.IrCountParams
import com.unifieddatalibrary.api.models.ir.IrCreateParams
import com.unifieddatalibrary.api.models.ir.IrDeleteParams
import com.unifieddatalibrary.api.models.ir.IrGetParams
import com.unifieddatalibrary.api.models.ir.IrGetResponse
import com.unifieddatalibrary.api.models.ir.IrListPage
import com.unifieddatalibrary.api.models.ir.IrListParams
import com.unifieddatalibrary.api.models.ir.IrQueryhelpParams
import com.unifieddatalibrary.api.models.ir.IrQueryhelpResponse
import com.unifieddatalibrary.api.models.ir.IrTupleParams
import com.unifieddatalibrary.api.models.ir.IrTupleResponse
import com.unifieddatalibrary.api.models.ir.IrUpdateParams
import java.util.function.Consumer

interface IrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrService

    /**
     * Service operation to take a single IR as a POST body and ingest into the database. An IR is
     * an on-orbit infrared payload. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: IrCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: IrCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single IR. An IR is an on-orbit infrared payload. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun update(pathId: String, params: IrUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: IrUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: IrUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: IrUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): IrListPage = list(IrListParams.none())

    /** @see list */
    fun list(
        params: IrListParams = IrListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IrListPage

    /** @see list */
    fun list(params: IrListParams = IrListParams.none()): IrListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IrListPage = list(IrListParams.none(), requestOptions)

    /**
     * Service operation to delete a IR object specified by the passed ID path parameter. An IR is
     * an on-orbit infrared payload. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, IrDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IrDeleteParams = IrDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: IrDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: IrDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, IrDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(IrCountParams.none())

    /** @see count */
    fun count(
        params: IrCountParams = IrCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: IrCountParams = IrCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String = count(IrCountParams.none(), requestOptions)

    /**
     * Service operation to get a single IR record by its unique ID passed as a path parameter. An
     * IR is an on-orbit infrared payload.
     */
    fun get(id: String): IrGetResponse = get(id, IrGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: IrGetParams = IrGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IrGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: IrGetParams = IrGetParams.none()): IrGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: IrGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IrGetResponse

    /** @see get */
    fun get(params: IrGetParams): IrGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): IrGetResponse =
        get(id, IrGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): IrQueryhelpResponse = queryhelp(IrQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: IrQueryhelpParams = IrQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IrQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: IrQueryhelpParams = IrQueryhelpParams.none()): IrQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): IrQueryhelpResponse =
        queryhelp(IrQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: IrTupleParams): List<IrTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: IrTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IrTupleResponse>

    /** A view of [IrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ir`, but is otherwise the same as
         * [IrService.create].
         */
        @MustBeClosed
        fun create(params: IrCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/ir/{id}`, but is otherwise the same as
         * [IrService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: IrUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: IrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: IrUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: IrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/ir`, but is otherwise the same as
         * [IrService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<IrListPage> = list(IrListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IrListParams = IrListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IrListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: IrListParams = IrListParams.none()): HttpResponseFor<IrListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IrListPage> =
            list(IrListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/ir/{id}`, but is otherwise the same as
         * [IrService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, IrDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IrDeleteParams = IrDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IrDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: IrDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, IrDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ir/count`, but is otherwise the same as
         * [IrService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(IrCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: IrCountParams = IrCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: IrCountParams = IrCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(IrCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ir/{id}`, but is otherwise the same as
         * [IrService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<IrGetResponse> = get(id, IrGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: IrGetParams = IrGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IrGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: IrGetParams = IrGetParams.none(),
        ): HttpResponseFor<IrGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: IrGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IrGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: IrGetParams): HttpResponseFor<IrGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<IrGetResponse> =
            get(id, IrGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ir/queryhelp`, but is otherwise the same as
         * [IrService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<IrQueryhelpResponse> = queryhelp(IrQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: IrQueryhelpParams = IrQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IrQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: IrQueryhelpParams = IrQueryhelpParams.none()
        ): HttpResponseFor<IrQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<IrQueryhelpResponse> =
            queryhelp(IrQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ir/tuple`, but is otherwise the same as
         * [IrService.tuple].
         */
        @MustBeClosed
        fun tuple(params: IrTupleParams): HttpResponseFor<List<IrTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: IrTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IrTupleResponse>>
    }
}
