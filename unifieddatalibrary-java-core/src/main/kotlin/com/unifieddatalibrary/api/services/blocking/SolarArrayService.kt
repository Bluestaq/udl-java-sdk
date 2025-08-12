// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SolarArrayFull
import com.unifieddatalibrary.api.models.solararray.SolarArrayCountParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayCreateParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayDeleteParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayGetParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayListPage
import com.unifieddatalibrary.api.models.solararray.SolarArrayListParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpResponse
import com.unifieddatalibrary.api.models.solararray.SolarArrayTupleParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayUpdateParams
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import java.util.function.Consumer

interface SolarArrayService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayService

    /** Service operation to take a single SolarArray as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SolarArrayCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single SolarArray. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SolarArrayUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SolarArrayUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SolarArrayListPage = list(SolarArrayListParams.none())

    /** @see list */
    fun list(params: SolarArrayListParams = SolarArrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SolarArrayListPage

    /** @see list */
    fun list(params: SolarArrayListParams = SolarArrayListParams.none()): SolarArrayListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SolarArrayListPage =
        list(
          SolarArrayListParams.none(), requestOptions
        )

    /** Service operation to delete a SolarArray object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SolarArrayDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SolarArrayDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SolarArrayDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SolarArrayCountParams.none())

    /** @see count */
    fun count(params: SolarArrayCountParams = SolarArrayCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SolarArrayCountParams = SolarArrayCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SolarArrayCountParams.none(), requestOptions
        )

    /** Service operation to get a single SolarArray record by its unique ID passed as a path parameter. */
    fun get(id: String): SolarArrayFull =
        get(
          id, SolarArrayGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SolarArrayFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none()): SolarArrayFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SolarArrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): SolarArrayFull

    /** @see get */
    fun get(params: SolarArrayGetParams): SolarArrayFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SolarArrayFull =
        get(
          id,
          SolarArrayGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SolarArrayQueryhelpResponse = queryhelp(SolarArrayQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SolarArrayQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none()): SolarArrayQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SolarArrayQueryhelpResponse =
        queryhelp(
          SolarArrayQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SolarArrayTupleParams): List<SolarArrayFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SolarArrayFull>

    /** A view of [SolarArrayService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/solararray`, but is otherwise the same as [SolarArrayService.create]. */
        @MustBeClosed
        fun create(params: SolarArrayCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/solararray/{id}`, but is otherwise the same as [SolarArrayService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SolarArrayUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SolarArrayUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/solararray`, but is otherwise the same as [SolarArrayService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SolarArrayListPage> = list(SolarArrayListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SolarArrayListParams = SolarArrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SolarArrayListParams = SolarArrayListParams.none()): HttpResponseFor<SolarArrayListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SolarArrayListPage> =
            list(
              SolarArrayListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/solararray/{id}`, but is otherwise the same as [SolarArrayService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SolarArrayDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SolarArrayDeleteParams = SolarArrayDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SolarArrayDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SolarArrayDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararray/count`, but is otherwise the same as [SolarArrayService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SolarArrayCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SolarArrayCountParams = SolarArrayCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SolarArrayCountParams = SolarArrayCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SolarArrayCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/solararray/{id}`, but is otherwise the same as [SolarArrayService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SolarArrayFull> =
            get(
              id, SolarArrayGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SolarArrayGetParams = SolarArrayGetParams.none()): HttpResponseFor<SolarArrayFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SolarArrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SolarArrayGetParams): HttpResponseFor<SolarArrayFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SolarArrayFull> =
            get(
              id,
              SolarArrayGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararray/queryhelp`, but is otherwise the same as [SolarArrayService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SolarArrayQueryhelpResponse> = queryhelp(SolarArrayQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SolarArrayQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SolarArrayQueryhelpParams = SolarArrayQueryhelpParams.none()): HttpResponseFor<SolarArrayQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SolarArrayQueryhelpResponse> =
            queryhelp(
              SolarArrayQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/solararray/tuple`, but is otherwise the same as [SolarArrayService.tuple]. */
        @MustBeClosed
        fun tuple(params: SolarArrayTupleParams): HttpResponseFor<List<SolarArrayFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SolarArrayFull>>
    }
}
