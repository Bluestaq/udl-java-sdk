// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

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

@Deprecated("deprecated")
class FileData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val targetName: JsonField<String>,
    private val targetPath: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("targetName")
        @ExcludeMissing
        targetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetPath")
        @ExcludeMissing
        targetPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, attributes, targetName, targetPath, type, mutableMapOf())

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetName(): Optional<String> = targetName.getOptional("targetName")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetPath(): Optional<String> = targetPath.getOptional("targetPath")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [targetName].
     *
     * Unlike [targetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetName") @ExcludeMissing fun _targetName(): JsonField<String> = targetName

    /**
     * Returns the raw JSON value of [targetPath].
     *
     * Unlike [targetPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetPath") @ExcludeMissing fun _targetPath(): JsonField<String> = targetPath

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<Type> = type

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

        /** Returns a mutable builder for constructing an instance of [FileData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileData]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var targetName: JsonField<String> = JsonMissing.of()
        private var targetPath: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileData: FileData) = apply {
            id = fileData.id
            attributes = fileData.attributes
            targetName = fileData.targetName
            targetPath = fileData.targetPath
            type = fileData.type
            additionalProperties = fileData.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        @Deprecated("deprecated")
        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun targetName(targetName: String) = targetName(JsonField.of(targetName))

        /**
         * Sets [Builder.targetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetName(targetName: JsonField<String>) = apply { this.targetName = targetName }

        fun targetPath(targetPath: String) = targetPath(JsonField.of(targetPath))

        /**
         * Sets [Builder.targetPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetPath(targetPath: JsonField<String>) = apply { this.targetPath = targetPath }

        @Deprecated("deprecated") fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated") fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [FileData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileData =
            FileData(
                id,
                attributes,
                targetName,
                targetPath,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileData = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().ifPresent { it.validate() }
        targetName()
        targetPath()
        type().ifPresent { it.validate() }
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
            (attributes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (targetName.asKnown().isPresent) 1 else 0) +
            (if (targetPath.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    @Deprecated("deprecated")
    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val classification: JsonField<String>,
        private val classificationMarking: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val createdDate: JsonField<String>,
        private val deleteOn: JsonField<Long>,
        private val description: JsonField<String>,
        private val docTitle: JsonField<String>,
        private val docType: JsonField<String>,
        private val doi: JsonField<List<String>>,
        private val ellipseLat: JsonField<Float>,
        private val ellipseLon: JsonField<Float>,
        private val fileName: JsonField<String>,
        private val intrinsicTitle: JsonField<String>,
        private val keywords: JsonField<String>,
        private val mediaTitle: JsonField<String>,
        private val metaInfo: JsonField<String>,
        private val milgrid: JsonField<String>,
        private val milgridLat: JsonField<Float>,
        private val milgridLon: JsonField<Float>,
        private val modifiedBy: JsonField<String>,
        private val modifiedDate: JsonField<String>,
        private val name: JsonField<String>,
        private val path: JsonField<String>,
        private val read: JsonField<String>,
        private val searchable: JsonField<Boolean>,
        private val searchAfter: JsonField<String>,
        private val serialNumber: JsonField<String>,
        private val size: JsonField<Long>,
        private val tags: JsonField<List<String>>,
        private val write: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("classification")
            @ExcludeMissing
            classification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdDate")
            @ExcludeMissing
            createdDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deleteOn") @ExcludeMissing deleteOn: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("docTitle")
            @ExcludeMissing
            docTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("docType") @ExcludeMissing docType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("doi") @ExcludeMissing doi: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ellipseLat")
            @ExcludeMissing
            ellipseLat: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("ellipseLon")
            @ExcludeMissing
            ellipseLon: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("fileName")
            @ExcludeMissing
            fileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("intrinsicTitle")
            @ExcludeMissing
            intrinsicTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("keywords")
            @ExcludeMissing
            keywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mediaTitle")
            @ExcludeMissing
            mediaTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metaInfo")
            @ExcludeMissing
            metaInfo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("milgrid") @ExcludeMissing milgrid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("milgridLat")
            @ExcludeMissing
            milgridLat: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("milgridLon")
            @ExcludeMissing
            milgridLon: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("modifiedBy")
            @ExcludeMissing
            modifiedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modifiedDate")
            @ExcludeMissing
            modifiedDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("read") @ExcludeMissing read: JsonField<String> = JsonMissing.of(),
            @JsonProperty("searchable")
            @ExcludeMissing
            searchable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("searchAfter")
            @ExcludeMissing
            searchAfter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serialNumber")
            @ExcludeMissing
            serialNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("write") @ExcludeMissing write: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            classification,
            classificationMarking,
            createdBy,
            createdDate,
            deleteOn,
            description,
            docTitle,
            docType,
            doi,
            ellipseLat,
            ellipseLon,
            fileName,
            intrinsicTitle,
            keywords,
            mediaTitle,
            metaInfo,
            milgrid,
            milgridLat,
            milgridLon,
            modifiedBy,
            modifiedDate,
            name,
            path,
            read,
            searchable,
            searchAfter,
            serialNumber,
            size,
            tags,
            write,
            mutableMapOf(),
        )

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun classification(): Optional<String> = classification.getOptional("classification")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): Optional<String> =
            classificationMarking.getOptional("classificationMarking")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdDate(): Optional<String> = createdDate.getOptional("createdDate")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deleteOn(): Optional<Long> = deleteOn.getOptional("deleteOn")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun docTitle(): Optional<String> = docTitle.getOptional("docTitle")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun docType(): Optional<String> = docType.getOptional("docType")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun doi(): Optional<List<String>> = doi.getOptional("doi")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ellipseLat(): Optional<Float> = ellipseLat.getOptional("ellipseLat")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ellipseLon(): Optional<Float> = ellipseLon.getOptional("ellipseLon")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fileName(): Optional<String> = fileName.getOptional("fileName")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun intrinsicTitle(): Optional<String> = intrinsicTitle.getOptional("intrinsicTitle")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun keywords(): Optional<String> = keywords.getOptional("keywords")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mediaTitle(): Optional<String> = mediaTitle.getOptional("mediaTitle")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metaInfo(): Optional<String> = metaInfo.getOptional("metaInfo")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milgrid(): Optional<String> = milgrid.getOptional("milgrid")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milgridLat(): Optional<Float> = milgridLat.getOptional("milgridLat")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milgridLon(): Optional<Float> = milgridLon.getOptional("milgridLon")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun modifiedBy(): Optional<String> = modifiedBy.getOptional("modifiedBy")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun modifiedDate(): Optional<String> = modifiedDate.getOptional("modifiedDate")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun path(): Optional<String> = path.getOptional("path")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun read(): Optional<String> = read.getOptional("read")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun searchable(): Optional<Boolean> = searchable.getOptional("searchable")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun searchAfter(): Optional<String> = searchAfter.getOptional("searchAfter")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun size(): Optional<Long> = size.getOptional("size")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun write(): Optional<String> = write.getOptional("write")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [classification].
         *
         * Unlike [classification], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("classification")
        @ExcludeMissing
        fun _classification(): JsonField<String> = classification

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
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [createdDate].
         *
         * Unlike [createdDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdDate")
        @ExcludeMissing
        fun _createdDate(): JsonField<String> = createdDate

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
         * Returns the raw JSON value of [docTitle].
         *
         * Unlike [docTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docTitle") @ExcludeMissing fun _docTitle(): JsonField<String> = docTitle

        /**
         * Returns the raw JSON value of [docType].
         *
         * Unlike [docType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docType") @ExcludeMissing fun _docType(): JsonField<String> = docType

        /**
         * Returns the raw JSON value of [doi].
         *
         * Unlike [doi], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("doi") @ExcludeMissing fun _doi(): JsonField<List<String>> = doi

        /**
         * Returns the raw JSON value of [ellipseLat].
         *
         * Unlike [ellipseLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ellipseLat") @ExcludeMissing fun _ellipseLat(): JsonField<Float> = ellipseLat

        /**
         * Returns the raw JSON value of [ellipseLon].
         *
         * Unlike [ellipseLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ellipseLon") @ExcludeMissing fun _ellipseLon(): JsonField<Float> = ellipseLon

        /**
         * Returns the raw JSON value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

        /**
         * Returns the raw JSON value of [intrinsicTitle].
         *
         * Unlike [intrinsicTitle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("intrinsicTitle")
        @ExcludeMissing
        fun _intrinsicTitle(): JsonField<String> = intrinsicTitle

        /**
         * Returns the raw JSON value of [keywords].
         *
         * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keywords") @ExcludeMissing fun _keywords(): JsonField<String> = keywords

        /**
         * Returns the raw JSON value of [mediaTitle].
         *
         * Unlike [mediaTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mediaTitle")
        @ExcludeMissing
        fun _mediaTitle(): JsonField<String> = mediaTitle

        /**
         * Returns the raw JSON value of [metaInfo].
         *
         * Unlike [metaInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metaInfo") @ExcludeMissing fun _metaInfo(): JsonField<String> = metaInfo

        /**
         * Returns the raw JSON value of [milgrid].
         *
         * Unlike [milgrid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milgrid") @ExcludeMissing fun _milgrid(): JsonField<String> = milgrid

        /**
         * Returns the raw JSON value of [milgridLat].
         *
         * Unlike [milgridLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milgridLat") @ExcludeMissing fun _milgridLat(): JsonField<Float> = milgridLat

        /**
         * Returns the raw JSON value of [milgridLon].
         *
         * Unlike [milgridLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milgridLon") @ExcludeMissing fun _milgridLon(): JsonField<Float> = milgridLon

        /**
         * Returns the raw JSON value of [modifiedBy].
         *
         * Unlike [modifiedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modifiedBy")
        @ExcludeMissing
        fun _modifiedBy(): JsonField<String> = modifiedBy

        /**
         * Returns the raw JSON value of [modifiedDate].
         *
         * Unlike [modifiedDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("modifiedDate")
        @ExcludeMissing
        fun _modifiedDate(): JsonField<String> = modifiedDate

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [read].
         *
         * Unlike [read], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read") @ExcludeMissing fun _read(): JsonField<String> = read

        /**
         * Returns the raw JSON value of [searchable].
         *
         * Unlike [searchable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("searchable")
        @ExcludeMissing
        fun _searchable(): JsonField<Boolean> = searchable

        /**
         * Returns the raw JSON value of [searchAfter].
         *
         * Unlike [searchAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("searchAfter")
        @ExcludeMissing
        fun _searchAfter(): JsonField<String> = searchAfter

        /**
         * Returns the raw JSON value of [serialNumber].
         *
         * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("serialNumber")
        @ExcludeMissing
        fun _serialNumber(): JsonField<String> = serialNumber

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [write].
         *
         * Unlike [write], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("write") @ExcludeMissing fun _write(): JsonField<String> = write

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var classification: JsonField<String> = JsonMissing.of()
            private var classificationMarking: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var createdDate: JsonField<String> = JsonMissing.of()
            private var deleteOn: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var docTitle: JsonField<String> = JsonMissing.of()
            private var docType: JsonField<String> = JsonMissing.of()
            private var doi: JsonField<MutableList<String>>? = null
            private var ellipseLat: JsonField<Float> = JsonMissing.of()
            private var ellipseLon: JsonField<Float> = JsonMissing.of()
            private var fileName: JsonField<String> = JsonMissing.of()
            private var intrinsicTitle: JsonField<String> = JsonMissing.of()
            private var keywords: JsonField<String> = JsonMissing.of()
            private var mediaTitle: JsonField<String> = JsonMissing.of()
            private var metaInfo: JsonField<String> = JsonMissing.of()
            private var milgrid: JsonField<String> = JsonMissing.of()
            private var milgridLat: JsonField<Float> = JsonMissing.of()
            private var milgridLon: JsonField<Float> = JsonMissing.of()
            private var modifiedBy: JsonField<String> = JsonMissing.of()
            private var modifiedDate: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var path: JsonField<String> = JsonMissing.of()
            private var read: JsonField<String> = JsonMissing.of()
            private var searchable: JsonField<Boolean> = JsonMissing.of()
            private var searchAfter: JsonField<String> = JsonMissing.of()
            private var serialNumber: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var write: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attributes: Attributes) = apply {
                id = attributes.id
                classification = attributes.classification
                classificationMarking = attributes.classificationMarking
                createdBy = attributes.createdBy
                createdDate = attributes.createdDate
                deleteOn = attributes.deleteOn
                description = attributes.description
                docTitle = attributes.docTitle
                docType = attributes.docType
                doi = attributes.doi.map { it.toMutableList() }
                ellipseLat = attributes.ellipseLat
                ellipseLon = attributes.ellipseLon
                fileName = attributes.fileName
                intrinsicTitle = attributes.intrinsicTitle
                keywords = attributes.keywords
                mediaTitle = attributes.mediaTitle
                metaInfo = attributes.metaInfo
                milgrid = attributes.milgrid
                milgridLat = attributes.milgridLat
                milgridLon = attributes.milgridLon
                modifiedBy = attributes.modifiedBy
                modifiedDate = attributes.modifiedDate
                name = attributes.name
                path = attributes.path
                read = attributes.read
                searchable = attributes.searchable
                searchAfter = attributes.searchAfter
                serialNumber = attributes.serialNumber
                size = attributes.size
                tags = attributes.tags.map { it.toMutableList() }
                write = attributes.write
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun classification(classification: String) =
                classification(JsonField.of(classification))

            /**
             * Sets [Builder.classification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classification] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classification(classification: JsonField<String>) = apply {
                this.classification = classification
            }

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

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun createdDate(createdDate: String) = createdDate(JsonField.of(createdDate))

            /**
             * Sets [Builder.createdDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdDate(createdDate: JsonField<String>) = apply {
                this.createdDate = createdDate
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

            fun docTitle(docTitle: String) = docTitle(JsonField.of(docTitle))

            /**
             * Sets [Builder.docTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docTitle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docTitle(docTitle: JsonField<String>) = apply { this.docTitle = docTitle }

            fun docType(docType: String) = docType(JsonField.of(docType))

            /**
             * Sets [Builder.docType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docType(docType: JsonField<String>) = apply { this.docType = docType }

            fun doi(doi: List<String>) = doi(JsonField.of(doi))

            /**
             * Sets [Builder.doi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doi] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doi(doi: JsonField<List<String>>) = apply {
                this.doi = doi.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.doi].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDoi(doi: String) = apply {
                this.doi =
                    (this.doi ?: JsonField.of(mutableListOf())).also {
                        checkKnown("doi", it).add(doi)
                    }
            }

            fun ellipseLat(ellipseLat: Float) = ellipseLat(JsonField.of(ellipseLat))

            /**
             * Sets [Builder.ellipseLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ellipseLat] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ellipseLat(ellipseLat: JsonField<Float>) = apply { this.ellipseLat = ellipseLat }

            fun ellipseLon(ellipseLon: Float) = ellipseLon(JsonField.of(ellipseLon))

            /**
             * Sets [Builder.ellipseLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ellipseLon] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ellipseLon(ellipseLon: JsonField<Float>) = apply { this.ellipseLon = ellipseLon }

            fun fileName(fileName: String) = fileName(JsonField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

            fun intrinsicTitle(intrinsicTitle: String) =
                intrinsicTitle(JsonField.of(intrinsicTitle))

            /**
             * Sets [Builder.intrinsicTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.intrinsicTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun intrinsicTitle(intrinsicTitle: JsonField<String>) = apply {
                this.intrinsicTitle = intrinsicTitle
            }

            fun keywords(keywords: String) = keywords(JsonField.of(keywords))

            /**
             * Sets [Builder.keywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywords] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keywords(keywords: JsonField<String>) = apply { this.keywords = keywords }

            fun mediaTitle(mediaTitle: String) = mediaTitle(JsonField.of(mediaTitle))

            /**
             * Sets [Builder.mediaTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaTitle(mediaTitle: JsonField<String>) = apply { this.mediaTitle = mediaTitle }

            fun metaInfo(metaInfo: String) = metaInfo(JsonField.of(metaInfo))

            /**
             * Sets [Builder.metaInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metaInfo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metaInfo(metaInfo: JsonField<String>) = apply { this.metaInfo = metaInfo }

            fun milgrid(milgrid: String) = milgrid(JsonField.of(milgrid))

            /**
             * Sets [Builder.milgrid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milgrid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milgrid(milgrid: JsonField<String>) = apply { this.milgrid = milgrid }

            fun milgridLat(milgridLat: Float) = milgridLat(JsonField.of(milgridLat))

            /**
             * Sets [Builder.milgridLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milgridLat] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milgridLat(milgridLat: JsonField<Float>) = apply { this.milgridLat = milgridLat }

            fun milgridLon(milgridLon: Float) = milgridLon(JsonField.of(milgridLon))

            /**
             * Sets [Builder.milgridLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milgridLon] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milgridLon(milgridLon: JsonField<Float>) = apply { this.milgridLon = milgridLon }

            fun modifiedBy(modifiedBy: String) = modifiedBy(JsonField.of(modifiedBy))

            /**
             * Sets [Builder.modifiedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modifiedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modifiedBy(modifiedBy: JsonField<String>) = apply { this.modifiedBy = modifiedBy }

            fun modifiedDate(modifiedDate: String) = modifiedDate(JsonField.of(modifiedDate))

            /**
             * Sets [Builder.modifiedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modifiedDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modifiedDate(modifiedDate: JsonField<String>) = apply {
                this.modifiedDate = modifiedDate
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun read(read: String) = read(JsonField.of(read))

            /**
             * Sets [Builder.read] to an arbitrary JSON value.
             *
             * You should usually call [Builder.read] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun read(read: JsonField<String>) = apply { this.read = read }

            fun searchable(searchable: Boolean) = searchable(JsonField.of(searchable))

            /**
             * Sets [Builder.searchable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun searchable(searchable: JsonField<Boolean>) = apply { this.searchable = searchable }

            fun searchAfter(searchAfter: String) = searchAfter(JsonField.of(searchAfter))

            /**
             * Sets [Builder.searchAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchAfter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun searchAfter(searchAfter: JsonField<String>) = apply {
                this.searchAfter = searchAfter
            }

            fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

            /**
             * Sets [Builder.serialNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serialNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
            }

            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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

            fun write(write: String) = write(JsonField.of(write))

            /**
             * Sets [Builder.write] to an arbitrary JSON value.
             *
             * You should usually call [Builder.write] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun write(write: JsonField<String>) = apply { this.write = write }

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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes =
                Attributes(
                    id,
                    classification,
                    classificationMarking,
                    createdBy,
                    createdDate,
                    deleteOn,
                    description,
                    docTitle,
                    docType,
                    (doi ?: JsonMissing.of()).map { it.toImmutable() },
                    ellipseLat,
                    ellipseLon,
                    fileName,
                    intrinsicTitle,
                    keywords,
                    mediaTitle,
                    metaInfo,
                    milgrid,
                    milgridLat,
                    milgridLon,
                    modifiedBy,
                    modifiedDate,
                    name,
                    path,
                    read,
                    searchable,
                    searchAfter,
                    serialNumber,
                    size,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    write,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            id()
            classification()
            classificationMarking()
            createdBy()
            createdDate()
            deleteOn()
            description()
            docTitle()
            docType()
            doi()
            ellipseLat()
            ellipseLon()
            fileName()
            intrinsicTitle()
            keywords()
            mediaTitle()
            metaInfo()
            milgrid()
            milgridLat()
            milgridLon()
            modifiedBy()
            modifiedDate()
            name()
            path()
            read()
            searchable()
            searchAfter()
            serialNumber()
            size()
            tags()
            write()
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
                (if (classification.asKnown().isPresent) 1 else 0) +
                (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (createdDate.asKnown().isPresent) 1 else 0) +
                (if (deleteOn.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (docTitle.asKnown().isPresent) 1 else 0) +
                (if (docType.asKnown().isPresent) 1 else 0) +
                (doi.asKnown().getOrNull()?.size ?: 0) +
                (if (ellipseLat.asKnown().isPresent) 1 else 0) +
                (if (ellipseLon.asKnown().isPresent) 1 else 0) +
                (if (fileName.asKnown().isPresent) 1 else 0) +
                (if (intrinsicTitle.asKnown().isPresent) 1 else 0) +
                (if (keywords.asKnown().isPresent) 1 else 0) +
                (if (mediaTitle.asKnown().isPresent) 1 else 0) +
                (if (metaInfo.asKnown().isPresent) 1 else 0) +
                (if (milgrid.asKnown().isPresent) 1 else 0) +
                (if (milgridLat.asKnown().isPresent) 1 else 0) +
                (if (milgridLon.asKnown().isPresent) 1 else 0) +
                (if (modifiedBy.asKnown().isPresent) 1 else 0) +
                (if (modifiedDate.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (path.asKnown().isPresent) 1 else 0) +
                (if (read.asKnown().isPresent) 1 else 0) +
                (if (searchable.asKnown().isPresent) 1 else 0) +
                (if (searchAfter.asKnown().isPresent) 1 else 0) +
                (if (serialNumber.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (write.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                id == other.id &&
                classification == other.classification &&
                classificationMarking == other.classificationMarking &&
                createdBy == other.createdBy &&
                createdDate == other.createdDate &&
                deleteOn == other.deleteOn &&
                description == other.description &&
                docTitle == other.docTitle &&
                docType == other.docType &&
                doi == other.doi &&
                ellipseLat == other.ellipseLat &&
                ellipseLon == other.ellipseLon &&
                fileName == other.fileName &&
                intrinsicTitle == other.intrinsicTitle &&
                keywords == other.keywords &&
                mediaTitle == other.mediaTitle &&
                metaInfo == other.metaInfo &&
                milgrid == other.milgrid &&
                milgridLat == other.milgridLat &&
                milgridLon == other.milgridLon &&
                modifiedBy == other.modifiedBy &&
                modifiedDate == other.modifiedDate &&
                name == other.name &&
                path == other.path &&
                read == other.read &&
                searchable == other.searchable &&
                searchAfter == other.searchAfter &&
                serialNumber == other.serialNumber &&
                size == other.size &&
                tags == other.tags &&
                write == other.write &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                classification,
                classificationMarking,
                createdBy,
                createdDate,
                deleteOn,
                description,
                docTitle,
                docType,
                doi,
                ellipseLat,
                ellipseLon,
                fileName,
                intrinsicTitle,
                keywords,
                mediaTitle,
                metaInfo,
                milgrid,
                milgridLat,
                milgridLon,
                modifiedBy,
                modifiedDate,
                name,
                path,
                read,
                searchable,
                searchAfter,
                serialNumber,
                size,
                tags,
                write,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{id=$id, classification=$classification, classificationMarking=$classificationMarking, createdBy=$createdBy, createdDate=$createdDate, deleteOn=$deleteOn, description=$description, docTitle=$docTitle, docType=$docType, doi=$doi, ellipseLat=$ellipseLat, ellipseLon=$ellipseLon, fileName=$fileName, intrinsicTitle=$intrinsicTitle, keywords=$keywords, mediaTitle=$mediaTitle, metaInfo=$metaInfo, milgrid=$milgrid, milgridLat=$milgridLat, milgridLon=$milgridLon, modifiedBy=$modifiedBy, modifiedDate=$modifiedDate, name=$name, path=$path, read=$read, searchable=$searchable, searchAfter=$searchAfter, serialNumber=$serialNumber, size=$size, tags=$tags, write=$write, additionalProperties=$additionalProperties}"
    }

    @Deprecated("deprecated")
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SUMMARY = of("summary")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FILE,
            FOLDER,
            SUMMARY,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILE,
            FOLDER,
            SUMMARY,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                SUMMARY -> Value.SUMMARY
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
                SUMMARY -> Known.SUMMARY
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileData &&
            id == other.id &&
            attributes == other.attributes &&
            targetName == other.targetName &&
            targetPath == other.targetPath &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, attributes, targetName, targetPath, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileData{id=$id, attributes=$attributes, targetName=$targetName, targetPath=$targetPath, type=$type, additionalProperties=$additionalProperties}"
}
