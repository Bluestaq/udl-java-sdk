// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
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
     * Unique identifier for document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * Additional metadata associated with this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attachment(): Optional<Attachment> = body.attachment()

    /**
     * Classification marking of the folder or file in IC/CAPCO portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> = body.classificationMarking()

    /**
     * The time at which this document was created, represented in UTC ISO format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = body.createdAt()

    /**
     * The creator of this document. Can be a person or a software entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = body.createdBy()

    /**
     * Time at which this document should be automatically deleted. Represented in milliseconds
     * since Unix epoch.
     *
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
     * The name of this document. Applicable to files and folders.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filename(): Optional<String> = body.filename()

    /**
     * The absolute path to this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filePath(): Optional<String> = body.filePath()

    /**
     * Optional. Any keywords associated with this document. Only applicable to files whose contents
     * are indexed (e.g. text files, PDFs).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun keywords(): Optional<String> = body.keywords()

    /**
     * The parent folder of this document. If this document is a root-level folder then the parent
     * path is "/".
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parentPath(): Optional<String> = body.parentPath()

    /**
     * The type of this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pathType(): Optional<PathType> = body.pathType()

    /**
     * For folders only. Comma separated list of user and group ids that should have read access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readAcl(): Optional<String> = body.readAcl()

    /**
     * Size of this document in bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun size(): Optional<Int> = body.size()

    /**
     * Array of provider/source specific tags for this data, used for implementing data owner
     * conditional access controls to restrict access to the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * The time at which this document was most recently updated, represented in UTC ISO format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = body.updatedAt()

    /**
     * The person or software entity who updated this document most recently.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = body.updatedBy()

    /**
     * For folders only. Comma separated list of user and group ids that should have write access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun writeAcl(): Optional<String> = body.writeAcl()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [attachment].
     *
     * Unlike [attachment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachment(): JsonField<Attachment> = body._attachment()

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _classificationMarking(): JsonField<String> = body._classificationMarking()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<String> = body._createdAt()

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdBy(): JsonField<String> = body._createdBy()

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
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filename(): JsonField<String> = body._filename()

    /**
     * Returns the raw JSON value of [filePath].
     *
     * Unlike [filePath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filePath(): JsonField<String> = body._filePath()

    /**
     * Returns the raw JSON value of [keywords].
     *
     * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _keywords(): JsonField<String> = body._keywords()

    /**
     * Returns the raw JSON value of [parentPath].
     *
     * Unlike [parentPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentPath(): JsonField<String> = body._parentPath()

    /**
     * Returns the raw JSON value of [pathType].
     *
     * Unlike [pathType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pathType(): JsonField<PathType> = body._pathType()

    /**
     * Returns the raw JSON value of [readAcl].
     *
     * Unlike [readAcl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readAcl(): JsonField<String> = body._readAcl()

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _size(): JsonField<Int> = body._size()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedAt(): JsonField<String> = body._updatedAt()

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedBy(): JsonField<String> = body._updatedBy()

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
         * - [id]
         * - [attachment]
         * - [classificationMarking]
         * - [createdAt]
         * - [createdBy]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Unique identifier for document. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Additional metadata associated with this document. */
        fun attachment(attachment: Attachment) = apply { body.attachment(attachment) }

        /**
         * Sets [Builder.attachment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachment] with a well-typed [Attachment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachment(attachment: JsonField<Attachment>) = apply { body.attachment(attachment) }

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

        /** The time at which this document was created, represented in UTC ISO format. */
        fun createdAt(createdAt: String) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { body.createdAt(createdAt) }

        /** The creator of this document. Can be a person or a software entity. */
        fun createdBy(createdBy: String) = apply { body.createdBy(createdBy) }

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { body.createdBy(createdBy) }

        /**
         * Time at which this document should be automatically deleted. Represented in milliseconds
         * since Unix epoch.
         */
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

        /** The name of this document. Applicable to files and folders. */
        fun filename(filename: String) = apply { body.filename(filename) }

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { body.filename(filename) }

        /** The absolute path to this document. */
        fun filePath(filePath: String) = apply { body.filePath(filePath) }

        /**
         * Sets [Builder.filePath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filePath] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filePath(filePath: JsonField<String>) = apply { body.filePath(filePath) }

        /**
         * Optional. Any keywords associated with this document. Only applicable to files whose
         * contents are indexed (e.g. text files, PDFs).
         */
        fun keywords(keywords: String) = apply { body.keywords(keywords) }

        /**
         * Sets [Builder.keywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keywords] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keywords(keywords: JsonField<String>) = apply { body.keywords(keywords) }

        /**
         * The parent folder of this document. If this document is a root-level folder then the
         * parent path is "/".
         */
        fun parentPath(parentPath: String) = apply { body.parentPath(parentPath) }

        /**
         * Sets [Builder.parentPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentPath(parentPath: JsonField<String>) = apply { body.parentPath(parentPath) }

        /** The type of this document. */
        fun pathType(pathType: PathType) = apply { body.pathType(pathType) }

        /**
         * Sets [Builder.pathType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pathType] with a well-typed [PathType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pathType(pathType: JsonField<PathType>) = apply { body.pathType(pathType) }

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

        /** Size of this document in bytes. */
        fun size(size: Int) = apply { body.size(size) }

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Int>) = apply { body.size(size) }

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
         * The time at which this document was most recently updated, represented in UTC ISO format.
         */
        fun updatedAt(updatedAt: String) = apply { body.updatedAt(updatedAt) }

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { body.updatedAt(updatedAt) }

        /** The person or software entity who updated this document most recently. */
        fun updatedBy(updatedBy: String) = apply { body.updatedBy(updatedBy) }

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { body.updatedBy(updatedBy) }

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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val attachment: JsonField<Attachment>,
        private val classificationMarking: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val deleteOn: JsonField<Long>,
        private val description: JsonField<String>,
        private val filename: JsonField<String>,
        private val filePath: JsonField<String>,
        private val keywords: JsonField<String>,
        private val parentPath: JsonField<String>,
        private val pathType: JsonField<PathType>,
        private val readAcl: JsonField<String>,
        private val size: JsonField<Int>,
        private val tags: JsonField<List<String>>,
        private val updatedAt: JsonField<String>,
        private val updatedBy: JsonField<String>,
        private val writeAcl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachment")
            @ExcludeMissing
            attachment: JsonField<Attachment> = JsonMissing.of(),
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deleteOn") @ExcludeMissing deleteOn: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filePath")
            @ExcludeMissing
            filePath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("keywords")
            @ExcludeMissing
            keywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parentPath")
            @ExcludeMissing
            parentPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pathType")
            @ExcludeMissing
            pathType: JsonField<PathType> = JsonMissing.of(),
            @JsonProperty("readAcl") @ExcludeMissing readAcl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("writeAcl") @ExcludeMissing writeAcl: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            attachment,
            classificationMarking,
            createdAt,
            createdBy,
            deleteOn,
            description,
            filename,
            filePath,
            keywords,
            parentPath,
            pathType,
            readAcl,
            size,
            tags,
            updatedAt,
            updatedBy,
            writeAcl,
            mutableMapOf(),
        )

        /**
         * Unique identifier for document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Additional metadata associated with this document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attachment(): Optional<Attachment> = attachment.getOptional("attachment")

        /**
         * Classification marking of the folder or file in IC/CAPCO portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): Optional<String> =
            classificationMarking.getOptional("classificationMarking")

        /**
         * The time at which this document was created, represented in UTC ISO format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

        /**
         * The creator of this document. Can be a person or a software entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Time at which this document should be automatically deleted. Represented in milliseconds
         * since Unix epoch.
         *
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
         * The name of this document. Applicable to files and folders.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * The absolute path to this document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun filePath(): Optional<String> = filePath.getOptional("filePath")

        /**
         * Optional. Any keywords associated with this document. Only applicable to files whose
         * contents are indexed (e.g. text files, PDFs).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun keywords(): Optional<String> = keywords.getOptional("keywords")

        /**
         * The parent folder of this document. If this document is a root-level folder then the
         * parent path is "/".
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parentPath(): Optional<String> = parentPath.getOptional("parentPath")

        /**
         * The type of this document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pathType(): Optional<PathType> = pathType.getOptional("pathType")

        /**
         * For folders only. Comma separated list of user and group ids that should have read access
         * on this folder and the items nested in it.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun readAcl(): Optional<String> = readAcl.getOptional("readAcl")

        /**
         * Size of this document in bytes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun size(): Optional<Int> = size.getOptional("size")

        /**
         * Array of provider/source specific tags for this data, used for implementing data owner
         * conditional access controls to restrict access to the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * The time at which this document was most recently updated, represented in UTC ISO format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

        /**
         * The person or software entity who updated this document most recently.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * For folders only. Comma separated list of user and group ids that should have write
         * access on this folder and the items nested in it.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun writeAcl(): Optional<String> = writeAcl.getOptional("writeAcl")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [attachment].
         *
         * Unlike [attachment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachment")
        @ExcludeMissing
        fun _attachment(): JsonField<Attachment> = attachment

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

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
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [filePath].
         *
         * Unlike [filePath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filePath") @ExcludeMissing fun _filePath(): JsonField<String> = filePath

        /**
         * Returns the raw JSON value of [keywords].
         *
         * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keywords") @ExcludeMissing fun _keywords(): JsonField<String> = keywords

        /**
         * Returns the raw JSON value of [parentPath].
         *
         * Unlike [parentPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parentPath")
        @ExcludeMissing
        fun _parentPath(): JsonField<String> = parentPath

        /**
         * Returns the raw JSON value of [pathType].
         *
         * Unlike [pathType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pathType") @ExcludeMissing fun _pathType(): JsonField<PathType> = pathType

        /**
         * Returns the raw JSON value of [readAcl].
         *
         * Unlike [readAcl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("readAcl") @ExcludeMissing fun _readAcl(): JsonField<String> = readAcl

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Int> = size

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

        /**
         * Returns the raw JSON value of [updatedBy].
         *
         * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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

            private var id: JsonField<String> = JsonMissing.of()
            private var attachment: JsonField<Attachment> = JsonMissing.of()
            private var classificationMarking: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var deleteOn: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var filePath: JsonField<String> = JsonMissing.of()
            private var keywords: JsonField<String> = JsonMissing.of()
            private var parentPath: JsonField<String> = JsonMissing.of()
            private var pathType: JsonField<PathType> = JsonMissing.of()
            private var readAcl: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Int> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var writeAcl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                attachment = body.attachment
                classificationMarking = body.classificationMarking
                createdAt = body.createdAt
                createdBy = body.createdBy
                deleteOn = body.deleteOn
                description = body.description
                filename = body.filename
                filePath = body.filePath
                keywords = body.keywords
                parentPath = body.parentPath
                pathType = body.pathType
                readAcl = body.readAcl
                size = body.size
                tags = body.tags.map { it.toMutableList() }
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
                writeAcl = body.writeAcl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique identifier for document. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Additional metadata associated with this document. */
            fun attachment(attachment: Attachment) = attachment(JsonField.of(attachment))

            /**
             * Sets [Builder.attachment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachment] with a well-typed [Attachment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attachment(attachment: JsonField<Attachment>) = apply {
                this.attachment = attachment
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

            /** The time at which this document was created, represented in UTC ISO format. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** The creator of this document. Can be a person or a software entity. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /**
             * Time at which this document should be automatically deleted. Represented in
             * milliseconds since Unix epoch.
             */
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

            /** The name of this document. Applicable to files and folders. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** The absolute path to this document. */
            fun filePath(filePath: String) = filePath(JsonField.of(filePath))

            /**
             * Sets [Builder.filePath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filePath] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filePath(filePath: JsonField<String>) = apply { this.filePath = filePath }

            /**
             * Optional. Any keywords associated with this document. Only applicable to files whose
             * contents are indexed (e.g. text files, PDFs).
             */
            fun keywords(keywords: String) = keywords(JsonField.of(keywords))

            /**
             * Sets [Builder.keywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywords] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keywords(keywords: JsonField<String>) = apply { this.keywords = keywords }

            /**
             * The parent folder of this document. If this document is a root-level folder then the
             * parent path is "/".
             */
            fun parentPath(parentPath: String) = parentPath(JsonField.of(parentPath))

            /**
             * Sets [Builder.parentPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentPath] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentPath(parentPath: JsonField<String>) = apply { this.parentPath = parentPath }

            /** The type of this document. */
            fun pathType(pathType: PathType) = pathType(JsonField.of(pathType))

            /**
             * Sets [Builder.pathType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pathType] with a well-typed [PathType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pathType(pathType: JsonField<PathType>) = apply { this.pathType = pathType }

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

            /** Size of this document in bytes. */
            fun size(size: Int) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Int>) = apply { this.size = size }

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
             * The time at which this document was most recently updated, represented in UTC ISO
             * format.
             */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /** The person or software entity who updated this document most recently. */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
                    id,
                    attachment,
                    classificationMarking,
                    createdAt,
                    createdBy,
                    deleteOn,
                    description,
                    filename,
                    filePath,
                    keywords,
                    parentPath,
                    pathType,
                    readAcl,
                    size,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    updatedBy,
                    writeAcl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            attachment().ifPresent { it.validate() }
            classificationMarking()
            createdAt()
            createdBy()
            deleteOn()
            description()
            filename()
            filePath()
            keywords()
            parentPath()
            pathType().ifPresent { it.validate() }
            readAcl()
            size()
            tags()
            updatedAt()
            updatedBy()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (attachment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (deleteOn.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (filePath.asKnown().isPresent) 1 else 0) +
                (if (keywords.asKnown().isPresent) 1 else 0) +
                (if (parentPath.asKnown().isPresent) 1 else 0) +
                (pathType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (readAcl.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (if (writeAcl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                attachment == other.attachment &&
                classificationMarking == other.classificationMarking &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                deleteOn == other.deleteOn &&
                description == other.description &&
                filename == other.filename &&
                filePath == other.filePath &&
                keywords == other.keywords &&
                parentPath == other.parentPath &&
                pathType == other.pathType &&
                readAcl == other.readAcl &&
                size == other.size &&
                tags == other.tags &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                writeAcl == other.writeAcl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                attachment,
                classificationMarking,
                createdAt,
                createdBy,
                deleteOn,
                description,
                filename,
                filePath,
                keywords,
                parentPath,
                pathType,
                readAcl,
                size,
                tags,
                updatedAt,
                updatedBy,
                writeAcl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, attachment=$attachment, classificationMarking=$classificationMarking, createdAt=$createdAt, createdBy=$createdBy, deleteOn=$deleteOn, description=$description, filename=$filename, filePath=$filePath, keywords=$keywords, parentPath=$parentPath, pathType=$pathType, readAcl=$readAcl, size=$size, tags=$tags, updatedAt=$updatedAt, updatedBy=$updatedBy, writeAcl=$writeAcl, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata associated with this document. */
    class Attachment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val author: JsonField<String>,
        private val contentLength: JsonField<Int>,
        private val contentType: JsonField<String>,
        private val date: JsonField<String>,
        private val keywords: JsonField<String>,
        private val language: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("author") @ExcludeMissing author: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_length")
            @ExcludeMissing
            contentLength: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
            @JsonProperty("keywords")
            @ExcludeMissing
            keywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            author,
            contentLength,
            contentType,
            date,
            keywords,
            language,
            title,
            mutableMapOf(),
        )

        /**
         * The creator of this document. Can be a person or a software entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun author(): Optional<String> = author.getOptional("author")

        /**
         * The length of the document, in bytes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contentLength(): Optional<Int> = contentLength.getOptional("content_length")

        /**
         * The document's MIME-type (if applicable).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * The time at which this attachment was created, represented in UTC ISO format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun date(): Optional<String> = date.getOptional("date")

        /**
         * Any keywords associated with this document. Only applicable to files whose contents are
         * indexed (e.g. text files, PDFs).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun keywords(): Optional<String> = keywords.getOptional("keywords")

        /**
         * The human language of the document, if discernible.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * The title of the document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [author].
         *
         * Unlike [author], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("author") @ExcludeMissing fun _author(): JsonField<String> = author

        /**
         * Returns the raw JSON value of [contentLength].
         *
         * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("content_length")
        @ExcludeMissing
        fun _contentLength(): JsonField<Int> = contentLength

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

        /**
         * Returns the raw JSON value of [keywords].
         *
         * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keywords") @ExcludeMissing fun _keywords(): JsonField<String> = keywords

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Attachment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var author: JsonField<String> = JsonMissing.of()
            private var contentLength: JsonField<Int> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var date: JsonField<String> = JsonMissing.of()
            private var keywords: JsonField<String> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                author = attachment.author
                contentLength = attachment.contentLength
                contentType = attachment.contentType
                date = attachment.date
                keywords = attachment.keywords
                language = attachment.language
                title = attachment.title
                additionalProperties = attachment.additionalProperties.toMutableMap()
            }

            /** The creator of this document. Can be a person or a software entity. */
            fun author(author: String) = author(JsonField.of(author))

            /**
             * Sets [Builder.author] to an arbitrary JSON value.
             *
             * You should usually call [Builder.author] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun author(author: JsonField<String>) = apply { this.author = author }

            /** The length of the document, in bytes. */
            fun contentLength(contentLength: Int) = contentLength(JsonField.of(contentLength))

            /**
             * Sets [Builder.contentLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentLength] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentLength(contentLength: JsonField<Int>) = apply {
                this.contentLength = contentLength
            }

            /** The document's MIME-type (if applicable). */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            /** The time at which this attachment was created, represented in UTC ISO format. */
            fun date(date: String) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun date(date: JsonField<String>) = apply { this.date = date }

            /**
             * Any keywords associated with this document. Only applicable to files whose contents
             * are indexed (e.g. text files, PDFs).
             */
            fun keywords(keywords: String) = keywords(JsonField.of(keywords))

            /**
             * Sets [Builder.keywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywords] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keywords(keywords: JsonField<String>) = apply { this.keywords = keywords }

            /** The human language of the document, if discernible. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** The title of the document. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Attachment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attachment =
                Attachment(
                    author,
                    contentLength,
                    contentType,
                    date,
                    keywords,
                    language,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            author()
            contentLength()
            contentType()
            date()
            keywords()
            language()
            title()
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
            (if (author.asKnown().isPresent) 1 else 0) +
                (if (contentLength.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (keywords.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                author == other.author &&
                contentLength == other.contentLength &&
                contentType == other.contentType &&
                date == other.date &&
                keywords == other.keywords &&
                language == other.language &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                author,
                contentLength,
                contentType,
                date,
                keywords,
                language,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attachment{author=$author, contentLength=$contentLength, contentType=$contentType, date=$date, keywords=$keywords, language=$language, title=$title, additionalProperties=$additionalProperties}"
    }

    /** The type of this document. */
    class PathType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FILE = of("file")

            @JvmField val FOLDER = of("folder")

            @JvmStatic fun of(value: String) = PathType(JsonField.of(value))
        }

        /** An enum containing [PathType]'s known values. */
        enum class Known {
            FILE,
            FOLDER,
        }

        /**
         * An enum containing [PathType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PathType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILE,
            FOLDER,
            /** An enum member indicating that [PathType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FILE -> Value.FILE
                FOLDER -> Value.FOLDER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                FILE -> Known.FILE
                FOLDER -> Known.FOLDER
                else -> throw UnifieddatalibraryInvalidDataException("Unknown PathType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): PathType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PathType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
