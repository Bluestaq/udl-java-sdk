// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirloadplanFull
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCountParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCreateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanDeleteParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListPageAsync
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanRetrieveParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanTupleParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanUpdateParams
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirloadPlanServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanServiceAsync

    /** Service operation to take a single airloadplan record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirloadPlanCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirloadPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single airloadplan record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AirloadplanFull> =
        retrieve(
          id, AirloadPlanRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirloadplanFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none()): CompletableFuture<AirloadplanFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirloadPlanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirloadplanFull>

    /** @see retrieve */
    fun retrieve(params: AirloadPlanRetrieveParams): CompletableFuture<AirloadplanFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AirloadplanFull> =
        retrieve(
          id,
          AirloadPlanRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single airloadplan record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirloadPlanUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirloadPlanUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AirloadPlanListParams): CompletableFuture<AirloadPlanListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AirloadPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirloadPlanListPageAsync>

    /** Service operation to delete a airloadplan record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AirloadPlanDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirloadPlanDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AirloadPlanDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AirloadPlanDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AirloadPlanCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AirloadPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AirloadPlanQueryhelpResponse> = queryhelp(AirloadPlanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirloadPlanQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none()): CompletableFuture<AirloadPlanQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AirloadPlanQueryhelpResponse> =
        queryhelp(
          AirloadPlanQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirloadPlanTupleParams): CompletableFuture<List<AirloadplanFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirloadPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AirloadplanFull>>

    /** A view of [AirloadPlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airloadplan`, but is otherwise the same as [AirloadPlanServiceAsync.create]. */
        fun create(params: AirloadPlanCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AirloadPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirloadplanFull>> =
            retrieve(
              id, AirloadPlanRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirloadplanFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none()): CompletableFuture<HttpResponseFor<AirloadplanFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AirloadPlanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirloadplanFull>>

        /** @see retrieve */
        fun retrieve(params: AirloadPlanRetrieveParams): CompletableFuture<HttpResponseFor<AirloadplanFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirloadplanFull>> =
            retrieve(
              id,
              AirloadPlanRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanServiceAsync.update]. */
        fun update(pathId: String, params: AirloadPlanUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AirloadPlanUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airloadplan`, but is otherwise the same as [AirloadPlanServiceAsync.list]. */
        fun list(params: AirloadPlanListParams): CompletableFuture<HttpResponseFor<AirloadPlanListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: AirloadPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirloadPlanListPageAsync>>

        /** Returns a raw HTTP response for `delete /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AirloadPlanDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AirloadPlanDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AirloadPlanDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AirloadPlanDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airloadplan/count`, but is otherwise the same as [AirloadPlanServiceAsync.count]. */
        fun count(params: AirloadPlanCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: AirloadPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/airloadplan/queryhelp`, but is otherwise the same as [AirloadPlanServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirloadPlanQueryhelpResponse>> = queryhelp(AirloadPlanQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirloadPlanQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AirloadPlanQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirloadPlanQueryhelpResponse>> =
            queryhelp(
              AirloadPlanQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airloadplan/tuple`, but is otherwise the same as [AirloadPlanServiceAsync.tuple]. */
        fun tuple(params: AirloadPlanTupleParams): CompletableFuture<HttpResponseFor<List<AirloadplanFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AirloadPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AirloadplanFull>>>
    }
}
