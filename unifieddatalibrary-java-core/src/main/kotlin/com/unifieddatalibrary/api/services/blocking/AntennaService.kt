// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AntennaFull
import com.unifieddatalibrary.api.models.antennas.AntennaCountParams
import com.unifieddatalibrary.api.models.antennas.AntennaCreateParams
import com.unifieddatalibrary.api.models.antennas.AntennaDeleteParams
import com.unifieddatalibrary.api.models.antennas.AntennaListPage
import com.unifieddatalibrary.api.models.antennas.AntennaListParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpResponse
import com.unifieddatalibrary.api.models.antennas.AntennaRetrieveParams
import com.unifieddatalibrary.api.models.antennas.AntennaTupleParams
import com.unifieddatalibrary.api.models.antennas.AntennaUpdateParams
import com.unifieddatalibrary.api.services.blocking.AntennaService
import java.util.function.Consumer

interface AntennaService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaService

    /** Service operation to take a single Antenna as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AntennaCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AntennaCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Antenna record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AntennaFull =
        retrieve(
          id, AntennaRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AntennaRetrieveParams = AntennaRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AntennaFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AntennaRetrieveParams = AntennaRetrieveParams.none()): AntennaFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AntennaRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AntennaFull

    /** @see retrieve */
    fun retrieve(params: AntennaRetrieveParams): AntennaFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AntennaFull =
        retrieve(
          id,
          AntennaRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Antenna. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AntennaUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AntennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AntennaUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AntennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AntennaListPage = list(AntennaListParams.none())

    /** @see list */
    fun list(params: AntennaListParams = AntennaListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AntennaListPage

    /** @see list */
    fun list(params: AntennaListParams = AntennaListParams.none()): AntennaListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AntennaListPage =
        list(
          AntennaListParams.none(), requestOptions
        )

    /** Service operation to delete a Antenna object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AntennaDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AntennaDeleteParams = AntennaDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AntennaDeleteParams = AntennaDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AntennaDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AntennaDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AntennaDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AntennaCountParams.none())

    /** @see count */
    fun count(params: AntennaCountParams = AntennaCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AntennaCountParams = AntennaCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AntennaCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AntennaQueryhelpResponse = queryhelp(AntennaQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AntennaQueryhelpParams = AntennaQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AntennaQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AntennaQueryhelpParams = AntennaQueryhelpParams.none()): AntennaQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AntennaQueryhelpResponse =
        queryhelp(
          AntennaQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AntennaTupleParams): List<AntennaFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AntennaTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AntennaFull>

    /** A view of [AntennaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/antenna`, but is otherwise the same as [AntennaService.create]. */
        @MustBeClosed
        fun create(params: AntennaCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AntennaCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/antenna/{id}`, but is otherwise the same as [AntennaService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AntennaFull> =
            retrieve(
              id, AntennaRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AntennaRetrieveParams = AntennaRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AntennaRetrieveParams = AntennaRetrieveParams.none()): HttpResponseFor<AntennaFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AntennaRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AntennaRetrieveParams): HttpResponseFor<AntennaFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AntennaFull> =
            retrieve(
              id,
              AntennaRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/antenna/{id}`, but is otherwise the same as [AntennaService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AntennaUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AntennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AntennaUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AntennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/antenna`, but is otherwise the same as [AntennaService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AntennaListPage> = list(AntennaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AntennaListParams = AntennaListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AntennaListParams = AntennaListParams.none()): HttpResponseFor<AntennaListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AntennaListPage> =
            list(
              AntennaListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/antenna/{id}`, but is otherwise the same as [AntennaService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AntennaDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AntennaDeleteParams = AntennaDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AntennaDeleteParams = AntennaDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AntennaDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AntennaDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AntennaDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/antenna/count`, but is otherwise the same as [AntennaService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AntennaCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AntennaCountParams = AntennaCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AntennaCountParams = AntennaCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AntennaCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/antenna/queryhelp`, but is otherwise the same as [AntennaService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AntennaQueryhelpResponse> = queryhelp(AntennaQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AntennaQueryhelpParams = AntennaQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AntennaQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AntennaQueryhelpParams = AntennaQueryhelpParams.none()): HttpResponseFor<AntennaQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AntennaQueryhelpResponse> =
            queryhelp(
              AntennaQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/antenna/tuple`, but is otherwise the same as [AntennaService.tuple]. */
        @MustBeClosed
        fun tuple(params: AntennaTupleParams): HttpResponseFor<List<AntennaFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AntennaTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AntennaFull>>
    }
}
