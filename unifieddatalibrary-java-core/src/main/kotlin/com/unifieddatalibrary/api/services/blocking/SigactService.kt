// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sigact.SigactCountParams
import com.unifieddatalibrary.api.models.sigact.SigactCreateBulkParams
import com.unifieddatalibrary.api.models.sigact.SigactListPage
import com.unifieddatalibrary.api.models.sigact.SigactListParams
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpParams
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpResponse
import com.unifieddatalibrary.api.models.sigact.SigactTupleParams
import com.unifieddatalibrary.api.models.sigact.SigactTupleResponse
import com.unifieddatalibrary.api.models.sigact.SigactUploadZipParams
import com.unifieddatalibrary.api.services.blocking.sigact.HistoryService
import java.util.function.Consumer

interface SigactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SigactService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: SigactListParams): SigactListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SigactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SigactListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SigactCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SigactCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of SigAct records as
     * a POST body and ingest into the database. Requires specific roles, please contact the UDL
     * team to gain access. This operation is not intended to be used for automated feeds into
     * UDL...data providers should contact the UDL team for instructions on setting up a permanent
     * feed through an alternate mechanism.
     */
    fun createBulk(params: SigactCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SigactCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SigactQueryhelpResponse = queryhelp(SigactQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SigactQueryhelpParams = SigactQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SigactQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SigactQueryhelpParams = SigactQueryhelpParams.none()
    ): SigactQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SigactQueryhelpResponse =
        queryhelp(SigactQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SigactTupleParams): List<SigactTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SigactTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SigactTupleResponse>

    /**
     * Upload a text file with its metadata. This operation bypasses the length constraints of the
     * `eventDescription` field.
     *
     * The request body requires a zip file containing exactly two files:\ 1\) A file with the
     * `.json` file extension whose content conforms to the `SigAct_Ingest` schema.\ 2\) A UTF-8
     * encoded file with the `.txt` file extension.
     *
     * The JSON and text files will be associated with each other via the `id` field. Query the
     * metadata via `GET /udl/sigact` and use `GET /udl/sigact/getFile/{id}` to retrieve the text
     * file.
     *
     * This operation only accepts application/zip media. The application/json request body is
     * documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadZip(params: SigactUploadZipParams) = uploadZip(params, RequestOptions.none())

    /** @see uploadZip */
    fun uploadZip(
        params: SigactUploadZipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [SigactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SigactService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/sigact`, but is otherwise the same as
         * [SigactService.list].
         */
        @MustBeClosed
        fun list(params: SigactListParams): HttpResponseFor<SigactListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SigactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SigactListPage>

        /**
         * Returns a raw HTTP response for `get /udl/sigact/count`, but is otherwise the same as
         * [SigactService.count].
         */
        @MustBeClosed
        fun count(params: SigactCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SigactCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/sigact/createBulk`, but is otherwise the same
         * as [SigactService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SigactCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SigactCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sigact/queryhelp`, but is otherwise the same as
         * [SigactService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SigactQueryhelpResponse> =
            queryhelp(SigactQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SigactQueryhelpParams = SigactQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SigactQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SigactQueryhelpParams = SigactQueryhelpParams.none()
        ): HttpResponseFor<SigactQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SigactQueryhelpResponse> =
            queryhelp(SigactQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sigact/tuple`, but is otherwise the same as
         * [SigactService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SigactTupleParams): HttpResponseFor<List<SigactTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SigactTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SigactTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-sigact-text`, but is otherwise the
         * same as [SigactService.uploadZip].
         */
        @MustBeClosed
        fun uploadZip(params: SigactUploadZipParams): HttpResponse =
            uploadZip(params, RequestOptions.none())

        /** @see uploadZip */
        @MustBeClosed
        fun uploadZip(
            params: SigactUploadZipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
