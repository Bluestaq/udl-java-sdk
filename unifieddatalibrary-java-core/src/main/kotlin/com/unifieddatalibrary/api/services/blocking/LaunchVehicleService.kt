// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCountParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCreateParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleDeleteParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListPage
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleUpdateParams
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import java.util.function.Consumer

interface LaunchVehicleService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleService

    /** Service operation to take a single LaunchVehicle as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: LaunchVehicleCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: LaunchVehicleCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single LaunchVehicle. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: LaunchVehicleUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: LaunchVehicleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: LaunchVehicleUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: LaunchVehicleUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): LaunchVehicleListPage = list(LaunchVehicleListParams.none())

    /** @see list */
    fun list(params: LaunchVehicleListParams = LaunchVehicleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LaunchVehicleListPage

    /** @see list */
    fun list(params: LaunchVehicleListParams = LaunchVehicleListParams.none()): LaunchVehicleListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): LaunchVehicleListPage =
        list(
          LaunchVehicleListParams.none(), requestOptions
        )

    /** Service operation to delete a LaunchVehicle object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, LaunchVehicleDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: LaunchVehicleDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: LaunchVehicleDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          LaunchVehicleDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(LaunchVehicleCountParams.none())

    /** @see count */
    fun count(params: LaunchVehicleCountParams = LaunchVehicleCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: LaunchVehicleCountParams = LaunchVehicleCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          LaunchVehicleCountParams.none(), requestOptions
        )

    /** Service operation to get a single LaunchVehicle record by its unique ID passed as a path parameter. */
    fun get(id: String): LaunchVehicleGetResponse =
        get(
          id, LaunchVehicleGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LaunchVehicleGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: LaunchVehicleGetParams = LaunchVehicleGetParams.none()): LaunchVehicleGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: LaunchVehicleGetParams, requestOptions: RequestOptions = RequestOptions.none()): LaunchVehicleGetResponse

    /** @see get */
    fun get(params: LaunchVehicleGetParams): LaunchVehicleGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchVehicleGetResponse =
        get(
          id,
          LaunchVehicleGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): LaunchVehicleQueryhelpResponse = queryhelp(LaunchVehicleQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): LaunchVehicleQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none()): LaunchVehicleQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LaunchVehicleQueryhelpResponse =
        queryhelp(
          LaunchVehicleQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: LaunchVehicleTupleParams): List<LaunchVehicleTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: LaunchVehicleTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<LaunchVehicleTupleResponse>

    /** A view of [LaunchVehicleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/launchvehicle`, but is otherwise the same as [LaunchVehicleService.create]. */
        @MustBeClosed
        fun create(params: LaunchVehicleCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: LaunchVehicleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/launchvehicle/{id}`, but is otherwise the same as [LaunchVehicleService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: LaunchVehicleUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: LaunchVehicleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchVehicleUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchVehicleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/launchvehicle`, but is otherwise the same as [LaunchVehicleService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<LaunchVehicleListPage> = list(LaunchVehicleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: LaunchVehicleListParams = LaunchVehicleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchVehicleListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: LaunchVehicleListParams = LaunchVehicleListParams.none()): HttpResponseFor<LaunchVehicleListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleListPage> =
            list(
              LaunchVehicleListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/launchvehicle/{id}`, but is otherwise the same as [LaunchVehicleService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, LaunchVehicleDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchVehicleDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchVehicleDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              LaunchVehicleDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/launchvehicle/count`, but is otherwise the same as [LaunchVehicleService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(LaunchVehicleCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: LaunchVehicleCountParams = LaunchVehicleCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: LaunchVehicleCountParams = LaunchVehicleCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              LaunchVehicleCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/launchvehicle/{id}`, but is otherwise the same as [LaunchVehicleService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchVehicleGetResponse> =
            get(
              id, LaunchVehicleGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchVehicleGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: LaunchVehicleGetParams = LaunchVehicleGetParams.none()): HttpResponseFor<LaunchVehicleGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchVehicleGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchVehicleGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchVehicleGetParams): HttpResponseFor<LaunchVehicleGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleGetResponse> =
            get(
              id,
              LaunchVehicleGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/launchvehicle/queryhelp`, but is otherwise the same as [LaunchVehicleService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LaunchVehicleQueryhelpResponse> = queryhelp(LaunchVehicleQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<LaunchVehicleQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none()): HttpResponseFor<LaunchVehicleQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleQueryhelpResponse> =
            queryhelp(
              LaunchVehicleQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/launchvehicle/tuple`, but is otherwise the same as [LaunchVehicleService.tuple]. */
        @MustBeClosed
        fun tuple(params: LaunchVehicleTupleParams): HttpResponseFor<List<LaunchVehicleTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: LaunchVehicleTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<LaunchVehicleTupleResponse>>
    }
}
