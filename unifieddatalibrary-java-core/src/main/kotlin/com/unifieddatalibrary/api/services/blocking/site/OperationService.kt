// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.site

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.site.operations.OperationCountParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateBulkParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateParams
import com.unifieddatalibrary.api.models.site.operations.OperationDeleteParams
import com.unifieddatalibrary.api.models.site.operations.OperationListPage
import com.unifieddatalibrary.api.models.site.operations.OperationListParams
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpParams
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpResponse
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveParams
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveResponse
import com.unifieddatalibrary.api.models.site.operations.OperationTupleParams
import com.unifieddatalibrary.api.models.site.operations.OperationTupleResponse
import com.unifieddatalibrary.api.models.site.operations.OperationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.site.operations.OperationUpdateParams
import com.unifieddatalibrary.api.services.blocking.site.OperationService
import java.util.function.Consumer

interface OperationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationService

    /** Service operation to take a single siteoperations object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OperationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OperationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single siteoperations record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): OperationRetrieveResponse =
        retrieve(
          id, OperationRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperationRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none()): OperationRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): OperationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OperationRetrieveParams): OperationRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): OperationRetrieveResponse =
        retrieve(
          id,
          OperationRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single siteoperations record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OperationUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OperationUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: OperationListParams): OperationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: OperationListParams, requestOptions: RequestOptions = RequestOptions.none()): OperationListPage

    /** Service operation to delete a siteoperations record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OperationDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OperationDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OperationDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OperationDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: OperationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: OperationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of siteoperations records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OperationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): OperationQueryHelpResponse = queryHelp(OperationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperationQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none()): OperationQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): OperationQueryHelpResponse =
        queryHelp(
          OperationQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OperationTupleParams): List<OperationTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OperationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OperationTupleResponse>

    /** Service operation to take multiple siteoperations records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: OperationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [OperationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/siteoperations`, but is otherwise the same as [OperationService.create]. */
        @MustBeClosed
        fun create(params: OperationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OperationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/siteoperations/{id}`, but is otherwise the same as [OperationService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<OperationRetrieveResponse> =
            retrieve(
              id, OperationRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperationRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: OperationRetrieveParams = OperationRetrieveParams.none()): HttpResponseFor<OperationRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OperationRetrieveParams): HttpResponseFor<OperationRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<OperationRetrieveResponse> =
            retrieve(
              id,
              OperationRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/siteoperations/{id}`, but is otherwise the same as [OperationService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OperationUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OperationUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OperationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/siteoperations`, but is otherwise the same as [OperationService.list]. */
        @MustBeClosed
        fun list(params: OperationListParams): HttpResponseFor<OperationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: OperationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperationListPage>

        /** Returns a raw HTTP response for `delete /udl/siteoperations/{id}`, but is otherwise the same as [OperationService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OperationDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OperationDeleteParams = OperationDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OperationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OperationDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OperationDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/siteoperations/count`, but is otherwise the same as [OperationService.count]. */
        @MustBeClosed
        fun count(params: OperationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: OperationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/siteoperations/createBulk`, but is otherwise the same as [OperationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: OperationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/siteoperations/queryhelp`, but is otherwise the same as [OperationService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<OperationQueryHelpResponse> = queryHelp(OperationQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperationQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: OperationQueryHelpParams = OperationQueryHelpParams.none()): HttpResponseFor<OperationQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<OperationQueryHelpResponse> =
            queryHelp(
              OperationQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/siteoperations/tuple`, but is otherwise the same as [OperationService.tuple]. */
        @MustBeClosed
        fun tuple(params: OperationTupleParams): HttpResponseFor<List<OperationTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OperationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OperationTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-siteoperations`, but is otherwise the same as [OperationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: OperationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
