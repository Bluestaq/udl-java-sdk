// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.classificationmarkings.ClassificationMarkingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ClassificationMarkingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassificationMarkingServiceAsync

    /** Returns a list of all classification markings appropriate to the current user. */
    fun list(): CompletableFuture<List<String>> = list(ClassificationMarkingListParams.none())

    /** @see list */
    fun list(
        params: ClassificationMarkingListParams = ClassificationMarkingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(
        params: ClassificationMarkingListParams = ClassificationMarkingListParams.none()
    ): CompletableFuture<List<String>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(ClassificationMarkingListParams.none(), requestOptions)

    /**
     * A view of [ClassificationMarkingServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassificationMarkingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/getClassificationMarkings`, but is otherwise
         * the same as [ClassificationMarkingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<String>>> =
            list(ClassificationMarkingListParams.none())

        /** @see list */
        fun list(
            params: ClassificationMarkingListParams = ClassificationMarkingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(
            params: ClassificationMarkingListParams = ClassificationMarkingListParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> =
            list(ClassificationMarkingListParams.none(), requestOptions)
    }
}
