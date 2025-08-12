// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.site

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.site.operations.OperationCountParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateBulkParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateParams
import com.unifieddatalibrary.api.models.site.operations.OperationDeleteParams
import com.unifieddatalibrary.api.models.site.operations.OperationListPageAsync
import com.unifieddatalibrary.api.models.site.operations.OperationListParams
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpParams
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpResponse
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveParams
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveResponse
import com.unifieddatalibrary.api.models.site.operations.OperationTupleParams
import com.unifieddatalibrary.api.models.site.operations.OperationTupleResponse
import com.unifieddatalibrary.api.models.site.operations.OperationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.site.operations.OperationUpdateParams
import com.unifieddatalibrary.api.services.async.site.OperationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OperationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationServiceAsync

    /** Service operation to take a single siteoperations object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OperationCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OperationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single siteoperations record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<OperationRetrieveResponse> =
        retrieve(
          id, OperationRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperationRetrieveResponse> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none()): CompletableFuture<OperationRetrieveResponse> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OperationRetrieveParams): CompletableFuture<OperationRetrieveResponse> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<OperationRetrieveResponse> =
        retrieve(
          id,
          OperationRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single siteoperations record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OperationUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OperationUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: OperationListParams): CompletableFuture<OperationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: OperationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperationListPageAsync>

    /** Service operation to delete a siteoperations record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OperationDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OperationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OperationDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OperationDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: OperationCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: OperationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of siteoperations records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OperationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<OperationQueryHelpResponse> = queryHelp(OperationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OperationQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none()): CompletableFuture<OperationQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<OperationQueryHelpResponse> =
        queryHelp(
          OperationQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OperationTupleParams): CompletableFuture<List<OperationTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OperationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OperationTupleResponse>>

    /** Service operation to take multiple siteoperations records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: OperationUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [OperationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/siteoperations`, but is otherwise the same as [OperationServiceAsync.create]. */
        fun create(params: OperationCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OperationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/siteoperations/{id}`, but is otherwise the same as [OperationServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>> =
            retrieve(
              id, OperationRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none()): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(params: OperationRetrieveParams): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperationRetrieveResponse>> =
            retrieve(
              id,
              OperationRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/siteoperations/{id}`, but is otherwise the same as [OperationServiceAsync.update]. */
        fun update(pathId: String, params: OperationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OperationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/siteoperations`, but is otherwise the same as [OperationServiceAsync.list]. */
        fun list(params: OperationListParams): CompletableFuture<HttpResponseFor<OperationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: OperationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperationListPageAsync>>

        /** Returns a raw HTTP response for `delete /udl/siteoperations/{id}`, but is otherwise the same as [OperationServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OperationDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OperationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OperationDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OperationDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/siteoperations/count`, but is otherwise the same as [OperationServiceAsync.count]. */
        fun count(params: OperationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: OperationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/siteoperations/createBulk`, but is otherwise the same as [OperationServiceAsync.createBulk]. */
        fun createBulk(params: OperationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/siteoperations/queryhelp`, but is otherwise the same as [OperationServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<OperationQueryHelpResponse>> = queryHelp(OperationQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OperationQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none()): CompletableFuture<HttpResponseFor<OperationQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperationQueryHelpResponse>> =
            queryHelp(
              OperationQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/siteoperations/tuple`, but is otherwise the same as [OperationServiceAsync.tuple]. */
        fun tuple(params: OperationTupleParams): CompletableFuture<HttpResponseFor<List<OperationTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: OperationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OperationTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-siteoperations`, but is otherwise the same as [OperationServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: OperationUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
