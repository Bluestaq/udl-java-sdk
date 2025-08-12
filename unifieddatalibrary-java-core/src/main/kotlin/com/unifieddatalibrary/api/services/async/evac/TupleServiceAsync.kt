// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.evac

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.evac.tuple.TupleListPageAsync
import com.unifieddatalibrary.api.models.evac.tuple.TupleListParams
import com.unifieddatalibrary.api.services.async.evac.TupleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TupleServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleServiceAsync

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun list(params: TupleListParams): CompletableFuture<TupleListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: TupleListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TupleListPageAsync>

    /** A view of [TupleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/evac/tuple`, but is otherwise the same as [TupleServiceAsync.list]. */
        fun list(params: TupleListParams): CompletableFuture<HttpResponseFor<TupleListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: TupleListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TupleListPageAsync>>
    }
}
