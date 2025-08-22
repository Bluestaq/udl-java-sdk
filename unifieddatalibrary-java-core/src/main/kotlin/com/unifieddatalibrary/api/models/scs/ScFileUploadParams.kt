// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Operation to upload a file. A specific role is required to perform this service operation. Please
 * contact the UDL team for assistance.
 */
class ScFileUploadParams
private constructor(
    private val classificationMarking: String,
    private val fileName: String,
    private val path: String,
    private val deleteAfter: String?,
    private val description: String?,
    private val overwrite: Boolean?,
    private val sendNotification: Boolean?,
    private val tags: String?,
    private val fileContent: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Classification (ex. U//FOUO) */
    fun classificationMarking(): String = classificationMarking

    /** FileName (ex. dog.jpg) */
    fun fileName(): String = fileName

    /** The base path to upload file (ex. images) */
    fun path(): String = path

    /** Length of time after which to automatically delete the file. */
    fun deleteAfter(): Optional<String> = Optional.ofNullable(deleteAfter)

    /** Description */
    fun description(): Optional<String> = Optional.ofNullable(description)

    /** Whether or not to overwrite a file with the same name and path, if one exists. */
    fun overwrite(): Optional<Boolean> = Optional.ofNullable(overwrite)

    /** Whether or not to send a notification that this file was uploaded. */
    fun sendNotification(): Optional<Boolean> = Optional.ofNullable(sendNotification)

    /** Tags */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    fun fileContent(): Optional<String> = Optional.ofNullable(fileContent)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScFileUploadParams].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .fileName()
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScFileUploadParams]. */
    class Builder internal constructor() {

        private var classificationMarking: String? = null
        private var fileName: String? = null
        private var path: String? = null
        private var deleteAfter: String? = null
        private var description: String? = null
        private var overwrite: Boolean? = null
        private var sendNotification: Boolean? = null
        private var tags: String? = null
        private var fileContent: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scFileUploadParams: ScFileUploadParams) = apply {
            classificationMarking = scFileUploadParams.classificationMarking
            fileName = scFileUploadParams.fileName
            path = scFileUploadParams.path
            deleteAfter = scFileUploadParams.deleteAfter
            description = scFileUploadParams.description
            overwrite = scFileUploadParams.overwrite
            sendNotification = scFileUploadParams.sendNotification
            tags = scFileUploadParams.tags
            fileContent = scFileUploadParams.fileContent
            additionalHeaders = scFileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = scFileUploadParams.additionalQueryParams.toBuilder()
        }

        /** Classification (ex. U//FOUO) */
        fun classificationMarking(classificationMarking: String) = apply {
            this.classificationMarking = classificationMarking
        }

        /** FileName (ex. dog.jpg) */
        fun fileName(fileName: String) = apply { this.fileName = fileName }

        /** The base path to upload file (ex. images) */
        fun path(path: String) = apply { this.path = path }

        /** Length of time after which to automatically delete the file. */
        fun deleteAfter(deleteAfter: String?) = apply { this.deleteAfter = deleteAfter }

        /** Alias for calling [Builder.deleteAfter] with `deleteAfter.orElse(null)`. */
        fun deleteAfter(deleteAfter: Optional<String>) = deleteAfter(deleteAfter.getOrNull())

        /** Description */
        fun description(description: String?) = apply { this.description = description }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Whether or not to overwrite a file with the same name and path, if one exists. */
        fun overwrite(overwrite: Boolean?) = apply { this.overwrite = overwrite }

        /**
         * Alias for [Builder.overwrite].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun overwrite(overwrite: Boolean) = overwrite(overwrite as Boolean?)

        /** Alias for calling [Builder.overwrite] with `overwrite.orElse(null)`. */
        fun overwrite(overwrite: Optional<Boolean>) = overwrite(overwrite.getOrNull())

        /** Whether or not to send a notification that this file was uploaded. */
        fun sendNotification(sendNotification: Boolean?) = apply {
            this.sendNotification = sendNotification
        }

        /**
         * Alias for [Builder.sendNotification].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sendNotification(sendNotification: Boolean) =
            sendNotification(sendNotification as Boolean?)

        /** Alias for calling [Builder.sendNotification] with `sendNotification.orElse(null)`. */
        fun sendNotification(sendNotification: Optional<Boolean>) =
            sendNotification(sendNotification.getOrNull())

        /** Tags */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        fun fileContent(fileContent: String?) = apply { this.fileContent = fileContent }

        /** Alias for calling [Builder.fileContent] with `fileContent.orElse(null)`. */
        fun fileContent(fileContent: Optional<String>) = fileContent(fileContent.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ScFileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .fileName()
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScFileUploadParams =
            ScFileUploadParams(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("fileName", fileName),
                checkRequired("path", path),
                deleteAfter,
                description,
                overwrite,
                sendNotification,
                tags,
                fileContent,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<String> = Optional.ofNullable(fileContent)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("classificationMarking", classificationMarking)
                put("fileName", fileName)
                put("path", path)
                deleteAfter?.let { put("deleteAfter", it) }
                description?.let { put("description", it) }
                overwrite?.let { put("overwrite", it.toString()) }
                sendNotification?.let { put("sendNotification", it.toString()) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScFileUploadParams &&
            classificationMarking == other.classificationMarking &&
            fileName == other.fileName &&
            path == other.path &&
            deleteAfter == other.deleteAfter &&
            description == other.description &&
            overwrite == other.overwrite &&
            sendNotification == other.sendNotification &&
            tags == other.tags &&
            fileContent == other.fileContent &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            classificationMarking,
            fileName,
            path,
            deleteAfter,
            description,
            overwrite,
            sendNotification,
            tags,
            fileContent,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ScFileUploadParams{classificationMarking=$classificationMarking, fileName=$fileName, path=$path, deleteAfter=$deleteAfter, description=$description, overwrite=$overwrite, sendNotification=$sendNotification, tags=$tags, fileContent=$fileContent, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
