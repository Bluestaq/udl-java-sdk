// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftstatusremarkFull
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCountParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCreateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListPage
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkTupleParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkUpdateParams
import java.util.function.Consumer

interface AircraftStatusRemarkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusRemarkService

    /**
     * Service operation to take a single Aircraft Status Remark record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: AircraftStatusRemarkCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftStatusRemarkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single Aircraft Status Remark record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): AircraftstatusremarkFull =
        retrieve(id, AircraftStatusRemarkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftstatusremarkFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(),
    ): AircraftstatusremarkFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AircraftStatusRemarkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftstatusremarkFull

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRemarkRetrieveParams): AircraftstatusremarkFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AircraftstatusremarkFull =
        retrieve(id, AircraftStatusRemarkRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Aircraft Status Remark record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AircraftStatusRemarkUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AircraftStatusRemarkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AircraftStatusRemarkUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AircraftStatusRemarkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): AircraftStatusRemarkListPage = list(AircraftStatusRemarkListParams.none())

    /** @see list */
    fun list(
        params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftStatusRemarkListPage

    /** @see list */
    fun list(
        params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none()
    ): AircraftStatusRemarkListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AircraftStatusRemarkListPage =
        list(AircraftStatusRemarkListParams.none(), requestOptions)

    /**
     * Service operation to delete a single Aircraft Status Remark record specified by the passed ID
     * path parameter. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, AircraftStatusRemarkDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AircraftStatusRemarkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AircraftStatusRemarkDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AircraftStatusRemarkDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(AircraftStatusRemarkCountParams.none())

    /** @see count */
    fun count(
        params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(AircraftStatusRemarkCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): AircraftStatusRemarkQueryhelpResponse =
        queryhelp(AircraftStatusRemarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftStatusRemarkQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none()
    ): AircraftStatusRemarkQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AircraftStatusRemarkQueryhelpResponse =
        queryhelp(AircraftStatusRemarkQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AircraftStatusRemarkTupleParams): List<AircraftstatusremarkFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AircraftStatusRemarkTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AircraftstatusremarkFull>

    /**
     * A view of [AircraftStatusRemarkService] that provides access to raw HTTP responses for each
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
        ): AircraftStatusRemarkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftstatusremark`, but is otherwise the
         * same as [AircraftStatusRemarkService.create].
         */
        @MustBeClosed
        fun create(params: AircraftStatusRemarkCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AircraftStatusRemarkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftstatusremark/{id}`, but is otherwise
         * the same as [AircraftStatusRemarkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AircraftstatusremarkFull> =
            retrieve(id, AircraftStatusRemarkRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftstatusremarkFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(),
        ): HttpResponseFor<AircraftstatusremarkFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AircraftStatusRemarkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftstatusremarkFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AircraftStatusRemarkRetrieveParams
        ): HttpResponseFor<AircraftstatusremarkFull> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftstatusremarkFull> =
            retrieve(id, AircraftStatusRemarkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/aircraftstatusremark/{id}`, but is otherwise
         * the same as [AircraftStatusRemarkService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: AircraftStatusRemarkUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: AircraftStatusRemarkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AircraftStatusRemarkUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AircraftStatusRemarkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftstatusremark`, but is otherwise the
         * same as [AircraftStatusRemarkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AircraftStatusRemarkListPage> =
            list(AircraftStatusRemarkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftStatusRemarkListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none()
        ): HttpResponseFor<AircraftStatusRemarkListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AircraftStatusRemarkListPage> =
            list(AircraftStatusRemarkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/aircraftstatusremark/{id}`, but is otherwise
         * the same as [AircraftStatusRemarkService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, AircraftStatusRemarkDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AircraftStatusRemarkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AircraftStatusRemarkDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AircraftStatusRemarkDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aircraftstatusremark/count`, but is otherwise
         * the same as [AircraftStatusRemarkService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AircraftStatusRemarkCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(AircraftStatusRemarkCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aircraftstatusremark/queryhelp`, but is
         * otherwise the same as [AircraftStatusRemarkService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AircraftStatusRemarkQueryhelpResponse> =
            queryhelp(AircraftStatusRemarkQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AircraftStatusRemarkQueryhelpParams =
                AircraftStatusRemarkQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftStatusRemarkQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none()
        ): HttpResponseFor<AircraftStatusRemarkQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<AircraftStatusRemarkQueryhelpResponse> =
            queryhelp(AircraftStatusRemarkQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aircraftstatusremark/tuple`, but is otherwise
         * the same as [AircraftStatusRemarkService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: AircraftStatusRemarkTupleParams
        ): HttpResponseFor<List<AircraftstatusremarkFull>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: AircraftStatusRemarkTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AircraftstatusremarkFull>>
    }
}
