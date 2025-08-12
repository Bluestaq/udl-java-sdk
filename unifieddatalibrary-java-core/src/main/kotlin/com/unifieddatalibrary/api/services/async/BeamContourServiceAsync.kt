// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BeamcontourFull
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCountParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateBulkParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourDeleteParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListPageAsync
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpResponse
import com.unifieddatalibrary.api.models.beamcontours.BeamContourRetrieveParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourTupleParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourUpdateParams
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BeamContourServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourServiceAsync

    /** Service operation to take a single BeamContour as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: BeamContourCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: BeamContourCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single BeamContour by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<BeamcontourFull> =
        retrieve(
          id, BeamContourRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamcontourFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: BeamContourRetrieveParams = BeamContourRetrieveParams.none()): CompletableFuture<BeamcontourFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: BeamContourRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamcontourFull>

    /** @see retrieve */
    fun retrieve(params: BeamContourRetrieveParams): CompletableFuture<BeamcontourFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BeamcontourFull> =
        retrieve(
          id,
          BeamContourRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single BeamContour. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: BeamContourUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: BeamContourUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: BeamContourUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: BeamContourUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: BeamContourListParams): CompletableFuture<BeamContourListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: BeamContourListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamContourListPageAsync>

    /** Service operation to delete a BeamContour object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, BeamContourDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: BeamContourDeleteParams = BeamContourDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: BeamContourDeleteParams = BeamContourDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: BeamContourDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BeamContourDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          BeamContourDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: BeamContourCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: BeamContourCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to take a list of BeamContours as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: BeamContourCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: BeamContourCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<BeamContourQueryHelpResponse> = queryHelp(BeamContourQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BeamContourQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none()): CompletableFuture<BeamContourQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<BeamContourQueryHelpResponse> =
        queryHelp(
          BeamContourQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: BeamContourTupleParams): CompletableFuture<List<BeamcontourFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: BeamContourTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<BeamcontourFull>>

    /** A view of [BeamContourServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/beamcontour`, but is otherwise the same as [BeamContourServiceAsync.create]. */
        fun create(params: BeamContourCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: BeamContourCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/beamcontour/{id}`, but is otherwise the same as [BeamContourServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BeamcontourFull>> =
            retrieve(
              id, BeamContourRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamcontourFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: BeamContourRetrieveParams = BeamContourRetrieveParams.none()): CompletableFuture<HttpResponseFor<BeamcontourFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: BeamContourRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamcontourFull>>

        /** @see retrieve */
        fun retrieve(params: BeamContourRetrieveParams): CompletableFuture<HttpResponseFor<BeamcontourFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamcontourFull>> =
            retrieve(
              id,
              BeamContourRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/beamcontour/{id}`, but is otherwise the same as [BeamContourServiceAsync.update]. */
        fun update(pathId: String, params: BeamContourUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: BeamContourUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: BeamContourUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: BeamContourUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/beamcontour`, but is otherwise the same as [BeamContourServiceAsync.list]. */
        fun list(params: BeamContourListParams): CompletableFuture<HttpResponseFor<BeamContourListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: BeamContourListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamContourListPageAsync>>

        /** Returns a raw HTTP response for `delete /udl/beamcontour/{id}`, but is otherwise the same as [BeamContourServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, BeamContourDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: BeamContourDeleteParams = BeamContourDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: BeamContourDeleteParams = BeamContourDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: BeamContourDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BeamContourDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              BeamContourDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/beamcontour/count`, but is otherwise the same as [BeamContourServiceAsync.count]. */
        fun count(params: BeamContourCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: BeamContourCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/beamcontour/createBulk`, but is otherwise the same as [BeamContourServiceAsync.createBulk]. */
        fun createBulk(params: BeamContourCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: BeamContourCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/beamcontour/queryhelp`, but is otherwise the same as [BeamContourServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<BeamContourQueryHelpResponse>> = queryHelp(BeamContourQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BeamContourQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none()): CompletableFuture<HttpResponseFor<BeamContourQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamContourQueryHelpResponse>> =
            queryHelp(
              BeamContourQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/beamcontour/tuple`, but is otherwise the same as [BeamContourServiceAsync.tuple]. */
        fun tuple(params: BeamContourTupleParams): CompletableFuture<HttpResponseFor<List<BeamcontourFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: BeamContourTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<BeamcontourFull>>>
    }
}
