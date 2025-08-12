// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.evac

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.evac.tuple.TupleListPage
import com.unifieddatalibrary.api.models.evac.tuple.TupleListParams
import com.unifieddatalibrary.api.services.blocking.evac.TupleService
import java.util.function.Consumer

interface TupleService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleService

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun list(params: TupleListParams): TupleListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: TupleListParams, requestOptions: RequestOptions = RequestOptions.none()): TupleListPage

    /** A view of [TupleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/evac/tuple`, but is otherwise the same as [TupleService.list]. */
        @MustBeClosed
        fun list(params: TupleListParams): HttpResponseFor<TupleListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: TupleListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TupleListPage>
    }
}
