// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SolarArrayFull
import com.unifieddatalibrary.api.models.solararray.SolarArrayCountParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayCreateParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayDeleteParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayGetParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayListPageAsync
import com.unifieddatalibrary.api.models.solararray.SolarArrayListParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpResponse
import com.unifieddatalibrary.api.models.solararray.SolarArrayTupleParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayUpdateParams
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SolarArrayServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayServiceAsync

    /** Service operation to take a single SolarArray as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SolarArrayCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single SolarArray. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SolarArrayUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SolarArrayUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SolarArrayListPageAsync> = list(SolarArrayListParams.none())

    /** @see list */
    fun list(params: SolarArrayListParams = SolarArrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayListPageAsync>

    /** @see list */
    fun list(params: SolarArrayListParams = SolarArrayListParams.none()): CompletableFuture<SolarArrayListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SolarArrayListPageAsync> =
        list(
          SolarArrayListParams.none(), requestOptions
        )

    /** Service operation to delete a SolarArray object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SolarArrayDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SolarArrayDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SolarArrayDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SolarArrayCountParams.none())

    /** @see count */
    fun count(params: SolarArrayCountParams = SolarArrayCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SolarArrayCountParams = SolarArrayCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SolarArrayCountParams.none(), requestOptions
        )

    /** Service operation to get a single SolarArray record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SolarArrayFull> =
        get(
          id, SolarArrayGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none()): CompletableFuture<SolarArrayFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SolarArrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayFull>

    /** @see get */
    fun get(params: SolarArrayGetParams): CompletableFuture<SolarArrayFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SolarArrayFull> =
        get(
          id,
          SolarArrayGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SolarArrayQueryhelpResponse> = queryhelp(SolarArrayQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none()): CompletableFuture<SolarArrayQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SolarArrayQueryhelpResponse> =
        queryhelp(
          SolarArrayQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SolarArrayTupleParams): CompletableFuture<List<SolarArrayFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SolarArrayFull>>

    /** A view of [SolarArrayServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/solararray`, but is otherwise the same as [SolarArrayServiceAsync.create]. */
        fun create(params: SolarArrayCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/solararray/{id}`, but is otherwise the same as [SolarArrayServiceAsync.update]. */
        fun update(pathId: String, params: SolarArrayUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SolarArrayUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/solararray`, but is otherwise the same as [SolarArrayServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SolarArrayListPageAsync>> = list(SolarArrayListParams.none())

        /** @see list */
        fun list(params: SolarArrayListParams = SolarArrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayListPageAsync>>

        /** @see list */
        fun list(params: SolarArrayListParams = SolarArrayListParams.none()): CompletableFuture<HttpResponseFor<SolarArrayListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayListPageAsync>> =
            list(
              SolarArrayListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/solararray/{id}`, but is otherwise the same as [SolarArrayServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SolarArrayDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SolarArrayDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SolarArrayDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararray/count`, but is otherwise the same as [SolarArrayServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SolarArrayCountParams.none())

        /** @see count */
        fun count(params: SolarArrayCountParams = SolarArrayCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SolarArrayCountParams = SolarArrayCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SolarArrayCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/solararray/{id}`, but is otherwise the same as [SolarArrayServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SolarArrayFull>> =
            get(
              id, SolarArrayGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none()): CompletableFuture<HttpResponseFor<SolarArrayFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SolarArrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayFull>>

        /** @see get */
        fun get(params: SolarArrayGetParams): CompletableFuture<HttpResponseFor<SolarArrayFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayFull>> =
            get(
              id,
              SolarArrayGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararray/queryhelp`, but is otherwise the same as [SolarArrayServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SolarArrayQueryhelpResponse>> = queryhelp(SolarArrayQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SolarArrayQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayQueryhelpResponse>> =
            queryhelp(
              SolarArrayQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/solararray/tuple`, but is otherwise the same as [SolarArrayServiceAsync.tuple]. */
        fun tuple(params: SolarArrayTupleParams): CompletableFuture<HttpResponseFor<List<SolarArrayFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SolarArrayFull>>>
    }
}
