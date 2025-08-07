// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

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
class V2FileUploadParams
private constructor(
    private val classificationMarking: String,
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

    /**
     * Classification marking of uploaded document. If folders are created, they will also have this
     * classification marking.
     */
    fun classificationMarking(): String = classificationMarking

    /**
     * The complete path for the upload including filename. Will attempt to create folders in path
     * if necessary. Must start with '/'.
     */
    fun path(): String = path

    /** Length of time after which to automatically delete the file. */
    fun deleteAfter(): Optional<String> = Optional.ofNullable(deleteAfter)

    /** Optional description of uploaded document. */
    fun description(): Optional<String> = Optional.ofNullable(description)

    /** Whether or not to overwrite a file with the same name and path, if one exists. */
    fun overwrite(): Optional<Boolean> = Optional.ofNullable(overwrite)

    /** Whether or not to send a notification that this file was uploaded. */
    fun sendNotification(): Optional<Boolean> = Optional.ofNullable(sendNotification)

    /**
     * Optional array of provider/source specific tags for this data, used for implementing data
     * owner conditional access controls to restrict access to the data.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    fun fileContent(): Optional<String> = Optional.ofNullable(fileContent)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2FileUploadParams].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2FileUploadParams]. */
    class Builder internal constructor() {

        private var classificationMarking: String? = null
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
        internal fun from(v2FileUploadParams: V2FileUploadParams) = apply {
            classificationMarking = v2FileUploadParams.classificationMarking
            path = v2FileUploadParams.path
            deleteAfter = v2FileUploadParams.deleteAfter
            description = v2FileUploadParams.description
            overwrite = v2FileUploadParams.overwrite
            sendNotification = v2FileUploadParams.sendNotification
            tags = v2FileUploadParams.tags
            fileContent = v2FileUploadParams.fileContent
            additionalHeaders = v2FileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2FileUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Classification marking of uploaded document. If folders are created, they will also have
         * this classification marking.
         */
        fun classificationMarking(classificationMarking: String) = apply {
            this.classificationMarking = classificationMarking
        }

        /**
         * The complete path for the upload including filename. Will attempt to create folders in
         * path if necessary. Must start with '/'.
         */
        fun path(path: String) = apply { this.path = path }

        /** Length of time after which to automatically delete the file. */
        fun deleteAfter(deleteAfter: String?) = apply { this.deleteAfter = deleteAfter }

        /** Alias for calling [Builder.deleteAfter] with `deleteAfter.orElse(null)`. */
        fun deleteAfter(deleteAfter: Optional<String>) = deleteAfter(deleteAfter.getOrNull())

        /** Optional description of uploaded document. */
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

        /**
         * Optional array of provider/source specific tags for this data, used for implementing data
         * owner conditional access controls to restrict access to the data.
         */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        fun fileContent(fileContent: String?) = apply { this.fileContent = fileContent }

        /** Alias for calling [Builder.fileContent] with `fileContent.orElse(null)`. */
        fun fileContent(fileContent: Optional<String>) = fileContent(fileContent.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [V2FileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2FileUploadParams =
            V2FileUploadParams(
                checkRequired("classificationMarking", classificationMarking),
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

        return /* spotless:off */ other is V2FileUploadParams && classificationMarking == other.classificationMarking && path == other.path && deleteAfter == other.deleteAfter && description == other.description && overwrite == other.overwrite && sendNotification == other.sendNotification && tags == other.tags && fileContent == other.fileContent && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(classificationMarking, path, deleteAfter, description, overwrite, sendNotification, tags, fileContent, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V2FileUploadParams{classificationMarking=$classificationMarking, path=$path, deleteAfter=$deleteAfter, description=$description, overwrite=$overwrite, sendNotification=$sendNotification, tags=$tags, fileContent=$fileContent, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
