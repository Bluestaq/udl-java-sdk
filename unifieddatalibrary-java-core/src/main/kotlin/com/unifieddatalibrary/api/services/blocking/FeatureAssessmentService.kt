// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentService
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryService
import java.util.function.Consumer

interface FeatureAssessmentService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentService

    fun history(): HistoryService

    /** Service operation to take a single FeatureAssessment record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: FeatureAssessmentCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single FeatureAssessment record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): FeatureAssessmentRetrieveResponse =
        retrieve(
          id, FeatureAssessmentRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): FeatureAssessmentRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none()): FeatureAssessmentRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): FeatureAssessmentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FeatureAssessmentRetrieveParams): FeatureAssessmentRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FeatureAssessmentRetrieveResponse =
        retrieve(
          id,
          FeatureAssessmentRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: FeatureAssessmentCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of FeatureAssessment records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: FeatureAssessmentCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: FeatureAssessmentQueryParams): List<FeatureAssessmentQueryResponse> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions = RequestOptions.none()): List<FeatureAssessmentQueryResponse>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): FeatureAssessmentQueryHelpResponse = queryHelp(FeatureAssessmentQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): FeatureAssessmentQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none()): FeatureAssessmentQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): FeatureAssessmentQueryHelpResponse =
        queryHelp(
          FeatureAssessmentQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: FeatureAssessmentTupleParams): List<FeatureAssessmentTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<FeatureAssessmentTupleResponse>

    /** Service operation to take multiple FeatureAssessment records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [FeatureAssessmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/featureassessment`, but is otherwise the same as [FeatureAssessmentService.create]. */
        @MustBeClosed
        fun create(params: FeatureAssessmentCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/featureassessment/{id}`, but is otherwise the same as [FeatureAssessmentService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FeatureAssessmentRetrieveResponse> =
            retrieve(
              id, FeatureAssessmentRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FeatureAssessmentRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: FeatureAssessmentRetrieveParams = FeatureAssessmentRetrieveParams.none()): HttpResponseFor<FeatureAssessmentRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FeatureAssessmentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FeatureAssessmentRetrieveParams): HttpResponseFor<FeatureAssessmentRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<FeatureAssessmentRetrieveResponse> =
            retrieve(
              id,
              FeatureAssessmentRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/featureassessment/count`, but is otherwise the same as [FeatureAssessmentService.count]. */
        @MustBeClosed
        fun count(params: FeatureAssessmentCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/featureassessment/createBulk`, but is otherwise the same as [FeatureAssessmentService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: FeatureAssessmentCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/featureassessment`, but is otherwise the same as [FeatureAssessmentService.query]. */
        @MustBeClosed
        fun query(params: FeatureAssessmentQueryParams): HttpResponseFor<List<FeatureAssessmentQueryResponse>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        @MustBeClosed
        fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<FeatureAssessmentQueryResponse>>

        /** Returns a raw HTTP response for `get /udl/featureassessment/queryhelp`, but is otherwise the same as [FeatureAssessmentService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<FeatureAssessmentQueryHelpResponse> = queryHelp(FeatureAssessmentQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FeatureAssessmentQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: FeatureAssessmentQueryHelpParams = FeatureAssessmentQueryHelpParams.none()): HttpResponseFor<FeatureAssessmentQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<FeatureAssessmentQueryHelpResponse> =
            queryHelp(
              FeatureAssessmentQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/featureassessment/tuple`, but is otherwise the same as [FeatureAssessmentService.tuple]. */
        @MustBeClosed
        fun tuple(params: FeatureAssessmentTupleParams): HttpResponseFor<List<FeatureAssessmentTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<FeatureAssessmentTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-featureassessment`, but is otherwise the same as [FeatureAssessmentService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
