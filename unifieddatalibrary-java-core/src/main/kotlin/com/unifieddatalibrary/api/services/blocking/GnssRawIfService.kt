// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListPage
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfUploadZipParams
import com.unifieddatalibrary.api.services.blocking.gnssrawif.HistoryService
import java.util.function.Consumer

interface GnssRawIfService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: GnssRawIfListParams): GnssRawIfListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GnssRawIfListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GnssRawIfListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GnssRawIfCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GnssRawIfCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to get a single GNSSRAWIF hdf5 file by its unique ID passed as a path
     * parameter. The file is returned as an attachment Content-Disposition.
     */
    @MustBeClosed fun fileGet(id: String): HttpResponse = fileGet(id, GnssRawIfFileGetParams.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        id: String,
        params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = fileGet(params.toBuilder().id(id).build(), requestOptions)

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        id: String,
        params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
    ): HttpResponse = fileGet(id, params, RequestOptions.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(
        params: GnssRawIfFileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: GnssRawIfFileGetParams): HttpResponse =
        fileGet(params, RequestOptions.none())

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
        fileGet(id, GnssRawIfFileGetParams.none(), requestOptions)

    /** Service operation to get a single GNSSRawIF by its unique ID passed as a path parameter. */
    fun get(id: String): GnssRawIfGetResponse = get(id, GnssRawIfGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GnssRawIfGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
    ): GnssRawIfGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GnssRawIfGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GnssRawIfGetResponse

    /** @see get */
    fun get(params: GnssRawIfGetParams): GnssRawIfGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): GnssRawIfGetResponse =
        get(id, GnssRawIfGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): GnssRawIfQueryhelpResponse = queryhelp(GnssRawIfQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GnssRawIfQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none()
    ): GnssRawIfQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): GnssRawIfQueryhelpResponse =
        queryhelp(GnssRawIfQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: GnssRawIfTupleParams): List<GnssRawIfTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GnssRawIfTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<GnssRawIfTupleResponse>

    /**
     * Upload an HDF5 file with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\ 1\) A file with the
     * `.json` file extension whose content conforms to the `GNSSRawIF_Ingest` schema.\ 2\) A file
     * with the `.hdf5` file extension.
     *
     * The JSON and HDF5 files will be associated with each other via the `id` field. Query the
     * metadata via `GET /udl/gnssrawif` and use `GET /udl/gnssrawif/getFile/{id}` to retrieve the
     * HDF5 file.
     *
     * This operation only accepts application/zip media. The application/json request body is
     * documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadZip(params: GnssRawIfUploadZipParams) = uploadZip(params, RequestOptions.none())

    /** @see uploadZip */
    fun uploadZip(
        params: GnssRawIfUploadZipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [GnssRawIfService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif`, but is otherwise the same as
         * [GnssRawIfService.list].
         */
        @MustBeClosed
        fun list(params: GnssRawIfListParams): HttpResponseFor<GnssRawIfListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GnssRawIfListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GnssRawIfListPage>

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/count`, but is otherwise the same as
         * [GnssRawIfService.count].
         */
        @MustBeClosed
        fun count(params: GnssRawIfCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: GnssRawIfCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/getFile/{id}`, but is otherwise the
         * same as [GnssRawIfService.fileGet].
         */
        @MustBeClosed
        fun fileGet(id: String): HttpResponse = fileGet(id, GnssRawIfFileGetParams.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            id: String,
            params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = fileGet(params.toBuilder().id(id).build(), requestOptions)

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            id: String,
            params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
        ): HttpResponse = fileGet(id, params, RequestOptions.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(
            params: GnssRawIfFileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: GnssRawIfFileGetParams): HttpResponse =
            fileGet(params, RequestOptions.none())

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
            fileGet(id, GnssRawIfFileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/{id}`, but is otherwise the same as
         * [GnssRawIfService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<GnssRawIfGetResponse> =
            get(id, GnssRawIfGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GnssRawIfGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
        ): HttpResponseFor<GnssRawIfGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GnssRawIfGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GnssRawIfGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: GnssRawIfGetParams): HttpResponseFor<GnssRawIfGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<GnssRawIfGetResponse> =
            get(id, GnssRawIfGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/queryhelp`, but is otherwise the same
         * as [GnssRawIfService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<GnssRawIfQueryhelpResponse> =
            queryhelp(GnssRawIfQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GnssRawIfQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none()
        ): HttpResponseFor<GnssRawIfQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<GnssRawIfQueryhelpResponse> =
            queryhelp(GnssRawIfQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/tuple`, but is otherwise the same as
         * [GnssRawIfService.tuple].
         */
        @MustBeClosed
        fun tuple(params: GnssRawIfTupleParams): HttpResponseFor<List<GnssRawIfTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: GnssRawIfTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<GnssRawIfTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-gnssrawif`, but is otherwise the same
         * as [GnssRawIfService.uploadZip].
         */
        @MustBeClosed
        fun uploadZip(params: GnssRawIfUploadZipParams): HttpResponse =
            uploadZip(params, RequestOptions.none())

        /** @see uploadZip */
        @MustBeClosed
        fun uploadZip(
            params: GnssRawIfUploadZipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
