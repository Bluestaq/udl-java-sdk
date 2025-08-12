// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldFull
import com.unifieddatalibrary.api.models.airfields.AirfieldCountParams
import com.unifieddatalibrary.api.models.airfields.AirfieldCreateParams
import com.unifieddatalibrary.api.models.airfields.AirfieldListPageAsync
import com.unifieddatalibrary.api.models.airfields.AirfieldListParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpResponse
import com.unifieddatalibrary.api.models.airfields.AirfieldRetrieveParams
import com.unifieddatalibrary.api.models.airfields.AirfieldTupleParams
import com.unifieddatalibrary.api.models.airfields.AirfieldUpdateParams
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirfieldServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldServiceAsync

    /** Service operation to take a single Airfield as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: AirfieldCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Airfield by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AirfieldFull> =
        retrieve(
          id, AirfieldRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none()): CompletableFuture<AirfieldFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldFull>

    /** @see retrieve */
    fun retrieve(params: AirfieldRetrieveParams): CompletableFuture<AirfieldFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AirfieldFull> =
        retrieve(
          id,
          AirfieldRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Airfield. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AirfieldListPageAsync> = list(AirfieldListParams.none())

    /** @see list */
    fun list(params: AirfieldListParams = AirfieldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldListPageAsync>

    /** @see list */
    fun list(params: AirfieldListParams = AirfieldListParams.none()): CompletableFuture<AirfieldListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirfieldListPageAsync> =
        list(
          AirfieldListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AirfieldCountParams.none())

    /** @see count */
    fun count(params: AirfieldCountParams = AirfieldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AirfieldCountParams = AirfieldCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AirfieldCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AirfieldQueryhelpResponse> = queryhelp(AirfieldQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none()): CompletableFuture<AirfieldQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AirfieldQueryhelpResponse> =
        queryhelp(
          AirfieldQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldTupleParams): CompletableFuture<List<AirfieldFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AirfieldFull>>

    /** A view of [AirfieldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfield`, but is otherwise the same as [AirfieldServiceAsync.create]. */
        fun create(params: AirfieldCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AirfieldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfield/{id}`, but is otherwise the same as [AirfieldServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirfieldFull>> =
            retrieve(
              id, AirfieldRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none()): CompletableFuture<HttpResponseFor<AirfieldFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldFull>>

        /** @see retrieve */
        fun retrieve(params: AirfieldRetrieveParams): CompletableFuture<HttpResponseFor<AirfieldFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldFull>> =
            retrieve(
              id,
              AirfieldRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfield/{id}`, but is otherwise the same as [AirfieldServiceAsync.update]. */
        fun update(pathId: String, params: AirfieldUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AirfieldUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfield`, but is otherwise the same as [AirfieldServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AirfieldListPageAsync>> = list(AirfieldListParams.none())

        /** @see list */
        fun list(params: AirfieldListParams = AirfieldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldListPageAsync>>

        /** @see list */
        fun list(params: AirfieldListParams = AirfieldListParams.none()): CompletableFuture<HttpResponseFor<AirfieldListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldListPageAsync>> =
            list(
              AirfieldListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/count`, but is otherwise the same as [AirfieldServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AirfieldCountParams.none())

        /** @see count */
        fun count(params: AirfieldCountParams = AirfieldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AirfieldCountParams = AirfieldCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AirfieldCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/queryhelp`, but is otherwise the same as [AirfieldServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirfieldQueryhelpResponse>> = queryhelp(AirfieldQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AirfieldQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldQueryhelpResponse>> =
            queryhelp(
              AirfieldQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/tuple`, but is otherwise the same as [AirfieldServiceAsync.tuple]. */
        fun tuple(params: AirfieldTupleParams): CompletableFuture<HttpResponseFor<List<AirfieldFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AirfieldFull>>>
    }
}
