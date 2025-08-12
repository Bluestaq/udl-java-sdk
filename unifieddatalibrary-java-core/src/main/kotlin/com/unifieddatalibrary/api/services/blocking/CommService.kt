// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CommFull
import com.unifieddatalibrary.api.models.comm.CommCountParams
import com.unifieddatalibrary.api.models.comm.CommCreateParams
import com.unifieddatalibrary.api.models.comm.CommDeleteParams
import com.unifieddatalibrary.api.models.comm.CommListPage
import com.unifieddatalibrary.api.models.comm.CommListParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpResponse
import com.unifieddatalibrary.api.models.comm.CommRetrieveParams
import com.unifieddatalibrary.api.models.comm.CommTupleParams
import com.unifieddatalibrary.api.models.comm.CommUpdateParams
import com.unifieddatalibrary.api.services.blocking.CommService
import java.util.function.Consumer

interface CommService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommService

    /** Service operation to take a single Comm as a POST body and ingest into the database. A Comm is an on-orbit communications payload, including supporting data such as transponders and channels, etc. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CommCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CommCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Comm record by its unique ID passed as a path parameter. A Comm is an on-orbit communications payload, including supporting data such as transponders and channels, etc. */
    fun retrieve(id: String): CommFull =
        retrieve(
          id, CommRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CommRetrieveParams = CommRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CommFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CommRetrieveParams = CommRetrieveParams.none()): CommFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CommRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CommFull

    /** @see retrieve */
    fun retrieve(params: CommRetrieveParams): CommFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CommFull =
        retrieve(
          id,
          CommRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Comm. A Comm is an on-orbit communications payload, including supporting data such as transponders and channels, etc. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: CommUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: CommUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: CommUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: CommUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CommListPage = list(CommListParams.none())

    /** @see list */
    fun list(params: CommListParams = CommListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CommListPage

    /** @see list */
    fun list(params: CommListParams = CommListParams.none()): CommListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CommListPage =
        list(
          CommListParams.none(), requestOptions
        )

    /** Service operation to delete a Comm object specified by the passed ID path parameter. A Comm is an on-orbit communications payload, including supporting data such as transponders and channels, etc. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, CommDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: CommDeleteParams = CommDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: CommDeleteParams = CommDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: CommDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CommDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          CommDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(CommCountParams.none())

    /** @see count */
    fun count(params: CommCountParams = CommCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: CommCountParams = CommCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          CommCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CommQueryhelpResponse = queryhelp(CommQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: CommQueryhelpParams = CommQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CommQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: CommQueryhelpParams = CommQueryhelpParams.none()): CommQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CommQueryhelpResponse =
        queryhelp(
          CommQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CommTupleParams): List<CommFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CommTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<CommFull>

    /** A view of [CommService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/comm`, but is otherwise the same as [CommService.create]. */
        @MustBeClosed
        fun create(params: CommCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: CommCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/comm/{id}`, but is otherwise the same as [CommService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CommFull> =
            retrieve(
              id, CommRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CommRetrieveParams = CommRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CommFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CommRetrieveParams = CommRetrieveParams.none()): HttpResponseFor<CommFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CommFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommRetrieveParams): HttpResponseFor<CommFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CommFull> =
            retrieve(
              id,
              CommRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/comm/{id}`, but is otherwise the same as [CommService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: CommUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: CommUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CommUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CommUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/comm`, but is otherwise the same as [CommService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<CommListPage> = list(CommListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: CommListParams = CommListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CommListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CommListParams = CommListParams.none()): HttpResponseFor<CommListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommListPage> =
            list(
              CommListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/comm/{id}`, but is otherwise the same as [CommService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, CommDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: CommDeleteParams = CommDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: CommDeleteParams = CommDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              CommDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/comm/count`, but is otherwise the same as [CommService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(CommCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: CommCountParams = CommCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: CommCountParams = CommCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              CommCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/comm/queryhelp`, but is otherwise the same as [CommService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<CommQueryhelpResponse> = queryhelp(CommQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CommQueryhelpParams = CommQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CommQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CommQueryhelpParams = CommQueryhelpParams.none()): HttpResponseFor<CommQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<CommQueryhelpResponse> =
            queryhelp(
              CommQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/comm/tuple`, but is otherwise the same as [CommService.tuple]. */
        @MustBeClosed
        fun tuple(params: CommTupleParams): HttpResponseFor<List<CommFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: CommTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<CommFull>>
    }
}
