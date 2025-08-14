// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.Engine
import com.unifieddatalibrary.api.models.engines.EngineCountParams
import com.unifieddatalibrary.api.models.engines.EngineCreateParams
import com.unifieddatalibrary.api.models.engines.EngineDeleteParams
import com.unifieddatalibrary.api.models.engines.EngineListPageAsync
import com.unifieddatalibrary.api.models.engines.EngineListParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpResponse
import com.unifieddatalibrary.api.models.engines.EngineRetrieveParams
import com.unifieddatalibrary.api.models.engines.EngineTupleParams
import com.unifieddatalibrary.api.models.engines.EngineUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EngineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineServiceAsync

    /**
     * Service operation to take a single Engine as a POST body and ingest into the database. An
     * Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: EngineCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EngineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Engine record by its unique ID passed as a path parameter.
     * An Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage.
     */
    fun retrieve(id: String): CompletableFuture<Engine> = retrieve(id, EngineRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EngineRetrieveParams = EngineRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Engine> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EngineRetrieveParams = EngineRetrieveParams.none(),
    ): CompletableFuture<Engine> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EngineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Engine>

    /** @see retrieve */
    fun retrieve(params: EngineRetrieveParams): CompletableFuture<Engine> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Engine> =
        retrieve(id, EngineRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Engine. An Engine represents launch engine/booster
     * information to include performance characteristics and limits. A launch vehicle has 1 to many
     * engines per stage. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun update(pathId: String, params: EngineUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: EngineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: EngineUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EngineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<EngineListPageAsync> = list(EngineListParams.none())

    /** @see list */
    fun list(
        params: EngineListParams = EngineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineListPageAsync>

    /** @see list */
    fun list(
        params: EngineListParams = EngineListParams.none()
    ): CompletableFuture<EngineListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EngineListPageAsync> =
        list(EngineListParams.none(), requestOptions)

    /**
     * Service operation to delete a Engine object specified by the passed ID path parameter. An
     * Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EngineDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EngineDeleteParams = EngineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EngineDeleteParams = EngineDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EngineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EngineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EngineDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(EngineCountParams.none())

    /** @see count */
    fun count(
        params: EngineCountParams = EngineCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: EngineCountParams = EngineCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(EngineCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<EngineQueryhelpResponse> =
        queryhelp(EngineQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EngineQueryhelpParams = EngineQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: EngineQueryhelpParams = EngineQueryhelpParams.none()
    ): CompletableFuture<EngineQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<EngineQueryhelpResponse> =
        queryhelp(EngineQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EngineTupleParams): CompletableFuture<List<Engine>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EngineTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Engine>>

    /**
     * A view of [EngineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EngineServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/engine`, but is otherwise the same as
         * [EngineServiceAsync.create].
         */
        fun create(params: EngineCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EngineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/engine/{id}`, but is otherwise the same as
         * [EngineServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Engine>> =
            retrieve(id, EngineRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EngineRetrieveParams = EngineRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Engine>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EngineRetrieveParams = EngineRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Engine>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EngineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Engine>>

        /** @see retrieve */
        fun retrieve(params: EngineRetrieveParams): CompletableFuture<HttpResponseFor<Engine>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Engine>> =
            retrieve(id, EngineRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/engine/{id}`, but is otherwise the same as
         * [EngineServiceAsync.update].
         */
        fun update(pathId: String, params: EngineUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: EngineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: EngineUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EngineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/engine`, but is otherwise the same as
         * [EngineServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EngineListPageAsync>> =
            list(EngineListParams.none())

        /** @see list */
        fun list(
            params: EngineListParams = EngineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineListPageAsync>>

        /** @see list */
        fun list(
            params: EngineListParams = EngineListParams.none()
        ): CompletableFuture<HttpResponseFor<EngineListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EngineListPageAsync>> =
            list(EngineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/engine/{id}`, but is otherwise the same as
         * [EngineServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EngineDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EngineDeleteParams = EngineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EngineDeleteParams = EngineDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EngineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EngineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EngineDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/count`, but is otherwise the same as
         * [EngineServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(EngineCountParams.none())

        /** @see count */
        fun count(
            params: EngineCountParams = EngineCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: EngineCountParams = EngineCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(EngineCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/queryhelp`, but is otherwise the same as
         * [EngineServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EngineQueryhelpResponse>> =
            queryhelp(EngineQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: EngineQueryhelpParams = EngineQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: EngineQueryhelpParams = EngineQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<EngineQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EngineQueryhelpResponse>> =
            queryhelp(EngineQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/tuple`, but is otherwise the same as
         * [EngineServiceAsync.tuple].
         */
        fun tuple(params: EngineTupleParams): CompletableFuture<HttpResponseFor<List<Engine>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EngineTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Engine>>>
    }
}
