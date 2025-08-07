// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.classificationmarkings.ClassificationMarkingListParams
import java.util.function.Consumer

interface ClassificationMarkingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassificationMarkingService

    /** Returns a list of all classification markings appropriate to the current user. */
    fun list(): List<String> = list(ClassificationMarkingListParams.none())

    /** @see list */
    fun list(
        params: ClassificationMarkingListParams = ClassificationMarkingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see list */
    fun list(
        params: ClassificationMarkingListParams = ClassificationMarkingListParams.none()
    ): List<String> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<String> =
        list(ClassificationMarkingListParams.none(), requestOptions)

    /**
     * A view of [ClassificationMarkingService] that provides access to raw HTTP responses for each
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
        ): ClassificationMarkingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/getClassificationMarkings`, but is otherwise
         * the same as [ClassificationMarkingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<String>> = list(ClassificationMarkingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClassificationMarkingListParams = ClassificationMarkingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClassificationMarkingListParams = ClassificationMarkingListParams.none()
        ): HttpResponseFor<List<String>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            list(ClassificationMarkingListParams.none(), requestOptions)
    }
}
