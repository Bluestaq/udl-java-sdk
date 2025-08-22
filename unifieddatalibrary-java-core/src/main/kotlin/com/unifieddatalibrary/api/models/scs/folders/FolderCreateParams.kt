// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.folders

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new folder that is passed as part of the path. A specific role is required to perform
 * this service operation. Please contact the UDL team for assistance.
 */
class FolderCreateParams
private constructor(
    private val id: String,
    private val classificationMarking: String,
    private val description: String?,
    private val read: String?,
    private val sendNotification: Boolean?,
    private val tags: String?,
    private val write: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /** Path to create folder. */
    fun id(): String = id

    /** Classification marking of the data in IC/CAPCO Portion-marked format. */
    fun classificationMarking(): String = classificationMarking

    /** Optional description to include on folder. */
    fun description(): Optional<String> = Optional.ofNullable(description)

    /** Comma separated list of user ids who can read contents of the folder. */
    fun read(): Optional<String> = Optional.ofNullable(read)

    /** Whether or not to send a notification that this folder was created. */
    fun sendNotification(): Optional<Boolean> = Optional.ofNullable(sendNotification)

    /** Comma separated list of tags to add to the folder. */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Comma separated list of user ids who can write to the folder. */
    fun write(): Optional<String> = Optional.ofNullable(write)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderCreateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .classificationMarking()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var classificationMarking: String? = null
        private var description: String? = null
        private var read: String? = null
        private var sendNotification: Boolean? = null
        private var tags: String? = null
        private var write: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folderCreateParams: FolderCreateParams) = apply {
            id = folderCreateParams.id
            classificationMarking = folderCreateParams.classificationMarking
            description = folderCreateParams.description
            read = folderCreateParams.read
            sendNotification = folderCreateParams.sendNotification
            tags = folderCreateParams.tags
            write = folderCreateParams.write
            additionalHeaders = folderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = folderCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = folderCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** Path to create folder. */
        fun id(id: String) = apply { this.id = id }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) = apply {
            this.classificationMarking = classificationMarking
        }

        /** Optional description to include on folder. */
        fun description(description: String?) = apply { this.description = description }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Comma separated list of user ids who can read contents of the folder. */
        fun read(read: String?) = apply { this.read = read }

        /** Alias for calling [Builder.read] with `read.orElse(null)`. */
        fun read(read: Optional<String>) = read(read.getOrNull())

        /** Whether or not to send a notification that this folder was created. */
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

        /** Comma separated list of tags to add to the folder. */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        /** Comma separated list of user ids who can write to the folder. */
        fun write(write: String?) = apply { this.write = write }

        /** Alias for calling [Builder.write] with `write.orElse(null)`. */
        fun write(write: Optional<String>) = write(write.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAlladditional_body_properties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [FolderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .classificationMarking()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FolderCreateParams =
            FolderCreateParams(
                checkRequired("id", id),
                checkRequired("classificationMarking", classificationMarking),
                description,
                read,
                sendNotification,
                tags,
                write,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("id", id)
                put("classificationMarking", classificationMarking)
                description?.let { put("description", it) }
                read?.let { put("read", it) }
                sendNotification?.let { put("sendNotification", it.toString()) }
                tags?.let { put("tags", it) }
                write?.let { put("write", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderCreateParams &&
            id == other.id &&
            classificationMarking == other.classificationMarking &&
            description == other.description &&
            read == other.read &&
            sendNotification == other.sendNotification &&
            tags == other.tags &&
            write == other.write &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            classificationMarking,
            description,
            read,
            sendNotification,
            tags,
            write,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "FolderCreateParams{id=$id, classificationMarking=$classificationMarking, description=$description, read=$read, sendNotification=$sendNotification, tags=$tags, write=$write, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
