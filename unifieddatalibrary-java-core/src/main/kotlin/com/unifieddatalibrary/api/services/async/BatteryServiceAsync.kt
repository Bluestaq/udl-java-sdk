// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BatteryFull
import com.unifieddatalibrary.api.models.batteries.BatteryCountParams
import com.unifieddatalibrary.api.models.batteries.BatteryCreateParams
import com.unifieddatalibrary.api.models.batteries.BatteryDeleteParams
import com.unifieddatalibrary.api.models.batteries.BatteryListPageAsync
import com.unifieddatalibrary.api.models.batteries.BatteryListParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpResponse
import com.unifieddatalibrary.api.models.batteries.BatteryRetrieveParams
import com.unifieddatalibrary.api.models.batteries.BatteryTupleParams
import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatteryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatteryServiceAsync

    /** Service operation to take a single Battery as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: BatteryCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: BatteryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Battery record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<BatteryFull> =
        retrieve(
          id, BatteryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BatteryRetrieveParams = BatteryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BatteryFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BatteryRetrieveParams = BatteryRetrieveParams.none()): CompletableFuture<BatteryFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: BatteryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BatteryFull>

    /** @see retrieve */
    fun retrieve(params: BatteryRetrieveParams): CompletableFuture<BatteryFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BatteryFull> =
        retrieve(
          id,
          BatteryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Battery. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: BatteryUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: BatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: BatteryUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: BatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<BatteryListPageAsync> = list(BatteryListParams.none())

    /** @see list */
    fun list(params: BatteryListParams = BatteryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BatteryListPageAsync>

    /** @see list */
    fun list(params: BatteryListParams = BatteryListParams.none()): CompletableFuture<BatteryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatteryListPageAsync> =
        list(
          BatteryListParams.none(), requestOptions
        )

    /** Service operation to delete a Battery object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, BatteryDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: BatteryDeleteParams = BatteryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: BatteryDeleteParams = BatteryDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: BatteryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BatteryDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          BatteryDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(BatteryCountParams.none())

    /** @see count */
    fun count(params: BatteryCountParams = BatteryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: BatteryCountParams = BatteryCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          BatteryCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<BatteryQueryhelpResponse> = queryhelp(BatteryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: BatteryQueryhelpParams = BatteryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BatteryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: BatteryQueryhelpParams = BatteryQueryhelpParams.none()): CompletableFuture<BatteryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<BatteryQueryhelpResponse> =
        queryhelp(
          BatteryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: BatteryTupleParams): CompletableFuture<List<BatteryFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: BatteryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<BatteryFull>>

    /** A view of [BatteryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatteryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/battery`, but is otherwise the same as [BatteryServiceAsync.create]. */
        fun create(params: BatteryCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: BatteryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/battery/{id}`, but is otherwise the same as [BatteryServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BatteryFull>> =
            retrieve(
              id, BatteryRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BatteryRetrieveParams = BatteryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BatteryFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BatteryRetrieveParams = BatteryRetrieveParams.none()): CompletableFuture<HttpResponseFor<BatteryFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: BatteryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BatteryFull>>

        /** @see retrieve */
        fun retrieve(params: BatteryRetrieveParams): CompletableFuture<HttpResponseFor<BatteryFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BatteryFull>> =
            retrieve(
              id,
              BatteryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/battery/{id}`, but is otherwise the same as [BatteryServiceAsync.update]. */
        fun update(pathId: String, params: BatteryUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: BatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: BatteryUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: BatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/battery`, but is otherwise the same as [BatteryServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<BatteryListPageAsync>> = list(BatteryListParams.none())

        /** @see list */
        fun list(params: BatteryListParams = BatteryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BatteryListPageAsync>>

        /** @see list */
        fun list(params: BatteryListParams = BatteryListParams.none()): CompletableFuture<HttpResponseFor<BatteryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BatteryListPageAsync>> =
            list(
              BatteryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/battery/{id}`, but is otherwise the same as [BatteryServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, BatteryDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: BatteryDeleteParams = BatteryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: BatteryDeleteParams = BatteryDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: BatteryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BatteryDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              BatteryDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/battery/count`, but is otherwise the same as [BatteryServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(BatteryCountParams.none())

        /** @see count */
        fun count(params: BatteryCountParams = BatteryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: BatteryCountParams = BatteryCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              BatteryCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/battery/queryhelp`, but is otherwise the same as [BatteryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<BatteryQueryhelpResponse>> = queryhelp(BatteryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: BatteryQueryhelpParams = BatteryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BatteryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: BatteryQueryhelpParams = BatteryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<BatteryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BatteryQueryhelpResponse>> =
            queryhelp(
              BatteryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/battery/tuple`, but is otherwise the same as [BatteryServiceAsync.tuple]. */
        fun tuple(params: BatteryTupleParams): CompletableFuture<HttpResponseFor<List<BatteryFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: BatteryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<BatteryFull>>>
    }
}
