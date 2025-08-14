// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FlightPlanFull
import com.unifieddatalibrary.api.models.flightplan.FlightplanCountParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanCreateParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanDeleteParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanListPageAsync
import com.unifieddatalibrary.api.models.flightplan.FlightplanListParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpResponse
import com.unifieddatalibrary.api.models.flightplan.FlightplanRetrieveParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanTupleParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FlightplanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlightplanServiceAsync

    /**
     * Service operation to take a single FlightPlan object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: FlightplanCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FlightplanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single FlightPlan record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<FlightPlanFull> =
        retrieve(id, FlightplanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlightPlanFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(),
    ): CompletableFuture<FlightPlanFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FlightplanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlightPlanFull>

    /** @see retrieve */
    fun retrieve(params: FlightplanRetrieveParams): CompletableFuture<FlightPlanFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<FlightPlanFull> =
        retrieve(id, FlightplanRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single flightplan record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: FlightplanUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: FlightplanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: FlightplanUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FlightplanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<FlightplanListPageAsync> = list(FlightplanListParams.none())

    /** @see list */
    fun list(
        params: FlightplanListParams = FlightplanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlightplanListPageAsync>

    /** @see list */
    fun list(
        params: FlightplanListParams = FlightplanListParams.none()
    ): CompletableFuture<FlightplanListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FlightplanListPageAsync> =
        list(FlightplanListParams.none(), requestOptions)

    /**
     * Service operation to delete a flight plan record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, FlightplanDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FlightplanDeleteParams = FlightplanDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FlightplanDeleteParams = FlightplanDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FlightplanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FlightplanDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, FlightplanDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(FlightplanCountParams.none())

    /** @see count */
    fun count(
        params: FlightplanCountParams = FlightplanCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: FlightplanCountParams = FlightplanCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(FlightplanCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<FlightplanQueryhelpResponse> =
        queryhelp(FlightplanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlightplanQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none()
    ): CompletableFuture<FlightplanQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<FlightplanQueryhelpResponse> =
        queryhelp(FlightplanQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: FlightplanTupleParams): CompletableFuture<List<FlightPlanFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: FlightplanTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FlightPlanFull>>

    /**
     * Service operation to take one or many flight plan records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: FlightplanUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: FlightplanUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [FlightplanServiceAsync] that provides access to raw HTTP responses for each
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
        ): FlightplanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/flightplan`, but is otherwise the same as
         * [FlightplanServiceAsync.create].
         */
        fun create(params: FlightplanCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FlightplanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/flightplan/{id}`, but is otherwise the same as
         * [FlightplanServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FlightPlanFull>> =
            retrieve(id, FlightplanRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlightPlanFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FlightPlanFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FlightplanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlightPlanFull>>

        /** @see retrieve */
        fun retrieve(
            params: FlightplanRetrieveParams
        ): CompletableFuture<HttpResponseFor<FlightPlanFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlightPlanFull>> =
            retrieve(id, FlightplanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/flightplan/{id}`, but is otherwise the same as
         * [FlightplanServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: FlightplanUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: FlightplanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: FlightplanUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FlightplanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/flightplan`, but is otherwise the same as
         * [FlightplanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FlightplanListPageAsync>> =
            list(FlightplanListParams.none())

        /** @see list */
        fun list(
            params: FlightplanListParams = FlightplanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlightplanListPageAsync>>

        /** @see list */
        fun list(
            params: FlightplanListParams = FlightplanListParams.none()
        ): CompletableFuture<HttpResponseFor<FlightplanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FlightplanListPageAsync>> =
            list(FlightplanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/flightplan/{id}`, but is otherwise the same
         * as [FlightplanServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, FlightplanDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: FlightplanDeleteParams = FlightplanDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: FlightplanDeleteParams = FlightplanDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FlightplanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FlightplanDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, FlightplanDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/flightplan/count`, but is otherwise the same as
         * [FlightplanServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(FlightplanCountParams.none())

        /** @see count */
        fun count(
            params: FlightplanCountParams = FlightplanCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: FlightplanCountParams = FlightplanCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(FlightplanCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/flightplan/queryhelp`, but is otherwise the
         * same as [FlightplanServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<FlightplanQueryhelpResponse>> =
            queryhelp(FlightplanQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlightplanQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<FlightplanQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FlightplanQueryhelpResponse>> =
            queryhelp(FlightplanQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/flightplan/tuple`, but is otherwise the same as
         * [FlightplanServiceAsync.tuple].
         */
        fun tuple(
            params: FlightplanTupleParams
        ): CompletableFuture<HttpResponseFor<List<FlightPlanFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: FlightplanTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FlightPlanFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-flightplan`, but is otherwise the
         * same as [FlightplanServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: FlightplanUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: FlightplanUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
