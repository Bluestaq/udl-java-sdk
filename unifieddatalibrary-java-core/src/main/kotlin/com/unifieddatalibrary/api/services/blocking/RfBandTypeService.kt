// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCountParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeDeleteParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListPage
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeUpdateParams
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import java.util.function.Consumer

interface RfBandTypeService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandTypeService

    /** Service operation to take a single RFBandType as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: RfBandTypeCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RfBandTypeCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an RFBandType. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: RfBandTypeUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: RfBandTypeUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: RfBandTypeUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: RfBandTypeUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): RfBandTypeListPage = list(RfBandTypeListParams.none())

    /** @see list */
    fun list(params: RfBandTypeListParams = RfBandTypeListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandTypeListPage

    /** @see list */
    fun list(params: RfBandTypeListParams = RfBandTypeListParams.none()): RfBandTypeListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): RfBandTypeListPage =
        list(
          RfBandTypeListParams.none(), requestOptions
        )

    /** Service operation to delete an RFBandType specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, RfBandTypeDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: RfBandTypeDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RfBandTypeDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          RfBandTypeDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(RfBandTypeCountParams.none())

    /** @see count */
    fun count(params: RfBandTypeCountParams = RfBandTypeCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: RfBandTypeCountParams = RfBandTypeCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          RfBandTypeCountParams.none(), requestOptions
        )

    /** Service operation to get a single RFBandType by its unique ID passed as a path parameter. */
    fun get(id: String): RfBandTypeGetResponse =
        get(
          id, RfBandTypeGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RfBandTypeGetParams = RfBandTypeGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandTypeGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RfBandTypeGetParams = RfBandTypeGetParams.none()): RfBandTypeGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RfBandTypeGetParams, requestOptions: RequestOptions = RequestOptions.none()): RfBandTypeGetResponse

    /** @see get */
    fun get(params: RfBandTypeGetParams): RfBandTypeGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RfBandTypeGetResponse =
        get(
          id,
          RfBandTypeGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): RfBandTypeQueryhelpResponse = queryhelp(RfBandTypeQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfBandTypeQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none()): RfBandTypeQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RfBandTypeQueryhelpResponse =
        queryhelp(
          RfBandTypeQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RfBandTypeTupleParams): List<RfBandTypeTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RfBandTypeTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<RfBandTypeTupleResponse>

    /** A view of [RfBandTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandTypeService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/rfbandtype`, but is otherwise the same as [RfBandTypeService.create]. */
        @MustBeClosed
        fun create(params: RfBandTypeCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: RfBandTypeCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/rfbandtype/{id}`, but is otherwise the same as [RfBandTypeService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: RfBandTypeUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: RfBandTypeUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfBandTypeUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfBandTypeUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/rfbandtype`, but is otherwise the same as [RfBandTypeService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<RfBandTypeListPage> = list(RfBandTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: RfBandTypeListParams = RfBandTypeListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RfBandTypeListParams = RfBandTypeListParams.none()): HttpResponseFor<RfBandTypeListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RfBandTypeListPage> =
            list(
              RfBandTypeListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/rfbandtype/{id}`, but is otherwise the same as [RfBandTypeService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, RfBandTypeDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfBandTypeDeleteParams = RfBandTypeDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfBandTypeDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfBandTypeDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              RfBandTypeDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfbandtype/count`, but is otherwise the same as [RfBandTypeService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(RfBandTypeCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: RfBandTypeCountParams = RfBandTypeCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: RfBandTypeCountParams = RfBandTypeCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              RfBandTypeCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfbandtype/{id}`, but is otherwise the same as [RfBandTypeService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RfBandTypeGetResponse> =
            get(
              id, RfBandTypeGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfBandTypeGetParams = RfBandTypeGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandTypeGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfBandTypeGetParams = RfBandTypeGetParams.none()): HttpResponseFor<RfBandTypeGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: RfBandTypeGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandTypeGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RfBandTypeGetParams): HttpResponseFor<RfBandTypeGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RfBandTypeGetResponse> =
            get(
              id,
              RfBandTypeGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfbandtype/queryhelp`, but is otherwise the same as [RfBandTypeService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RfBandTypeQueryhelpResponse> = queryhelp(RfBandTypeQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfBandTypeQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfBandTypeQueryhelpParams = RfBandTypeQueryhelpParams.none()): HttpResponseFor<RfBandTypeQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RfBandTypeQueryhelpResponse> =
            queryhelp(
              RfBandTypeQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfbandtype/tuple`, but is otherwise the same as [RfBandTypeService.tuple]. */
        @MustBeClosed
        fun tuple(params: RfBandTypeTupleParams): HttpResponseFor<List<RfBandTypeTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: RfBandTypeTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<RfBandTypeTupleResponse>>
    }
}
