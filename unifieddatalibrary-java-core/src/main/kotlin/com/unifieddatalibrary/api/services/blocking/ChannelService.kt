// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ChannelFull
import com.unifieddatalibrary.api.models.channels.ChannelCountParams
import com.unifieddatalibrary.api.models.channels.ChannelCreateParams
import com.unifieddatalibrary.api.models.channels.ChannelDeleteParams
import com.unifieddatalibrary.api.models.channels.ChannelListPage
import com.unifieddatalibrary.api.models.channels.ChannelListParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpResponse
import com.unifieddatalibrary.api.models.channels.ChannelRetrieveParams
import com.unifieddatalibrary.api.models.channels.ChannelTupleParams
import com.unifieddatalibrary.api.models.channels.ChannelUpdateParams
import com.unifieddatalibrary.api.services.blocking.ChannelService
import java.util.function.Consumer

interface ChannelService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService

    /** Service operation to take a single Channel as a POST body and ingest into the database. A Comm payload may have multiple transponders and a transponder may have many channels. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ChannelCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ChannelCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Channel record by its unique ID passed as a path parameter. A Comm payload may have multiple transponders and a transponder may have many channels. */
    fun retrieve(id: String): ChannelFull =
        retrieve(
          id, ChannelRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: ChannelRetrieveParams = ChannelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ChannelFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: ChannelRetrieveParams = ChannelRetrieveParams.none()): ChannelFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: ChannelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ChannelFull

    /** @see retrieve */
    fun retrieve(params: ChannelRetrieveParams): ChannelFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ChannelFull =
        retrieve(
          id,
          ChannelRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Channel. A Comm payload may have multiple transponders and a transponder may have many channels. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ChannelUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ChannelUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ChannelUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ChannelUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): ChannelListPage = list(ChannelListParams.none())

    /** @see list */
    fun list(params: ChannelListParams = ChannelListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ChannelListPage

    /** @see list */
    fun list(params: ChannelListParams = ChannelListParams.none()): ChannelListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): ChannelListPage =
        list(
          ChannelListParams.none(), requestOptions
        )

    /** Service operation to delete a Channel object specified by the passed ID path parameter. A Comm payload may have multiple transponders and a transponder may have many channels. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, ChannelDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ChannelDeleteParams = ChannelDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ChannelDeleteParams = ChannelDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ChannelDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ChannelDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          ChannelDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(ChannelCountParams.none())

    /** @see count */
    fun count(params: ChannelCountParams = ChannelCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: ChannelCountParams = ChannelCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          ChannelCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): ChannelQueryhelpResponse = queryhelp(ChannelQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ChannelQueryhelpParams = ChannelQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ChannelQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ChannelQueryhelpParams = ChannelQueryhelpParams.none()): ChannelQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ChannelQueryhelpResponse =
        queryhelp(
          ChannelQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ChannelTupleParams): List<ChannelFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ChannelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<ChannelFull>

    /** A view of [ChannelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/channel`, but is otherwise the same as [ChannelService.create]. */
        @MustBeClosed
        fun create(params: ChannelCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: ChannelCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/channel/{id}`, but is otherwise the same as [ChannelService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ChannelFull> =
            retrieve(
              id, ChannelRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: ChannelRetrieveParams = ChannelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ChannelFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: ChannelRetrieveParams = ChannelRetrieveParams.none()): HttpResponseFor<ChannelFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChannelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ChannelFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChannelRetrieveParams): HttpResponseFor<ChannelFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ChannelFull> =
            retrieve(
              id,
              ChannelRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/channel/{id}`, but is otherwise the same as [ChannelService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: ChannelUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: ChannelUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ChannelUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ChannelUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/channel`, but is otherwise the same as [ChannelService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<ChannelListPage> = list(ChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: ChannelListParams = ChannelListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ChannelListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ChannelListParams = ChannelListParams.none()): HttpResponseFor<ChannelListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChannelListPage> =
            list(
              ChannelListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/channel/{id}`, but is otherwise the same as [ChannelService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, ChannelDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ChannelDeleteParams = ChannelDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ChannelDeleteParams = ChannelDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChannelDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChannelDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              ChannelDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/channel/count`, but is otherwise the same as [ChannelService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(ChannelCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: ChannelCountParams = ChannelCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: ChannelCountParams = ChannelCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              ChannelCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/channel/queryhelp`, but is otherwise the same as [ChannelService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ChannelQueryhelpResponse> = queryhelp(ChannelQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ChannelQueryhelpParams = ChannelQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ChannelQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ChannelQueryhelpParams = ChannelQueryhelpParams.none()): HttpResponseFor<ChannelQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ChannelQueryhelpResponse> =
            queryhelp(
              ChannelQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/channel/tuple`, but is otherwise the same as [ChannelService.tuple]. */
        @MustBeClosed
        fun tuple(params: ChannelTupleParams): HttpResponseFor<List<ChannelFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: ChannelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<ChannelFull>>
    }
}
