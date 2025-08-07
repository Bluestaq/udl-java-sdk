// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataownertypes.DataownerTypeListPage
import com.unifieddatalibrary.api.models.supportingdata.dataownertypes.DataownerTypeListParams
import java.util.function.Consumer

interface DataownerTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerTypeService

    /** Retrieves all distinct data owner types. */
    fun list(): DataownerTypeListPage = list(DataownerTypeListParams.none())

    /** @see list */
    fun list(
        params: DataownerTypeListParams = DataownerTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataownerTypeListPage

    /** @see list */
    fun list(
        params: DataownerTypeListParams = DataownerTypeListParams.none()
    ): DataownerTypeListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DataownerTypeListPage =
        list(DataownerTypeListParams.none(), requestOptions)

    /**
     * A view of [DataownerTypeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataownerTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/getDataOwnerTypes`, but is otherwise
         * the same as [DataownerTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DataownerTypeListPage> = list(DataownerTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataownerTypeListParams = DataownerTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataownerTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataownerTypeListParams = DataownerTypeListParams.none()
        ): HttpResponseFor<DataownerTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DataownerTypeListPage> =
            list(DataownerTypeListParams.none(), requestOptions)
    }
}
