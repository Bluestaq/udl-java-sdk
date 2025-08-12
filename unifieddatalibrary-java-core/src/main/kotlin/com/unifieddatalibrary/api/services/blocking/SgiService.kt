// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sgi.SgiCountParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateBulkParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateParams
import com.unifieddatalibrary.api.models.sgi.SgiDeleteParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateResponse
import com.unifieddatalibrary.api.models.sgi.SgiGetParams
import com.unifieddatalibrary.api.models.sgi.SgiGetResponse
import com.unifieddatalibrary.api.models.sgi.SgiListPage
import com.unifieddatalibrary.api.models.sgi.SgiListParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpResponse
import com.unifieddatalibrary.api.models.sgi.SgiTupleParams
import com.unifieddatalibrary.api.models.sgi.SgiTupleResponse
import com.unifieddatalibrary.api.models.sgi.SgiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sgi.SgiUpdateParams
import com.unifieddatalibrary.api.services.blocking.SgiService
import com.unifieddatalibrary.api.services.blocking.sgi.HistoryService
import java.util.function.Consumer

interface SgiService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiService

    fun history(): HistoryService

    /** Service operation to take a single SGI record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SgiCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SgiCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single SGI record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SgiUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SgiUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SgiUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SgiUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): SgiListPage = list(SgiListParams.none())

    /** @see list */
    fun list(params: SgiListParams = SgiListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SgiListPage

    /** @see list */
    fun list(params: SgiListParams = SgiListParams.none()): SgiListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): SgiListPage =
        list(
          SgiListParams.none(), requestOptions
        )

    /** Service operation to delete a SGI record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, SgiDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SgiDeleteParams = SgiDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SgiDeleteParams = SgiDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SgiDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SgiDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          SgiDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(SgiCountParams.none())

    /** @see count */
    fun count(params: SgiCountParams = SgiCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: SgiCountParams = SgiCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          SgiCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of SGI as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SgiCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single SGI record by its unique ID passed as a path parameter. */
    fun get(id: String): SgiGetResponse =
        get(
          id, SgiGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SgiGetParams = SgiGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SgiGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SgiGetParams = SgiGetParams.none()): SgiGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SgiGetParams, requestOptions: RequestOptions = RequestOptions.none()): SgiGetResponse

    /** @see get */
    fun get(params: SgiGetParams): SgiGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SgiGetResponse =
        get(
          id,
          SgiGetParams.none(),
          requestOptions,
        )

    /** Service to return matching SGI records as of the effective date. */
    fun getDataByEffectiveAsOfDate(): SgiGetDataByEffectiveAsOfDateResponse = getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none())

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SgiGetDataByEffectiveAsOfDateResponse

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none()): SgiGetDataByEffectiveAsOfDateResponse =
        getDataByEffectiveAsOfDate(
          params, RequestOptions.none()
        )

    /** @see getDataByEffectiveAsOfDate */
    fun getDataByEffectiveAsOfDate(requestOptions: RequestOptions): SgiGetDataByEffectiveAsOfDateResponse =
        getDataByEffectiveAsOfDate(
          SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SgiQueryhelpResponse = queryhelp(SgiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SgiQueryhelpParams = SgiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SgiQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SgiQueryhelpParams = SgiQueryhelpParams.none()): SgiQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SgiQueryhelpResponse =
        queryhelp(
          SgiQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SgiTupleParams): List<SgiTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SgiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SgiTupleResponse>

    /** Service operation to take multiple SGI as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SgiUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SgiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sgi`, but is otherwise the same as [SgiService.create]. */
        @MustBeClosed
        fun create(params: SgiCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SgiCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/sgi/{id}`, but is otherwise the same as [SgiService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SgiUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SgiUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SgiUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SgiUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sgi`, but is otherwise the same as [SgiService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<SgiListPage> = list(SgiListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: SgiListParams = SgiListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SgiListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SgiListParams = SgiListParams.none()): HttpResponseFor<SgiListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SgiListPage> =
            list(
              SgiListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/sgi/{id}`, but is otherwise the same as [SgiService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, SgiDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SgiDeleteParams = SgiDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SgiDeleteParams = SgiDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: SgiDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SgiDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              SgiDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sgi/count`, but is otherwise the same as [SgiService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(SgiCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: SgiCountParams = SgiCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SgiCountParams = SgiCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              SgiCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/sgi/createBulk`, but is otherwise the same as [SgiService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: SgiCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sgi/{id}`, but is otherwise the same as [SgiService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SgiGetResponse> =
            get(
              id, SgiGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SgiGetParams = SgiGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SgiGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SgiGetParams = SgiGetParams.none()): HttpResponseFor<SgiGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SgiGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SgiGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SgiGetParams): HttpResponseFor<SgiGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SgiGetResponse> =
            get(
              id,
              SgiGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sgi/getSGIDataByEffectiveAsOfDate`, but is otherwise the same as [SgiService.getDataByEffectiveAsOfDate]. */
        @MustBeClosed
        fun getDataByEffectiveAsOfDate(): HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse> = getDataByEffectiveAsOfDate(SgiGetDataByEffectiveAsOfDateParams.none())

        /** @see getDataByEffectiveAsOfDate */
        @MustBeClosed
        fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>

        /** @see getDataByEffectiveAsOfDate */
        @MustBeClosed
        fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams = SgiGetDataByEffectiveAsOfDateParams.none()): HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse> =
            getDataByEffectiveAsOfDate(
              params, RequestOptions.none()
            )

        /** @see getDataByEffectiveAsOfDate */
        @MustBeClosed
        fun getDataByEffectiveAsOfDate(requestOptions: RequestOptions): HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse> =
            getDataByEffectiveAsOfDate(
              SgiGetDataByEffectiveAsOfDateParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sgi/queryhelp`, but is otherwise the same as [SgiService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SgiQueryhelpResponse> = queryhelp(SgiQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SgiQueryhelpParams = SgiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SgiQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SgiQueryhelpParams = SgiQueryhelpParams.none()): HttpResponseFor<SgiQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SgiQueryhelpResponse> =
            queryhelp(
              SgiQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sgi/tuple`, but is otherwise the same as [SgiService.tuple]. */
        @MustBeClosed
        fun tuple(params: SgiTupleParams): HttpResponseFor<List<SgiTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SgiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SgiTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sgi`, but is otherwise the same as [SgiService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: SgiUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
