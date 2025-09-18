// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryAodrParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCountParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCreateParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetFileParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListPage
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryUploadZipParams
import com.unifieddatalibrary.api.services.blocking.groundimagery.HistoryService
import java.util.function.Consumer

interface GroundImageryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroundImageryService

    fun history(): HistoryService

    /**
     * Service operation to take a single GroundImagery object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: GroundImageryCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroundImageryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: GroundImageryListParams): GroundImageryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroundImageryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroundImageryListPage

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun aodr(params: GroundImageryAodrParams) = aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(
        params: GroundImageryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GroundImageryCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GroundImageryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to get a single GroundImagery record by its unique ID passed as a path
     * parameter. GroundImagery represents metadata about a ground image, as well as the actual
     * binary image data.
     */
    fun get(id: String): GroundImageryGetResponse = get(id, GroundImageryGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GroundImageryGetParams = GroundImageryGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroundImageryGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GroundImageryGetParams = GroundImageryGetParams.none(),
    ): GroundImageryGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GroundImageryGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroundImageryGetResponse

    /** @see get */
    fun get(params: GroundImageryGetParams): GroundImageryGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): GroundImageryGetResponse =
        get(id, GroundImageryGetParams.none(), requestOptions)

    /**
     * Service operation to get a single GroundImagery binary image by its unique ID passed as a
     * path parameter. The image is returned as an attachment Content-Disposition.
     */
    @MustBeClosed
    fun getFile(id: String): HttpResponse = getFile(id, GroundImageryGetFileParams.none())

    /** @see getFile */
    @MustBeClosed
    fun getFile(
        id: String,
        params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = getFile(params.toBuilder().id(id).build(), requestOptions)

    /** @see getFile */
    @MustBeClosed
    fun getFile(
        id: String,
        params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(),
    ): HttpResponse = getFile(id, params, RequestOptions.none())

    /** @see getFile */
    @MustBeClosed
    fun getFile(
        params: GroundImageryGetFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getFile */
    @MustBeClosed
    fun getFile(params: GroundImageryGetFileParams): HttpResponse =
        getFile(params, RequestOptions.none())

    /** @see getFile */
    @MustBeClosed
    fun getFile(id: String, requestOptions: RequestOptions): HttpResponse =
        getFile(id, GroundImageryGetFileParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): GroundImageryQueryhelpResponse = queryhelp(GroundImageryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroundImageryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none()
    ): GroundImageryQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): GroundImageryQueryhelpResponse =
        queryhelp(GroundImageryQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: GroundImageryTupleParams): List<GroundImageryTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GroundImageryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<GroundImageryTupleResponse>

    /**
     * Upload a new image with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\ 1\) A file with the
     * `.json` file extension whose content conforms to the `GroundImagery_Ingest` schema. 2\) A
     * binary image file of the allowed types for this service.
     *
     * The JSON and image files will be associated with each other via the `id` field. Query the
     * metadata via `GET /udl/groundimagery` and use `GET /udl/groundimagery/getFile/{id}` to
     * retrieve the binary image file.
     *
     * This operation only accepts application/zip media. The application/json request body is
     * documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadZip(params: GroundImageryUploadZipParams) = uploadZip(params, RequestOptions.none())

    /** @see uploadZip */
    fun uploadZip(
        params: GroundImageryUploadZipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [GroundImageryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroundImageryService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/groundimagery`, but is otherwise the same as
         * [GroundImageryService.create].
         */
        @MustBeClosed
        fun create(params: GroundImageryCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroundImageryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery`, but is otherwise the same as
         * [GroundImageryService.list].
         */
        @MustBeClosed
        fun list(params: GroundImageryListParams): HttpResponseFor<GroundImageryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroundImageryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroundImageryListPage>

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/history/aodr`, but is otherwise
         * the same as [GroundImageryService.aodr].
         */
        @MustBeClosed
        fun aodr(params: GroundImageryAodrParams): HttpResponse =
            aodr(params, RequestOptions.none())

        /** @see aodr */
        @MustBeClosed
        fun aodr(
            params: GroundImageryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/count`, but is otherwise the same
         * as [GroundImageryService.count].
         */
        @MustBeClosed
        fun count(params: GroundImageryCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: GroundImageryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/{id}`, but is otherwise the same
         * as [GroundImageryService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<GroundImageryGetResponse> =
            get(id, GroundImageryGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GroundImageryGetParams = GroundImageryGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroundImageryGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GroundImageryGetParams = GroundImageryGetParams.none(),
        ): HttpResponseFor<GroundImageryGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GroundImageryGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroundImageryGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: GroundImageryGetParams): HttpResponseFor<GroundImageryGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroundImageryGetResponse> =
            get(id, GroundImageryGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/getFile/{id}`, but is otherwise
         * the same as [GroundImageryService.getFile].
         */
        @MustBeClosed
        fun getFile(id: String): HttpResponse = getFile(id, GroundImageryGetFileParams.none())

        /** @see getFile */
        @MustBeClosed
        fun getFile(
            id: String,
            params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getFile(params.toBuilder().id(id).build(), requestOptions)

        /** @see getFile */
        @MustBeClosed
        fun getFile(
            id: String,
            params: GroundImageryGetFileParams = GroundImageryGetFileParams.none(),
        ): HttpResponse = getFile(id, params, RequestOptions.none())

        /** @see getFile */
        @MustBeClosed
        fun getFile(
            params: GroundImageryGetFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getFile */
        @MustBeClosed
        fun getFile(params: GroundImageryGetFileParams): HttpResponse =
            getFile(params, RequestOptions.none())

        /** @see getFile */
        @MustBeClosed
        fun getFile(id: String, requestOptions: RequestOptions): HttpResponse =
            getFile(id, GroundImageryGetFileParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/queryhelp`, but is otherwise the
         * same as [GroundImageryService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<GroundImageryQueryhelpResponse> =
            queryhelp(GroundImageryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroundImageryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GroundImageryQueryhelpParams = GroundImageryQueryhelpParams.none()
        ): HttpResponseFor<GroundImageryQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<GroundImageryQueryhelpResponse> =
            queryhelp(GroundImageryQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/groundimagery/tuple`, but is otherwise the same
         * as [GroundImageryService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: GroundImageryTupleParams
        ): HttpResponseFor<List<GroundImageryTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: GroundImageryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<GroundImageryTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-groundimagery`, but is otherwise the
         * same as [GroundImageryService.uploadZip].
         */
        @MustBeClosed
        fun uploadZip(params: GroundImageryUploadZipParams): HttpResponse =
            uploadZip(params, RequestOptions.none())

        /** @see uploadZip */
        @MustBeClosed
        fun uploadZip(
            params: GroundImageryUploadZipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
