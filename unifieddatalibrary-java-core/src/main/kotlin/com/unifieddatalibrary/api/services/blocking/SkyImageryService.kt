// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryCountParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryFileGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListPage
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryUploadZipParams
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import com.unifieddatalibrary.api.services.blocking.skyimagery.HistoryService
import java.util.function.Consumer

interface SkyImageryService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryService

    fun history(): HistoryService

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SkyImageryListParams): SkyImageryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SkyImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): SkyImageryListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SkyImageryCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SkyImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to get a single SkyImagery binary image by its unique ID passed as a path parameter. The image is returned as an attachment Content-Disposition. */
    @MustBeClosed
    fun fileGet(id: String): HttpResponse =
        fileGet(
          id, SkyImageryFileGetParams.none()
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, params: SkyImageryFileGetParams = SkyImageryFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
        fileGet(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, params: SkyImageryFileGetParams = SkyImageryFileGetParams.none()): HttpResponse =
        fileGet(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: SkyImageryFileGetParams): HttpResponse =
        fileGet(
          params, RequestOptions.none()
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
        fileGet(
          id,
          SkyImageryFileGetParams.none(),
          requestOptions,
        )

    /** Service operation to get a single SkyImagery record by its unique ID passed as a path parameter. SkyImagery represents metadata about a sky image, as well as the actual binary image data. */
    fun get(id: String): SkyImageryGetResponse =
        get(
          id, SkyImageryGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SkyImageryGetParams = SkyImageryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SkyImageryGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SkyImageryGetParams = SkyImageryGetParams.none()): SkyImageryGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SkyImageryGetParams, requestOptions: RequestOptions = RequestOptions.none()): SkyImageryGetResponse

    /** @see get */
    fun get(params: SkyImageryGetParams): SkyImageryGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SkyImageryGetResponse =
        get(
          id,
          SkyImageryGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SkyImageryQueryhelpResponse = queryhelp(SkyImageryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SkyImageryQueryhelpParams = SkyImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SkyImageryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SkyImageryQueryhelpParams = SkyImageryQueryhelpParams.none()): SkyImageryQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SkyImageryQueryhelpResponse =
        queryhelp(
          SkyImageryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SkyImageryTupleParams): List<SkyImageryTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SkyImageryTupleResponse>

    /**
     * Upload a new image with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\
     * 1\) A file with the `.json` file extension whose content conforms to the `SkyImagery_Ingest` schema.\
     * 2\) A binary image file of the allowed types for this service.
     *
     * The JSON and image files will be associated with each other via the `id` field. Query the metadata via `GET /udl/skyimagery` and use `GET /udl/skyimagery/getFile/{id}` to retrieve the binary image file.
     *
     * This operation only accepts application/zip media. The application/json request body is documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadZip(params: SkyImageryUploadZipParams) =
        uploadZip(
          params, RequestOptions.none()
        )

    /** @see uploadZip */
    fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SkyImageryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/skyimagery`, but is otherwise the same as [SkyImageryService.list]. */
        @MustBeClosed
        fun list(params: SkyImageryListParams): HttpResponseFor<SkyImageryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: SkyImageryListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SkyImageryListPage>

        /** Returns a raw HTTP response for `get /udl/skyimagery/count`, but is otherwise the same as [SkyImageryService.count]. */
        @MustBeClosed
        fun count(params: SkyImageryCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: SkyImageryCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/skyimagery/getFile/{id}`, but is otherwise the same as [SkyImageryService.fileGet]. */
        @MustBeClosed
        fun fileGet(id: String): HttpResponse =
            fileGet(
              id, SkyImageryFileGetParams.none()
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, params: SkyImageryFileGetParams = SkyImageryFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            fileGet(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, params: SkyImageryFileGetParams = SkyImageryFileGetParams.none()): HttpResponse =
            fileGet(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: SkyImageryFileGetParams): HttpResponse =
            fileGet(
              params, RequestOptions.none()
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
            fileGet(
              id,
              SkyImageryFileGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/skyimagery/{id}`, but is otherwise the same as [SkyImageryService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SkyImageryGetResponse> =
            get(
              id, SkyImageryGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SkyImageryGetParams = SkyImageryGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SkyImageryGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SkyImageryGetParams = SkyImageryGetParams.none()): HttpResponseFor<SkyImageryGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SkyImageryGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SkyImageryGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SkyImageryGetParams): HttpResponseFor<SkyImageryGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SkyImageryGetResponse> =
            get(
              id,
              SkyImageryGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/skyimagery/queryhelp`, but is otherwise the same as [SkyImageryService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SkyImageryQueryhelpResponse> = queryhelp(SkyImageryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SkyImageryQueryhelpParams = SkyImageryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SkyImageryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SkyImageryQueryhelpParams = SkyImageryQueryhelpParams.none()): HttpResponseFor<SkyImageryQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SkyImageryQueryhelpResponse> =
            queryhelp(
              SkyImageryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/skyimagery/tuple`, but is otherwise the same as [SkyImageryService.tuple]. */
        @MustBeClosed
        fun tuple(params: SkyImageryTupleParams): HttpResponseFor<List<SkyImageryTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SkyImageryTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-skyimagery`, but is otherwise the same as [SkyImageryService.uploadZip]. */
        @MustBeClosed
        fun uploadZip(params: SkyImageryUploadZipParams): HttpResponse =
            uploadZip(
              params, RequestOptions.none()
            )

        /** @see uploadZip */
        @MustBeClosed
        fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
