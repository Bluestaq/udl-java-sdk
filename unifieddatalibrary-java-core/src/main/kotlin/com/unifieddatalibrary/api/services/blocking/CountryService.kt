// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CountryFull
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryDeleteParams
import com.unifieddatalibrary.api.models.countries.CountryListPage
import com.unifieddatalibrary.api.models.countries.CountryListParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpResponse
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import com.unifieddatalibrary.api.services.blocking.CountryService
import java.util.function.Consumer

interface CountryService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService

    /** Service operation to take a single Country as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CountryCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CountryCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Country record by its unique code passed as a path parameter. */
    fun retrieve(code: String): CountryFull =
        retrieve(
          code, CountryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CountryFull =
        retrieve(
          params.toBuilder()
              .code(code)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none()): CountryFull =
        retrieve(
          code,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CountryFull

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams): CountryFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(code: String, requestOptions: RequestOptions): CountryFull =
        retrieve(
          code,
          CountryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Country. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathCode: String, params: CountryUpdateParams) =
        update(
          pathCode,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathCode: String, params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathCode(pathCode)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: CountryUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CountryListPage = list(CountryListParams.none())

    /** @see list */
    fun list(params: CountryListParams = CountryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CountryListPage

    /** @see list */
    fun list(params: CountryListParams = CountryListParams.none()): CountryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CountryListPage =
        list(
          CountryListParams.none(), requestOptions
        )

    /** Service operation to delete a Country object specified by the passed code path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(code: String) =
        delete(
          code, CountryDeleteParams.none()
        )

    /** @see delete */
    fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .code(code)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none()) =
        delete(
          code,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: CountryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CountryDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(code: String, requestOptions: RequestOptions) =
        delete(
          code,
          CountryDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(CountryCountParams.none())

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          CountryCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CountryQueryhelpResponse = queryhelp(CountryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CountryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none()): CountryQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CountryQueryhelpResponse =
        queryhelp(
          CountryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CountryTupleParams): List<CountryFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CountryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<CountryFull>

    /** A view of [CountryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/country`, but is otherwise the same as [CountryService.create]. */
        @MustBeClosed
        fun create(params: CountryCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: CountryCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/country/{code}`, but is otherwise the same as [CountryService.retrieve]. */
        @MustBeClosed
        fun retrieve(code: String): HttpResponseFor<CountryFull> =
            retrieve(
              code, CountryRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CountryFull> =
            retrieve(
              params.toBuilder()
                  .code(code)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(code: String, params: CountryRetrieveParams = CountryRetrieveParams.none()): HttpResponseFor<CountryFull> =
            retrieve(
              code,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CountryFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CountryRetrieveParams): HttpResponseFor<CountryFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(code: String, requestOptions: RequestOptions): HttpResponseFor<CountryFull> =
            retrieve(
              code,
              CountryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/country/{code}`, but is otherwise the same as [CountryService.update]. */
        @MustBeClosed
        fun update(pathCode: String, params: CountryUpdateParams): HttpResponse =
            update(
              pathCode,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathCode: String, params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathCode(pathCode)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CountryUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/country`, but is otherwise the same as [CountryService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<CountryListPage> = list(CountryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: CountryListParams = CountryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CountryListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CountryListParams = CountryListParams.none()): HttpResponseFor<CountryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CountryListPage> =
            list(
              CountryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/country/{code}`, but is otherwise the same as [CountryService.delete]. */
        @MustBeClosed
        fun delete(code: String): HttpResponse =
            delete(
              code, CountryDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .code(code)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(code: String, params: CountryDeleteParams = CountryDeleteParams.none()): HttpResponse =
            delete(
              code,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: CountryDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CountryDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(code: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              code,
              CountryDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/country/count`, but is otherwise the same as [CountryService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(CountryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: CountryCountParams = CountryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: CountryCountParams = CountryCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              CountryCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/country/queryhelp`, but is otherwise the same as [CountryService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<CountryQueryhelpResponse> = queryhelp(CountryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CountryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CountryQueryhelpParams = CountryQueryhelpParams.none()): HttpResponseFor<CountryQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<CountryQueryhelpResponse> =
            queryhelp(
              CountryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/country/tuple`, but is otherwise the same as [CountryService.tuple]. */
        @MustBeClosed
        fun tuple(params: CountryTupleParams): HttpResponseFor<List<CountryFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: CountryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<CountryFull>>
    }
}
