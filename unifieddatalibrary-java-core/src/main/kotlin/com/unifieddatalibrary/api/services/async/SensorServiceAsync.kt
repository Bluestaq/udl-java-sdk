// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensor.SensorCountParams
import com.unifieddatalibrary.api.models.sensor.SensorCreateParams
import com.unifieddatalibrary.api.models.sensor.SensorDeleteParams
import com.unifieddatalibrary.api.models.sensor.SensorGetParams
import com.unifieddatalibrary.api.models.sensor.SensorGetResponse
import com.unifieddatalibrary.api.models.sensor.SensorListPageAsync
import com.unifieddatalibrary.api.models.sensor.SensorListParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpResponse
import com.unifieddatalibrary.api.models.sensor.SensorTupleParams
import com.unifieddatalibrary.api.models.sensor.SensorTupleResponse
import com.unifieddatalibrary.api.models.sensor.SensorUpdateParams
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync

    fun calibration(): CalibrationServiceAsync

    /** Service operation to take a single sensor as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SensorCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SensorCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Sensor. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(id: String, params: SensorUpdateParams): CompletableFuture<Void?> =
        update(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(id: String, params: SensorUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SensorUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SensorUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SensorListPageAsync> = list(SensorListParams.none())

    /** @see list */
    fun list(params: SensorListParams = SensorListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SensorListPageAsync>

    /** @see list */
    fun list(params: SensorListParams = SensorListParams.none()): CompletableFuture<SensorListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SensorListPageAsync> =
        list(
          SensorListParams.none(), requestOptions
        )

    /** Service operation to delete a Sensor specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SensorDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SensorDeleteParams = SensorDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SensorDeleteParams = SensorDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SensorDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SensorDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SensorDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SensorCountParams.none())

    /** @see count */
    fun count(params: SensorCountParams = SensorCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SensorCountParams = SensorCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SensorCountParams.none(), requestOptions
        )

    /** Service operation to get a single Sensor by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SensorGetResponse> =
        get(
          id, SensorGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SensorGetParams = SensorGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SensorGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SensorGetParams = SensorGetParams.none()): CompletableFuture<SensorGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SensorGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SensorGetResponse>

    /** @see get */
    fun get(params: SensorGetParams): CompletableFuture<SensorGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SensorGetResponse> =
        get(
          id,
          SensorGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SensorQueryhelpResponse> = queryhelp(SensorQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SensorQueryhelpParams = SensorQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SensorQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SensorQueryhelpParams = SensorQueryhelpParams.none()): CompletableFuture<SensorQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SensorQueryhelpResponse> =
        queryhelp(
          SensorQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SensorTupleParams): CompletableFuture<List<SensorTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SensorTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SensorTupleResponse>>

    /** A view of [SensorServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync.WithRawResponse

        fun calibration(): CalibrationServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sensor`, but is otherwise the same as [SensorServiceAsync.create]. */
        fun create(params: SensorCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SensorCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/sensor/{id}`, but is otherwise the same as [SensorServiceAsync.update]. */
        fun update(id: String, params: SensorUpdateParams): CompletableFuture<HttpResponse> =
            update(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(id: String, params: SensorUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SensorUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SensorUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/sensor`, but is otherwise the same as [SensorServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SensorListPageAsync>> = list(SensorListParams.none())

        /** @see list */
        fun list(params: SensorListParams = SensorListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SensorListPageAsync>>

        /** @see list */
        fun list(params: SensorListParams = SensorListParams.none()): CompletableFuture<HttpResponseFor<SensorListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorListPageAsync>> =
            list(
              SensorListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/sensor/{id}`, but is otherwise the same as [SensorServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SensorDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SensorDeleteParams = SensorDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SensorDeleteParams = SensorDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SensorDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SensorDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SensorDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sensor/count`, but is otherwise the same as [SensorServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SensorCountParams.none())

        /** @see count */
        fun count(params: SensorCountParams = SensorCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SensorCountParams = SensorCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SensorCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensor/{id}`, but is otherwise the same as [SensorServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SensorGetResponse>> =
            get(
              id, SensorGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SensorGetParams = SensorGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SensorGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SensorGetParams = SensorGetParams.none()): CompletableFuture<HttpResponseFor<SensorGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SensorGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SensorGetResponse>>

        /** @see get */
        fun get(params: SensorGetParams): CompletableFuture<HttpResponseFor<SensorGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorGetResponse>> =
            get(
              id,
              SensorGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sensor/queryhelp`, but is otherwise the same as [SensorServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SensorQueryhelpResponse>> = queryhelp(SensorQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SensorQueryhelpParams = SensorQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SensorQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SensorQueryhelpParams = SensorQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SensorQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorQueryhelpResponse>> =
            queryhelp(
              SensorQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensor/tuple`, but is otherwise the same as [SensorServiceAsync.tuple]. */
        fun tuple(params: SensorTupleParams): CompletableFuture<HttpResponseFor<List<SensorTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SensorTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SensorTupleResponse>>>
    }
}
