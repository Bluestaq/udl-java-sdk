// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCountParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCreateParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListPage
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetRetrieveParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetTupleParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.attitudesets.HistoryService
import java.util.function.Consumer

interface AttitudeSetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetService

    fun history(): HistoryService

    /**
     * Service operation intended for initial integration only. Takes a single AttitudeSet as a POST
     * body and ingest into the database. This operation does not persist any Onorbit Attitude
     * points that may be present in the body of the request. This operation is not intended to be
     * used for automated feeds into UDL. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance. </br> The following rules apply to
     * this operation:
     *
     * <h3>
     * * Attitude Set numPoints value must correspond exactly to the number of Onorbit Attitude
     *   states associated with that Attitude Set. The numPoints value is checked against the actual
     *   posted number of states and mismatch will result in the post being rejected.
     * * Attitude Set startTime and endTime must correspond to the earliest and latest state times,
     *   respectively, of the associated Onorbit Attitude states.
     * * Either satNo, idOnOrbit, or origObjectId must be provided. The preferred option is to post
     *   with satNo for a cataloged object, and with (only) origObjectId for an unknown,
     *   uncataloged, or internal/test object. There are several cases for the logic associated with
     *   these fields:
     *     + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will
     *       be populated appropriately in addition to the satNo.
     *     + If satNo is provided and does not correlate to a known UDL sat number then the provided
     *       satNo value will be moved to the origObjectId field and satNo left null.
     *     + If origObjectId and a valid satNo or idOnOrbit are provided then both the
     *       satNo/idOnOrbit and origObjectId will maintain the provided values.
     *     + If only origObjectId is provided then origObjectId will be populated with the posted
     *       value. In this case, no checks are made against existing UDL sat numbers. </h3>
     */
    fun create(params: AttitudeSetCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AttitudeSetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single AttitudeSet record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): AttitudesetFull = retrieve(id, AttitudeSetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudesetFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(),
    ): AttitudesetFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AttitudeSetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudesetFull

    /** @see retrieve */
    fun retrieve(params: AttitudeSetRetrieveParams): AttitudesetFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AttitudesetFull =
        retrieve(id, AttitudeSetRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AttitudeSetListParams): AttitudeSetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AttitudeSetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudeSetListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AttitudeSetCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AttitudeSetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): AttitudeSetQueryHelpResponse = queryHelp(AttitudeSetQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudeSetQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none()
    ): AttitudeSetQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): AttitudeSetQueryHelpResponse =
        queryHelp(AttitudeSetQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AttitudeSetTupleParams): List<AttitudesetFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AttitudeSetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AttitudesetFull>

    /**
     * Service operation to take a single Attitude Set and many associated Onorbit Attitude records
     * as a POST body for ingest into the database. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance. </br> The following rules
     * apply to this operation:
     *
     * <h3>
     * * Attitude Set numPoints value must correspond exactly to the number of Onorbit Attitude
     *   states associated with that Attitude Set. The numPoints value is checked against the actual
     *   posted number of states, and a mismatch will result in the post being rejected.
     * * Attitude Set startTime and endTime must correspond to the earliest and latest state times,
     *   respectively, of the associated Onorbit Attitude states.
     * * Either satNo, idOnOrbit, or origObjectId must be provided. The preferred option is to post
     *   with satNo for a cataloged object, and with (only) origObjectId for an unknown,
     *   uncataloged, or internal/test object. There are several cases for the logic associated with
     *   these fields:
     *     + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will
     *       be populated appropriately in addition to the satNo.
     *     + If satNo is provided and does not correlate to a known UDL sat number then the provided
     *       satNo value will be moved to the origObjectId field and satNo left null.
     *     + If origObjectId and a valid satNo or idOnOrbit are provided then both the
     *       satNo/idOnOrbit and origObjectId will maintain the provided values.
     *     + If only origObjectId is provided then origObjectId will be populated with the posted
     *       value. In this case, no checks are made against existing UDL sat numbers. </h3>
     */
    fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AttitudeSetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AttitudeSetService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudeSetService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/attitudeset`, but is otherwise the same as
         * [AttitudeSetService.create].
         */
        @MustBeClosed
        fun create(params: AttitudeSetCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AttitudeSetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/{id}`, but is otherwise the same as
         * [AttitudeSetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AttitudesetFull> =
            retrieve(id, AttitudeSetRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudesetFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(),
        ): HttpResponseFor<AttitudesetFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AttitudeSetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudesetFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AttitudeSetRetrieveParams): HttpResponseFor<AttitudesetFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AttitudesetFull> =
            retrieve(id, AttitudeSetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset`, but is otherwise the same as
         * [AttitudeSetService.list].
         */
        @MustBeClosed
        fun list(params: AttitudeSetListParams): HttpResponseFor<AttitudeSetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AttitudeSetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudeSetListPage>

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/count`, but is otherwise the same
         * as [AttitudeSetService.count].
         */
        @MustBeClosed
        fun count(params: AttitudeSetCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AttitudeSetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/queryhelp`, but is otherwise the
         * same as [AttitudeSetService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<AttitudeSetQueryHelpResponse> =
            queryHelp(AttitudeSetQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudeSetQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none()
        ): HttpResponseFor<AttitudeSetQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<AttitudeSetQueryHelpResponse> =
            queryHelp(AttitudeSetQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/tuple`, but is otherwise the same
         * as [AttitudeSetService.tuple].
         */
        @MustBeClosed
        fun tuple(params: AttitudeSetTupleParams): HttpResponseFor<List<AttitudesetFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: AttitudeSetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AttitudesetFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-attitudeset`, but is otherwise the
         * same as [AttitudeSetService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AttitudeSetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
