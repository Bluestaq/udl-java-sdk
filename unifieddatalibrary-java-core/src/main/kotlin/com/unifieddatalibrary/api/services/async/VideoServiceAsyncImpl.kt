// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
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
import com.unifieddatalibrary.api.models.video.VideoListResponse
import com.unifieddatalibrary.api.models.video.VideoQueryhelpParams
import com.unifieddatalibrary.api.models.video.VideoQueryhelpResponse
import com.unifieddatalibrary.api.models.video.VideoTupleParams
import com.unifieddatalibrary.api.models.video.history.VideoStreamsFull
import com.unifieddatalibrary.api.services.async.video.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.video.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VideoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoServiceAsync {

    private val withRawResponse: VideoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VideoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoServiceAsync =
        VideoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: VideoCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/video
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: VideoListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoListPageAsync> =
        // get /udl/video
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: VideoCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/video/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: VideoGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoStreamsFull> =
        // get /udl/video/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getPlayerStreamingInfo(
        params: VideoGetPlayerStreamingInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoGetPlayerStreamingInfoResponse> =
        // get /udl/video/getPlayerStreamingInfo
        withRawResponse().getPlayerStreamingInfo(params, requestOptions).thenApply { it.parse() }

    override fun getPublisherStreamingInfo(
        params: VideoGetPublisherStreamingInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoGetPublisherStreamingInfoResponse> =
        // get /udl/video/getPublisherStreamingInfo
        withRawResponse().getPublisherStreamingInfo(params, requestOptions).thenApply { it.parse() }

    override fun getStreamFile(
        params: VideoGetStreamFileParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoGetStreamFileResponse> =
        // get /udl/video/getStreamFile
        withRawResponse().getStreamFile(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: VideoQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VideoQueryhelpResponse> =
        // get /udl/video/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: VideoTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<VideoStreamsFull>> =
        // get /udl/video/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoServiceAsync.WithRawResponse =
            VideoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: VideoCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<List<VideoListResponse>> =
            jsonHandler<List<VideoListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: VideoListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                VideoListPageAsync.builder()
                                    .service(VideoServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: VideoCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "count")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { countHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<VideoStreamsFull> =
            jsonHandler<VideoStreamsFull>(clientOptions.jsonMapper)

        override fun get(
            params: VideoGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoStreamsFull>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPlayerStreamingInfoHandler: Handler<VideoGetPlayerStreamingInfoResponse> =
            jsonHandler<VideoGetPlayerStreamingInfoResponse>(clientOptions.jsonMapper)

        override fun getPlayerStreamingInfo(
            params: VideoGetPlayerStreamingInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoGetPlayerStreamingInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "getPlayerStreamingInfo")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPlayerStreamingInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPublisherStreamingInfoHandler:
            Handler<VideoGetPublisherStreamingInfoResponse> =
            jsonHandler<VideoGetPublisherStreamingInfoResponse>(clientOptions.jsonMapper)

        override fun getPublisherStreamingInfo(
            params: VideoGetPublisherStreamingInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoGetPublisherStreamingInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "getPublisherStreamingInfo")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPublisherStreamingInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getStreamFileHandler: Handler<VideoGetStreamFileResponse> =
            jsonHandler<VideoGetStreamFileResponse>(clientOptions.jsonMapper)

        override fun getStreamFile(
            params: VideoGetStreamFileParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoGetStreamFileResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "getStreamFile")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStreamFileHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryhelpHandler: Handler<VideoQueryhelpResponse> =
            jsonHandler<VideoQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: VideoQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VideoQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryhelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tupleHandler: Handler<List<VideoStreamsFull>> =
            jsonHandler<List<VideoStreamsFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: VideoTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<VideoStreamsFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "video", "tuple")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { tupleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
