// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.groups.GroupListParams
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Returns a list of all available groups for ACL UIs */
    fun list(): List<String> = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()): List<String> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<String> =
        list(GroupListParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/groups`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<String>> = list(GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(params: GroupListParams = GroupListParams.none()): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            list(GroupListParams.none(), requestOptions)
    }
}
