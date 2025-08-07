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
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.ScAggregateDocTypeParams
import com.unifieddatalibrary.api.models.scs.ScAllowableFileExtensionsParams
import com.unifieddatalibrary.api.models.scs.ScAllowableFileMimesParams
import com.unifieddatalibrary.api.models.scs.ScCopyParams
import com.unifieddatalibrary.api.models.scs.ScDeleteParams
import com.unifieddatalibrary.api.models.scs.ScDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileUploadParams
import com.unifieddatalibrary.api.models.scs.ScMoveParams
import com.unifieddatalibrary.api.models.scs.ScRenameParams
import com.unifieddatalibrary.api.models.scs.ScSearchParams
import com.unifieddatalibrary.api.models.scs.ScUpdateTagsParams
import com.unifieddatalibrary.api.services.async.scs.ClassificationMarkingServiceAsync
import com.unifieddatalibrary.api.services.async.scs.ClassificationMarkingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.FileMetadataServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileMetadataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.GroupServiceAsync
import com.unifieddatalibrary.api.services.async.scs.GroupServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.PathServiceAsync
import com.unifieddatalibrary.api.services.async.scs.PathServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsync
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsync
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ScServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScServiceAsync {

    private val withRawResponse: ScServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val folders: FolderServiceAsync by lazy { FolderServiceAsyncImpl(clientOptions) }

    private val classificationMarkings: ClassificationMarkingServiceAsync by lazy {
        ClassificationMarkingServiceAsyncImpl(clientOptions)
    }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val fileMetadata: FileMetadataServiceAsync by lazy {
        FileMetadataServiceAsyncImpl(clientOptions)
    }

    private val rangeParameters: RangeParameterServiceAsync by lazy {
        RangeParameterServiceAsyncImpl(clientOptions)
    }

    private val paths: PathServiceAsync by lazy { PathServiceAsyncImpl(clientOptions) }

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    private val file: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ScServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScServiceAsync =
        ScServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun folders(): FolderServiceAsync = folders

    override fun classificationMarkings(): ClassificationMarkingServiceAsync =
        classificationMarkings

    override fun groups(): GroupServiceAsync = groups

    override fun fileMetadata(): FileMetadataServiceAsync = fileMetadata

    override fun rangeParameters(): RangeParameterServiceAsync = rangeParameters

    override fun paths(): PathServiceAsync = paths

    override fun v2(): V2ServiceAsync = v2

    override fun file(): FileServiceAsync = file

    override fun delete(
        params: ScDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /scs/delete
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun aggregateDocType(
        params: ScAggregateDocTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /scs/aggregateDocType
        withRawResponse().aggregateDocType(params, requestOptions).thenApply { it.parse() }

    override fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /scs/allowableFileExtensions
        withRawResponse().allowableFileExtensions(params, requestOptions).thenApply { it.parse() }

    override fun allowableFileMimes(
        params: ScAllowableFileMimesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /scs/allowableFileMimes
        withRawResponse().allowableFileMimes(params, requestOptions).thenApply { it.parse() }

    override fun copy(
        params: ScCopyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // post /scs/copy
        withRawResponse().copy(params, requestOptions).thenApply { it.parse() }

    override fun download(
        params: ScDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /scs/download
        withRawResponse().download(params, requestOptions)

    override fun fileDownload(
        params: ScFileDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /scs/download
        withRawResponse().fileDownload(params, requestOptions)

    override fun fileUpload(
        params: ScFileUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // post /scs/file
        withRawResponse().fileUpload(params, requestOptions).thenApply { it.parse() }

    override fun move(
        params: ScMoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // put /scs/move
        withRawResponse().move(params, requestOptions).thenApply { it.parse() }

    override fun rename(
        params: ScRenameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /scs/rename
        withRawResponse().rename(params, requestOptions).thenAccept {}

    override fun search(
        params: ScSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FileData>> =
        // post /scs/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun updateTags(
        params: ScUpdateTagsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /scs/updateTagsForFilesInFolder
        withRawResponse().updateTags(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val folders: FolderServiceAsync.WithRawResponse by lazy {
            FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val classificationMarkings:
            ClassificationMarkingServiceAsync.WithRawResponse by lazy {
            ClassificationMarkingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fileMetadata: FileMetadataServiceAsync.WithRawResponse by lazy {
            FileMetadataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rangeParameters: RangeParameterServiceAsync.WithRawResponse by lazy {
            RangeParameterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val paths: PathServiceAsync.WithRawResponse by lazy {
            PathServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val file: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScServiceAsync.WithRawResponse =
            ScServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun folders(): FolderServiceAsync.WithRawResponse = folders

        override fun classificationMarkings(): ClassificationMarkingServiceAsync.WithRawResponse =
            classificationMarkings

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun fileMetadata(): FileMetadataServiceAsync.WithRawResponse = fileMetadata

        override fun rangeParameters(): RangeParameterServiceAsync.WithRawResponse = rangeParameters

        override fun paths(): PathServiceAsync.WithRawResponse = paths

        override fun v2(): V2ServiceAsync.WithRawResponse = v2

        override fun file(): FileServiceAsync.WithRawResponse = file

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ScDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "delete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val aggregateDocTypeHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun aggregateDocType(
            params: ScAggregateDocTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "aggregateDocType")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { aggregateDocTypeHandler.handle(it) }
                    }
                }
        }

        private val allowableFileExtensionsHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "allowableFileExtensions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { allowableFileExtensionsHandler.handle(it) }
                    }
                }
        }

        private val allowableFileMimesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun allowableFileMimes(
            params: ScAllowableFileMimesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "allowableFileMimes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { allowableFileMimesHandler.handle(it) }
                    }
                }
        }

        private val copyHandler: Handler<String> = stringHandler()

        override fun copy(
            params: ScCopyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "copy")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { copyHandler.handle(it) }
                    }
                }
        }

        override fun download(
            params: ScDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "download")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun fileDownload(
            params: ScFileDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "download")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val fileUploadHandler: Handler<String> = stringHandler()

        override fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileContent", !params._fileContent().isMissing())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "file")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { fileUploadHandler.handle(it) }
                    }
                }
        }

        private val moveHandler: Handler<String> = stringHandler()

        override fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "move")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { moveHandler.handle(it) }
                    }
                }
        }

        private val renameHandler: Handler<Void?> = emptyHandler()

        override fun rename(
            params: ScRenameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "rename")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { renameHandler.handle(it) }
                    }
                }
        }

        private val searchHandler: Handler<List<FileData>> =
            jsonHandler<List<FileData>>(clientOptions.jsonMapper)

        override fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FileData>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateTagsHandler: Handler<Void?> = emptyHandler()

        override fun updateTags(
            params: ScUpdateTagsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "updateTagsForFilesInFolder")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateTagsHandler.handle(it) }
                    }
                }
        }
    }
}
