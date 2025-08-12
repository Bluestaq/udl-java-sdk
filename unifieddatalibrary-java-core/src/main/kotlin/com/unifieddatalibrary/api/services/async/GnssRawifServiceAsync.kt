// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListPageAsync
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfUploadZipParams
import com.unifieddatalibrary.api.services.async.gnssrawif.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GnssRawIfServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: GnssRawIfListParams): CompletableFuture<GnssRawIfListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GnssRawIfListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssRawIfListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GnssRawIfCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GnssRawIfCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to get a single GNSSRAWIF hdf5 file by its unique ID passed as a path
     * parameter. The file is returned as an attachment Content-Disposition.
     */
    fun fileGet(id: String): CompletableFuture<HttpResponse> =
        fileGet(id, GnssRawIfFileGetParams.none())

    /** @see fileGet */
    fun fileGet(
        id: String,
        params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = fileGet(params.toBuilder().id(id).build(), requestOptions)

    /** @see fileGet */
    fun fileGet(
        id: String,
        params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
    ): CompletableFuture<HttpResponse> = fileGet(id, params, RequestOptions.none())

    /** @see fileGet */
    fun fileGet(
        params: GnssRawIfFileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see fileGet */
    fun fileGet(params: GnssRawIfFileGetParams): CompletableFuture<HttpResponse> =
        fileGet(params, RequestOptions.none())

    /** @see fileGet */
    fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        fileGet(id, GnssRawIfFileGetParams.none(), requestOptions)

    /** Service operation to get a single GNSSRawIF by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<GnssRawIfGetResponse> =
        get(id, GnssRawIfGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssRawIfGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
    ): CompletableFuture<GnssRawIfGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GnssRawIfGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssRawIfGetResponse>

    /** @see get */
    fun get(params: GnssRawIfGetParams): CompletableFuture<GnssRawIfGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<GnssRawIfGetResponse> =
        get(id, GnssRawIfGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<GnssRawIfQueryhelpResponse> =
        queryhelp(GnssRawIfQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssRawIfQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none()
    ): CompletableFuture<GnssRawIfQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<GnssRawIfQueryhelpResponse> =
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
    fun tuple(params: GnssRawIfTupleParams): CompletableFuture<List<GnssRawIfTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GnssRawIfTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<GnssRawIfTupleResponse>>

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
    fun uploadZip(params: GnssRawIfUploadZipParams): CompletableFuture<Void?> =
        uploadZip(params, RequestOptions.none())

    /** @see uploadZip */
    fun uploadZip(
        params: GnssRawIfUploadZipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [GnssRawIfServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssRawIfServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif`, but is otherwise the same as
         * [GnssRawIfServiceAsync.list].
         */
        fun list(
            params: GnssRawIfListParams
        ): CompletableFuture<HttpResponseFor<GnssRawIfListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GnssRawIfListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssRawIfListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/count`, but is otherwise the same as
         * [GnssRawIfServiceAsync.count].
         */
        fun count(params: GnssRawIfCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: GnssRawIfCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/getFile/{id}`, but is otherwise the
         * same as [GnssRawIfServiceAsync.fileGet].
         */
        fun fileGet(id: String): CompletableFuture<HttpResponse> =
            fileGet(id, GnssRawIfFileGetParams.none())

        /** @see fileGet */
        fun fileGet(
            id: String,
            params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            fileGet(params.toBuilder().id(id).build(), requestOptions)

        /** @see fileGet */
        fun fileGet(
            id: String,
            params: GnssRawIfFileGetParams = GnssRawIfFileGetParams.none(),
        ): CompletableFuture<HttpResponse> = fileGet(id, params, RequestOptions.none())

        /** @see fileGet */
        fun fileGet(
            params: GnssRawIfFileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see fileGet */
        fun fileGet(params: GnssRawIfFileGetParams): CompletableFuture<HttpResponse> =
            fileGet(params, RequestOptions.none())

        /** @see fileGet */
        fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            fileGet(id, GnssRawIfFileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/{id}`, but is otherwise the same as
         * [GnssRawIfServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> =
            get(id, GnssRawIfGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: GnssRawIfGetParams = GnssRawIfGetParams.none(),
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GnssRawIfGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>>

        /** @see get */
        fun get(
            params: GnssRawIfGetParams
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> =
            get(id, GnssRawIfGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/queryhelp`, but is otherwise the same
         * as [GnssRawIfServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<GnssRawIfQueryhelpResponse>> =
            queryhelp(GnssRawIfQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssRawIfQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: GnssRawIfQueryhelpParams = GnssRawIfQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<GnssRawIfQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GnssRawIfQueryhelpResponse>> =
            queryhelp(GnssRawIfQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssrawif/tuple`, but is otherwise the same as
         * [GnssRawIfServiceAsync.tuple].
         */
        fun tuple(
            params: GnssRawIfTupleParams
        ): CompletableFuture<HttpResponseFor<List<GnssRawIfTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: GnssRawIfTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<GnssRawIfTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-gnssrawif`, but is otherwise the same
         * as [GnssRawIfServiceAsync.uploadZip].
         */
        fun uploadZip(params: GnssRawIfUploadZipParams): CompletableFuture<HttpResponse> =
            uploadZip(params, RequestOptions.none())

        /** @see uploadZip */
        fun uploadZip(
            params: GnssRawIfUploadZipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
