// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCountParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateBulkParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetGetParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListPage
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpResponse
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetTupleParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.soiobservationset.history.SoiObservationSetFull
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetService
import com.unifieddatalibrary.api.services.blocking.soiobservationset.HistoryService
import java.util.function.Consumer

interface SoiObservationSetService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SoiObservationSetService

    fun history(): HistoryService

    /** Service operation to take a single SOIObservationSet record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SoiObservationSetCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SoiObservationSetCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters. The query will return the SOI Observation Sets and not the associated SOI Observations. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SoiObservationSetListParams): SoiObservationSetListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SoiObservationSetListParams, requestOptions: RequestOptions = RequestOptions.none()): SoiObservationSetListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SoiObservationSetCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SoiObservationSetCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of SOIObservationSet records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SoiObservationSetCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SoiObservationSetCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single SOIObservationSet by its unique ID passed as a path parameter. */
    fun get(id: String): SoiObservationSetFull =
        get(
          id, SoiObservationSetGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SoiObservationSetFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SoiObservationSetGetParams = SoiObservationSetGetParams.none()): SoiObservationSetFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SoiObservationSetGetParams, requestOptions: RequestOptions = RequestOptions.none()): SoiObservationSetFull

    /** @see get */
    fun get(params: SoiObservationSetGetParams): SoiObservationSetFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SoiObservationSetFull =
        get(
          id,
          SoiObservationSetGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SoiObservationSetQueryhelpResponse = queryhelp(SoiObservationSetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SoiObservationSetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none()): SoiObservationSetQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SoiObservationSetQueryhelpResponse =
        queryhelp(
          SoiObservationSetQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SoiObservationSetTupleParams): List<SoiObservationSetFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SoiObservationSetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SoiObservationSetFull>

    /** Service operation to take multiple SOIObservationSet records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SoiObservationSetUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SoiObservationSetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SoiObservationSetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SoiObservationSetService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/soiobservationset`, but is otherwise the same as [SoiObservationSetService.create]. */
        @MustBeClosed
        fun create(params: SoiObservationSetCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SoiObservationSetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/soiobservationset`, but is otherwise the same as [SoiObservationSetService.list]. */
        @MustBeClosed
        fun list(params: SoiObservationSetListParams): HttpResponseFor<SoiObservationSetListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: SoiObservationSetListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SoiObservationSetListPage>

        /** Returns a raw HTTP response for `get /udl/soiobservationset/count`, but is otherwise the same as [SoiObservationSetService.count]. */
        @MustBeClosed
        fun count(params: SoiObservationSetCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: SoiObservationSetCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/soiobservationset/createBulk`, but is otherwise the same as [SoiObservationSetService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: SoiObservationSetCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: SoiObservationSetCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/soiobservationset/{id}`, but is otherwise the same as [SoiObservationSetService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SoiObservationSetFull> =
            get(
              id, SoiObservationSetGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SoiObservationSetFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SoiObservationSetGetParams = SoiObservationSetGetParams.none()): HttpResponseFor<SoiObservationSetFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SoiObservationSetGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SoiObservationSetFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SoiObservationSetGetParams): HttpResponseFor<SoiObservationSetFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SoiObservationSetFull> =
            get(
              id,
              SoiObservationSetGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/soiobservationset/queryhelp`, but is otherwise the same as [SoiObservationSetService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SoiObservationSetQueryhelpResponse> = queryhelp(SoiObservationSetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SoiObservationSetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none()): HttpResponseFor<SoiObservationSetQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SoiObservationSetQueryhelpResponse> =
            queryhelp(
              SoiObservationSetQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/soiobservationset/tuple`, but is otherwise the same as [SoiObservationSetService.tuple]. */
        @MustBeClosed
        fun tuple(params: SoiObservationSetTupleParams): HttpResponseFor<List<SoiObservationSetFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SoiObservationSetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SoiObservationSetFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-soiobservationset`, but is otherwise the same as [SoiObservationSetService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: SoiObservationSetUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: SoiObservationSetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
