// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftstatusremarkFull
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCountParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCreateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListPageAsync
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkTupleParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkUpdateParams
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftStatusRemarkServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusRemarkServiceAsync

    /** Service operation to take a single Aircraft Status Remark record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AircraftStatusRemarkCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AircraftStatusRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Aircraft Status Remark record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<AircraftstatusremarkFull> =
        retrieve(
          id, AircraftStatusRemarkRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftstatusremarkFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none()): CompletableFuture<AircraftstatusremarkFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftstatusremarkFull>

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRemarkRetrieveParams): CompletableFuture<AircraftstatusremarkFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AircraftstatusremarkFull> =
        retrieve(
          id,
          AircraftStatusRemarkRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Aircraft Status Remark record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AircraftStatusRemarkUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AircraftStatusRemarkUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AircraftStatusRemarkListPageAsync> = list(AircraftStatusRemarkListParams.none())

    /** @see list */
    fun list(params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftStatusRemarkListPageAsync>

    /** @see list */
    fun list(params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none()): CompletableFuture<AircraftStatusRemarkListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AircraftStatusRemarkListPageAsync> =
        list(
          AircraftStatusRemarkListParams.none(), requestOptions
        )

    /** Service operation to delete a single Aircraft Status Remark record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AircraftStatusRemarkDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AircraftStatusRemarkDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AircraftStatusRemarkDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AircraftStatusRemarkDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AircraftStatusRemarkCountParams.none())

    /** @see count */
    fun count(params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AircraftStatusRemarkCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AircraftStatusRemarkQueryhelpResponse> = queryhelp(AircraftStatusRemarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AircraftStatusRemarkQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none()): CompletableFuture<AircraftStatusRemarkQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AircraftStatusRemarkQueryhelpResponse> =
        queryhelp(
          AircraftStatusRemarkQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AircraftStatusRemarkTupleParams): CompletableFuture<List<AircraftstatusremarkFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AircraftStatusRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AircraftstatusremarkFull>>

    /** A view of [AircraftStatusRemarkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusRemarkServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/aircraftstatusremark`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.create]. */
        fun create(params: AircraftStatusRemarkCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AircraftStatusRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraftstatusremark/{id}`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>> =
            retrieve(
              id, AircraftStatusRemarkRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: AircraftStatusRemarkRetrieveParams = AircraftStatusRemarkRetrieveParams.none()): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: AircraftStatusRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>>

        /** @see retrieve */
        fun retrieve(params: AircraftStatusRemarkRetrieveParams): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftstatusremarkFull>> =
            retrieve(
              id,
              AircraftStatusRemarkRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/aircraftstatusremark/{id}`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.update]. */
        fun update(pathId: String, params: AircraftStatusRemarkUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AircraftStatusRemarkUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/aircraftstatusremark`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AircraftStatusRemarkListPageAsync>> = list(AircraftStatusRemarkListParams.none())

        /** @see list */
        fun list(params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftStatusRemarkListPageAsync>>

        /** @see list */
        fun list(params: AircraftStatusRemarkListParams = AircraftStatusRemarkListParams.none()): CompletableFuture<HttpResponseFor<AircraftStatusRemarkListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusRemarkListPageAsync>> =
            list(
              AircraftStatusRemarkListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/aircraftstatusremark/{id}`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AircraftStatusRemarkDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AircraftStatusRemarkDeleteParams = AircraftStatusRemarkDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AircraftStatusRemarkDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AircraftStatusRemarkDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AircraftStatusRemarkDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatusremark/count`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AircraftStatusRemarkCountParams.none())

        /** @see count */
        fun count(params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AircraftStatusRemarkCountParams = AircraftStatusRemarkCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AircraftStatusRemarkCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatusremark/queryhelp`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AircraftStatusRemarkQueryhelpResponse>> = queryhelp(AircraftStatusRemarkQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AircraftStatusRemarkQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AircraftStatusRemarkQueryhelpParams = AircraftStatusRemarkQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AircraftStatusRemarkQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusRemarkQueryhelpResponse>> =
            queryhelp(
              AircraftStatusRemarkQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatusremark/tuple`, but is otherwise the same as [AircraftStatusRemarkServiceAsync.tuple]. */
        fun tuple(params: AircraftStatusRemarkTupleParams): CompletableFuture<HttpResponseFor<List<AircraftstatusremarkFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AircraftStatusRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AircraftstatusremarkFull>>>
    }
}
