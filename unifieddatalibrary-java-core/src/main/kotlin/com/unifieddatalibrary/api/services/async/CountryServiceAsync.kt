// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CountryFull
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryDeleteParams
import com.unifieddatalibrary.api.models.countries.CountryListPageAsync
import com.unifieddatalibrary.api.models.countries.CountryListParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpResponse
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CountryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryServiceAsync

    /** Service operation to take a single Country as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CountryCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CountryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Country record by its unique code passed as a path parameter. */
    fun retrieve(code: String): CompletableFuture<CountryFull> =
        retrieve(
          code, CountryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CountryFull> =
        retrieve(
          params.toBuilder()
              .code(code)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none()): CompletableFuture<CountryFull> =
        retrieve(
          code,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CountryFull>

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams): CompletableFuture<CountryFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(code: String, requestOptions: RequestOptions): CompletableFuture<CountryFull> =
        retrieve(
          code,
          CountryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Country. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathCode: String, params: CountryUpdateParams): CompletableFuture<Void?> =
        update(
          pathCode,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathCode: String, params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathCode(pathCode)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: CountryUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<CountryListPageAsync> = list(CountryListParams.none())

    /** @see list */
    fun list(params: CountryListParams = CountryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CountryListPageAsync>

    /** @see list */
    fun list(params: CountryListParams = CountryListParams.none()): CompletableFuture<CountryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CountryListPageAsync> =
        list(
          CountryListParams.none(), requestOptions
        )

    /** Service operation to delete a Country object specified by the passed code path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(code: String): CompletableFuture<Void?> =
        delete(
          code, CountryDeleteParams.none()
        )

    /** @see delete */
    fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .code(code)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          code,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: CountryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CountryDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(code: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          code,
          CountryDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(CountryCountParams.none())

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          CountryCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<CountryQueryhelpResponse> = queryhelp(CountryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CountryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none()): CompletableFuture<CountryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<CountryQueryhelpResponse> =
        queryhelp(
          CountryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CountryTupleParams): CompletableFuture<List<CountryFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CountryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<CountryFull>>

    /** A view of [CountryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/country`, but is otherwise the same as [CountryServiceAsync.create]. */
        fun create(params: CountryCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: CountryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/country/{code}`, but is otherwise the same as [CountryServiceAsync.retrieve]. */
        fun retrieve(code: String): CompletableFuture<HttpResponseFor<CountryFull>> =
            retrieve(
              code, CountryRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CountryFull>> =
            retrieve(
              params.toBuilder()
                  .code(code)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none()): CompletableFuture<HttpResponseFor<CountryFull>> =
            retrieve(
              code,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CountryFull>>

        /** @see retrieve */
        fun retrieve(params: CountryRetrieveParams): CompletableFuture<HttpResponseFor<CountryFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(code: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryFull>> =
            retrieve(
              code,
              CountryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/country/{code}`, but is otherwise the same as [CountryServiceAsync.update]. */
        fun update(pathCode: String, params: CountryUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathCode,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathCode: String, params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathCode(pathCode)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: CountryUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/country`, but is otherwise the same as [CountryServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<CountryListPageAsync>> = list(CountryListParams.none())

        /** @see list */
        fun list(params: CountryListParams = CountryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CountryListPageAsync>>

        /** @see list */
        fun list(params: CountryListParams = CountryListParams.none()): CompletableFuture<HttpResponseFor<CountryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryListPageAsync>> =
            list(
              CountryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/country/{code}`, but is otherwise the same as [CountryServiceAsync.delete]. */
        fun delete(code: String): CompletableFuture<HttpResponse> =
            delete(
              code, CountryDeleteParams.none()
            )

        /** @see delete */
        fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .code(code)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              code,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: CountryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CountryDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(code: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              code,
              CountryDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/country/count`, but is otherwise the same as [CountryServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(CountryCountParams.none())

        /** @see count */
        fun count(params: CountryCountParams = CountryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: CountryCountParams = CountryCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              CountryCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/country/queryhelp`, but is otherwise the same as [CountryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<CountryQueryhelpResponse>> = queryhelp(CountryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CountryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<CountryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryQueryhelpResponse>> =
            queryhelp(
              CountryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/country/tuple`, but is otherwise the same as [CountryServiceAsync.tuple]. */
        fun tuple(params: CountryTupleParams): CompletableFuture<HttpResponseFor<List<CountryFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: CountryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<CountryFull>>>
    }
}
