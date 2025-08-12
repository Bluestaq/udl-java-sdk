// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelRecoveryFullL
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCountParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateBulkParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryFileCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryGetParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListPageAsync
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpResponse
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryTupleParams
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import com.unifieddatalibrary.api.services.async.personnelrecovery.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PersonnelrecoveryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonnelrecoveryServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single Personnel Recovery object as a POST body and ingest into the database. Requires a specific role, please contact the UDL team to gain access. */
    fun create(params: PersonnelrecoveryCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: PersonnelrecoveryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: PersonnelrecoveryListParams): CompletableFuture<PersonnelrecoveryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: PersonnelrecoveryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PersonnelrecoveryListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: PersonnelrecoveryCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: PersonnelrecoveryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Personnel Recovery records as a POST body and ingest into the database. Requires specific roles, please contact the UDL team to gain access. This operation is not intended to be used for automated feeds into UDL...data providers should contact the UDL team for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: PersonnelrecoveryCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: PersonnelrecoveryCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to take a list of Personnel Recovery records as a POST body and ingest into the database. Requires a specific role, please contact the UDL team to gain access. This operation is intended to be used for automated feeds into UDL. */
    fun fileCreate(params: PersonnelrecoveryFileCreateParams): CompletableFuture<Void?> =
        fileCreate(
          params, RequestOptions.none()
        )

    /** @see fileCreate */
    fun fileCreate(params: PersonnelrecoveryFileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single PersonnelRecovery by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<PersonnelRecoveryFullL> =
        get(
          id, PersonnelrecoveryGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PersonnelRecoveryFullL> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none()): CompletableFuture<PersonnelRecoveryFullL> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: PersonnelrecoveryGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PersonnelRecoveryFullL>

    /** @see get */
    fun get(params: PersonnelrecoveryGetParams): CompletableFuture<PersonnelRecoveryFullL> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<PersonnelRecoveryFullL> =
        get(
          id,
          PersonnelrecoveryGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<PersonnelrecoveryQueryhelpResponse> = queryhelp(PersonnelrecoveryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PersonnelrecoveryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none()): CompletableFuture<PersonnelrecoveryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<PersonnelrecoveryQueryhelpResponse> =
        queryhelp(
          PersonnelrecoveryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: PersonnelrecoveryTupleParams): CompletableFuture<List<PersonnelRecoveryFullL>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: PersonnelrecoveryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<PersonnelRecoveryFullL>>

    /** A view of [PersonnelrecoveryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonnelrecoveryServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/personnelrecovery`, but is otherwise the same as [PersonnelrecoveryServiceAsync.create]. */
        fun create(params: PersonnelrecoveryCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: PersonnelrecoveryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/personnelrecovery`, but is otherwise the same as [PersonnelrecoveryServiceAsync.list]. */
        fun list(params: PersonnelrecoveryListParams): CompletableFuture<HttpResponseFor<PersonnelrecoveryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: PersonnelrecoveryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<PersonnelrecoveryListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/personnelrecovery/count`, but is otherwise the same as [PersonnelrecoveryServiceAsync.count]. */
        fun count(params: PersonnelrecoveryCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: PersonnelrecoveryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/personnelrecovery/createBulk`, but is otherwise the same as [PersonnelrecoveryServiceAsync.createBulk]. */
        fun createBulk(params: PersonnelrecoveryCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: PersonnelrecoveryCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `post /filedrop/udl-personnelrecovery`, but is otherwise the same as [PersonnelrecoveryServiceAsync.fileCreate]. */
        fun fileCreate(params: PersonnelrecoveryFileCreateParams): CompletableFuture<HttpResponse> =
            fileCreate(
              params, RequestOptions.none()
            )

        /** @see fileCreate */
        fun fileCreate(params: PersonnelrecoveryFileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/personnelrecovery/{id}`, but is otherwise the same as [PersonnelrecoveryServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>> =
            get(
              id, PersonnelrecoveryGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none()): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: PersonnelrecoveryGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>>

        /** @see get */
        fun get(params: PersonnelrecoveryGetParams): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<PersonnelRecoveryFullL>> =
            get(
              id,
              PersonnelrecoveryGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/personnelrecovery/queryhelp`, but is otherwise the same as [PersonnelrecoveryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<PersonnelrecoveryQueryhelpResponse>> = queryhelp(PersonnelrecoveryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<PersonnelrecoveryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<PersonnelrecoveryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<PersonnelrecoveryQueryhelpResponse>> =
            queryhelp(
              PersonnelrecoveryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/personnelrecovery/tuple`, but is otherwise the same as [PersonnelrecoveryServiceAsync.tuple]. */
        fun tuple(params: PersonnelrecoveryTupleParams): CompletableFuture<HttpResponseFor<List<PersonnelRecoveryFullL>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: PersonnelrecoveryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<PersonnelRecoveryFullL>>>
    }
}
