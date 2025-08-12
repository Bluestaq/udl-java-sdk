// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCountParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCreateParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestDeleteParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListPage
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestUpdateParams
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestService
import java.util.function.Consumer

interface ObjectOfInterestService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectOfInterestService

    /** Service operation to take a single ObjectOfInterest as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ObjectOfInterestCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ObjectOfInterestCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single ObjectOfInterest. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ObjectOfInterestUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ObjectOfInterestUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): ObjectOfInterestListPage = list(ObjectOfInterestListParams.none())

    /** @see list */
    fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ObjectOfInterestListPage

    /** @see list */
    fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none()): ObjectOfInterestListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): ObjectOfInterestListPage =
        list(
          ObjectOfInterestListParams.none(), requestOptions
        )

    /** Service operation to delete a ObjectOfInterest object specified by the passed ID path parameter. A ObjectOfInterest is an on-orbit ObjectOfInterestunications payload, including supporting data such as transponders and channels, etc. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, ObjectOfInterestDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ObjectOfInterestDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ObjectOfInterestDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          ObjectOfInterestDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(ObjectOfInterestCountParams.none())

    /** @see count */
    fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          ObjectOfInterestCountParams.none(), requestOptions
        )

    /** Service operation to get a single ObjectOfInterest record by its unique ID passed as a path parameter. */
    fun get(id: String): ObjectOfInterestGetResponse =
        get(
          id, ObjectOfInterestGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ObjectOfInterestGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none()): ObjectOfInterestGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ObjectOfInterestGetParams, requestOptions: RequestOptions = RequestOptions.none()): ObjectOfInterestGetResponse

    /** @see get */
    fun get(params: ObjectOfInterestGetParams): ObjectOfInterestGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ObjectOfInterestGetResponse =
        get(
          id,
          ObjectOfInterestGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): ObjectOfInterestQueryhelpResponse = queryhelp(ObjectOfInterestQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ObjectOfInterestQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none()): ObjectOfInterestQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ObjectOfInterestQueryhelpResponse =
        queryhelp(
          ObjectOfInterestQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ObjectOfInterestTupleParams): List<ObjectOfInterestTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ObjectOfInterestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<ObjectOfInterestTupleResponse>

    /** A view of [ObjectOfInterestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectOfInterestService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/objectofinterest`, but is otherwise the same as [ObjectOfInterestService.create]. */
        @MustBeClosed
        fun create(params: ObjectOfInterestCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: ObjectOfInterestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: ObjectOfInterestUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ObjectOfInterestUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/objectofinterest`, but is otherwise the same as [ObjectOfInterestService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<ObjectOfInterestListPage> = list(ObjectOfInterestListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ObjectOfInterestListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none()): HttpResponseFor<ObjectOfInterestListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ObjectOfInterestListPage> =
            list(
              ObjectOfInterestListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, ObjectOfInterestDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ObjectOfInterestDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ObjectOfInterestDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              ObjectOfInterestDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/count`, but is otherwise the same as [ObjectOfInterestService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(ObjectOfInterestCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              ObjectOfInterestCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ObjectOfInterestGetResponse> =
            get(
              id, ObjectOfInterestGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ObjectOfInterestGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none()): HttpResponseFor<ObjectOfInterestGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: ObjectOfInterestGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ObjectOfInterestGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ObjectOfInterestGetParams): HttpResponseFor<ObjectOfInterestGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ObjectOfInterestGetResponse> =
            get(
              id,
              ObjectOfInterestGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/queryhelp`, but is otherwise the same as [ObjectOfInterestService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ObjectOfInterestQueryhelpResponse> = queryhelp(ObjectOfInterestQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ObjectOfInterestQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none()): HttpResponseFor<ObjectOfInterestQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ObjectOfInterestQueryhelpResponse> =
            queryhelp(
              ObjectOfInterestQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/tuple`, but is otherwise the same as [ObjectOfInterestService.tuple]. */
        @MustBeClosed
        fun tuple(params: ObjectOfInterestTupleParams): HttpResponseFor<List<ObjectOfInterestTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: ObjectOfInterestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<ObjectOfInterestTupleResponse>>
    }
}
