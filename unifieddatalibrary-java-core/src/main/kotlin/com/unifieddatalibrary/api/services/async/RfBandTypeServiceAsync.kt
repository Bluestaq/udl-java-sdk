// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCountParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeDeleteParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListPageAsync
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RfBandTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandTypeServiceAsync

    /**
     * Service operation to take a single RFBandType as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: RfBandTypeCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RfBandTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an RFBandType. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: RfBandTypeUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: RfBandTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: RfBandTypeUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RfBandTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<RfBandTypeListPageAsync> = list(RfBandTypeListParams.none())

    /** @see list */
    fun list(
        params: RfBandTypeListParams = RfBandTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfBandTypeListPageAsync>

    /** @see list */
    fun list(
        params: RfBandTypeListParams = RfBandTypeListParams.none()
    ): CompletableFuture<RfBandTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RfBandTypeListPageAsync> =
        list(RfBandTypeListParams.none(), requestOptions)

    /**
     * Service operation to delete an RFBandType specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, RfBandTypeDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RfBandTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RfBandTypeDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, RfBandTypeDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(RfBandTypeCountParams.none())

    /** @see count */
    fun count(
        params: RfBandTypeCountParams = RfBandTypeCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: RfBandTypeCountParams = RfBandTypeCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(RfBandTypeCountParams.none(), requestOptions)

    /** Service operation to get a single RFBandType by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<RfBandTypeGetResponse> =
        get(id, RfBandTypeGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: RfBandTypeGetParams = RfBandTypeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfBandTypeGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: RfBandTypeGetParams = RfBandTypeGetParams.none(),
    ): CompletableFuture<RfBandTypeGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RfBandTypeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfBandTypeGetResponse>

    /** @see get */
    fun get(params: RfBandTypeGetParams): CompletableFuture<RfBandTypeGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<RfBandTypeGetResponse> =
        get(id, RfBandTypeGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<RfBandTypeQueryhelpResponse> =
        queryhelp(RfBandTypeQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfBandTypeQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none()
    ): CompletableFuture<RfBandTypeQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<RfBandTypeQueryhelpResponse> =
        queryhelp(RfBandTypeQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: RfBandTypeTupleParams): CompletableFuture<List<RfBandTypeTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RfBandTypeTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RfBandTypeTupleResponse>>

    /**
     * A view of [RfBandTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): RfBandTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfbandtype`, but is otherwise the same as
         * [RfBandTypeServiceAsync.create].
         */
        fun create(params: RfBandTypeCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RfBandTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/rfbandtype/{id}`, but is otherwise the same as
         * [RfBandTypeServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: RfBandTypeUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: RfBandTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: RfBandTypeUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RfBandTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfbandtype`, but is otherwise the same as
         * [RfBandTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RfBandTypeListPageAsync>> =
            list(RfBandTypeListParams.none())

        /** @see list */
        fun list(
            params: RfBandTypeListParams = RfBandTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfBandTypeListPageAsync>>

        /** @see list */
        fun list(
            params: RfBandTypeListParams = RfBandTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<RfBandTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfBandTypeListPageAsync>> =
            list(RfBandTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfbandtype/{id}`, but is otherwise the same
         * as [RfBandTypeServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, RfBandTypeDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RfBandTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RfBandTypeDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, RfBandTypeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfbandtype/count`, but is otherwise the same as
         * [RfBandTypeServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(RfBandTypeCountParams.none())

        /** @see count */
        fun count(
            params: RfBandTypeCountParams = RfBandTypeCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: RfBandTypeCountParams = RfBandTypeCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(RfBandTypeCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfbandtype/{id}`, but is otherwise the same as
         * [RfBandTypeServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>> =
            get(id, RfBandTypeGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: RfBandTypeGetParams = RfBandTypeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: RfBandTypeGetParams = RfBandTypeGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RfBandTypeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>>

        /** @see get */
        fun get(
            params: RfBandTypeGetParams
        ): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RfBandTypeGetResponse>> =
            get(id, RfBandTypeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfbandtype/queryhelp`, but is otherwise the
         * same as [RfBandTypeServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<RfBandTypeQueryhelpResponse>> =
            queryhelp(RfBandTypeQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfBandTypeQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<RfBandTypeQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfBandTypeQueryhelpResponse>> =
            queryhelp(RfBandTypeQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfbandtype/tuple`, but is otherwise the same as
         * [RfBandTypeServiceAsync.tuple].
         */
        fun tuple(
            params: RfBandTypeTupleParams
        ): CompletableFuture<HttpResponseFor<List<RfBandTypeTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: RfBandTypeTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RfBandTypeTupleResponse>>>
    }
}
