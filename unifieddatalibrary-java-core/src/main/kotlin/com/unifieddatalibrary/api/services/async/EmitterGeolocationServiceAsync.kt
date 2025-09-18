// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCountParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateBulkParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationDeleteParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationListPageAsync
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationListParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryHelpParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryHelpResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationRetrieveParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationRetrieveResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationTupleParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationTupleResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmitterGeolocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmitterGeolocationServiceAsync

    /**
     * Service operation to take a single RF geolocation as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: EmitterGeolocationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmitterGeolocationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single RF geolocation by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        retrieve(id, EmitterGeolocationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmitterGeolocationRetrieveParams = EmitterGeolocationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmitterGeolocationRetrieveParams = EmitterGeolocationRetrieveParams.none(),
    ): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmitterGeolocationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmitterGeolocationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EmitterGeolocationRetrieveParams
    ): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        retrieve(id, EmitterGeolocationRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: EmitterGeolocationListParams
    ): CompletableFuture<EmitterGeolocationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EmitterGeolocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmitterGeolocationListPageAsync>

    /**
     * Service operation to delete a RF geolocation specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. Note, delete operations do not remove data from historical or publish/subscribe
     * stores.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, EmitterGeolocationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmitterGeolocationDeleteParams = EmitterGeolocationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmitterGeolocationDeleteParams = EmitterGeolocationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmitterGeolocationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmitterGeolocationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EmitterGeolocationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EmitterGeolocationCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EmitterGeolocationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of RF geolocations as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EmitterGeolocationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EmitterGeolocationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<EmitterGeolocationQueryHelpResponse> =
        queryHelp(EmitterGeolocationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EmitterGeolocationQueryHelpParams = EmitterGeolocationQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmitterGeolocationQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: EmitterGeolocationQueryHelpParams = EmitterGeolocationQueryHelpParams.none()
    ): CompletableFuture<EmitterGeolocationQueryHelpResponse> =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<EmitterGeolocationQueryHelpResponse> =
        queryHelp(EmitterGeolocationQueryHelpParams.none(), requestOptions)

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
        params: EmitterGeolocationTupleParams
    ): CompletableFuture<List<EmitterGeolocationTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EmitterGeolocationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EmitterGeolocationTupleResponse>>

    /**
     * Service operation to take multiple emittergeolocation records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: EmitterGeolocationUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EmitterGeolocationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EmitterGeolocationServiceAsync] that provides access to raw HTTP responses for
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
        ): EmitterGeolocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/emittergeolocation`, but is otherwise the same
         * as [EmitterGeolocationServiceAsync.create].
         */
        fun create(params: EmitterGeolocationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmitterGeolocationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/emittergeolocation/{id}`, but is otherwise the
         * same as [EmitterGeolocationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> =
            retrieve(id, EmitterGeolocationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmitterGeolocationRetrieveParams = EmitterGeolocationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmitterGeolocationRetrieveParams = EmitterGeolocationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmitterGeolocationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmitterGeolocationRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> =
            retrieve(id, EmitterGeolocationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/emittergeolocation`, but is otherwise the same
         * as [EmitterGeolocationServiceAsync.list].
         */
        fun list(
            params: EmitterGeolocationListParams
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EmitterGeolocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/emittergeolocation/{id}`, but is otherwise
         * the same as [EmitterGeolocationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EmitterGeolocationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmitterGeolocationDeleteParams = EmitterGeolocationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmitterGeolocationDeleteParams = EmitterGeolocationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmitterGeolocationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmitterGeolocationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EmitterGeolocationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/emittergeolocation/count`, but is otherwise the
         * same as [EmitterGeolocationServiceAsync.count].
         */
        fun count(
            params: EmitterGeolocationCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EmitterGeolocationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/emittergeolocation/createBulk`, but is
         * otherwise the same as [EmitterGeolocationServiceAsync.createBulk].
         */
        fun createBulk(
            params: EmitterGeolocationCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EmitterGeolocationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/emittergeolocation/queryhelp`, but is otherwise
         * the same as [EmitterGeolocationServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EmitterGeolocationQueryHelpResponse>> =
            queryHelp(EmitterGeolocationQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: EmitterGeolocationQueryHelpParams = EmitterGeolocationQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: EmitterGeolocationQueryHelpParams = EmitterGeolocationQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmitterGeolocationQueryHelpResponse>> =
            queryHelp(EmitterGeolocationQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/emittergeolocation/tuple`, but is otherwise the
         * same as [EmitterGeolocationServiceAsync.tuple].
         */
        fun tuple(
            params: EmitterGeolocationTupleParams
        ): CompletableFuture<HttpResponseFor<List<EmitterGeolocationTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EmitterGeolocationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EmitterGeolocationTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-emittergeolocation`, but is otherwise
         * the same as [EmitterGeolocationServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EmitterGeolocationUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EmitterGeolocationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
