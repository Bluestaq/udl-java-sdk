// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldstatusFull
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCountParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusDeleteParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListPageAsync
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusRetrieveParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusTupleParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusUpdateParams
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import com.unifieddatalibrary.api.services.async.airfieldstatus.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirfieldStatusServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single airfield status record as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: AirfieldStatusCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single airfield status record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AirfieldstatusFull> =
        retrieve(
          id, AirfieldStatusRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldstatusFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none()): CompletableFuture<AirfieldstatusFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldstatusFull>

    /** @see retrieve */
    fun retrieve(params: AirfieldStatusRetrieveParams): CompletableFuture<AirfieldstatusFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AirfieldstatusFull> =
        retrieve(
          id,
          AirfieldStatusRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single airfield status record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldStatusUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldStatusUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AirfieldStatusListPageAsync> = list(AirfieldStatusListParams.none())

    /** @see list */
    fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldStatusListPageAsync>

    /** @see list */
    fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none()): CompletableFuture<AirfieldStatusListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirfieldStatusListPageAsync> =
        list(
          AirfieldStatusListParams.none(), requestOptions
        )

    /** Service operation to delete a Status object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AirfieldStatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AirfieldStatusDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AirfieldStatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AirfieldStatusCountParams.none())

    /** @see count */
    fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AirfieldStatusCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AirfieldStatusQueryhelpResponse> = queryhelp(AirfieldStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldStatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none()): CompletableFuture<AirfieldStatusQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AirfieldStatusQueryhelpResponse> =
        queryhelp(
          AirfieldStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldStatusTupleParams): CompletableFuture<List<AirfieldstatusFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AirfieldstatusFull>>

    /** A view of [AirfieldStatusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfieldstatus`, but is otherwise the same as [AirfieldStatusServiceAsync.create]. */
        fun create(params: AirfieldStatusCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> =
            retrieve(
              id, AirfieldStatusRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none()): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldstatusFull>>

        /** @see retrieve */
        fun retrieve(params: AirfieldStatusRetrieveParams): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> =
            retrieve(
              id,
              AirfieldStatusRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusServiceAsync.update]. */
        fun update(pathId: String, params: AirfieldStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AirfieldStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfieldstatus`, but is otherwise the same as [AirfieldStatusServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AirfieldStatusListPageAsync>> = list(AirfieldStatusListParams.none())

        /** @see list */
        fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldStatusListPageAsync>>

        /** @see list */
        fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none()): CompletableFuture<HttpResponseFor<AirfieldStatusListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldStatusListPageAsync>> =
            list(
              AirfieldStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AirfieldStatusDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AirfieldStatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AirfieldStatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/count`, but is otherwise the same as [AirfieldStatusServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AirfieldStatusCountParams.none())

        /** @see count */
        fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AirfieldStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/queryhelp`, but is otherwise the same as [AirfieldStatusServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirfieldStatusQueryhelpResponse>> = queryhelp(AirfieldStatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldStatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AirfieldStatusQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldStatusQueryhelpResponse>> =
            queryhelp(
              AirfieldStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/tuple`, but is otherwise the same as [AirfieldStatusServiceAsync.tuple]. */
        fun tuple(params: AirfieldStatusTupleParams): CompletableFuture<HttpResponseFor<List<AirfieldstatusFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AirfieldstatusFull>>>
    }
}
