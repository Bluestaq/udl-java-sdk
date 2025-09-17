// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCountParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateBulkParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementDeleteParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementListPage
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementListParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUpdateParams
import java.util.function.Consumer

interface AviationRiskManagementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AviationRiskManagementService

    /**
     * Service operation to take a single Aviation Risk Management record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: AviationRiskManagementCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AviationRiskManagementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single Aviation Risk Management record by its unique ID passed as
     * a path parameter.
     */
    fun retrieve(id: String): AviationRiskManagementRetrieveResponse =
        retrieve(id, AviationRiskManagementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AviationRiskManagementRetrieveParams = AviationRiskManagementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AviationRiskManagementRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AviationRiskManagementRetrieveParams = AviationRiskManagementRetrieveParams.none(),
    ): AviationRiskManagementRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AviationRiskManagementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AviationRiskManagementRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: AviationRiskManagementRetrieveParams
    ): AviationRiskManagementRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): AviationRiskManagementRetrieveResponse =
        retrieve(id, AviationRiskManagementRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Aviation Risk Management record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AviationRiskManagementUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AviationRiskManagementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AviationRiskManagementUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AviationRiskManagementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AviationRiskManagementListParams): AviationRiskManagementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AviationRiskManagementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AviationRiskManagementListPage

    /**
     * Service operation to delete an Aviation Risk Management record specified by the passed ID
     * path parameter. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, AviationRiskManagementDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AviationRiskManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AviationRiskManagementDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AviationRiskManagementDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AviationRiskManagementCountParams): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AviationRiskManagementCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Aviation Risk
     * Management records as a POST body and ingest into the database. This operation is not
     * intended to be used for automated feeds into UDL. Data providers should contact the UDL team
     * for specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: AviationRiskManagementCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AviationRiskManagementCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): AviationRiskManagementQueryHelpResponse =
        queryHelp(AviationRiskManagementQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: AviationRiskManagementQueryHelpParams =
            AviationRiskManagementQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AviationRiskManagementQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: AviationRiskManagementQueryHelpParams = AviationRiskManagementQueryHelpParams.none()
    ): AviationRiskManagementQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): AviationRiskManagementQueryHelpResponse =
        queryHelp(AviationRiskManagementQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: AviationRiskManagementTupleParams
    ): List<AviationRiskManagementTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AviationRiskManagementTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AviationRiskManagementTupleResponse>

    /**
     * Service operation to take multiple Aviation Risk Management records as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: AviationRiskManagementUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AviationRiskManagementUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AviationRiskManagementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AviationRiskManagementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aviationriskmanagement`, but is otherwise the
         * same as [AviationRiskManagementService.create].
         */
        @MustBeClosed
        fun create(params: AviationRiskManagementCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AviationRiskManagementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/{id}`, but is otherwise
         * the same as [AviationRiskManagementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AviationRiskManagementRetrieveResponse> =
            retrieve(id, AviationRiskManagementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AviationRiskManagementRetrieveParams =
                AviationRiskManagementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AviationRiskManagementRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AviationRiskManagementRetrieveParams =
                AviationRiskManagementRetrieveParams.none(),
        ): HttpResponseFor<AviationRiskManagementRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AviationRiskManagementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AviationRiskManagementRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AviationRiskManagementRetrieveParams
        ): HttpResponseFor<AviationRiskManagementRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AviationRiskManagementRetrieveResponse> =
            retrieve(id, AviationRiskManagementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/aviationriskmanagement/{id}`, but is otherwise
         * the same as [AviationRiskManagementService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: AviationRiskManagementUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: AviationRiskManagementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AviationRiskManagementUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AviationRiskManagementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement`, but is otherwise the
         * same as [AviationRiskManagementService.list].
         */
        @MustBeClosed
        fun list(
            params: AviationRiskManagementListParams
        ): HttpResponseFor<AviationRiskManagementListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AviationRiskManagementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AviationRiskManagementListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/aviationriskmanagement/{id}`, but is
         * otherwise the same as [AviationRiskManagementService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, AviationRiskManagementDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AviationRiskManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AviationRiskManagementDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AviationRiskManagementDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/count`, but is otherwise
         * the same as [AviationRiskManagementService.count].
         */
        @MustBeClosed
        fun count(params: AviationRiskManagementCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AviationRiskManagementCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/aviationriskmanagement/createBulk`, but is
         * otherwise the same as [AviationRiskManagementService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: AviationRiskManagementCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: AviationRiskManagementCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/queryhelp`, but is
         * otherwise the same as [AviationRiskManagementService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<AviationRiskManagementQueryHelpResponse> =
            queryHelp(AviationRiskManagementQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: AviationRiskManagementQueryHelpParams =
                AviationRiskManagementQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AviationRiskManagementQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: AviationRiskManagementQueryHelpParams =
                AviationRiskManagementQueryHelpParams.none()
        ): HttpResponseFor<AviationRiskManagementQueryHelpResponse> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<AviationRiskManagementQueryHelpResponse> =
            queryHelp(AviationRiskManagementQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/tuple`, but is otherwise
         * the same as [AviationRiskManagementService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: AviationRiskManagementTupleParams
        ): HttpResponseFor<List<AviationRiskManagementTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: AviationRiskManagementTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AviationRiskManagementTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aviationriskmanagement`, but is
         * otherwise the same as [AviationRiskManagementService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AviationRiskManagementUnvalidatedPublishParams
        ): HttpResponse = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AviationRiskManagementUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
