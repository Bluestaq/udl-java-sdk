// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates all folders in provided path that don't exist. Can be used to create a single folder or a
 * new folder structure. Provided classificationMarking, description, writeAcl, readAcl, and tags
 * are applied to the deepest folder in the provided path. If parent folders are created by this
 * request, each parent folder will be created with the same classificationMarking and tags. A
 * specific role is required to perform this service operation. Please contact the UDL team for
 * assistance.
 */
class V2FolderCreateParams
private constructor(
    private val path: String,
    private val sendNotification: Boolean?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Path to create. Will attempt to create all folders in the path that do not exist. Must start
     * and end with '/'.
     */
    fun path(): String = path

    /** Whether or not to send a notification that this folder was created. */
    fun sendNotification(): Optional<Boolean> = Optional.ofNullable(sendNotification)

    /**
     * Classification marking of the folder or file in IC/CAPCO portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> = body.classificationMarking()

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deleteOn(): Optional<Long> = body.deleteOn()

    /**
     * Optional description for the file or folder.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * For folders only. Comma separated list of user and group ids that should have read access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readAcl(): Optional<String> = body.readAcl()

    /**
     * Array of provider/source specific tags for this data, used for implementing data owner
     * conditional access controls to restrict access to the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * For folders only. Comma separated list of user and group ids that should have write access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun writeAcl(): Optional<String> = body.writeAcl()

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _classificationMarking(): JsonField<String> = body._classificationMarking()

    /**
     * Returns the raw JSON value of [deleteOn].
     *
     * Unlike [deleteOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deleteOn(): JsonField<Long> = body._deleteOn()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [readAcl].
     *
     * Unlike [readAcl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readAcl(): JsonField<String> = body._readAcl()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [writeAcl].
     *
     * Unlike [writeAcl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _writeAcl(): JsonField<String> = body._writeAcl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2FolderCreateParams].
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2FolderCreateParams]. */
    class Builder internal constructor() {

        private var path: String? = null
        private var sendNotification: Boolean? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2FolderCreateParams: V2FolderCreateParams) = apply {
            path = v2FolderCreateParams.path
            sendNotification = v2FolderCreateParams.sendNotification
            body = v2FolderCreateParams.body.toBuilder()
            additionalHeaders = v2FolderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2FolderCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Path to create. Will attempt to create all folders in the path that do not exist. Must
         * start and end with '/'.
         */
        fun path(path: String) = apply { this.path = path }

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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [classificationMarking]
         * - [deleteOn]
         * - [description]
         * - [readAcl]
         * - [tags]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Classification marking of the folder or file in IC/CAPCO portion-marked format. */
        fun classificationMarking(classificationMarking: String) = apply {
            body.classificationMarking(classificationMarking)
        }

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            body.classificationMarking(classificationMarking)
        }

        fun deleteOn(deleteOn: Long) = apply { body.deleteOn(deleteOn) }

        /**
         * Sets [Builder.deleteOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteOn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleteOn(deleteOn: JsonField<Long>) = apply { body.deleteOn(deleteOn) }

        /** Optional description for the file or folder. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * For folders only. Comma separated list of user and group ids that should have read access
         * on this folder and the items nested in it.
         */
        fun readAcl(readAcl: String) = apply { body.readAcl(readAcl) }

        /**
         * Sets [Builder.readAcl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAcl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun readAcl(readAcl: JsonField<String>) = apply { body.readAcl(readAcl) }

        /**
         * Array of provider/source specific tags for this data, used for implementing data owner
         * conditional access controls to restrict access to the data.
         */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        /**
         * For folders only. Comma separated list of user and group ids that should have write
         * access on this folder and the items nested in it.
         */
        fun writeAcl(writeAcl: String) = apply { body.writeAcl(writeAcl) }

        /**
         * Sets [Builder.writeAcl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.writeAcl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun writeAcl(writeAcl: JsonField<String>) = apply { body.writeAcl(writeAcl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [V2FolderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2FolderCreateParams =
            V2FolderCreateParams(
                checkRequired("path", path),
                sendNotification,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("path", path)
                sendNotification?.let { put("sendNotification", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** An SCS file or folder. */
    class Body
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val deleteOn: JsonField<Long>,
        private val description: JsonField<String>,
        private val readAcl: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val writeAcl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deleteOn") @ExcludeMissing deleteOn: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("readAcl") @ExcludeMissing readAcl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("writeAcl") @ExcludeMissing writeAcl: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            deleteOn,
            description,
            readAcl,
            tags,
            writeAcl,
            mutableMapOf(),
        )

        /**
         * Classification marking of the folder or file in IC/CAPCO portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): Optional<String> =
            classificationMarking.getOptional("classificationMarking")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deleteOn(): Optional<Long> = deleteOn.getOptional("deleteOn")

        /**
         * Optional description for the file or folder.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * For folders only. Comma separated list of user and group ids that should have read access
         * on this folder and the items nested in it.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun readAcl(): Optional<String> = readAcl.getOptional("readAcl")

        /**
         * Array of provider/source specific tags for this data, used for implementing data owner
         * conditional access controls to restrict access to the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * For folders only. Comma separated list of user and group ids that should have write
         * access on this folder and the items nested in it.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun writeAcl(): Optional<String> = writeAcl.getOptional("writeAcl")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        fun _classificationMarking(): JsonField<String> = classificationMarking

        /**
         * Returns the raw JSON value of [deleteOn].
         *
         * Unlike [deleteOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deleteOn") @ExcludeMissing fun _deleteOn(): JsonField<Long> = deleteOn

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [readAcl].
         *
         * Unlike [readAcl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("readAcl") @ExcludeMissing fun _readAcl(): JsonField<String> = readAcl

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [writeAcl].
         *
         * Unlike [writeAcl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("writeAcl") @ExcludeMissing fun _writeAcl(): JsonField<String> = writeAcl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String> = JsonMissing.of()
            private var deleteOn: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var readAcl: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var writeAcl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                deleteOn = body.deleteOn
                description = body.description
                readAcl = body.readAcl
                tags = body.tags.map { it.toMutableList() }
                writeAcl = body.writeAcl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Classification marking of the folder or file in IC/CAPCO portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            fun deleteOn(deleteOn: Long) = deleteOn(JsonField.of(deleteOn))

            /**
             * Sets [Builder.deleteOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deleteOn] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deleteOn(deleteOn: JsonField<Long>) = apply { this.deleteOn = deleteOn }

            /** Optional description for the file or folder. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * For folders only. Comma separated list of user and group ids that should have read
             * access on this folder and the items nested in it.
             */
            fun readAcl(readAcl: String) = readAcl(JsonField.of(readAcl))

            /**
             * Sets [Builder.readAcl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readAcl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readAcl(readAcl: JsonField<String>) = apply { this.readAcl = readAcl }

            /**
             * Array of provider/source specific tags for this data, used for implementing data
             * owner conditional access controls to restrict access to the data.
             */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /**
             * For folders only. Comma separated list of user and group ids that should have write
             * access on this folder and the items nested in it.
             */
            fun writeAcl(writeAcl: String) = writeAcl(JsonField.of(writeAcl))

            /**
             * Sets [Builder.writeAcl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.writeAcl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun writeAcl(writeAcl: JsonField<String>) = apply { this.writeAcl = writeAcl }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    classificationMarking,
                    deleteOn,
                    description,
                    readAcl,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    writeAcl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            deleteOn()
            description()
            readAcl()
            tags()
            writeAcl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (if (deleteOn.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (readAcl.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (writeAcl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                deleteOn == other.deleteOn &&
                description == other.description &&
                readAcl == other.readAcl &&
                tags == other.tags &&
                writeAcl == other.writeAcl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                deleteOn,
                description,
                readAcl,
                tags,
                writeAcl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, deleteOn=$deleteOn, description=$description, readAcl=$readAcl, tags=$tags, writeAcl=$writeAcl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2FolderCreateParams &&
            path == other.path &&
            sendNotification == other.sendNotification &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(path, sendNotification, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V2FolderCreateParams{path=$path, sendNotification=$sendNotification, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
