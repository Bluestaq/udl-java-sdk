// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ConjunctionFull
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCountParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCreateBulkParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCreateUdlParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionGetHistoryParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionListPageAsync
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionListParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionQueryhelpParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionQueryhelpResponse
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionRetrieveParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionTupleParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionUploadConjunctionDataMessageParams
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsync
import com.unifieddatalibrary.api.services.async.conjunctions.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConjunctionServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConjunctionServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to get a single conjunction by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<ConjunctionFull> =
        retrieve(
          id, ConjunctionRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: ConjunctionRetrieveParams = ConjunctionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ConjunctionFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: ConjunctionRetrieveParams = ConjunctionRetrieveParams.none()): CompletableFuture<ConjunctionFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: ConjunctionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ConjunctionFull>

    /** @see retrieve */
    fun retrieve(params: ConjunctionRetrieveParams): CompletableFuture<ConjunctionFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ConjunctionFull> =
        retrieve(
          id,
          ConjunctionRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: ConjunctionListParams): CompletableFuture<ConjunctionListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: ConjunctionListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ConjunctionListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: ConjunctionCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: ConjunctionCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to take a single Conjunction as a POST body and ingest into the database. A Conjunction is analysis of probability of collision; the data can include state vectors for primary and secondary satellites. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createUdl(params: ConjunctionCreateUdlParams): CompletableFuture<Void?> =
        createUdl(
          params, RequestOptions.none()
        )

    /** @see createUdl */
    fun createUdl(params: ConjunctionCreateUdlParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation intended for initial integration only, to take a list of Conjunctions as a POST body and ingest into the database. A Conjunction is analysis of probability of collision; the data can include state vectors for primary and secondary satellites. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: ConjunctionCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: ConjunctionCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun getHistory(params: ConjunctionGetHistoryParams): CompletableFuture<List<ConjunctionFull>> =
        getHistory(
          params, RequestOptions.none()
        )

    /** @see getHistory */
    fun getHistory(params: ConjunctionGetHistoryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ConjunctionFull>>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<ConjunctionQueryhelpResponse> = queryhelp(ConjunctionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ConjunctionQueryhelpParams = ConjunctionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ConjunctionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: ConjunctionQueryhelpParams = ConjunctionQueryhelpParams.none()): CompletableFuture<ConjunctionQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ConjunctionQueryhelpResponse> =
        queryhelp(
          ConjunctionQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ConjunctionTupleParams): CompletableFuture<List<ConjunctionFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ConjunctionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ConjunctionFull>>

    /** Service operation to take a list of Conjunctions as a POST body and ingest into the database. A Conjunction is analysis of probability of collision; the data can include state vectors for primary and secondary satellites. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: ConjunctionUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: ConjunctionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /**
     * Service to accept multiple CDMs in as zip file or a single CDM as payload. The service converts key-value pair formatted CDMs to UDL formats and stores them. The CDM format is as described in https://ccsds.org document CCSDS 508.0-B-1. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     *
     * **Example:** /filedrop/cdms?filename=conj.zip&classification=U&dataMode=TEST&source=Bluestaq&tags=tag1,tag2
     */
    fun uploadConjunctionDataMessage(fileContent: String, params: ConjunctionUploadConjunctionDataMessageParams): CompletableFuture<Void?> =
        uploadConjunctionDataMessage(
          fileContent,
          params,
          RequestOptions.none(),
        )

    /** @see uploadConjunctionDataMessage */
    fun uploadConjunctionDataMessage(fileContent: String, params: ConjunctionUploadConjunctionDataMessageParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        uploadConjunctionDataMessage(
          params.toBuilder()
              .fileContent(fileContent)
              .build(), requestOptions
        )

    /** @see uploadConjunctionDataMessage */
    fun uploadConjunctionDataMessage(params: ConjunctionUploadConjunctionDataMessageParams): CompletableFuture<Void?> =
        uploadConjunctionDataMessage(
          params, RequestOptions.none()
        )

    /** @see uploadConjunctionDataMessage */
    fun uploadConjunctionDataMessage(params: ConjunctionUploadConjunctionDataMessageParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [ConjunctionServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConjunctionServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/conjunction/{id}`, but is otherwise the same as [ConjunctionServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ConjunctionFull>> =
            retrieve(
              id, ConjunctionRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: ConjunctionRetrieveParams = ConjunctionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ConjunctionFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: ConjunctionRetrieveParams = ConjunctionRetrieveParams.none()): CompletableFuture<HttpResponseFor<ConjunctionFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: ConjunctionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ConjunctionFull>>

        /** @see retrieve */
        fun retrieve(params: ConjunctionRetrieveParams): CompletableFuture<HttpResponseFor<ConjunctionFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ConjunctionFull>> =
            retrieve(
              id,
              ConjunctionRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/conjunction`, but is otherwise the same as [ConjunctionServiceAsync.list]. */
        fun list(params: ConjunctionListParams): CompletableFuture<HttpResponseFor<ConjunctionListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: ConjunctionListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ConjunctionListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/conjunction/count`, but is otherwise the same as [ConjunctionServiceAsync.count]. */
        fun count(params: ConjunctionCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: ConjunctionCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/conjunction`, but is otherwise the same as [ConjunctionServiceAsync.createUdl]. */
        fun createUdl(params: ConjunctionCreateUdlParams): CompletableFuture<HttpResponse> =
            createUdl(
              params, RequestOptions.none()
            )

        /** @see createUdl */
        fun createUdl(params: ConjunctionCreateUdlParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `post /udl/conjunction/createBulk`, but is otherwise the same as [ConjunctionServiceAsync.createBulk]. */
        fun createBulk(params: ConjunctionCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: ConjunctionCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/conjunction/history`, but is otherwise the same as [ConjunctionServiceAsync.getHistory]. */
        fun getHistory(params: ConjunctionGetHistoryParams): CompletableFuture<HttpResponseFor<List<ConjunctionFull>>> =
            getHistory(
              params, RequestOptions.none()
            )

        /** @see getHistory */
        fun getHistory(params: ConjunctionGetHistoryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ConjunctionFull>>>

        /** Returns a raw HTTP response for `get /udl/conjunction/queryhelp`, but is otherwise the same as [ConjunctionServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ConjunctionQueryhelpResponse>> = queryhelp(ConjunctionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: ConjunctionQueryhelpParams = ConjunctionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ConjunctionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: ConjunctionQueryhelpParams = ConjunctionQueryhelpParams.none()): CompletableFuture<HttpResponseFor<ConjunctionQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ConjunctionQueryhelpResponse>> =
            queryhelp(
              ConjunctionQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/conjunction/tuple`, but is otherwise the same as [ConjunctionServiceAsync.tuple]. */
        fun tuple(params: ConjunctionTupleParams): CompletableFuture<HttpResponseFor<List<ConjunctionFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: ConjunctionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ConjunctionFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-conjunction`, but is otherwise the same as [ConjunctionServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: ConjunctionUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: ConjunctionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `post /filedrop/cdms`, but is otherwise the same as [ConjunctionServiceAsync.uploadConjunctionDataMessage]. */
        fun uploadConjunctionDataMessage(fileContent: String, params: ConjunctionUploadConjunctionDataMessageParams): CompletableFuture<HttpResponse> =
            uploadConjunctionDataMessage(
              fileContent,
              params,
              RequestOptions.none(),
            )

        /** @see uploadConjunctionDataMessage */
        fun uploadConjunctionDataMessage(fileContent: String, params: ConjunctionUploadConjunctionDataMessageParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            uploadConjunctionDataMessage(
              params.toBuilder()
                  .fileContent(fileContent)
                  .build(), requestOptions
            )

        /** @see uploadConjunctionDataMessage */
        fun uploadConjunctionDataMessage(params: ConjunctionUploadConjunctionDataMessageParams): CompletableFuture<HttpResponse> =
            uploadConjunctionDataMessage(
              params, RequestOptions.none()
            )

        /** @see uploadConjunctionDataMessage */
        fun uploadConjunctionDataMessage(params: ConjunctionUploadConjunctionDataMessageParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
