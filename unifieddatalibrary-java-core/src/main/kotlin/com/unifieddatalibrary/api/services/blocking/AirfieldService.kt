// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldFull
import com.unifieddatalibrary.api.models.airfields.AirfieldCountParams
import com.unifieddatalibrary.api.models.airfields.AirfieldCreateParams
import com.unifieddatalibrary.api.models.airfields.AirfieldListPage
import com.unifieddatalibrary.api.models.airfields.AirfieldListParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpResponse
import com.unifieddatalibrary.api.models.airfields.AirfieldRetrieveParams
import com.unifieddatalibrary.api.models.airfields.AirfieldTupleParams
import com.unifieddatalibrary.api.models.airfields.AirfieldUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import java.util.function.Consumer

interface AirfieldService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldService

    /** Service operation to take a single Airfield as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: AirfieldCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Airfield by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirfieldFull =
        retrieve(
          id, AirfieldRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none()): AirfieldFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirfieldFull

    /** @see retrieve */
    fun retrieve(params: AirfieldRetrieveParams): AirfieldFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirfieldFull =
        retrieve(
          id,
          AirfieldRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Airfield. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AirfieldListPage = list(AirfieldListParams.none())

    /** @see list */
    fun list(params: AirfieldListParams = AirfieldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldListPage

    /** @see list */
    fun list(params: AirfieldListParams = AirfieldListParams.none()): AirfieldListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AirfieldListPage =
        list(
          AirfieldListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AirfieldCountParams.none())

    /** @see count */
    fun count(params: AirfieldCountParams = AirfieldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AirfieldCountParams = AirfieldCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AirfieldCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirfieldQueryhelpResponse = queryhelp(AirfieldQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none()): AirfieldQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirfieldQueryhelpResponse =
        queryhelp(
          AirfieldQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldTupleParams): List<AirfieldFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirfieldFull>

    /** A view of [AirfieldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfield`, but is otherwise the same as [AirfieldService.create]. */
        @MustBeClosed
        fun create(params: AirfieldCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirfieldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfield/{id}`, but is otherwise the same as [AirfieldService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirfieldFull> =
            retrieve(
              id, AirfieldRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldRetrieveParams = AirfieldRetrieveParams.none()): HttpResponseFor<AirfieldFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldRetrieveParams): HttpResponseFor<AirfieldFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirfieldFull> =
            retrieve(
              id,
              AirfieldRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfield/{id}`, but is otherwise the same as [AirfieldService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfield`, but is otherwise the same as [AirfieldService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AirfieldListPage> = list(AirfieldListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AirfieldListParams = AirfieldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AirfieldListParams = AirfieldListParams.none()): HttpResponseFor<AirfieldListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirfieldListPage> =
            list(
              AirfieldListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/count`, but is otherwise the same as [AirfieldService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AirfieldCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AirfieldCountParams = AirfieldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AirfieldCountParams = AirfieldCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AirfieldCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/queryhelp`, but is otherwise the same as [AirfieldService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirfieldQueryhelpResponse> = queryhelp(AirfieldQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldQueryhelpParams = AirfieldQueryhelpParams.none()): HttpResponseFor<AirfieldQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirfieldQueryhelpResponse> =
            queryhelp(
              AirfieldQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfield/tuple`, but is otherwise the same as [AirfieldService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirfieldTupleParams): HttpResponseFor<List<AirfieldFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirfieldFull>>
    }
}
