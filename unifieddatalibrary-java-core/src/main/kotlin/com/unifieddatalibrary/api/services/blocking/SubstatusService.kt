// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SubStatusFull
import com.unifieddatalibrary.api.models.SubStatusIngest
import com.unifieddatalibrary.api.models.substatus.SubstatusCountParams
import com.unifieddatalibrary.api.models.substatus.SubstatusCreateParams
import com.unifieddatalibrary.api.models.substatus.SubstatusDeleteParams
import com.unifieddatalibrary.api.models.substatus.SubstatusGetParams
import com.unifieddatalibrary.api.models.substatus.SubstatusListPage
import com.unifieddatalibrary.api.models.substatus.SubstatusListParams
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpParams
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.substatus.SubstatusTupleParams
import com.unifieddatalibrary.api.models.substatus.SubstatusUpdateParams
import java.util.function.Consumer

interface SubstatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubstatusService

    /**
     * Service operation to take a single Sub Status record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SubstatusCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubstatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(
        subStatusIngest: SubStatusIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        create(
            SubstatusCreateParams.builder().subStatusIngest(subStatusIngest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(subStatusIngest: SubStatusIngest) = create(subStatusIngest, RequestOptions.none())

    /**
     * Service operation to update a single Sub Status record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SubstatusUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SubstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SubstatusUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SubstatusListPage = list(SubstatusListParams.none())

    /** @see list */
    fun list(
        params: SubstatusListParams = SubstatusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubstatusListPage

    /** @see list */
    fun list(params: SubstatusListParams = SubstatusListParams.none()): SubstatusListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubstatusListPage =
        list(SubstatusListParams.none(), requestOptions)

    /**
     * Service operation to delete a Sub Status record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, SubstatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SubstatusDeleteParams = SubstatusDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubstatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SubstatusDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SubstatusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SubstatusCountParams.none())

    /** @see count */
    fun count(
        params: SubstatusCountParams = SubstatusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SubstatusCountParams = SubstatusCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SubstatusCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Sub Status record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SubStatusFull = get(id, SubstatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SubstatusGetParams = SubstatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubStatusFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: SubstatusGetParams = SubstatusGetParams.none()): SubStatusFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubstatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubStatusFull

    /** @see get */
    fun get(params: SubstatusGetParams): SubStatusFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SubStatusFull =
        get(id, SubstatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SubstatusQueryhelpResponse = queryhelp(SubstatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubstatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none()
    ): SubstatusQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SubstatusQueryhelpResponse =
        queryhelp(SubstatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SubstatusTupleParams): List<SubStatusFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SubstatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SubStatusFull>

    /** A view of [SubstatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubstatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/substatus`, but is otherwise the same as
         * [SubstatusService.create].
         */
        @MustBeClosed
        fun create(params: SubstatusCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubstatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            subStatusIngest: SubStatusIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                SubstatusCreateParams.builder().subStatusIngest(subStatusIngest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(subStatusIngest: SubStatusIngest): HttpResponse =
            create(subStatusIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /udl/substatus/{id}`, but is otherwise the same as
         * [SubstatusService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SubstatusUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SubstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SubstatusUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/substatus`, but is otherwise the same as
         * [SubstatusService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubstatusListPage> = list(SubstatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubstatusListParams = SubstatusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubstatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubstatusListParams = SubstatusListParams.none()
        ): HttpResponseFor<SubstatusListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubstatusListPage> =
            list(SubstatusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/substatus/{id}`, but is otherwise the same
         * as [SubstatusService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SubstatusDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubstatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubstatusDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SubstatusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/count`, but is otherwise the same as
         * [SubstatusService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(SubstatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SubstatusCountParams = SubstatusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SubstatusCountParams = SubstatusCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SubstatusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/{id}`, but is otherwise the same as
         * [SubstatusService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SubStatusFull> = get(id, SubstatusGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SubstatusGetParams = SubstatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubStatusFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SubstatusGetParams = SubstatusGetParams.none(),
        ): HttpResponseFor<SubStatusFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SubstatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubStatusFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SubstatusGetParams): HttpResponseFor<SubStatusFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SubStatusFull> =
            get(id, SubstatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/queryhelp`, but is otherwise the same
         * as [SubstatusService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SubstatusQueryhelpResponse> =
            queryhelp(SubstatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubstatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none()
        ): HttpResponseFor<SubstatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SubstatusQueryhelpResponse> =
            queryhelp(SubstatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/tuple`, but is otherwise the same as
         * [SubstatusService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SubstatusTupleParams): HttpResponseFor<List<SubStatusFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SubstatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SubStatusFull>>
    }
}
