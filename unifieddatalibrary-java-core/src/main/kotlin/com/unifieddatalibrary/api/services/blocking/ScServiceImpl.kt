// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.prepare
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
import com.unifieddatalibrary.api.services.blocking.scs.ClassificationMarkingService
import com.unifieddatalibrary.api.services.blocking.scs.ClassificationMarkingServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.FileMetadataService
import com.unifieddatalibrary.api.services.blocking.scs.FileMetadataServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.FileService
import com.unifieddatalibrary.api.services.blocking.scs.FileServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.FolderService
import com.unifieddatalibrary.api.services.blocking.scs.FolderServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.GroupService
import com.unifieddatalibrary.api.services.blocking.scs.GroupServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.PathService
import com.unifieddatalibrary.api.services.blocking.scs.PathServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.RangeParameterService
import com.unifieddatalibrary.api.services.blocking.scs.RangeParameterServiceImpl
import com.unifieddatalibrary.api.services.blocking.scs.V2Service
import com.unifieddatalibrary.api.services.blocking.scs.V2ServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScServiceImpl internal constructor(private val clientOptions: ClientOptions) : ScService {

    private val withRawResponse: ScService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    private val classificationMarkings: ClassificationMarkingService by lazy {
        ClassificationMarkingServiceImpl(clientOptions)
    }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val fileMetadata: FileMetadataService by lazy { FileMetadataServiceImpl(clientOptions) }

    private val rangeParameters: RangeParameterService by lazy {
        RangeParameterServiceImpl(clientOptions)
    }

    private val paths: PathService by lazy { PathServiceImpl(clientOptions) }

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptions) }

    private val file: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): ScService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScService =
        ScServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun folders(): FolderService = folders

    override fun classificationMarkings(): ClassificationMarkingService = classificationMarkings

    override fun groups(): GroupService = groups

    override fun fileMetadata(): FileMetadataService = fileMetadata

    override fun rangeParameters(): RangeParameterService = rangeParameters

    override fun paths(): PathService = paths

    override fun v2(): V2Service = v2

    override fun file(): FileService = file

    override fun delete(params: ScDeleteParams, requestOptions: RequestOptions) {
        // delete /scs/delete
        withRawResponse().delete(params, requestOptions)
    }

    override fun aggregateDocType(
        params: ScAggregateDocTypeParams,
        requestOptions: RequestOptions,
    ): List<String> =
        // get /scs/aggregateDocType
        withRawResponse().aggregateDocType(params, requestOptions).parse()

    override fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams,
        requestOptions: RequestOptions,
    ): List<String> =
        // get /scs/allowableFileExtensions
        withRawResponse().allowableFileExtensions(params, requestOptions).parse()

    override fun allowableFileMimes(
        params: ScAllowableFileMimesParams,
        requestOptions: RequestOptions,
    ): List<String> =
        // get /scs/allowableFileMimes
        withRawResponse().allowableFileMimes(params, requestOptions).parse()

    override fun copy(params: ScCopyParams, requestOptions: RequestOptions): String =
        // post /scs/copy
        withRawResponse().copy(params, requestOptions).parse()

    override fun download(params: ScDownloadParams, requestOptions: RequestOptions): HttpResponse =
        // post /scs/download
        withRawResponse().download(params, requestOptions)

    override fun fileDownload(
        params: ScFileDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /scs/download
        withRawResponse().fileDownload(params, requestOptions)

    override fun fileUpload(params: ScFileUploadParams, requestOptions: RequestOptions): String =
        // post /scs/file
        withRawResponse().fileUpload(params, requestOptions).parse()

    override fun move(params: ScMoveParams, requestOptions: RequestOptions): String =
        // put /scs/move
        withRawResponse().move(params, requestOptions).parse()

    override fun rename(params: ScRenameParams, requestOptions: RequestOptions) {
        // put /scs/rename
        withRawResponse().rename(params, requestOptions)
    }

    override fun search(params: ScSearchParams, requestOptions: RequestOptions): List<FileData> =
        // post /scs/search
        withRawResponse().search(params, requestOptions).parse()

    override fun updateTags(params: ScUpdateTagsParams, requestOptions: RequestOptions) {
        // put /scs/updateTagsForFilesInFolder
        withRawResponse().updateTags(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val classificationMarkings: ClassificationMarkingService.WithRawResponse by lazy {
            ClassificationMarkingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fileMetadata: FileMetadataService.WithRawResponse by lazy {
            FileMetadataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rangeParameters: RangeParameterService.WithRawResponse by lazy {
            RangeParameterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val paths: PathService.WithRawResponse by lazy {
            PathServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2Service.WithRawResponse by lazy {
            V2ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val file: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScService.WithRawResponse =
            ScServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun folders(): FolderService.WithRawResponse = folders

        override fun classificationMarkings(): ClassificationMarkingService.WithRawResponse =
            classificationMarkings

        override fun groups(): GroupService.WithRawResponse = groups

        override fun fileMetadata(): FileMetadataService.WithRawResponse = fileMetadata

        override fun rangeParameters(): RangeParameterService.WithRawResponse = rangeParameters

        override fun paths(): PathService.WithRawResponse = paths

        override fun v2(): V2Service.WithRawResponse = v2

        override fun file(): FileService.WithRawResponse = file

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ScDeleteParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "delete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val aggregateDocTypeHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun aggregateDocType(
            params: ScAggregateDocTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "aggregateDocType")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { aggregateDocTypeHandler.handle(it) }
            }
        }

        private val allowableFileExtensionsHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "allowableFileExtensions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { allowableFileExtensionsHandler.handle(it) }
            }
        }

        private val allowableFileMimesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun allowableFileMimes(
            params: ScAllowableFileMimesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "allowableFileMimes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { allowableFileMimesHandler.handle(it) }
            }
        }

        private val copyHandler: Handler<String> = stringHandler()

        override fun copy(
            params: ScCopyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "copy")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { copyHandler.handle(it) }
            }
        }

        override fun download(
            params: ScDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "download")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun fileDownload(
            params: ScFileDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "download")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val fileUploadHandler: Handler<String> = stringHandler()

        override fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileContent", params._body().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "file")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { fileUploadHandler.handle(it) }
            }
        }

        private val moveHandler: Handler<String> = stringHandler()

        override fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "move")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { moveHandler.handle(it) }
            }
        }

        private val renameHandler: Handler<Void?> = emptyHandler()

        override fun rename(params: ScRenameParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "rename")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { renameHandler.handle(it) }
            }
        }

        private val searchHandler: Handler<List<FileData>> =
            jsonHandler<List<FileData>>(clientOptions.jsonMapper)

        override fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FileData>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateTagsHandler: Handler<Void?> = emptyHandler()

        override fun updateTags(
            params: ScUpdateTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "updateTagsForFilesInFolder")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateTagsHandler.handle(it) }
            }
        }
    }
}
