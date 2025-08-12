// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldslotFull
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCountParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCreateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotDeleteParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListPageAsync
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotTupleParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotUpdateParams
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirfieldSlotServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotServiceAsync

    /** Service operation to take a single airfieldslot record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirfieldSlotCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldSlotCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single airfieldslot record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AirfieldslotFull> =
        retrieve(
          id, AirfieldSlotRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldslotFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none()): CompletableFuture<AirfieldslotFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldSlotRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldslotFull>

    /** @see retrieve */
    fun retrieve(params: AirfieldSlotRetrieveParams): CompletableFuture<AirfieldslotFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AirfieldslotFull> =
        retrieve(
          id,
          AirfieldSlotRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single airfieldslot record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldSlotUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldSlotUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldSlotUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldSlotUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AirfieldSlotListPageAsync> = list(AirfieldSlotListParams.none())

    /** @see list */
    fun list(params: AirfieldSlotListParams = AirfieldSlotListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldSlotListPageAsync>

    /** @see list */
    fun list(params: AirfieldSlotListParams = AirfieldSlotListParams.none()): CompletableFuture<AirfieldSlotListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirfieldSlotListPageAsync> =
        list(
          AirfieldSlotListParams.none(), requestOptions
        )

    /** Service operation to delete an airfieldslot record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AirfieldSlotDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirfieldSlotDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AirfieldSlotDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AirfieldSlotDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AirfieldSlotCountParams.none())

    /** @see count */
    fun count(params: AirfieldSlotCountParams = AirfieldSlotCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AirfieldSlotCountParams = AirfieldSlotCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AirfieldSlotCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AirfieldSlotQueryhelpResponse> = queryhelp(AirfieldSlotQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirfieldSlotQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none()): CompletableFuture<AirfieldSlotQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AirfieldSlotQueryhelpResponse> =
        queryhelp(
          AirfieldSlotQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldSlotTupleParams): CompletableFuture<List<AirfieldslotFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldSlotTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AirfieldslotFull>>

    /** A view of [AirfieldSlotServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfieldslot`, but is otherwise the same as [AirfieldSlotServiceAsync.create]. */
        fun create(params: AirfieldSlotCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AirfieldSlotCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfieldslot/{id}`, but is otherwise the same as [AirfieldSlotServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirfieldslotFull>> =
            retrieve(
              id, AirfieldSlotRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldslotFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none()): CompletableFuture<HttpResponseFor<AirfieldslotFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AirfieldSlotRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldslotFull>>

        /** @see retrieve */
        fun retrieve(params: AirfieldSlotRetrieveParams): CompletableFuture<HttpResponseFor<AirfieldslotFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldslotFull>> =
            retrieve(
              id,
              AirfieldSlotRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfieldslot/{id}`, but is otherwise the same as [AirfieldSlotServiceAsync.update]. */
        fun update(pathId: String, params: AirfieldSlotUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AirfieldSlotUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AirfieldSlotUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AirfieldSlotUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airfieldslot`, but is otherwise the same as [AirfieldSlotServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AirfieldSlotListPageAsync>> = list(AirfieldSlotListParams.none())

        /** @see list */
        fun list(params: AirfieldSlotListParams = AirfieldSlotListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldSlotListPageAsync>>

        /** @see list */
        fun list(params: AirfieldSlotListParams = AirfieldSlotListParams.none()): CompletableFuture<HttpResponseFor<AirfieldSlotListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldSlotListPageAsync>> =
            list(
              AirfieldSlotListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/airfieldslot/{id}`, but is otherwise the same as [AirfieldSlotServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AirfieldSlotDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AirfieldSlotDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AirfieldSlotDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AirfieldSlotDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airfieldslot/count`, but is otherwise the same as [AirfieldSlotServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AirfieldSlotCountParams.none())

        /** @see count */
        fun count(params: AirfieldSlotCountParams = AirfieldSlotCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AirfieldSlotCountParams = AirfieldSlotCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AirfieldSlotCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldslot/queryhelp`, but is otherwise the same as [AirfieldSlotServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirfieldSlotQueryhelpResponse>> = queryhelp(AirfieldSlotQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirfieldSlotQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AirfieldSlotQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirfieldSlotQueryhelpResponse>> =
            queryhelp(
              AirfieldSlotQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldslot/tuple`, but is otherwise the same as [AirfieldSlotServiceAsync.tuple]. */
        fun tuple(params: AirfieldSlotTupleParams): CompletableFuture<HttpResponseFor<List<AirfieldslotFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AirfieldSlotTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AirfieldslotFull>>>
    }
}
