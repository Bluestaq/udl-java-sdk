// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCountParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCreateParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionDeleteParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListPage
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionUpdateParams
import java.util.function.Consumer

interface LaunchDetectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchDetectionService

    /**
     * Service operation to take a single launch detection as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaunchDetectionCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchDetectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single launch detection. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchDetectionUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchDetectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchDetectionUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchDetectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LaunchDetectionListPage = list(LaunchDetectionListParams.none())

    /** @see list */
    fun list(
        params: LaunchDetectionListParams = LaunchDetectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchDetectionListPage

    /** @see list */
    fun list(
        params: LaunchDetectionListParams = LaunchDetectionListParams.none()
    ): LaunchDetectionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LaunchDetectionListPage =
        list(LaunchDetectionListParams.none(), requestOptions)

    /**
     * Service operation to delete a launch detection object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, LaunchDetectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchDetectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LaunchDetectionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LaunchDetectionDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(LaunchDetectionCountParams.none())

    /** @see count */
    fun count(
        params: LaunchDetectionCountParams = LaunchDetectionCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: LaunchDetectionCountParams = LaunchDetectionCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(LaunchDetectionCountParams.none(), requestOptions)

    /**
     * Service operation to get a single launch detection record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): LaunchDetectionGetResponse = get(id, LaunchDetectionGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchDetectionGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
    ): LaunchDetectionGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchDetectionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchDetectionGetResponse

    /** @see get */
    fun get(params: LaunchDetectionGetParams): LaunchDetectionGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchDetectionGetResponse =
        get(id, LaunchDetectionGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LaunchDetectionQueryhelpResponse =
        queryhelp(LaunchDetectionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchDetectionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none()
    ): LaunchDetectionQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LaunchDetectionQueryhelpResponse =
        queryhelp(LaunchDetectionQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaunchDetectionTupleParams): List<LaunchDetectionTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchDetectionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LaunchDetectionTupleResponse>

    /**
     * A view of [LaunchDetectionService] that provides access to raw HTTP responses for each
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
        ): LaunchDetectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchdetection`, but is otherwise the same as
         * [LaunchDetectionService.create].
         */
        @MustBeClosed
        fun create(params: LaunchDetectionCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LaunchDetectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LaunchDetectionUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LaunchDetectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchDetectionUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LaunchDetectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection`, but is otherwise the same as
         * [LaunchDetectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LaunchDetectionListPage> =
            list(LaunchDetectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchDetectionListParams = LaunchDetectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchDetectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchDetectionListParams = LaunchDetectionListParams.none()
        ): HttpResponseFor<LaunchDetectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaunchDetectionListPage> =
            list(LaunchDetectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LaunchDetectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LaunchDetectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchDetectionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LaunchDetectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/count`, but is otherwise the
         * same as [LaunchDetectionService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(LaunchDetectionCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaunchDetectionCountParams = LaunchDetectionCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaunchDetectionCountParams = LaunchDetectionCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(LaunchDetectionCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchDetectionGetResponse> =
            get(id, LaunchDetectionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchDetectionGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
        ): HttpResponseFor<LaunchDetectionGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaunchDetectionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchDetectionGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchDetectionGetParams): HttpResponseFor<LaunchDetectionGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchDetectionGetResponse> =
            get(id, LaunchDetectionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/queryhelp`, but is otherwise
         * the same as [LaunchDetectionService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LaunchDetectionQueryhelpResponse> =
            queryhelp(LaunchDetectionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchDetectionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none()
        ): HttpResponseFor<LaunchDetectionQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<LaunchDetectionQueryhelpResponse> =
            queryhelp(LaunchDetectionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/tuple`, but is otherwise the
         * same as [LaunchDetectionService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: LaunchDetectionTupleParams
        ): HttpResponseFor<List<LaunchDetectionTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LaunchDetectionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LaunchDetectionTupleResponse>>
    }
}
