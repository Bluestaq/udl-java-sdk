// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.elsets

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.current.CurrentListPage
import com.unifieddatalibrary.api.models.elsets.current.CurrentListParams
import com.unifieddatalibrary.api.models.elsets.current.CurrentTupleParams
import java.util.function.Consumer

interface CurrentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    /**
     * Service operation to dynamically query/filter current elsets within the system by a variety
     * of query parameters not specified in this API documentation. A current elset is the currently
     * active, latest elset for an on-orbit object. Current elsets are tracked by source and a
     * source should be provided as a query parameter to this service operation to view the
     * 'current' catalog for a particular provider. If source is not provided, it will be defaulted
     * to '18th SPCS'. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more
     * details on additional query parameter information.
     */
    fun list(): CurrentListPage = list(CurrentListParams.none())

    /** @see list */
    fun list(
        params: CurrentListParams = CurrentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentListPage

    /** @see list */
    fun list(params: CurrentListParams = CurrentListParams.none()): CurrentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CurrentListPage =
        list(CurrentListParams.none(), requestOptions)

    /**
     * Service operation to dynamically query/filter current elsets within the system by a variety
     * of query parameters not specified in this API documentation. A current elset is the currently
     * active, latest elset for an on-orbit object. Current elsets are tracked by source and a
     * source should be provided as a query parameter to this service operation to view the
     * 'current' catalog for a particular provider. If source is not provided, it will be defaulted
     * to '18th SPCS'. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more
     * details on additional query parameter information.
     */
    fun tuple(params: CurrentTupleParams): List<Elset> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CurrentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Elset>

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/elset/current`, but is otherwise the same as
         * [CurrentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CurrentListPage> = list(CurrentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none()
        ): HttpResponseFor<CurrentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CurrentListPage> =
            list(CurrentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset/current/tuple`, but is otherwise the same
         * as [CurrentService.tuple].
         */
        @MustBeClosed
        fun tuple(params: CurrentTupleParams): HttpResponseFor<List<Elset>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: CurrentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Elset>>
    }
}
