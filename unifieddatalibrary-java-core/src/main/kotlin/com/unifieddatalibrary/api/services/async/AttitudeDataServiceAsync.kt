// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AttitudedataFull
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpParams
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataTupleParams
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttitudeDataServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<AttitudeDataQueryHelpResponse> = queryHelp(AttitudeDataQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: AttitudeDataQueryHelpParams = AttitudeDataQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudeDataQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: AttitudeDataQueryHelpParams = AttitudeDataQueryHelpParams.none()): CompletableFuture<AttitudeDataQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<AttitudeDataQueryHelpResponse> =
        queryHelp(
          AttitudeDataQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AttitudeDataTupleParams): CompletableFuture<List<AttitudedataFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AttitudeDataTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AttitudedataFull>>

    /** A view of [AttitudeDataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/attitudedata/queryhelp`, but is otherwise the same as [AttitudeDataServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<AttitudeDataQueryHelpResponse>> = queryHelp(AttitudeDataQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: AttitudeDataQueryHelpParams = AttitudeDataQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudeDataQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: AttitudeDataQueryHelpParams = AttitudeDataQueryHelpParams.none()): CompletableFuture<HttpResponseFor<AttitudeDataQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudeDataQueryHelpResponse>> =
            queryHelp(
              AttitudeDataQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/attitudedata/tuple`, but is otherwise the same as [AttitudeDataServiceAsync.tuple]. */
        fun tuple(params: AttitudeDataTupleParams): CompletableFuture<HttpResponseFor<List<AttitudedataFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AttitudeDataTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AttitudedataFull>>>
    }
}
