// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCountParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCreateParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListPageAsync
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetRetrieveParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetTupleParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.attitudesets.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttitudeSetServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation intended for initial integration only. Takes a single AttitudeSet as a POST body and ingest into the database. This operation does not persist any Onorbit Attitude points that may be present in the body of the request. This operation is not intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     *
     * The following rules apply to this operation:
     *
     * <h3>
     *  * Attitude Set numPoints value must correspond exactly to the number of Onorbit Attitude states associated with that Attitude Set.  The numPoints value is checked against the actual posted number of states and mismatch will result in the post being rejected.
     *  * Attitude Set startTime and endTime must correspond to the earliest and latest state times, respectively, of the associated Onorbit Attitude states.
     *  * Either satNo, idOnOrbit, or origObjectId must be provided.  The preferred option is to post with satNo for a cataloged object with (only) origObjectId for an unknown, uncatalogued, or internal/test object.  There are several cases for the logic associated with these fields:
     *    + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will be populated appropriately in addition to the satNo.
     *    + If satNo is provided and does not correlate to a known UDL sat number then the provided satNo value will be moved to the origObjectId field and satNo left null.
     *    + If origObjectId and a valid satNo or idOnOrbit are provided then both the satNo/idOnOrbit and origObjectId will maintain the provided values.
     *    + If only origObjectId is provided then origObjectId will be populated with the posted value.  In this case, no checks are made against existing UDL sat numbers.
     * </h3>
     */
    fun create(params: AttitudeSetCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AttitudeSetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single AttitudeSet record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AttitudesetFull> =
        retrieve(
          id, AttitudeSetRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudesetFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none()): CompletableFuture<AttitudesetFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AttitudeSetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudesetFull>

    /** @see retrieve */
    fun retrieve(params: AttitudeSetRetrieveParams): CompletableFuture<AttitudesetFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AttitudesetFull> =
        retrieve(
          id,
          AttitudeSetRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AttitudeSetListParams): CompletableFuture<AttitudeSetListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AttitudeSetListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudeSetListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AttitudeSetCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AttitudeSetCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<AttitudeSetQueryHelpResponse> = queryHelp(AttitudeSetQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudeSetQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none()): CompletableFuture<AttitudeSetQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<AttitudeSetQueryHelpResponse> =
        queryHelp(
          AttitudeSetQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AttitudeSetTupleParams): CompletableFuture<List<AttitudesetFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AttitudeSetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AttitudesetFull>>

    /**
     * Service operation to take a single Attitude Set and many associated Onorbit Attitude records as a POST body for ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     *
     * The following rules apply to this operation:
     *
     * <h3>
     *   * Attitude Set numPoints value must correspond exactly to the number of Onorbit Attitude states associated with that Attitude Set. The numPoints value is checked against the actual posted number of states and mismatch will result in the post being rejected.
     *   * Attitude Set startTime and endTime must correspond to the earliest and latest state times, respectively, of the associated Onorbit Attitude states.
     *   * Either satNo, idOnOrbit, or origObjectId must be provided. The preferred option is to post with satNo for a cataloged object, and with (only) origObjectId for an unknown, uncatalogued, or internal/test object.  There are several cases for the logic associated with these fields:
     *     + If satNo is provided and correlates to a known UDL sat number then the idOnOrbit will be populated appropriately in addition to the satNo.
     *     + If satNo is provided and does not correlate to a known UDL sat number then the provided satNo value will be moved to the origObjectId field and satNo left null.
     *     + If origObjectId and a valid satNo or idOnOrbit are provided then both the satNo/idOnOrbit and origObjectId will maintain the provided values.
     *     + If only origObjectId is provided then origObjectId will be populated with the posted value.  In this case, no checks are made against existing UDL sat numbers.
     * </h3>
     */
    fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [AttitudeSetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/attitudeset`, but is otherwise the same as [AttitudeSetServiceAsync.create]. */
        fun create(params: AttitudeSetCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AttitudeSetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/attitudeset/{id}`, but is otherwise the same as [AttitudeSetServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(
              id, AttitudeSetRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AttitudeSetRetrieveParams = AttitudeSetRetrieveParams.none()): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AttitudeSetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudesetFull>>

        /** @see retrieve */
        fun retrieve(params: AttitudeSetRetrieveParams): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(
              id,
              AttitudeSetRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/attitudeset`, but is otherwise the same as [AttitudeSetServiceAsync.list]. */
        fun list(params: AttitudeSetListParams): CompletableFuture<HttpResponseFor<AttitudeSetListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: AttitudeSetListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudeSetListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/attitudeset/count`, but is otherwise the same as [AttitudeSetServiceAsync.count]. */
        fun count(params: AttitudeSetCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: AttitudeSetCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/attitudeset/queryhelp`, but is otherwise the same as [AttitudeSetServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<AttitudeSetQueryHelpResponse>> = queryHelp(AttitudeSetQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudeSetQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: AttitudeSetQueryHelpParams = AttitudeSetQueryHelpParams.none()): CompletableFuture<HttpResponseFor<AttitudeSetQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudeSetQueryHelpResponse>> =
            queryHelp(
              AttitudeSetQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/attitudeset/tuple`, but is otherwise the same as [AttitudeSetServiceAsync.tuple]. */
        fun tuple(params: AttitudeSetTupleParams): CompletableFuture<HttpResponseFor<List<AttitudesetFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AttitudeSetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AttitudesetFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-attitudeset`, but is otherwise the same as [AttitudeSetServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
