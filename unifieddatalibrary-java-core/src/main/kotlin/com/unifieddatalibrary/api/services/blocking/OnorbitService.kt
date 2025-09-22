// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitFull
import com.unifieddatalibrary.api.models.onorbit.OnorbitCountParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitCreateParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitDeleteParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitIngest
import com.unifieddatalibrary.api.models.onorbit.OnorbitListPage
import com.unifieddatalibrary.api.models.onorbit.OnorbitListParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitTupleParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitUpdateParams
import com.unifieddatalibrary.api.services.blocking.onorbit.AntennaDetailService
import java.util.function.Consumer

interface OnorbitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitService

    fun antennaDetails(): AntennaDetailService

    /**
     * Service operation to take a single onorbit object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: OnorbitCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see create */
    fun create(
        onorbitIngest: OnorbitIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(OnorbitCreateParams.builder().onorbitIngest(onorbitIngest).build(), requestOptions)

    /** @see create */
    fun create(onorbitIngest: OnorbitIngest) = create(onorbitIngest, RequestOptions.none())

    /**
     * Service operation to update a single OnOrbit object. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: OnorbitUpdateParams) = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OnorbitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: OnorbitUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OnorbitListPage = list(OnorbitListParams.none())

    /** @see list */
    fun list(
        params: OnorbitListParams = OnorbitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitListPage

    /** @see list */
    fun list(params: OnorbitListParams = OnorbitListParams.none()): OnorbitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitListPage =
        list(OnorbitListParams.none(), requestOptions)

    /**
     * Service operation to delete an OnOrbit object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, OnorbitDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: OnorbitDeleteParams = OnorbitDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbitDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OnorbitDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OnorbitDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(OnorbitCountParams.none())

    /** @see count */
    fun count(
        params: OnorbitCountParams = OnorbitCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: OnorbitCountParams = OnorbitCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(OnorbitCountParams.none(), requestOptions)

    /**
     * Service operation to get a single OnOrbit object by its unique ID passed as a path parameter.
     */
    fun get(id: String): OnorbitFull = get(id, OnorbitGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitGetParams = OnorbitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: OnorbitGetParams = OnorbitGetParams.none()): OnorbitFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitFull

    /** @see get */
    fun get(params: OnorbitGetParams): OnorbitFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitFull =
        get(id, OnorbitGetParams.none(), requestOptions)

    /** This service queries common information across Radar, EO, and RF observations. */
    fun getSignature(params: OnorbitGetSignatureParams): OnorbitGetSignatureResponse =
        getSignature(params, RequestOptions.none())

    /** @see getSignature */
    fun getSignature(
        params: OnorbitGetSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitGetSignatureResponse

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OnorbitQueryhelpResponse = queryhelp(OnorbitQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none()
    ): OnorbitQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnorbitQueryhelpResponse =
        queryhelp(OnorbitQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbitTupleParams): List<OnorbitFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OnorbitFull>

    /** A view of [OnorbitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitService.WithRawResponse

        fun antennaDetails(): AntennaDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbit`, but is otherwise the same as
         * [OnorbitService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            onorbitIngest: OnorbitIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                OnorbitCreateParams.builder().onorbitIngest(onorbitIngest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(onorbitIngest: OnorbitIngest): HttpResponse =
            create(onorbitIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitService.update].
         */
        @MustBeClosed
        fun update(id: String, params: OnorbitUpdateParams): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OnorbitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnorbitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbit`, but is otherwise the same as
         * [OnorbitService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OnorbitListPage> = list(OnorbitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitListParams = OnorbitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitListParams = OnorbitListParams.none()
        ): HttpResponseFor<OnorbitListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitListPage> =
            list(OnorbitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, OnorbitDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnorbitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OnorbitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/count`, but is otherwise the same as
         * [OnorbitService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(OnorbitCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitCountParams = OnorbitCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: OnorbitCountParams = OnorbitCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(OnorbitCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitFull> = get(id, OnorbitGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitGetParams = OnorbitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitGetParams = OnorbitGetParams.none(),
        ): HttpResponseFor<OnorbitFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitGetParams): HttpResponseFor<OnorbitFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitFull> =
            get(id, OnorbitGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/getSignature`, but is otherwise the
         * same as [OnorbitService.getSignature].
         */
        @MustBeClosed
        fun getSignature(
            params: OnorbitGetSignatureParams
        ): HttpResponseFor<OnorbitGetSignatureResponse> =
            getSignature(params, RequestOptions.none())

        /** @see getSignature */
        @MustBeClosed
        fun getSignature(
            params: OnorbitGetSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitGetSignatureResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/queryhelp`, but is otherwise the same
         * as [OnorbitService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnorbitQueryhelpResponse> =
            queryhelp(OnorbitQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none()
        ): HttpResponseFor<OnorbitQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OnorbitQueryhelpResponse> =
            queryhelp(OnorbitQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/tuple`, but is otherwise the same as
         * [OnorbitService.tuple].
         */
        @MustBeClosed
        fun tuple(params: OnorbitTupleParams): HttpResponseFor<List<OnorbitFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OnorbitTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OnorbitFull>>
    }
}
