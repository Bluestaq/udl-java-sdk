// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.video.VideoListPage
import com.unifieddatalibrary.api.models.video.VideoListParams
import com.unifieddatalibrary.api.models.video.VideoQueryhelpParams
import com.unifieddatalibrary.api.models.video.VideoQueryhelpResponse
import com.unifieddatalibrary.api.models.video.VideoTupleParams
import com.unifieddatalibrary.api.models.video.history.VideoStreamsFull
import com.unifieddatalibrary.api.services.blocking.VideoService
import com.unifieddatalibrary.api.services.blocking.video.HistoryService
import java.util.function.Consumer

interface VideoService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoService

    fun history(): HistoryService

    /** Service operation to take a single Video Stream record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: VideoCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: VideoCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): VideoListPage = list(VideoListParams.none())

    /** @see list */
    fun list(params: VideoListParams = VideoListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VideoListPage

    /** @see list */
    fun list(params: VideoListParams = VideoListParams.none()): VideoListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): VideoListPage =
        list(
          VideoListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(VideoCountParams.none())

    /** @see count */
    fun count(params: VideoCountParams = VideoCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: VideoCountParams = VideoCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          VideoCountParams.none(), requestOptions
        )

    /** Service operation to get a single Video Stream record by its unique ID passed as a path parameter. */
    fun get(id: String): VideoStreamsFull =
        get(
          id, VideoGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: VideoGetParams = VideoGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VideoStreamsFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: VideoGetParams = VideoGetParams.none()): VideoStreamsFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: VideoGetParams, requestOptions: RequestOptions = RequestOptions.none()): VideoStreamsFull

    /** @see get */
    fun get(params: VideoGetParams): VideoStreamsFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): VideoStreamsFull =
        get(
          id,
          VideoGetParams.none(),
          requestOptions,
        )

    /** Service operation to retrieve player URL and token for given stream name and source. */
    fun getPlayerStreamingInfo(params: VideoGetPlayerStreamingInfoParams): VideoGetPlayerStreamingInfoResponse =
        getPlayerStreamingInfo(
          params, RequestOptions.none()
        )

    /** @see getPlayerStreamingInfo */
    fun getPlayerStreamingInfo(params: VideoGetPlayerStreamingInfoParams, requestOptions: RequestOptions = RequestOptions.none()): VideoGetPlayerStreamingInfoResponse

    /** Service operation to retrieve publisher URL and token for given stream name and source. */
    fun getPublisherStreamingInfo(params: VideoGetPublisherStreamingInfoParams): VideoGetPublisherStreamingInfoResponse =
        getPublisherStreamingInfo(
          params, RequestOptions.none()
        )

    /** @see getPublisherStreamingInfo */
    fun getPublisherStreamingInfo(params: VideoGetPublisherStreamingInfoParams, requestOptions: RequestOptions = RequestOptions.none()): VideoGetPublisherStreamingInfoResponse

    /** Service operation to retrieve a static pre-configured SRT or UDP streamfile URL for given stream name and source. */
    fun getStreamFile(params: VideoGetStreamFileParams): VideoGetStreamFileResponse =
        getStreamFile(
          params, RequestOptions.none()
        )

    /** @see getStreamFile */
    fun getStreamFile(params: VideoGetStreamFileParams, requestOptions: RequestOptions = RequestOptions.none()): VideoGetStreamFileResponse

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): VideoQueryhelpResponse = queryhelp(VideoQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: VideoQueryhelpParams = VideoQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VideoQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: VideoQueryhelpParams = VideoQueryhelpParams.none()): VideoQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): VideoQueryhelpResponse =
        queryhelp(
          VideoQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: VideoTupleParams): List<VideoStreamsFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: VideoTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<VideoStreamsFull>

    /** A view of [VideoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/video`, but is otherwise the same as [VideoService.create]. */
        @MustBeClosed
        fun create(params: VideoCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: VideoCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/video`, but is otherwise the same as [VideoService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<VideoListPage> = list(VideoListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: VideoListParams = VideoListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: VideoListParams = VideoListParams.none()): HttpResponseFor<VideoListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VideoListPage> =
            list(
              VideoListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/video/count`, but is otherwise the same as [VideoService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(VideoCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: VideoCountParams = VideoCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: VideoCountParams = VideoCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              VideoCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/video/{id}`, but is otherwise the same as [VideoService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<VideoStreamsFull> =
            get(
              id, VideoGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: VideoGetParams = VideoGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoStreamsFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: VideoGetParams = VideoGetParams.none()): HttpResponseFor<VideoStreamsFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: VideoGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoStreamsFull>

        /** @see get */
        @MustBeClosed
        fun get(params: VideoGetParams): HttpResponseFor<VideoStreamsFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<VideoStreamsFull> =
            get(
              id,
              VideoGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/video/getPlayerStreamingInfo`, but is otherwise the same as [VideoService.getPlayerStreamingInfo]. */
        @MustBeClosed
        fun getPlayerStreamingInfo(params: VideoGetPlayerStreamingInfoParams): HttpResponseFor<VideoGetPlayerStreamingInfoResponse> =
            getPlayerStreamingInfo(
              params, RequestOptions.none()
            )

        /** @see getPlayerStreamingInfo */
        @MustBeClosed
        fun getPlayerStreamingInfo(params: VideoGetPlayerStreamingInfoParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoGetPlayerStreamingInfoResponse>

        /** Returns a raw HTTP response for `get /udl/video/getPublisherStreamingInfo`, but is otherwise the same as [VideoService.getPublisherStreamingInfo]. */
        @MustBeClosed
        fun getPublisherStreamingInfo(params: VideoGetPublisherStreamingInfoParams): HttpResponseFor<VideoGetPublisherStreamingInfoResponse> =
            getPublisherStreamingInfo(
              params, RequestOptions.none()
            )

        /** @see getPublisherStreamingInfo */
        @MustBeClosed
        fun getPublisherStreamingInfo(params: VideoGetPublisherStreamingInfoParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoGetPublisherStreamingInfoResponse>

        /** Returns a raw HTTP response for `get /udl/video/getStreamFile`, but is otherwise the same as [VideoService.getStreamFile]. */
        @MustBeClosed
        fun getStreamFile(params: VideoGetStreamFileParams): HttpResponseFor<VideoGetStreamFileResponse> =
            getStreamFile(
              params, RequestOptions.none()
            )

        /** @see getStreamFile */
        @MustBeClosed
        fun getStreamFile(params: VideoGetStreamFileParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoGetStreamFileResponse>

        /** Returns a raw HTTP response for `get /udl/video/queryhelp`, but is otherwise the same as [VideoService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<VideoQueryhelpResponse> = queryhelp(VideoQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: VideoQueryhelpParams = VideoQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VideoQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: VideoQueryhelpParams = VideoQueryhelpParams.none()): HttpResponseFor<VideoQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<VideoQueryhelpResponse> =
            queryhelp(
              VideoQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/video/tuple`, but is otherwise the same as [VideoService.tuple]. */
        @MustBeClosed
        fun tuple(params: VideoTupleParams): HttpResponseFor<List<VideoStreamsFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: VideoTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<VideoStreamsFull>>
    }
}
