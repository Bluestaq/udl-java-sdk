// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationDeleteParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListPage
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import java.util.function.Consumer

interface SeraDataNavigationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationService

    /**
     * Service operation to take a single SeradataNavigation as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeraDataNavigationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeraDataNavigationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update an SeradataNavigation. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeraDataNavigationUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeraDataNavigationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeraDataNavigationUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeraDataNavigationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SeraDataNavigationListPage = list(SeraDataNavigationListParams.none())

    /** @see list */
    fun list(
        params: SeraDataNavigationListParams = SeraDataNavigationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataNavigationListPage

    /** @see list */
    fun list(
        params: SeraDataNavigationListParams = SeraDataNavigationListParams.none()
    ): SeraDataNavigationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SeraDataNavigationListPage =
        list(SeraDataNavigationListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataNavigation specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String) = delete(id, SeraDataNavigationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeraDataNavigationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SeraDataNavigationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SeraDataNavigationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SeraDataNavigationCountParams.none())

    /** @see count */
    fun count(
        params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SeraDataNavigationCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataNavigation by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SeraDataNavigationGetResponse = get(id, SeraDataNavigationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataNavigationGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(),
    ): SeraDataNavigationGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeraDataNavigationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataNavigationGetResponse

    /** @see get */
    fun get(params: SeraDataNavigationGetParams): SeraDataNavigationGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SeraDataNavigationGetResponse =
        get(id, SeraDataNavigationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SeraDataNavigationQueryhelpResponse =
        queryhelp(SeraDataNavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SeraDataNavigationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none()
    ): SeraDataNavigationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SeraDataNavigationQueryhelpResponse =
        queryhelp(SeraDataNavigationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SeraDataNavigationTupleParams): List<SeraDataNavigationTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeraDataNavigationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SeraDataNavigationTupleResponse>

    /**
     * A view of [SeraDataNavigationService] that provides access to raw HTTP responses for each
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
        ): SeraDataNavigationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradatanavigation`, but is otherwise the same
         * as [SeraDataNavigationService.create].
         */
        @MustBeClosed
        fun create(params: SeraDataNavigationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SeraDataNavigationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/seradatanavigation/{id}`, but is otherwise the
         * same as [SeraDataNavigationService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SeraDataNavigationUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SeraDataNavigationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SeraDataNavigationUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SeraDataNavigationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/seradatanavigation`, but is otherwise the same
         * as [SeraDataNavigationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SeraDataNavigationListPage> =
            list(SeraDataNavigationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeraDataNavigationListParams = SeraDataNavigationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataNavigationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SeraDataNavigationListParams = SeraDataNavigationListParams.none()
        ): HttpResponseFor<SeraDataNavigationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SeraDataNavigationListPage> =
            list(SeraDataNavigationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradatanavigation/{id}`, but is otherwise
         * the same as [SeraDataNavigationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SeraDataNavigationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SeraDataNavigationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SeraDataNavigationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SeraDataNavigationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatanavigation/count`, but is otherwise the
         * same as [SeraDataNavigationService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SeraDataNavigationCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SeraDataNavigationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatanavigation/{id}`, but is otherwise the
         * same as [SeraDataNavigationService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SeraDataNavigationGetResponse> =
            get(id, SeraDataNavigationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataNavigationGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(),
        ): HttpResponseFor<SeraDataNavigationGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeraDataNavigationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataNavigationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SeraDataNavigationGetParams
        ): HttpResponseFor<SeraDataNavigationGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeraDataNavigationGetResponse> =
            get(id, SeraDataNavigationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatanavigation/queryhelp`, but is otherwise
         * the same as [SeraDataNavigationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SeraDataNavigationQueryhelpResponse> =
            queryhelp(SeraDataNavigationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SeraDataNavigationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none()
        ): HttpResponseFor<SeraDataNavigationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SeraDataNavigationQueryhelpResponse> =
            queryhelp(SeraDataNavigationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradatanavigation/tuple`, but is otherwise the
         * same as [SeraDataNavigationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SeraDataNavigationTupleParams
        ): HttpResponseFor<List<SeraDataNavigationTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SeraDataNavigationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SeraDataNavigationTupleResponse>>
    }
}
