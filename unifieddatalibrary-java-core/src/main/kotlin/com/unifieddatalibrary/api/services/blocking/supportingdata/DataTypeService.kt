// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.datatypes.DataTypeListPage
import com.unifieddatalibrary.api.models.supportingdata.datatypes.DataTypeListParams
import java.util.function.Consumer

interface DataTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataTypeService

    /** Retrieves all distinct data owner types. */
    fun list(): DataTypeListPage = list(DataTypeListParams.none())

    /** @see list */
    fun list(
        params: DataTypeListParams = DataTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataTypeListPage

    /** @see list */
    fun list(params: DataTypeListParams = DataTypeListParams.none()): DataTypeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DataTypeListPage =
        list(DataTypeListParams.none(), requestOptions)

    /** A view of [DataTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/getDataTypes`, but is otherwise the
         * same as [DataTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DataTypeListPage> = list(DataTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataTypeListParams = DataTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataTypeListParams = DataTypeListParams.none()
        ): HttpResponseFor<DataTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DataTypeListPage> =
            list(DataTypeListParams.none(), requestOptions)
    }
}
