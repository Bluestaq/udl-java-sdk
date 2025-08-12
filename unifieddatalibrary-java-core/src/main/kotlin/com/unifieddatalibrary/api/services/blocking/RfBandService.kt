// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.RfBandFull
import com.unifieddatalibrary.api.models.rfband.RfBandCountParams
import com.unifieddatalibrary.api.models.rfband.RfBandCreateParams
import com.unifieddatalibrary.api.models.rfband.RfBandDeleteParams
import com.unifieddatalibrary.api.models.rfband.RfBandGetParams
import com.unifieddatalibrary.api.models.rfband.RfBandListPage
import com.unifieddatalibrary.api.models.rfband.RfBandListParams
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpParams
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpResponse
import com.unifieddatalibrary.api.models.rfband.RfBandTupleParams
import com.unifieddatalibrary.api.models.rfband.RfBandUpdateParams
import com.unifieddatalibrary.api.services.blocking.RfBandService
import java.util.function.Consumer

interface RfBandService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandService

    /** Service operation to take a single RFBand as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: RfBandCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RfBandCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an RFBand. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: RfBandUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: RfBandUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): RfBandListPage = list(RfBandListParams.none())

    /** @see list */
    fun list(params: RfBandListParams = RfBandListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandListPage

    /** @see list */
    fun list(params: RfBandListParams = RfBandListParams.none()): RfBandListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): RfBandListPage =
        list(
          RfBandListParams.none(), requestOptions
        )

    /** Service operation to delete an RFBand specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, RfBandDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RfBandDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          RfBandDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(RfBandCountParams.none())

    /** @see count */
    fun count(params: RfBandCountParams = RfBandCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: RfBandCountParams = RfBandCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          RfBandCountParams.none(), requestOptions
        )

    /** Service operation to get a single RFBand by its unique ID passed as a path parameter. */
    fun get(id: String): RfBandFull =
        get(
          id, RfBandGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RfBandGetParams = RfBandGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RfBandGetParams = RfBandGetParams.none()): RfBandFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RfBandGetParams, requestOptions: RequestOptions = RequestOptions.none()): RfBandFull

    /** @see get */
    fun get(params: RfBandGetParams): RfBandFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RfBandFull =
        get(
          id,
          RfBandGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): RfBandQueryhelpResponse = queryhelp(RfBandQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none()): RfBandQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RfBandQueryhelpResponse =
        queryhelp(
          RfBandQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RfBandTupleParams): List<RfBandFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<RfBandFull>

    /** A view of [RfBandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/rfband`, but is otherwise the same as [RfBandService.create]. */
        @MustBeClosed
        fun create(params: RfBandCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: RfBandCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/rfband/{id}`, but is otherwise the same as [RfBandService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: RfBandUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfBandUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfBandUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/rfband`, but is otherwise the same as [RfBandService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<RfBandListPage> = list(RfBandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: RfBandListParams = RfBandListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RfBandListParams = RfBandListParams.none()): HttpResponseFor<RfBandListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RfBandListPage> =
            list(
              RfBandListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/rfband/{id}`, but is otherwise the same as [RfBandService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, RfBandDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfBandDeleteParams = RfBandDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfBandDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              RfBandDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfband/count`, but is otherwise the same as [RfBandService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(RfBandCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: RfBandCountParams = RfBandCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: RfBandCountParams = RfBandCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              RfBandCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfband/{id}`, but is otherwise the same as [RfBandService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RfBandFull> =
            get(
              id, RfBandGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfBandGetParams = RfBandGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfBandGetParams = RfBandGetParams.none()): HttpResponseFor<RfBandFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: RfBandGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandFull>

        /** @see get */
        @MustBeClosed
        fun get(params: RfBandGetParams): HttpResponseFor<RfBandFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RfBandFull> =
            get(
              id,
              RfBandGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfband/queryhelp`, but is otherwise the same as [RfBandService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RfBandQueryhelpResponse> = queryhelp(RfBandQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfBandQueryhelpParams = RfBandQueryhelpParams.none()): HttpResponseFor<RfBandQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RfBandQueryhelpResponse> =
            queryhelp(
              RfBandQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfband/tuple`, but is otherwise the same as [RfBandService.tuple]. */
        @MustBeClosed
        fun tuple(params: RfBandTupleParams): HttpResponseFor<List<RfBandFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<RfBandFull>>
    }
}
