// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCountParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListPage
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadUpdateParams
import java.util.function.Consumer

interface SeradataOpticalPayloadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadService

    /**
     * Service operation to take a single SeradataOpticalPayload as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeradataOpticalPayloadCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataOpticalPayloadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an SeradataOpticalPayload. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeradataOpticalPayloadUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataOpticalPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataOpticalPayloadUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataOpticalPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SeradataOpticalPayloadListPage = list(SeradataOpticalPayloadListParams.none())

    /** @see list */
    fun list(
        params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataOpticalPayloadListPage

    /** @see list */
    fun list(
        params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none()
    ): SeradataOpticalPayloadListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SeradataOpticalPayloadListPage =
        list(SeradataOpticalPayloadListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataOpticalPayload specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, SeradataOpticalPayloadDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataOpticalPayloadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SeradataOpticalPayloadDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SeradataOpticalPayloadDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SeradataOpticalPayloadCountParams.none())

    /** @see count */
    fun count(
        params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SeradataOpticalPayloadCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataOpticalPayload by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SeradataOpticalPayloadGetResponse =
        get(id, SeradataOpticalPayloadGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataOpticalPayloadGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
    ): SeradataOpticalPayloadGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataOpticalPayloadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataOpticalPayloadGetResponse

    /** @see get */
    fun get(params: SeradataOpticalPayloadGetParams): SeradataOpticalPayloadGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeradataOpticalPayloadGetResponse =
        get(id, SeradataOpticalPayloadGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SeradataOpticalPayloadQueryhelpResponse =
        queryhelp(SeradataOpticalPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataOpticalPayloadQueryhelpParams =
            SeradataOpticalPayloadQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeradataOpticalPayloadQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataOpticalPayloadQueryhelpParams = SeradataOpticalPayloadQueryhelpParams.none()
    ): SeradataOpticalPayloadQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeradataOpticalPayloadQueryhelpResponse =
        queryhelp(SeradataOpticalPayloadQueryhelpParams.none(), requestOptions)

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
        params: SeradataOpticalPayloadTupleParams
    ): List<SeradataOpticalPayloadTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataOpticalPayloadTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SeradataOpticalPayloadTupleResponse>

    /**
     * A view of [SeradataOpticalPayloadService] that provides access to raw HTTP responses for each
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
        ): SeradataOpticalPayloadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradataopticalpayload`, but is otherwise the
         * same as [SeradataOpticalPayloadService.create].
         */
        @MustBeClosed
        fun create(params: SeradataOpticalPayloadCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SeradataOpticalPayloadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/seradataopticalpayload/{id}`, but is otherwise
         * the same as [SeradataOpticalPayloadService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SeradataOpticalPayloadUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SeradataOpticalPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SeradataOpticalPayloadUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SeradataOpticalPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload`, but is otherwise the
         * same as [SeradataOpticalPayloadService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SeradataOpticalPayloadListPage> =
            list(SeradataOpticalPayloadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataOpticalPayloadListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none()
        ): HttpResponseFor<SeradataOpticalPayloadListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeradataOpticalPayloadListPage> =
            list(SeradataOpticalPayloadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradataopticalpayload/{id}`, but is
         * otherwise the same as [SeradataOpticalPayloadService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SeradataOpticalPayloadDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SeradataOpticalPayloadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeradataOpticalPayloadDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SeradataOpticalPayloadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/count`, but is otherwise
         * the same as [SeradataOpticalPayloadService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeradataOpticalPayloadCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SeradataOpticalPayloadCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/{id}`, but is otherwise
         * the same as [SeradataOpticalPayloadService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeradataOpticalPayloadGetResponse> =
            get(id, SeradataOpticalPayloadGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataOpticalPayloadGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
        ): HttpResponseFor<SeradataOpticalPayloadGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataOpticalPayloadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataOpticalPayloadGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeradataOpticalPayloadGetParams
        ): HttpResponseFor<SeradataOpticalPayloadGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataOpticalPayloadGetResponse> =
            get(id, SeradataOpticalPayloadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/queryhelp`, but is
         * otherwise the same as [SeradataOpticalPayloadService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse> =
            queryhelp(SeradataOpticalPayloadQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataOpticalPayloadQueryhelpParams =
                SeradataOpticalPayloadQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeradataOpticalPayloadQueryhelpParams =
                SeradataOpticalPayloadQueryhelpParams.none()
        ): HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse> =
            queryhelp(SeradataOpticalPayloadQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/tuple`, but is otherwise
         * the same as [SeradataOpticalPayloadService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SeradataOpticalPayloadTupleParams
        ): HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SeradataOpticalPayloadTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>>
    }
}
