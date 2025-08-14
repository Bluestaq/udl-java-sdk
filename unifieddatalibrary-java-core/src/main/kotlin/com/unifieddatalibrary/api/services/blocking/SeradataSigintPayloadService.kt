// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListPage
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import java.util.function.Consumer

interface SeradataSigintPayloadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSigintPayloadService

    /**
     * Service operation to take a single SeradataSigIntPayload as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeradataSigintPayloadCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataSigintPayloadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an SeradataSigIntPayload. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeradataSigintPayloadUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataSigintPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataSigintPayloadUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataSigintPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SeradataSigintPayloadListPage = list(SeradataSigintPayloadListParams.none())

    /** @see list */
    fun list(
        params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSigintPayloadListPage

    /** @see list */
    fun list(
        params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none()
    ): SeradataSigintPayloadListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SeradataSigintPayloadListPage =
        list(SeradataSigintPayloadListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataSigIntPayload specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, SeradataSigintPayloadDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataSigintPayloadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SeradataSigintPayloadDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SeradataSigintPayloadDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SeradataSigintPayloadCountParams.none())

    /** @see count */
    fun count(
        params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SeradataSigintPayloadCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataSigIntPayload by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SeradataSigintPayloadGetResponse =
        get(id, SeradataSigintPayloadGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSigintPayloadGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(),
    ): SeradataSigintPayloadGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataSigintPayloadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSigintPayloadGetResponse

    /** @see get */
    fun get(params: SeradataSigintPayloadGetParams): SeradataSigintPayloadGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeradataSigintPayloadGetResponse =
        get(id, SeradataSigintPayloadGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SeradataSigintPayloadQueryhelpResponse =
        queryhelp(SeradataSigintPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataSigintPayloadQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none()
    ): SeradataSigintPayloadQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeradataSigintPayloadQueryhelpResponse =
        queryhelp(SeradataSigintPayloadQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SeradataSigintPayloadTupleParams): List<SeradataSigintPayloadTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataSigintPayloadTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SeradataSigintPayloadTupleResponse>

    /**
     * A view of [SeradataSigintPayloadService] that provides access to raw HTTP responses for each
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
        ): SeradataSigintPayloadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradatasigintpayload`, but is otherwise the
         * same as [SeradataSigintPayloadService.create].
         */
        @MustBeClosed
        fun create(params: SeradataSigintPayloadCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SeradataSigintPayloadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/seradatasigintpayload/{id}`, but is otherwise
         * the same as [SeradataSigintPayloadService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SeradataSigintPayloadUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SeradataSigintPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SeradataSigintPayloadUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SeradataSigintPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/seradatasigintpayload`, but is otherwise the
         * same as [SeradataSigintPayloadService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SeradataSigintPayloadListPage> =
            list(SeradataSigintPayloadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSigintPayloadListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none()
        ): HttpResponseFor<SeradataSigintPayloadListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeradataSigintPayloadListPage> =
            list(SeradataSigintPayloadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradatasigintpayload/{id}`, but is
         * otherwise the same as [SeradataSigintPayloadService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SeradataSigintPayloadDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SeradataSigintPayloadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeradataSigintPayloadDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SeradataSigintPayloadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatasigintpayload/count`, but is otherwise
         * the same as [SeradataSigintPayloadService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeradataSigintPayloadCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SeradataSigintPayloadCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatasigintpayload/{id}`, but is otherwise
         * the same as [SeradataSigintPayloadService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeradataSigintPayloadGetResponse> =
            get(id, SeradataSigintPayloadGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSigintPayloadGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(),
        ): HttpResponseFor<SeradataSigintPayloadGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataSigintPayloadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSigintPayloadGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataSigintPayloadGetParams
        ): HttpResponseFor<SeradataSigintPayloadGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataSigintPayloadGetResponse> =
            get(id, SeradataSigintPayloadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatasigintpayload/queryhelp`, but is
         * otherwise the same as [SeradataSigintPayloadService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeradataSigintPayloadQueryhelpResponse> =
            queryhelp(SeradataSigintPayloadQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataSigintPayloadQueryhelpParams =
                SeradataSigintPayloadQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataSigintPayloadQueryhelpParams =
                SeradataSigintPayloadQueryhelpParams.none()
        ): HttpResponseFor<SeradataSigintPayloadQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeradataSigintPayloadQueryhelpResponse> =
            queryhelp(SeradataSigintPayloadQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatasigintpayload/tuple`, but is otherwise
         * the same as [SeradataSigintPayloadService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SeradataSigintPayloadTupleParams
        ): HttpResponseFor<List<SeradataSigintPayloadTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SeradataSigintPayloadTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SeradataSigintPayloadTupleResponse>>
    }
}
