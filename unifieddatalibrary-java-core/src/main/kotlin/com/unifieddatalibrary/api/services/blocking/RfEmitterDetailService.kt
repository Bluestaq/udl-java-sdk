// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListPage
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.RfEmitterDetailService
import java.util.function.Consumer

interface RfEmitterDetailService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterDetailService

    /** Service operation to take a single RFEmitterDetails as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: RfEmitterDetailCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RfEmitterDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an RFEmitterDetails. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: RfEmitterDetailUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: RfEmitterDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: RfEmitterDetailUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: RfEmitterDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): RfEmitterDetailListPage = list(RfEmitterDetailListParams.none())

    /** @see list */
    fun list(params: RfEmitterDetailListParams = RfEmitterDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfEmitterDetailListPage

    /** @see list */
    fun list(params: RfEmitterDetailListParams = RfEmitterDetailListParams.none()): RfEmitterDetailListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): RfEmitterDetailListPage =
        list(
          RfEmitterDetailListParams.none(), requestOptions
        )

    /** Service operation to delete an RFEmitterDetails specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, RfEmitterDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: RfEmitterDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RfEmitterDetailDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          RfEmitterDetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(RfEmitterDetailCountParams.none())

    /** @see count */
    fun count(params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          RfEmitterDetailCountParams.none(), requestOptions
        )

    /** Service operation to get a single RFEmitterDetails by its unique ID passed as a path parameter. */
    fun get(id: String): RfEmitterDetailGetResponse =
        get(
          id, RfEmitterDetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfEmitterDetailGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none()): RfEmitterDetailGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RfEmitterDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): RfEmitterDetailGetResponse

    /** @see get */
    fun get(params: RfEmitterDetailGetParams): RfEmitterDetailGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RfEmitterDetailGetResponse =
        get(
          id,
          RfEmitterDetailGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): RfEmitterDetailQueryhelpResponse = queryhelp(RfEmitterDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfEmitterDetailQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none()): RfEmitterDetailQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RfEmitterDetailQueryhelpResponse =
        queryhelp(
          RfEmitterDetailQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RfEmitterDetailTupleParams): List<RfEmitterDetailTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RfEmitterDetailTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<RfEmitterDetailTupleResponse>

    /** A view of [RfEmitterDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterDetailService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/rfemitterdetails`, but is otherwise the same as [RfEmitterDetailService.create]. */
        @MustBeClosed
        fun create(params: RfEmitterDetailCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: RfEmitterDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/rfemitterdetails/{id}`, but is otherwise the same as [RfEmitterDetailService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: RfEmitterDetailUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: RfEmitterDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfEmitterDetailUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RfEmitterDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/rfemitterdetails`, but is otherwise the same as [RfEmitterDetailService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<RfEmitterDetailListPage> = list(RfEmitterDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: RfEmitterDetailListParams = RfEmitterDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfEmitterDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RfEmitterDetailListParams = RfEmitterDetailListParams.none()): HttpResponseFor<RfEmitterDetailListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RfEmitterDetailListPage> =
            list(
              RfEmitterDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/rfemitterdetails/{id}`, but is otherwise the same as [RfEmitterDetailService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, RfEmitterDetailDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: RfEmitterDetailDeleteParams = RfEmitterDetailDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfEmitterDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RfEmitterDetailDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              RfEmitterDetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfemitterdetails/count`, but is otherwise the same as [RfEmitterDetailService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(RfEmitterDetailCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: RfEmitterDetailCountParams = RfEmitterDetailCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              RfEmitterDetailCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfemitterdetails/{id}`, but is otherwise the same as [RfEmitterDetailService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RfEmitterDetailGetResponse> =
            get(
              id, RfEmitterDetailGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfEmitterDetailGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfEmitterDetailGetParams = RfEmitterDetailGetParams.none()): HttpResponseFor<RfEmitterDetailGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: RfEmitterDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfEmitterDetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RfEmitterDetailGetParams): HttpResponseFor<RfEmitterDetailGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RfEmitterDetailGetResponse> =
            get(
              id,
              RfEmitterDetailGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfemitterdetails/queryhelp`, but is otherwise the same as [RfEmitterDetailService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RfEmitterDetailQueryhelpResponse> = queryhelp(RfEmitterDetailQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfEmitterDetailQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfEmitterDetailQueryhelpParams = RfEmitterDetailQueryhelpParams.none()): HttpResponseFor<RfEmitterDetailQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RfEmitterDetailQueryhelpResponse> =
            queryhelp(
              RfEmitterDetailQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfemitterdetails/tuple`, but is otherwise the same as [RfEmitterDetailService.tuple]. */
        @MustBeClosed
        fun tuple(params: RfEmitterDetailTupleParams): HttpResponseFor<List<RfEmitterDetailTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: RfEmitterDetailTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<RfEmitterDetailTupleResponse>>
    }
}
