// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCountParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateBulkParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementDeleteParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AviationRiskManagementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AviationRiskManagementServiceAsync

    /**
     * Service operation to take a single Aviation Risk Management record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: AviationRiskManagementCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AviationRiskManagementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Aviation Risk Management record by its unique ID passed as
     * a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<AviationRiskManagementRetrieveResponse> =
        retrieve(id, AviationRiskManagementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AviationRiskManagementRetrieveParams = AviationRiskManagementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AviationRiskManagementRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AviationRiskManagementRetrieveParams = AviationRiskManagementRetrieveParams.none(),
    ): CompletableFuture<AviationRiskManagementRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AviationRiskManagementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AviationRiskManagementRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AviationRiskManagementRetrieveParams
    ): CompletableFuture<AviationRiskManagementRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AviationRiskManagementRetrieveResponse> =
        retrieve(id, AviationRiskManagementRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Aviation Risk Management record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(
        pathId: String,
        params: AviationRiskManagementUpdateParams,
    ): CompletableFuture<Void?> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AviationRiskManagementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AviationRiskManagementUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AviationRiskManagementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to delete an Aviation Risk Management record specified by the passed ID
     * path parameter. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, AviationRiskManagementDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AviationRiskManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AviationRiskManagementDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AviationRiskManagementDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AviationRiskManagementCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AviationRiskManagementCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of Aviation Risk
     * Management records as a POST body and ingest into the database. This operation is not
     * intended to be used for automated feeds into UDL. Data providers should contact the UDL team
     * for specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: AviationRiskManagementCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AviationRiskManagementCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun query(
        params: AviationRiskManagementQueryParams
    ): CompletableFuture<List<AviationRiskManagementQueryResponse>> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: AviationRiskManagementQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AviationRiskManagementQueryResponse>>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<AviationRiskManagementQueryHelpResponse> =
        queryHelp(AviationRiskManagementQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: AviationRiskManagementQueryHelpParams =
            AviationRiskManagementQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AviationRiskManagementQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: AviationRiskManagementQueryHelpParams = AviationRiskManagementQueryHelpParams.none()
    ): CompletableFuture<AviationRiskManagementQueryHelpResponse> =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AviationRiskManagementQueryHelpResponse> =
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
    ): CompletableFuture<List<AviationRiskManagementTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AviationRiskManagementTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AviationRiskManagementTupleResponse>>

    /**
     * Service operation to take multiple Aviation Risk Management records as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: AviationRiskManagementUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AviationRiskManagementUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AviationRiskManagementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AviationRiskManagementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aviationriskmanagement`, but is otherwise the
         * same as [AviationRiskManagementServiceAsync.create].
         */
        fun create(params: AviationRiskManagementCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AviationRiskManagementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/{id}`, but is otherwise
         * the same as [AviationRiskManagementServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>> =
            retrieve(id, AviationRiskManagementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AviationRiskManagementRetrieveParams =
                AviationRiskManagementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AviationRiskManagementRetrieveParams =
                AviationRiskManagementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AviationRiskManagementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AviationRiskManagementRetrieveParams
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementRetrieveResponse>> =
            retrieve(id, AviationRiskManagementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/aviationriskmanagement/{id}`, but is otherwise
         * the same as [AviationRiskManagementServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: AviationRiskManagementUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AviationRiskManagementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AviationRiskManagementUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AviationRiskManagementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /udl/aviationriskmanagement/{id}`, but is
         * otherwise the same as [AviationRiskManagementServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AviationRiskManagementDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AviationRiskManagementDeleteParams = AviationRiskManagementDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AviationRiskManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AviationRiskManagementDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AviationRiskManagementDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/count`, but is otherwise
         * the same as [AviationRiskManagementServiceAsync.count].
         */
        fun count(
            params: AviationRiskManagementCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AviationRiskManagementCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/aviationriskmanagement/createBulk`, but is
         * otherwise the same as [AviationRiskManagementServiceAsync.createBulk].
         */
        fun createBulk(
            params: AviationRiskManagementCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: AviationRiskManagementCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement`, but is otherwise the
         * same as [AviationRiskManagementServiceAsync.query].
         */
        fun query(
            params: AviationRiskManagementQueryParams
        ): CompletableFuture<HttpResponseFor<List<AviationRiskManagementQueryResponse>>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: AviationRiskManagementQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AviationRiskManagementQueryResponse>>>

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/queryhelp`, but is
         * otherwise the same as [AviationRiskManagementServiceAsync.queryHelp].
         */
        fun queryHelp():
            CompletableFuture<HttpResponseFor<AviationRiskManagementQueryHelpResponse>> =
            queryHelp(AviationRiskManagementQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: AviationRiskManagementQueryHelpParams =
                AviationRiskManagementQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: AviationRiskManagementQueryHelpParams =
                AviationRiskManagementQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AviationRiskManagementQueryHelpResponse>> =
            queryHelp(AviationRiskManagementQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aviationriskmanagement/tuple`, but is otherwise
         * the same as [AviationRiskManagementServiceAsync.tuple].
         */
        fun tuple(
            params: AviationRiskManagementTupleParams
        ): CompletableFuture<HttpResponseFor<List<AviationRiskManagementTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AviationRiskManagementTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AviationRiskManagementTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aviationriskmanagement`, but is
         * otherwise the same as [AviationRiskManagementServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: AviationRiskManagementUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: AviationRiskManagementUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
