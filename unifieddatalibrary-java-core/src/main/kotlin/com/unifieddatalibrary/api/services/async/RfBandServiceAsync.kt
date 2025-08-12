// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.RfBandFull
import com.unifieddatalibrary.api.models.rfband.RfBandCountParams
import com.unifieddatalibrary.api.models.rfband.RfBandCreateParams
import com.unifieddatalibrary.api.models.rfband.RfBandDeleteParams
import com.unifieddatalibrary.api.models.rfband.RfBandGetParams
import com.unifieddatalibrary.api.models.rfband.RfBandListPageAsync
import com.unifieddatalibrary.api.models.rfband.RfBandListParams
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpParams
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpResponse
import com.unifieddatalibrary.api.models.rfband.RfBandTupleParams
import com.unifieddatalibrary.api.models.rfband.RfBandUpdateParams
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RfBandServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandServiceAsync

    /** Service operation to take a single RFBand as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: RfBandCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RfBandCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update an RFBand. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: RfBandUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: RfBandUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<RfBandListPageAsync> = list(RfBandListParams.none())

    /** @see list */
    fun list(params: RfBandListParams = RfBandListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RfBandListPageAsync>

    /** @see list */
    fun list(params: RfBandListParams = RfBandListParams.none()): CompletableFuture<RfBandListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RfBandListPageAsync> =
        list(
          RfBandListParams.none(), requestOptions
        )

    /** Service operation to delete an RFBand specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, RfBandDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RfBandDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          RfBandDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(RfBandCountParams.none())

    /** @see count */
    fun count(params: RfBandCountParams = RfBandCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: RfBandCountParams = RfBandCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          RfBandCountParams.none(), requestOptions
        )

    /** Service operation to get a single RFBand by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<RfBandFull> =
        get(
          id, RfBandGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RfBandGetParams = RfBandGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RfBandFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RfBandGetParams = RfBandGetParams.none()): CompletableFuture<RfBandFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RfBandGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RfBandFull>

    /** @see get */
    fun get(params: RfBandGetParams): CompletableFuture<RfBandFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<RfBandFull> =
        get(
          id,
          RfBandGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<RfBandQueryhelpResponse> = queryhelp(RfBandQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RfBandQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none()): CompletableFuture<RfBandQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<RfBandQueryhelpResponse> =
        queryhelp(
          RfBandQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RfBandTupleParams): CompletableFuture<List<RfBandFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<RfBandFull>>

    /** A view of [RfBandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/rfband`, but is otherwise the same as [RfBandServiceAsync.create]. */
        fun create(params: RfBandCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: RfBandCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/rfband/{id}`, but is otherwise the same as [RfBandServiceAsync.update]. */
        fun update(pathId: String, params: RfBandUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: RfBandUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/rfband`, but is otherwise the same as [RfBandServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<RfBandListPageAsync>> = list(RfBandListParams.none())

        /** @see list */
        fun list(params: RfBandListParams = RfBandListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RfBandListPageAsync>>

        /** @see list */
        fun list(params: RfBandListParams = RfBandListParams.none()): CompletableFuture<HttpResponseFor<RfBandListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandListPageAsync>> =
            list(
              RfBandListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/rfband/{id}`, but is otherwise the same as [RfBandServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, RfBandDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RfBandDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              RfBandDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfband/count`, but is otherwise the same as [RfBandServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(RfBandCountParams.none())

        /** @see count */
        fun count(params: RfBandCountParams = RfBandCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: RfBandCountParams = RfBandCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              RfBandCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfband/{id}`, but is otherwise the same as [RfBandServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<RfBandFull>> =
            get(
              id, RfBandGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: RfBandGetParams = RfBandGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RfBandFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: RfBandGetParams = RfBandGetParams.none()): CompletableFuture<HttpResponseFor<RfBandFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: RfBandGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RfBandFull>>

        /** @see get */
        fun get(params: RfBandGetParams): CompletableFuture<HttpResponseFor<RfBandFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandFull>> =
            get(
              id,
              RfBandGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfband/queryhelp`, but is otherwise the same as [RfBandServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<RfBandQueryhelpResponse>> = queryhelp(RfBandQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RfBandQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none()): CompletableFuture<HttpResponseFor<RfBandQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandQueryhelpResponse>> =
            queryhelp(
              RfBandQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfband/tuple`, but is otherwise the same as [RfBandServiceAsync.tuple]. */
        fun tuple(params: RfBandTupleParams): CompletableFuture<HttpResponseFor<List<RfBandFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<RfBandFull>>>
    }
}
