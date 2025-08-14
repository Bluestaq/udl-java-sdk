// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.video.VideoCountParams
import com.unifieddatalibrary.api.models.video.VideoCreateParams
import com.unifieddatalibrary.api.models.video.VideoGetParams
import com.unifieddatalibrary.api.models.video.VideoGetPlayerStreamingInfoParams
import com.unifieddatalibrary.api.models.video.VideoGetPlayerStreamingInfoResponse
import com.unifieddatalibrary.api.models.video.VideoGetPublisherStreamingInfoParams
import com.unifieddatalibrary.api.models.video.VideoGetPublisherStreamingInfoResponse
import com.unifieddatalibrary.api.models.video.VideoGetStreamFileParams
import com.unifieddatalibrary.api.models.video.VideoGetStreamFileResponse
import com.unifieddatalibrary.api.models.video.VideoListPageAsync
import com.unifieddatalibrary.api.models.video.VideoListParams
import com.unifieddatalibrary.api.models.video.VideoQueryhelpParams
import com.unifieddatalibrary.api.models.video.VideoQueryhelpResponse
import com.unifieddatalibrary.api.models.video.VideoTupleParams
import com.unifieddatalibrary.api.models.video.history.VideoStreamsFull
import com.unifieddatalibrary.api.services.async.video.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VideoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single Video Stream record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: VideoCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VideoCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<VideoListPageAsync> = list(VideoListParams.none())

    /** @see list */
    fun list(
        params: VideoListParams = VideoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoListPageAsync>

    /** @see list */
    fun list(
        params: VideoListParams = VideoListParams.none()
    ): CompletableFuture<VideoListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VideoListPageAsync> =
        list(VideoListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(VideoCountParams.none())

    /** @see count */
    fun count(
        params: VideoCountParams = VideoCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: VideoCountParams = VideoCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(VideoCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Video Stream record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<VideoStreamsFull> = get(id, VideoGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: VideoGetParams = VideoGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoStreamsFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: VideoGetParams = VideoGetParams.none(),
    ): CompletableFuture<VideoStreamsFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VideoGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoStreamsFull>

    /** @see get */
    fun get(params: VideoGetParams): CompletableFuture<VideoStreamsFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<VideoStreamsFull> =
        get(id, VideoGetParams.none(), requestOptions)

    /** Service operation to retrieve player URL and token for given stream name and source. */
    fun getPlayerStreamingInfo(
        params: VideoGetPlayerStreamingInfoParams
    ): CompletableFuture<VideoGetPlayerStreamingInfoResponse> =
        getPlayerStreamingInfo(params, RequestOptions.none())

    /** @see getPlayerStreamingInfo */
    fun getPlayerStreamingInfo(
        params: VideoGetPlayerStreamingInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoGetPlayerStreamingInfoResponse>

    /** Service operation to retrieve publisher URL and token for given stream name and source. */
    fun getPublisherStreamingInfo(
        params: VideoGetPublisherStreamingInfoParams
    ): CompletableFuture<VideoGetPublisherStreamingInfoResponse> =
        getPublisherStreamingInfo(params, RequestOptions.none())

    /** @see getPublisherStreamingInfo */
    fun getPublisherStreamingInfo(
        params: VideoGetPublisherStreamingInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoGetPublisherStreamingInfoResponse>

    /**
     * Service operation to retrieve a static pre-configured SRT or UDP streamfile URL for given
     * stream name and source.
     */
    fun getStreamFile(
        params: VideoGetStreamFileParams
    ): CompletableFuture<VideoGetStreamFileResponse> = getStreamFile(params, RequestOptions.none())

    /** @see getStreamFile */
    fun getStreamFile(
        params: VideoGetStreamFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoGetStreamFileResponse>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<VideoQueryhelpResponse> =
        queryhelp(VideoQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: VideoQueryhelpParams = VideoQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VideoQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: VideoQueryhelpParams = VideoQueryhelpParams.none()
    ): CompletableFuture<VideoQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<VideoQueryhelpResponse> =
        queryhelp(VideoQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: VideoTupleParams): CompletableFuture<List<VideoStreamsFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: VideoTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<VideoStreamsFull>>

    /** A view of [VideoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/video`, but is otherwise the same as
         * [VideoServiceAsync.create].
         */
        fun create(params: VideoCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VideoCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/video`, but is otherwise the same as
         * [VideoServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VideoListPageAsync>> =
            list(VideoListParams.none())

        /** @see list */
        fun list(
            params: VideoListParams = VideoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoListPageAsync>>

        /** @see list */
        fun list(
            params: VideoListParams = VideoListParams.none()
        ): CompletableFuture<HttpResponseFor<VideoListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VideoListPageAsync>> =
            list(VideoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/video/count`, but is otherwise the same as
         * [VideoServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(VideoCountParams.none())

        /** @see count */
        fun count(
            params: VideoCountParams = VideoCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: VideoCountParams = VideoCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(VideoCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/video/{id}`, but is otherwise the same as
         * [VideoServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<VideoStreamsFull>> =
            get(id, VideoGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: VideoGetParams = VideoGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoStreamsFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: VideoGetParams = VideoGetParams.none(),
        ): CompletableFuture<HttpResponseFor<VideoStreamsFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: VideoGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoStreamsFull>>

        /** @see get */
        fun get(params: VideoGetParams): CompletableFuture<HttpResponseFor<VideoStreamsFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoStreamsFull>> =
            get(id, VideoGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/video/getPlayerStreamingInfo`, but is otherwise
         * the same as [VideoServiceAsync.getPlayerStreamingInfo].
         */
        fun getPlayerStreamingInfo(
            params: VideoGetPlayerStreamingInfoParams
        ): CompletableFuture<HttpResponseFor<VideoGetPlayerStreamingInfoResponse>> =
            getPlayerStreamingInfo(params, RequestOptions.none())

        /** @see getPlayerStreamingInfo */
        fun getPlayerStreamingInfo(
            params: VideoGetPlayerStreamingInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoGetPlayerStreamingInfoResponse>>

        /**
         * Returns a raw HTTP response for `get /udl/video/getPublisherStreamingInfo`, but is
         * otherwise the same as [VideoServiceAsync.getPublisherStreamingInfo].
         */
        fun getPublisherStreamingInfo(
            params: VideoGetPublisherStreamingInfoParams
        ): CompletableFuture<HttpResponseFor<VideoGetPublisherStreamingInfoResponse>> =
            getPublisherStreamingInfo(params, RequestOptions.none())

        /** @see getPublisherStreamingInfo */
        fun getPublisherStreamingInfo(
            params: VideoGetPublisherStreamingInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoGetPublisherStreamingInfoResponse>>

        /**
         * Returns a raw HTTP response for `get /udl/video/getStreamFile`, but is otherwise the same
         * as [VideoServiceAsync.getStreamFile].
         */
        fun getStreamFile(
            params: VideoGetStreamFileParams
        ): CompletableFuture<HttpResponseFor<VideoGetStreamFileResponse>> =
            getStreamFile(params, RequestOptions.none())

        /** @see getStreamFile */
        fun getStreamFile(
            params: VideoGetStreamFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoGetStreamFileResponse>>

        /**
         * Returns a raw HTTP response for `get /udl/video/queryhelp`, but is otherwise the same as
         * [VideoServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<VideoQueryhelpResponse>> =
            queryhelp(VideoQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: VideoQueryhelpParams = VideoQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VideoQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: VideoQueryhelpParams = VideoQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<VideoQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VideoQueryhelpResponse>> =
            queryhelp(VideoQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/video/tuple`, but is otherwise the same as
         * [VideoServiceAsync.tuple].
         */
        fun tuple(
            params: VideoTupleParams
        ): CompletableFuture<HttpResponseFor<List<VideoStreamsFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: VideoTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<VideoStreamsFull>>>
    }
}
