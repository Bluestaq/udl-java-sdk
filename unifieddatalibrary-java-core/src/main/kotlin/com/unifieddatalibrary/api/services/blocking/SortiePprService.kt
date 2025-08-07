// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SortiePprFull
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCountParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateBulkParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprDeleteParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprGetParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListPage
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpResponse
import com.unifieddatalibrary.api.models.sortieppr.SortiePprTupleParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUpdateParams
import com.unifieddatalibrary.api.services.blocking.sortieppr.HistoryService
import java.util.function.Consumer

interface SortiePprService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SortiePprService

    fun history(): HistoryService

    /**
     * Service operation to take a single sortieppr record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SortiePprCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SortiePprCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single sortieppr record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SortiePprUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SortiePprUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SortiePprUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SortiePprUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: SortiePprListParams): SortiePprListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SortiePprListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SortiePprListPage

    /**
     * Service operation to delete a sortieppr record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, SortiePprDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SortiePprDeleteParams = SortiePprDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SortiePprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SortiePprDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SortiePprDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SortiePprCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SortiePprCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of SortiePPR records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: SortiePprCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SortiePprCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single sortieppr record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SortiePprFull = get(id, SortiePprGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SortiePprGetParams = SortiePprGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SortiePprFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: SortiePprGetParams = SortiePprGetParams.none()): SortiePprFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SortiePprGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SortiePprFull

    /** @see get */
    fun get(params: SortiePprGetParams): SortiePprFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SortiePprFull =
        get(id, SortiePprGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SortiePprQueryhelpResponse = queryhelp(SortiePprQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SortiePprQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none()
    ): SortiePprQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SortiePprQueryhelpResponse =
        queryhelp(SortiePprQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SortiePprTupleParams): List<SortiePprFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SortiePprTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SortiePprFull>

    /**
     * Service operation to take SortiePPR as a POST body and ingest into the database. This
     * operation is intended to be used for automated feeds into UDL. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: SortiePprUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SortiePprUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [SortiePprService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SortiePprService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sortieppr`, but is otherwise the same as
         * [SortiePprService.create].
         */
        @MustBeClosed
        fun create(params: SortiePprCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SortiePprCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/sortieppr/{id}`, but is otherwise the same as
         * [SortiePprService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SortiePprUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SortiePprUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SortiePprUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SortiePprUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr`, but is otherwise the same as
         * [SortiePprService.list].
         */
        @MustBeClosed
        fun list(params: SortiePprListParams): HttpResponseFor<SortiePprListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SortiePprListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SortiePprListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/sortieppr/{id}`, but is otherwise the same
         * as [SortiePprService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SortiePprDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SortiePprDeleteParams = SortiePprDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SortiePprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SortiePprDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SortiePprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/count`, but is otherwise the same as
         * [SortiePprService.count].
         */
        @MustBeClosed
        fun count(params: SortiePprCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SortiePprCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/sortieppr/createBulk`, but is otherwise the
         * same as [SortiePprService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SortiePprCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SortiePprCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/{id}`, but is otherwise the same as
         * [SortiePprService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SortiePprFull> = get(id, SortiePprGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SortiePprGetParams = SortiePprGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SortiePprFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SortiePprGetParams = SortiePprGetParams.none(),
        ): HttpResponseFor<SortiePprFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SortiePprGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SortiePprFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SortiePprGetParams): HttpResponseFor<SortiePprFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SortiePprFull> =
            get(id, SortiePprGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/queryhelp`, but is otherwise the same
         * as [SortiePprService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SortiePprQueryhelpResponse> =
            queryhelp(SortiePprQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SortiePprQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SortiePprQueryhelpParams = SortiePprQueryhelpParams.none()
        ): HttpResponseFor<SortiePprQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SortiePprQueryhelpResponse> =
            queryhelp(SortiePprQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sortieppr/tuple`, but is otherwise the same as
         * [SortiePprService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SortiePprTupleParams): HttpResponseFor<List<SortiePprFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SortiePprTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SortiePprFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sortieppr`, but is otherwise the same
         * as [SortiePprService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: SortiePprUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: SortiePprUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
