// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.diplomaticclearance

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListPageAsync
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CountryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryServiceAsync

    /**
     * Service operation to take a single diplomaticclearancecountry record as a POST body and
     * ingest into the database. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: CountryCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CountryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single diplomaticclearancecountry record by its unique ID passed
     * as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<CountryRetrieveResponse> =
        retrieve(id, CountryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
    ): CompletableFuture<CountryRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams): CompletableFuture<CountryRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryRetrieveResponse> =
        retrieve(id, CountryRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single diplomaticclearancecountry record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: CountryUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: CountryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: CountryUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CountryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<CountryListPageAsync> = list(CountryListParams.none())

    /** @see list */
    fun list(
        params: CountryListParams = CountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryListPageAsync>

    /** @see list */
    fun list(
        params: CountryListParams = CountryListParams.none()
    ): CompletableFuture<CountryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CountryListPageAsync> =
        list(CountryListParams.none(), requestOptions)

    /**
     * Service operation to delete a diplomaticclearancecountry record specified by the passed ID
     * path parameter. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, CountryDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CountryDeleteParams = CountryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CountryDeleteParams = CountryDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CountryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CountryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, CountryDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(CountryCountParams.none())

    /** @see count */
    fun count(
        params: CountryCountParams = CountryCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(CountryCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of
     * diplomaticclearancecountry records as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: CountryCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CountryCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<CountryQueryHelpResponse> =
        queryHelp(CountryQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CountryQueryHelpParams = CountryQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: CountryQueryHelpParams = CountryQueryHelpParams.none()
    ): CompletableFuture<CountryQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<CountryQueryHelpResponse> =
        queryHelp(CountryQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: CountryTupleParams): CompletableFuture<List<CountryTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CountryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CountryTupleResponse>>

    /**
     * Service operation to take multiple diplomaticclearancecountry records as a POST body and
     * ingest into the database. This operation is intended to be used for automated feeds into UDL.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun unvalidatedPublish(params: CountryUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CountryUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CountryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CountryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearancecountry`, but is otherwise
         * the same as [CountryServiceAsync.create].
         */
        fun create(params: CountryCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CountryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(id, CountryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CountryRetrieveParams
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(id, CountryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryServiceAsync.update].
         */
        fun update(pathId: String, params: CountryUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: CountryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: CountryUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CountryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry`, but is otherwise
         * the same as [CountryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CountryListPageAsync>> =
            list(CountryListParams.none())

        /** @see list */
        fun list(
            params: CountryListParams = CountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryListPageAsync>>

        /** @see list */
        fun list(
            params: CountryListParams = CountryListParams.none()
        ): CompletableFuture<HttpResponseFor<CountryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CountryListPageAsync>> =
            list(CountryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, CountryDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CountryDeleteParams = CountryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CountryDeleteParams = CountryDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CountryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CountryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, CountryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/count`, but is
         * otherwise the same as [CountryServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(CountryCountParams.none())

        /** @see count */
        fun count(
            params: CountryCountParams = CountryCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: CountryCountParams = CountryCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(CountryCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearancecountry/createBulk`, but is
         * otherwise the same as [CountryServiceAsync.createBulk].
         */
        fun createBulk(params: CountryCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: CountryCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/queryhelp`, but is
         * otherwise the same as [CountryServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<CountryQueryHelpResponse>> =
            queryHelp(CountryQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: CountryQueryHelpParams = CountryQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: CountryQueryHelpParams = CountryQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<CountryQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CountryQueryHelpResponse>> =
            queryHelp(CountryQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/tuple`, but is
         * otherwise the same as [CountryServiceAsync.tuple].
         */
        fun tuple(
            params: CountryTupleParams
        ): CompletableFuture<HttpResponseFor<List<CountryTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: CountryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CountryTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-diplomaticclearancecountry`, but is
         * otherwise the same as [CountryServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: CountryUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: CountryUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
