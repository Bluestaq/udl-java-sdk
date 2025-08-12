// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftFull
import com.unifieddatalibrary.api.models.aircraft.AircraftCountParams
import com.unifieddatalibrary.api.models.aircraft.AircraftCreateParams
import com.unifieddatalibrary.api.models.aircraft.AircraftListPageAsync
import com.unifieddatalibrary.api.models.aircraft.AircraftListParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraft.AircraftRetrieveParams
import com.unifieddatalibrary.api.models.aircraft.AircraftTupleQueryParams
import com.unifieddatalibrary.api.models.aircraft.AircraftUpdateParams
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftServiceAsync

    /** Service operation to take a single Aircraft as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AircraftCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AircraftCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Aircraft record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AircraftFull> =
        retrieve(
          id, AircraftRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none()): CompletableFuture<AircraftFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AircraftRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftFull>

    /** @see retrieve */
    fun retrieve(params: AircraftRetrieveParams): CompletableFuture<AircraftFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AircraftFull> =
        retrieve(
          id,
          AircraftRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Aircraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AircraftUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AircraftUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AircraftListPageAsync> = list(AircraftListParams.none())

    /** @see list */
    fun list(params: AircraftListParams = AircraftListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftListPageAsync>

    /** @see list */
    fun list(params: AircraftListParams = AircraftListParams.none()): CompletableFuture<AircraftListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AircraftListPageAsync> =
        list(
          AircraftListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AircraftCountParams.none())

    /** @see count */
    fun count(params: AircraftCountParams = AircraftCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AircraftCountParams = AircraftCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AircraftCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AircraftQueryhelpResponse> = queryhelp(AircraftQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none()): CompletableFuture<AircraftQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AircraftQueryhelpResponse> =
        queryhelp(
          AircraftQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tupleQuery(params: AircraftTupleQueryParams): CompletableFuture<List<AircraftFull>> =
        tupleQuery(
          params, RequestOptions.none()
        )

    /** @see tupleQuery */
    fun tupleQuery(params: AircraftTupleQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AircraftFull>>

    /** A view of [AircraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/aircraft`, but is otherwise the same as [AircraftServiceAsync.create]. */
        fun create(params: AircraftCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AircraftCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraft/{id}`, but is otherwise the same as [AircraftServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AircraftFull>> =
            retrieve(
              id, AircraftRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none()): CompletableFuture<HttpResponseFor<AircraftFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AircraftRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftFull>>

        /** @see retrieve */
        fun retrieve(params: AircraftRetrieveParams): CompletableFuture<HttpResponseFor<AircraftFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftFull>> =
            retrieve(
              id,
              AircraftRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/aircraft/{id}`, but is otherwise the same as [AircraftServiceAsync.update]. */
        fun update(pathId: String, params: AircraftUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AircraftUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraft`, but is otherwise the same as [AircraftServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AircraftListPageAsync>> = list(AircraftListParams.none())

        /** @see list */
        fun list(params: AircraftListParams = AircraftListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftListPageAsync>>

        /** @see list */
        fun list(params: AircraftListParams = AircraftListParams.none()): CompletableFuture<HttpResponseFor<AircraftListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftListPageAsync>> =
            list(
              AircraftListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/count`, but is otherwise the same as [AircraftServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AircraftCountParams.none())

        /** @see count */
        fun count(params: AircraftCountParams = AircraftCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AircraftCountParams = AircraftCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AircraftCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/queryhelp`, but is otherwise the same as [AircraftServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AircraftQueryhelpResponse>> = queryhelp(AircraftQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AircraftQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftQueryhelpResponse>> =
            queryhelp(
              AircraftQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/tuple`, but is otherwise the same as [AircraftServiceAsync.tupleQuery]. */
        fun tupleQuery(params: AircraftTupleQueryParams): CompletableFuture<HttpResponseFor<List<AircraftFull>>> =
            tupleQuery(
              params, RequestOptions.none()
            )

        /** @see tupleQuery */
        fun tupleQuery(params: AircraftTupleQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AircraftFull>>>
    }
}
