// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OperatingunitFull
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCountParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCreateParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitDeleteParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitGetParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitListPage
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitListParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitTupleParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitUpdateParams
import com.unifieddatalibrary.api.services.blocking.OperatingunitService
import java.util.function.Consumer

interface OperatingunitService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitService

    /** Service operation to take a single Operatingunit as a POST body and ingest into the database. Operatingunit defines a unit or organization which operates or controls a space-related Entity. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OperatingunitCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OperatingunitCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Operatingunit. Operatingunit defines a unit or organization which operates or controls a space-related Entity. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(id: String, params: OperatingunitUpdateParams) =
        update(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(id: String, params: OperatingunitUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OperatingunitUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OperatingunitUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OperatingunitListPage = list(OperatingunitListParams.none())

    /** @see list */
    fun list(params: OperatingunitListParams = OperatingunitListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingunitListPage

    /** @see list */
    fun list(params: OperatingunitListParams = OperatingunitListParams.none()): OperatingunitListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OperatingunitListPage =
        list(
          OperatingunitListParams.none(), requestOptions
        )

    /** Service operation to delete an Operatingunit object specified by the passed ID path parameter. Operatingunit defines a unit or organization which operates or controls a space-related Entity. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OperatingunitDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OperatingunitDeleteParams = OperatingunitDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OperatingunitDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OperatingunitDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OperatingunitDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(OperatingunitCountParams.none())

    /** @see count */
    fun count(params: OperatingunitCountParams = OperatingunitCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: OperatingunitCountParams = OperatingunitCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          OperatingunitCountParams.none(), requestOptions
        )

    /** Service operation to get a single Operatingunit record by its unique ID passed as a path parameter. Operatingunit defines a unit or organization which operates or controls a space-related Entity. */
    fun get(id: String): OperatingunitFull =
        get(
          id, OperatingunitGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OperatingunitGetParams = OperatingunitGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingunitFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OperatingunitGetParams = OperatingunitGetParams.none()): OperatingunitFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OperatingunitGetParams, requestOptions: RequestOptions = RequestOptions.none()): OperatingunitFull

    /** @see get */
    fun get(params: OperatingunitGetParams): OperatingunitFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OperatingunitFull =
        get(
          id,
          OperatingunitGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): OperatingunitQueryhelpResponse = queryhelp(OperatingunitQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingunitQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none()): OperatingunitQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OperatingunitQueryhelpResponse =
        queryhelp(
          OperatingunitQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OperatingunitTupleParams): List<OperatingunitFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OperatingunitTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OperatingunitFull>

    /** A view of [OperatingunitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/operatingunit`, but is otherwise the same as [OperatingunitService.create]. */
        @MustBeClosed
        fun create(params: OperatingunitCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OperatingunitCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/operatingunit/{id}`, but is otherwise the same as [OperatingunitService.update]. */
        @MustBeClosed
        fun update(id: String, params: OperatingunitUpdateParams): HttpResponse =
            update(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(id: String, params: OperatingunitUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OperatingunitUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OperatingunitUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/operatingunit`, but is otherwise the same as [OperatingunitService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OperatingunitListPage> = list(OperatingunitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OperatingunitListParams = OperatingunitListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OperatingunitListParams = OperatingunitListParams.none()): HttpResponseFor<OperatingunitListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OperatingunitListPage> =
            list(
              OperatingunitListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/operatingunit/{id}`, but is otherwise the same as [OperatingunitService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OperatingunitDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OperatingunitDeleteParams = OperatingunitDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OperatingunitDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OperatingunitDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OperatingunitDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/operatingunit/count`, but is otherwise the same as [OperatingunitService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OperatingunitCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: OperatingunitCountParams = OperatingunitCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: OperatingunitCountParams = OperatingunitCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              OperatingunitCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunit/{id}`, but is otherwise the same as [OperatingunitService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OperatingunitFull> =
            get(
              id, OperatingunitGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OperatingunitGetParams = OperatingunitGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OperatingunitGetParams = OperatingunitGetParams.none()): HttpResponseFor<OperatingunitFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OperatingunitGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OperatingunitGetParams): HttpResponseFor<OperatingunitFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OperatingunitFull> =
            get(
              id,
              OperatingunitGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/operatingunit/queryhelp`, but is otherwise the same as [OperatingunitService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OperatingunitQueryhelpResponse> = queryhelp(OperatingunitQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none()): HttpResponseFor<OperatingunitQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OperatingunitQueryhelpResponse> =
            queryhelp(
              OperatingunitQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunit/tuple`, but is otherwise the same as [OperatingunitService.tuple]. */
        @MustBeClosed
        fun tuple(params: OperatingunitTupleParams): HttpResponseFor<List<OperatingunitFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OperatingunitTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OperatingunitFull>>
    }
}
