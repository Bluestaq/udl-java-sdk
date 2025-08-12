// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCountParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateBulkParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.featureassessment.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeatureAssessmentServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single FeatureAssessment record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: FeatureAssessmentCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single FeatureAssessment record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        retrieve(
          id, FeatureAssessmentRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none()): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FeatureAssessmentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FeatureAssessmentRetrieveParams): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        retrieve(
          id,
          FeatureAssessmentRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: FeatureAssessmentCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of FeatureAssessment records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: FeatureAssessmentCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: FeatureAssessmentQueryParams): CompletableFuture<List<FeatureAssessmentQueryResponse>> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<FeatureAssessmentQueryResponse>>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<FeatureAssessmentQueryHelpResponse> = queryHelp(FeatureAssessmentQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FeatureAssessmentQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none()): CompletableFuture<FeatureAssessmentQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<FeatureAssessmentQueryHelpResponse> =
        queryHelp(
          FeatureAssessmentQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: FeatureAssessmentTupleParams): CompletableFuture<List<FeatureAssessmentTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<FeatureAssessmentTupleResponse>>

    /** Service operation to take multiple FeatureAssessment records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [FeatureAssessmentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/featureassessment`, but is otherwise the same as [FeatureAssessmentServiceAsync.create]. */
        fun create(params: FeatureAssessmentCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/featureassessment/{id}`, but is otherwise the same as [FeatureAssessmentServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> =
            retrieve(
              id, FeatureAssessmentRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none()): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(params: FeatureAssessmentRetrieveParams): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> =
            retrieve(
              id,
              FeatureAssessmentRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/featureassessment/count`, but is otherwise the same as [FeatureAssessmentServiceAsync.count]. */
        fun count(params: FeatureAssessmentCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/featureassessment/createBulk`, but is otherwise the same as [FeatureAssessmentServiceAsync.createBulk]. */
        fun createBulk(params: FeatureAssessmentCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/featureassessment`, but is otherwise the same as [FeatureAssessmentServiceAsync.query]. */
        fun query(params: FeatureAssessmentQueryParams): CompletableFuture<HttpResponseFor<List<FeatureAssessmentQueryResponse>>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<FeatureAssessmentQueryResponse>>>

        /** Returns a raw HTTP response for `get /udl/featureassessment/queryhelp`, but is otherwise the same as [FeatureAssessmentServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<FeatureAssessmentQueryHelpResponse>> = queryHelp(FeatureAssessmentQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FeatureAssessmentQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none()): CompletableFuture<HttpResponseFor<FeatureAssessmentQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FeatureAssessmentQueryHelpResponse>> =
            queryHelp(
              FeatureAssessmentQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/featureassessment/tuple`, but is otherwise the same as [FeatureAssessmentServiceAsync.tuple]. */
        fun tuple(params: FeatureAssessmentTupleParams): CompletableFuture<HttpResponseFor<List<FeatureAssessmentTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<FeatureAssessmentTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-featureassessment`, but is otherwise the same as [FeatureAssessmentServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
