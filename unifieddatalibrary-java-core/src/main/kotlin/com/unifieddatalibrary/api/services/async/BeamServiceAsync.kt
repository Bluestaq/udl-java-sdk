// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BeamFull
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamDeleteParams
import com.unifieddatalibrary.api.models.beam.BeamListPageAsync
import com.unifieddatalibrary.api.models.beam.BeamListParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpResponse
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BeamServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamServiceAsync

    /** Service operation to take a single Beam as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: BeamCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: BeamCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Beam record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<BeamFull> =
        retrieve(
          id, BeamRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BeamRetrieveParams = BeamRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BeamRetrieveParams = BeamRetrieveParams.none()): CompletableFuture<BeamFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamFull>

    /** @see retrieve */
    fun retrieve(params: BeamRetrieveParams): CompletableFuture<BeamFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BeamFull> =
        retrieve(
          id,
          BeamRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Beam. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: BeamUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: BeamUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: BeamUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: BeamUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<BeamListPageAsync> = list(BeamListParams.none())

    /** @see list */
    fun list(params: BeamListParams = BeamListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamListPageAsync>

    /** @see list */
    fun list(params: BeamListParams = BeamListParams.none()): CompletableFuture<BeamListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BeamListPageAsync> =
        list(
          BeamListParams.none(), requestOptions
        )

    /** Service operation to delete a Beam object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, BeamDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: BeamDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BeamDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          BeamDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(BeamCountParams.none())

    /** @see count */
    fun count(params: BeamCountParams = BeamCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: BeamCountParams = BeamCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          BeamCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<BeamQueryHelpResponse> = queryHelp(BeamQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: BeamQueryHelpParams = BeamQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: BeamQueryHelpParams = BeamQueryHelpParams.none()): CompletableFuture<BeamQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<BeamQueryHelpResponse> =
        queryHelp(
          BeamQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: BeamTupleParams): CompletableFuture<List<BeamFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: BeamTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<BeamFull>>

    /** A view of [BeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/beam`, but is otherwise the same as [BeamServiceAsync.create]. */
        fun create(params: BeamCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: BeamCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/beam/{id}`, but is otherwise the same as [BeamServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BeamFull>> =
            retrieve(
              id, BeamRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BeamRetrieveParams = BeamRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BeamRetrieveParams = BeamRetrieveParams.none()): CompletableFuture<HttpResponseFor<BeamFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamFull>>

        /** @see retrieve */
        fun retrieve(params: BeamRetrieveParams): CompletableFuture<HttpResponseFor<BeamFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamFull>> =
            retrieve(
              id,
              BeamRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/beam/{id}`, but is otherwise the same as [BeamServiceAsync.update]. */
        fun update(pathId: String, params: BeamUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: BeamUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: BeamUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: BeamUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/beam`, but is otherwise the same as [BeamServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<BeamListPageAsync>> = list(BeamListParams.none())

        /** @see list */
        fun list(params: BeamListParams = BeamListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamListPageAsync>>

        /** @see list */
        fun list(params: BeamListParams = BeamListParams.none()): CompletableFuture<HttpResponseFor<BeamListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamListPageAsync>> =
            list(
              BeamListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/beam/{id}`, but is otherwise the same as [BeamServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, BeamDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: BeamDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BeamDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              BeamDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/beam/count`, but is otherwise the same as [BeamServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(BeamCountParams.none())

        /** @see count */
        fun count(params: BeamCountParams = BeamCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: BeamCountParams = BeamCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              BeamCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/beam/queryhelp`, but is otherwise the same as [BeamServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<BeamQueryHelpResponse>> = queryHelp(BeamQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: BeamQueryHelpParams = BeamQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: BeamQueryHelpParams = BeamQueryHelpParams.none()): CompletableFuture<HttpResponseFor<BeamQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamQueryHelpResponse>> =
            queryHelp(
              BeamQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/beam/tuple`, but is otherwise the same as [BeamServiceAsync.tuple]. */
        fun tuple(params: BeamTupleParams): CompletableFuture<HttpResponseFor<List<BeamFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: BeamTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<BeamFull>>>
    }
}
