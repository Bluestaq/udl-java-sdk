// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCountParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCreateParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusDeleteParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListPageAsync
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusUpdateParams
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import com.unifieddatalibrary.api.services.async.sitestatus.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiteStatusServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteStatusServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single SiteStatus object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SiteStatusCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SiteStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single SiteStatus object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SiteStatusUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SiteStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SiteStatusUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SiteStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SiteStatusListPageAsync> = list(SiteStatusListParams.none())

    /** @see list */
    fun list(params: SiteStatusListParams = SiteStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteStatusListPageAsync>

    /** @see list */
    fun list(params: SiteStatusListParams = SiteStatusListParams.none()): CompletableFuture<SiteStatusListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SiteStatusListPageAsync> =
        list(
          SiteStatusListParams.none(), requestOptions
        )

    /** Service operation to delete an SiteStatus object specified by the passed ID path parameter. Note, delete operations do not remove data from historical or publish/subscribe stores. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SiteStatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SiteStatusDeleteParams = SiteStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SiteStatusDeleteParams = SiteStatusDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SiteStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SiteStatusDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SiteStatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SiteStatusCountParams.none())

    /** @see count */
    fun count(params: SiteStatusCountParams = SiteStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SiteStatusCountParams = SiteStatusCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SiteStatusCountParams.none(), requestOptions
        )

    /** Service operation to get a single SiteStatus record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SiteStatusGetResponse> =
        get(
          id, SiteStatusGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SiteStatusGetParams = SiteStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteStatusGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SiteStatusGetParams = SiteStatusGetParams.none()): CompletableFuture<SiteStatusGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SiteStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteStatusGetResponse>

    /** @see get */
    fun get(params: SiteStatusGetParams): CompletableFuture<SiteStatusGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SiteStatusGetResponse> =
        get(
          id,
          SiteStatusGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SiteStatusQueryhelpResponse> = queryhelp(SiteStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SiteStatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none()): CompletableFuture<SiteStatusQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SiteStatusQueryhelpResponse> =
        queryhelp(
          SiteStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SiteStatusTupleParams): CompletableFuture<List<SiteStatusTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SiteStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SiteStatusTupleResponse>>

    /** A view of [SiteStatusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteStatusServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sitestatus`, but is otherwise the same as [SiteStatusServiceAsync.create]. */
        fun create(params: SiteStatusCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SiteStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/sitestatus/{id}`, but is otherwise the same as [SiteStatusServiceAsync.update]. */
        fun update(pathId: String, params: SiteStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SiteStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SiteStatusUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SiteStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/sitestatus`, but is otherwise the same as [SiteStatusServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SiteStatusListPageAsync>> = list(SiteStatusListParams.none())

        /** @see list */
        fun list(params: SiteStatusListParams = SiteStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteStatusListPageAsync>>

        /** @see list */
        fun list(params: SiteStatusListParams = SiteStatusListParams.none()): CompletableFuture<HttpResponseFor<SiteStatusListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteStatusListPageAsync>> =
            list(
              SiteStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/sitestatus/{id}`, but is otherwise the same as [SiteStatusServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SiteStatusDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SiteStatusDeleteParams = SiteStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SiteStatusDeleteParams = SiteStatusDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SiteStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SiteStatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SiteStatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sitestatus/count`, but is otherwise the same as [SiteStatusServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SiteStatusCountParams.none())

        /** @see count */
        fun count(params: SiteStatusCountParams = SiteStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SiteStatusCountParams = SiteStatusCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SiteStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sitestatus/{id}`, but is otherwise the same as [SiteStatusServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>> =
            get(
              id, SiteStatusGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SiteStatusGetParams = SiteStatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SiteStatusGetParams = SiteStatusGetParams.none()): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SiteStatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>>

        /** @see get */
        fun get(params: SiteStatusGetParams): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteStatusGetResponse>> =
            get(
              id,
              SiteStatusGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sitestatus/queryhelp`, but is otherwise the same as [SiteStatusServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SiteStatusQueryhelpResponse>> = queryhelp(SiteStatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SiteStatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SiteStatusQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteStatusQueryhelpResponse>> =
            queryhelp(
              SiteStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sitestatus/tuple`, but is otherwise the same as [SiteStatusServiceAsync.tuple]. */
        fun tuple(params: SiteStatusTupleParams): CompletableFuture<HttpResponseFor<List<SiteStatusTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SiteStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SiteStatusTupleResponse>>>
    }
}
