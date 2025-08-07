// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.Engine
import com.unifieddatalibrary.api.models.engines.EngineCountParams
import com.unifieddatalibrary.api.models.engines.EngineCreateParams
import com.unifieddatalibrary.api.models.engines.EngineDeleteParams
import com.unifieddatalibrary.api.models.engines.EngineListPage
import com.unifieddatalibrary.api.models.engines.EngineListParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpResponse
import com.unifieddatalibrary.api.models.engines.EngineRetrieveParams
import com.unifieddatalibrary.api.models.engines.EngineTupleParams
import com.unifieddatalibrary.api.models.engines.EngineUpdateParams
import java.util.function.Consumer

interface EngineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineService

    /**
     * Service operation to take a single Engine as a POST body and ingest into the database. An
     * Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: EngineCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EngineCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single Engine record by its unique ID passed as a path parameter.
     * An Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage.
     */
    fun retrieve(id: String): Engine = retrieve(id, EngineRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EngineRetrieveParams = EngineRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Engine = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: EngineRetrieveParams = EngineRetrieveParams.none()): Engine =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EngineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Engine

    /** @see retrieve */
    fun retrieve(params: EngineRetrieveParams): Engine = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Engine =
        retrieve(id, EngineRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Engine. An Engine represents launch engine/booster
     * information to include performance characteristics and limits. A launch vehicle has 1 to many
     * engines per stage. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun update(pathId: String, params: EngineUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: EngineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: EngineUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: EngineUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): EngineListPage = list(EngineListParams.none())

    /** @see list */
    fun list(
        params: EngineListParams = EngineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineListPage

    /** @see list */
    fun list(params: EngineListParams = EngineListParams.none()): EngineListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EngineListPage =
        list(EngineListParams.none(), requestOptions)

    /**
     * Service operation to delete a Engine object specified by the passed ID path parameter. An
     * Engine represents launch engine/booster information to include performance characteristics
     * and limits. A launch vehicle has 1 to many engines per stage. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, EngineDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EngineDeleteParams = EngineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EngineDeleteParams = EngineDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EngineDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EngineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EngineDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(EngineCountParams.none())

    /** @see count */
    fun count(
        params: EngineCountParams = EngineCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: EngineCountParams = EngineCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(EngineCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): EngineQueryhelpResponse = queryhelp(EngineQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EngineQueryhelpParams = EngineQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: EngineQueryhelpParams = EngineQueryhelpParams.none()
    ): EngineQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EngineQueryhelpResponse =
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
    fun tuple(params: EngineTupleParams): List<Engine> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EngineTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Engine>

    /** A view of [EngineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/engine`, but is otherwise the same as
         * [EngineService.create].
         */
        @MustBeClosed
        fun create(params: EngineCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EngineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/engine/{id}`, but is otherwise the same as
         * [EngineService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Engine> =
            retrieve(id, EngineRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EngineRetrieveParams = EngineRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Engine> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EngineRetrieveParams = EngineRetrieveParams.none(),
        ): HttpResponseFor<Engine> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EngineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Engine>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EngineRetrieveParams): HttpResponseFor<Engine> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Engine> =
            retrieve(id, EngineRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/engine/{id}`, but is otherwise the same as
         * [EngineService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: EngineUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: EngineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EngineUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EngineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/engine`, but is otherwise the same as
         * [EngineService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EngineListPage> = list(EngineListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EngineListParams = EngineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EngineListParams = EngineListParams.none()
        ): HttpResponseFor<EngineListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EngineListPage> =
            list(EngineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/engine/{id}`, but is otherwise the same as
         * [EngineService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, EngineDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EngineDeleteParams = EngineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EngineDeleteParams = EngineDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EngineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EngineDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EngineDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/count`, but is otherwise the same as
         * [EngineService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(EngineCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EngineCountParams = EngineCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: EngineCountParams = EngineCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(EngineCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/queryhelp`, but is otherwise the same as
         * [EngineService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EngineQueryhelpResponse> =
            queryhelp(EngineQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EngineQueryhelpParams = EngineQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EngineQueryhelpParams = EngineQueryhelpParams.none()
        ): HttpResponseFor<EngineQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EngineQueryhelpResponse> =
            queryhelp(EngineQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/engine/tuple`, but is otherwise the same as
         * [EngineService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EngineTupleParams): HttpResponseFor<List<Engine>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EngineTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Engine>>
    }
}
