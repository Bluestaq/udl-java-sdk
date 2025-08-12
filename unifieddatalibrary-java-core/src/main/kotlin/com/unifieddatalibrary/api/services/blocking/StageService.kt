// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.stage.StageCountParams
import com.unifieddatalibrary.api.models.stage.StageCreateParams
import com.unifieddatalibrary.api.models.stage.StageDeleteParams
import com.unifieddatalibrary.api.models.stage.StageGetParams
import com.unifieddatalibrary.api.models.stage.StageGetResponse
import com.unifieddatalibrary.api.models.stage.StageListPage
import com.unifieddatalibrary.api.models.stage.StageListParams
import com.unifieddatalibrary.api.models.stage.StageQueryhelpParams
import com.unifieddatalibrary.api.models.stage.StageQueryhelpResponse
import com.unifieddatalibrary.api.models.stage.StageTupleParams
import com.unifieddatalibrary.api.models.stage.StageTupleResponse
import com.unifieddatalibrary.api.models.stage.StageUpdateParams
import com.unifieddatalibrary.api.services.blocking.StageService
import java.util.function.Consumer

interface StageService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService

    /** Service operation to take a single Stage as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Stage represents various stages of a particular launch vehicle, compiled by a particular source. A vehicle may have multiple stage records. */
    fun create(params: StageCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: StageCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Stage. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Stage represents various stages of a particular launch vehicle, compiled by a particular source. A vehicle may have multiple stage records. */
    fun update(pathId: String, params: StageUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: StageUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: StageUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: StageUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): StageListPage = list(StageListParams.none())

    /** @see list */
    fun list(params: StageListParams = StageListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StageListPage

    /** @see list */
    fun list(params: StageListParams = StageListParams.none()): StageListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): StageListPage =
        list(
          StageListParams.none(), requestOptions
        )

    /** Service operation to delete a Stage object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Stage represents various stages of a particular launch vehicle, compiled by a particular source. A vehicle may have multiple stage records. */
    fun delete(id: String) =
        delete(
          id, StageDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: StageDeleteParams = StageDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: StageDeleteParams = StageDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: StageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: StageDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          StageDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(StageCountParams.none())

    /** @see count */
    fun count(params: StageCountParams = StageCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: StageCountParams = StageCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          StageCountParams.none(), requestOptions
        )

    /** Service operation to get a single Stage record by its unique ID passed as a path parameter. A Stage represents various stages of a particular launch vehicle, compiled by a particular source. A vehicle may have multiple stage records. */
    fun get(id: String): StageGetResponse =
        get(
          id, StageGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: StageGetParams = StageGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StageGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: StageGetParams = StageGetParams.none()): StageGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: StageGetParams, requestOptions: RequestOptions = RequestOptions.none()): StageGetResponse

    /** @see get */
    fun get(params: StageGetParams): StageGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): StageGetResponse =
        get(
          id,
          StageGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): StageQueryhelpResponse = queryhelp(StageQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: StageQueryhelpParams = StageQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StageQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: StageQueryhelpParams = StageQueryhelpParams.none()): StageQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): StageQueryhelpResponse =
        queryhelp(
          StageQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: StageTupleParams): List<StageTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: StageTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<StageTupleResponse>

    /** A view of [StageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/stage`, but is otherwise the same as [StageService.create]. */
        @MustBeClosed
        fun create(params: StageCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: StageCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/stage/{id}`, but is otherwise the same as [StageService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: StageUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: StageUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StageUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StageUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/stage`, but is otherwise the same as [StageService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<StageListPage> = list(StageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: StageListParams = StageListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StageListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: StageListParams = StageListParams.none()): HttpResponseFor<StageListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StageListPage> =
            list(
              StageListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/stage/{id}`, but is otherwise the same as [StageService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, StageDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StageDeleteParams = StageDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StageDeleteParams = StageDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: StageDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: StageDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              StageDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/stage/count`, but is otherwise the same as [StageService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(StageCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: StageCountParams = StageCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: StageCountParams = StageCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              StageCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/stage/{id}`, but is otherwise the same as [StageService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<StageGetResponse> =
            get(
              id, StageGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StageGetParams = StageGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StageGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StageGetParams = StageGetParams.none()): HttpResponseFor<StageGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: StageGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StageGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: StageGetParams): HttpResponseFor<StageGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<StageGetResponse> =
            get(
              id,
              StageGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/stage/queryhelp`, but is otherwise the same as [StageService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<StageQueryhelpResponse> = queryhelp(StageQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StageQueryhelpParams = StageQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StageQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StageQueryhelpParams = StageQueryhelpParams.none()): HttpResponseFor<StageQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<StageQueryhelpResponse> =
            queryhelp(
              StageQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/stage/tuple`, but is otherwise the same as [StageService.tuple]. */
        @MustBeClosed
        fun tuple(params: StageTupleParams): HttpResponseFor<List<StageTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: StageTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StageTupleResponse>>
    }
}
