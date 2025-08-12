// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.statevector

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.StateVectorFull
import com.unifieddatalibrary.api.models.statevector.current.CurrentListPage
import com.unifieddatalibrary.api.models.statevector.current.CurrentListParams
import com.unifieddatalibrary.api.models.statevector.current.CurrentTupleParams
import com.unifieddatalibrary.api.services.blocking.statevector.CurrentService
import java.util.function.Consumer

interface CurrentService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    /** Service operation to dynamically query/filter current StateVector data within the system by a variety of query parameters not specified in this API documentation. A current StateVector is the currently active, latest StateVector for an on-orbit object. Current state vectors are tracked by source and a source should be provided as a query parameter to this service operation to view the 'current' catalog for a particular provider. Default current state vector sources may vary by UDL environment. Please contact the UDL help desk for more information, or explicitly specify the desired source. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CurrentListPage = list(CurrentListParams.none())

    /** @see list */
    fun list(params: CurrentListParams = CurrentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CurrentListPage

    /** @see list */
    fun list(params: CurrentListParams = CurrentListParams.none()): CurrentListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CurrentListPage =
        list(
          CurrentListParams.none(), requestOptions
        )

    /** Service operation to dynamically query/filter current StateVector data within the system by a variety of query parameters not specified in this API documentation. A current StateVector is the currently active, latest StateVector for an on-orbit object. Current state vectors are tracked by source and a source should be provided as a query parameter to this service operation to view the 'current' catalog for a particular provider. Default current state vector sources may vary by UDL environment. Please contact the UDL help desk for more information, or explicitly specify the desired source. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun tuple(params: CurrentTupleParams): List<StateVectorFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CurrentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<StateVectorFull>

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/statevector/current`, but is otherwise the same as [CurrentService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<CurrentListPage> = list(CurrentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: CurrentListParams = CurrentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CurrentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CurrentListParams = CurrentListParams.none()): HttpResponseFor<CurrentListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CurrentListPage> =
            list(
              CurrentListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/statevector/current/tuple`, but is otherwise the same as [CurrentService.tuple]. */
        @MustBeClosed
        fun tuple(params: CurrentTupleParams): HttpResponseFor<List<StateVectorFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: CurrentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StateVectorFull>>
    }
}
