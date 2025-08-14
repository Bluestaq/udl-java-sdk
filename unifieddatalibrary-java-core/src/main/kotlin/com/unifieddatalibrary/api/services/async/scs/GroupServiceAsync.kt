// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.groups.GroupListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Returns a list of all available groups for ACL UIs */
    fun list(): CompletableFuture<List<String>> = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()): CompletableFuture<List<String>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(GroupListParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/groups`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<String>>> = list(GroupListParams.none())

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> =
            list(GroupListParams.none(), requestOptions)
    }
}
