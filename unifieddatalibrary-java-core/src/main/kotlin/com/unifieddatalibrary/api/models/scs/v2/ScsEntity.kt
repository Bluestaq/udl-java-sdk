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
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An SCS file or folder. */
class ScsEntity
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
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deleteOn") @ExcludeMissing deleteOn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filePath") @ExcludeMissing filePath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keywords") @ExcludeMissing keywords: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentPath")
        @ExcludeMissing
        parentPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pathType") @ExcludeMissing pathType: JsonField<PathType> = JsonMissing.of(),
        @JsonProperty("readAcl") @ExcludeMissing readAcl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
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
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Additional metadata associated with this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attachment(): Optional<Attachment> = attachment.getOptional("attachment")

    /**
     * Classification marking of the folder or file in IC/CAPCO portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> =
        classificationMarking.getOptional("classificationMarking")

    /**
     * The time at which this document was created, represented in UTC ISO format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

    /**
     * The creator of this document. Can be a person or a software entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Time at which this document should be automatically deleted. Represented in milliseconds
     * since Unix epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deleteOn(): Optional<Long> = deleteOn.getOptional("deleteOn")

    /**
     * Optional description for the file or folder.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The name of this document. Applicable to files and folders.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * The absolute path to this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filePath(): Optional<String> = filePath.getOptional("filePath")

    /**
     * Optional. Any keywords associated with this document. Only applicable to files whose contents
     * are indexed (e.g. text files, PDFs).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun keywords(): Optional<String> = keywords.getOptional("keywords")

    /**
     * The parent folder of this document. If this document is a root-level folder then the parent
     * path is "/".
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parentPath(): Optional<String> = parentPath.getOptional("parentPath")

    /**
     * The type of this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pathType(): Optional<PathType> = pathType.getOptional("pathType")

    /**
     * For folders only. Comma separated list of user and group ids that should have read access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readAcl(): Optional<String> = readAcl.getOptional("readAcl")

    /**
     * Size of this document in bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun size(): Optional<Int> = size.getOptional("size")

    /**
     * Array of provider/source specific tags for this data, used for implementing data owner
     * conditional access controls to restrict access to the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * The time at which this document was most recently updated, represented in UTC ISO format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

    /**
     * The person or software entity who updated this document most recently.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * For folders only. Comma separated list of user and group ids that should have write access on
     * this folder and the items nested in it.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
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
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
    @JsonProperty("parentPath") @ExcludeMissing fun _parentPath(): JsonField<String> = parentPath

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

        /** Returns a mutable builder for constructing an instance of [ScsEntity]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScsEntity]. */
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
        internal fun from(scsEntity: ScsEntity) = apply {
            id = scsEntity.id
            attachment = scsEntity.attachment
            classificationMarking = scsEntity.classificationMarking
            createdAt = scsEntity.createdAt
            createdBy = scsEntity.createdBy
            deleteOn = scsEntity.deleteOn
            description = scsEntity.description
            filename = scsEntity.filename
            filePath = scsEntity.filePath
            keywords = scsEntity.keywords
            parentPath = scsEntity.parentPath
            pathType = scsEntity.pathType
            readAcl = scsEntity.readAcl
            size = scsEntity.size
            tags = scsEntity.tags.map { it.toMutableList() }
            updatedAt = scsEntity.updatedAt
            updatedBy = scsEntity.updatedBy
            writeAcl = scsEntity.writeAcl
            additionalProperties = scsEntity.additionalProperties.toMutableMap()
        }

        /** Unique identifier for document. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun attachment(attachment: JsonField<Attachment>) = apply { this.attachment = attachment }

        /** Classification marking of the folder or file in IC/CAPCO portion-marked format. */
        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The creator of this document. Can be a person or a software entity. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * Time at which this document should be automatically deleted. Represented in milliseconds
         * since Unix epoch.
         */
        fun deleteOn(deleteOn: Long) = deleteOn(JsonField.of(deleteOn))

        /**
         * Sets [Builder.deleteOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteOn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleteOn(deleteOn: JsonField<Long>) = apply { this.deleteOn = deleteOn }

        /** Optional description for the file or folder. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of this document. Applicable to files and folders. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** The absolute path to this document. */
        fun filePath(filePath: String) = filePath(JsonField.of(filePath))

        /**
         * Sets [Builder.filePath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filePath] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.keywords] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.parentPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentPath(parentPath: JsonField<String>) = apply { this.parentPath = parentPath }

        /** The type of this document. */
        fun pathType(pathType: PathType) = pathType(JsonField.of(pathType))

        /**
         * Sets [Builder.pathType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pathType] with a well-typed [PathType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pathType(pathType: JsonField<PathType>) = apply { this.pathType = pathType }

        /**
         * For folders only. Comma separated list of user and group ids that should have read access
         * on this folder and the items nested in it.
         */
        fun readAcl(readAcl: String) = readAcl(JsonField.of(readAcl))

        /**
         * Sets [Builder.readAcl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAcl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun readAcl(readAcl: JsonField<String>) = apply { this.readAcl = readAcl }

        /** Size of this document in bytes. */
        fun size(size: Int) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Int>) = apply { this.size = size }

        /**
         * Array of provider/source specific tags for this data, used for implementing data owner
         * conditional access controls to restrict access to the data.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /**
         * The time at which this document was most recently updated, represented in UTC ISO format.
         */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The person or software entity who updated this document most recently. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.writeAcl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [ScsEntity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScsEntity =
            ScsEntity(
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

    fun validate(): ScsEntity = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is ScsEntity &&
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
        "ScsEntity{id=$id, attachment=$attachment, classificationMarking=$classificationMarking, createdAt=$createdAt, createdBy=$createdBy, deleteOn=$deleteOn, description=$description, filename=$filename, filePath=$filePath, keywords=$keywords, parentPath=$parentPath, pathType=$pathType, readAcl=$readAcl, size=$size, tags=$tags, updatedAt=$updatedAt, updatedBy=$updatedBy, writeAcl=$writeAcl, additionalProperties=$additionalProperties}"
}
