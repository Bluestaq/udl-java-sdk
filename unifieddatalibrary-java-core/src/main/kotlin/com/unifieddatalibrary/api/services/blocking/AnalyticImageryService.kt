// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AnalyticImageryFull
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryAbridged
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryFileGetParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListPage
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryQueryhelpParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryRetrieveParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryTupleParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.analyticimagery.HistoryService
import java.util.function.Consumer

interface AnalyticImageryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticImageryService

    fun history(): HistoryService

    /**
     * Service operation to get a single AnalyticImagery record by its unique ID passed as a path
     * parameter. AnalyticImagery represents metadata about an image, as well as the actual binary
     * image data.
     */
    fun retrieve(id: String): AnalyticImageryFull =
        retrieve(id, AnalyticImageryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticImageryFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(),
    ): AnalyticImageryFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AnalyticImageryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticImageryFull

    /** @see retrieve */
    fun retrieve(params: AnalyticImageryRetrieveParams): AnalyticImageryFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AnalyticImageryFull =
        retrieve(id, AnalyticImageryRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AnalyticImageryListParams): AnalyticImageryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AnalyticImageryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticImageryListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AnalyticImageryCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AnalyticImageryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to get a single AnalyticImagery binary image by its unique ID passed as a
     * path parameter. The image is returned as an attachment Content-Disposition.
     */
    @MustBeClosed
    fun fileGet(id: String): HttpResponse = fileGet(id, AnalyticImageryFileGetParams.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        id: String,
        params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = fileGet(params.toBuilder().id(id).build(), requestOptions)

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        id: String,
        params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(),
    ): HttpResponse = fileGet(id, params, RequestOptions.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        params: AnalyticImageryFileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: AnalyticImageryFileGetParams): HttpResponse =
        fileGet(params, RequestOptions.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
        fileGet(id, AnalyticImageryFileGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): AnalyticImageryQueryhelpResponse =
        queryhelp(AnalyticImageryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticImageryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none()
    ): AnalyticImageryQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AnalyticImageryQueryhelpResponse =
        queryhelp(AnalyticImageryQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AnalyticImageryTupleParams): List<AnalyticImageryAbridged> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AnalyticImageryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AnalyticImageryAbridged>

    /**
     * Upload a new image with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\ 1\) A file with the
     * `.json` file extension whose content conforms to the `AnalyticImagery_Ingest` schema.\ 2\) A
     * binary image file of the allowed types for this service.
     *
     * The JSON and image files will be associated with each other via the `id` field. Query the
     * metadata via `GET /udl/analyticimagery` and use `GET /udl/analyticimagery/getFile/{id}` to
     * retrieve the binary image file.
     *
     * This operation only accepts application/zip media. The application/json request body is
     * documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AnalyticImageryUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AnalyticImageryService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticImageryService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery/{id}`, but is otherwise the
         * same as [AnalyticImageryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AnalyticImageryFull> =
            retrieve(id, AnalyticImageryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticImageryFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AnalyticImageryRetrieveParams = AnalyticImageryRetrieveParams.none(),
        ): HttpResponseFor<AnalyticImageryFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnalyticImageryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticImageryFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AnalyticImageryRetrieveParams): HttpResponseFor<AnalyticImageryFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticImageryFull> =
            retrieve(id, AnalyticImageryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery`, but is otherwise the same as
         * [AnalyticImageryService.list].
         */
        @MustBeClosed
        fun list(params: AnalyticImageryListParams): HttpResponseFor<AnalyticImageryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AnalyticImageryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticImageryListPage>

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery/count`, but is otherwise the
         * same as [AnalyticImageryService.count].
         */
        @MustBeClosed
        fun count(params: AnalyticImageryCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AnalyticImageryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery/getFile/{id}`, but is otherwise
         * the same as [AnalyticImageryService.fileGet].
         */
        @MustBeClosed
        fun fileGet(id: String): HttpResponse = fileGet(id, AnalyticImageryFileGetParams.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            id: String,
            params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = fileGet(params.toBuilder().id(id).build(), requestOptions)

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            id: String,
            params: AnalyticImageryFileGetParams = AnalyticImageryFileGetParams.none(),
        ): HttpResponse = fileGet(id, params, RequestOptions.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            params: AnalyticImageryFileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: AnalyticImageryFileGetParams): HttpResponse =
            fileGet(params, RequestOptions.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
            fileGet(id, AnalyticImageryFileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery/queryhelp`, but is otherwise
         * the same as [AnalyticImageryService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AnalyticImageryQueryhelpResponse> =
            queryhelp(AnalyticImageryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticImageryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AnalyticImageryQueryhelpParams = AnalyticImageryQueryhelpParams.none()
        ): HttpResponseFor<AnalyticImageryQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<AnalyticImageryQueryhelpResponse> =
            queryhelp(AnalyticImageryQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/analyticimagery/tuple`, but is otherwise the
         * same as [AnalyticImageryService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: AnalyticImageryTupleParams
        ): HttpResponseFor<List<AnalyticImageryAbridged>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: AnalyticImageryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AnalyticImageryAbridged>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-analyticimagery`, but is otherwise
         * the same as [AnalyticImageryService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: AnalyticImageryUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AnalyticImageryUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
