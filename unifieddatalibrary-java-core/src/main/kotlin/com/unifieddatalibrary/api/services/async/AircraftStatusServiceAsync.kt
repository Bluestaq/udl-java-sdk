// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftstatusFull
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCountParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCreateParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListPageAsync
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusTupleParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusUpdateParams
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.aircraftstatuses.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftStatusServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single AircraftStatus as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AircraftStatusCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single AircraftStatus record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AircraftstatusFull> =
        retrieve(
          id, AircraftStatusRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftstatusFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none()): CompletableFuture<AircraftstatusFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftstatusFull>

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRetrieveParams): CompletableFuture<AircraftstatusFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AircraftstatusFull> =
        retrieve(
          id,
          AircraftStatusRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single AircraftStatus. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AircraftStatusUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AircraftStatusUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AircraftStatusListPageAsync> = list(AircraftStatusListParams.none())

    /** @see list */
    fun list(params: AircraftStatusListParams = AircraftStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftStatusListPageAsync>

    /** @see list */
    fun list(params: AircraftStatusListParams = AircraftStatusListParams.none()): CompletableFuture<AircraftStatusListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AircraftStatusListPageAsync> =
        list(
          AircraftStatusListParams.none(), requestOptions
        )

    /** Service operation to delete a Status object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AircraftStatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AircraftStatusDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AircraftStatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AircraftStatusCountParams.none())

    /** @see count */
    fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AircraftStatusCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AircraftStatusQueryhelpResponse> = queryhelp(AircraftStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftStatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none()): CompletableFuture<AircraftStatusQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AircraftStatusQueryhelpResponse> =
        queryhelp(
          AircraftStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AircraftStatusTupleParams): CompletableFuture<List<AircraftstatusFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AircraftstatusFull>>

    /** A view of [AircraftStatusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/aircraftstatus`, but is otherwise the same as [AircraftStatusServiceAsync.create]. */
        fun create(params: AircraftStatusCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AircraftstatusFull>> =
            retrieve(
              id, AircraftStatusRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftstatusFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none()): CompletableFuture<HttpResponseFor<AircraftstatusFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftstatusFull>>

        /** @see retrieve */
        fun retrieve(params: AircraftStatusRetrieveParams): CompletableFuture<HttpResponseFor<AircraftstatusFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftstatusFull>> =
            retrieve(
              id,
              AircraftStatusRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusServiceAsync.update]. */
        fun update(pathId: String, params: AircraftStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AircraftStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraftstatus`, but is otherwise the same as [AircraftStatusServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AircraftStatusListPageAsync>> = list(AircraftStatusListParams.none())

        /** @see list */
        fun list(params: AircraftStatusListParams = AircraftStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftStatusListPageAsync>>

        /** @see list */
        fun list(params: AircraftStatusListParams = AircraftStatusListParams.none()): CompletableFuture<HttpResponseFor<AircraftStatusListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusListPageAsync>> =
            list(
              AircraftStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AircraftStatusDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AircraftStatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AircraftStatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/count`, but is otherwise the same as [AircraftStatusServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AircraftStatusCountParams.none())

        /** @see count */
        fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AircraftStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/queryhelp`, but is otherwise the same as [AircraftStatusServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AircraftStatusQueryhelpResponse>> = queryhelp(AircraftStatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftStatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AircraftStatusQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusQueryhelpResponse>> =
            queryhelp(
              AircraftStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/tuple`, but is otherwise the same as [AircraftStatusServiceAsync.tuple]. */
        fun tuple(params: AircraftStatusTupleParams): CompletableFuture<HttpResponseFor<List<AircraftstatusFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AircraftstatusFull>>>
    }
}
