// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class RelatedDocumentFull
private constructor(
    private val dataSourceRefs: JsonField<List<SofDataSourceRefFull>>,
    private val documentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataSourceRefs")
        @ExcludeMissing
        dataSourceRefs: JsonField<List<SofDataSourceRefFull>> = JsonMissing.of(),
        @JsonProperty("documentId") @ExcludeMissing documentId: JsonField<String> = JsonMissing.of(),
    ) : this(dataSourceRefs, documentId, mutableMapOf())

    /**
     * List of data sources related to this document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataSourceRefs(): Optional<List<SofDataSourceRefFull>> =
        dataSourceRefs.getOptional("dataSourceRefs")

    /**
     * The document id of the related document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun documentId(): Optional<String> = documentId.getOptional("documentId")

    /**
     * Returns the raw JSON value of [dataSourceRefs].
     *
     * Unlike [dataSourceRefs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSourceRefs")
    @ExcludeMissing
    fun _dataSourceRefs(): JsonField<List<SofDataSourceRefFull>> = dataSourceRefs

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentId") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

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

        /** Returns a mutable builder for constructing an instance of [RelatedDocumentFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RelatedDocumentFull]. */
    class Builder internal constructor() {

        private var dataSourceRefs: JsonField<MutableList<SofDataSourceRefFull>>? = null
        private var documentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(relatedDocumentFull: RelatedDocumentFull) = apply {
            dataSourceRefs = relatedDocumentFull.dataSourceRefs.map { it.toMutableList() }
            documentId = relatedDocumentFull.documentId
            additionalProperties = relatedDocumentFull.additionalProperties.toMutableMap()
        }

        /** List of data sources related to this document. */
        fun dataSourceRefs(dataSourceRefs: List<SofDataSourceRefFull>) =
            dataSourceRefs(JsonField.of(dataSourceRefs))

        /**
         * Sets [Builder.dataSourceRefs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceRefs] with a well-typed
         * `List<SofDataSourceRefFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun dataSourceRefs(dataSourceRefs: JsonField<List<SofDataSourceRefFull>>) = apply {
            this.dataSourceRefs = dataSourceRefs.map { it.toMutableList() }
        }

        /**
         * Adds a single [SofDataSourceRefFull] to [dataSourceRefs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataSourceRef(dataSourceRef: SofDataSourceRefFull) = apply {
            dataSourceRefs =
                (dataSourceRefs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dataSourceRefs", it).add(dataSourceRef)
                }
        }

        /** The document id of the related document. */
        fun documentId(documentId: String) = documentId(JsonField.of(documentId))

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [RelatedDocumentFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RelatedDocumentFull =
            RelatedDocumentFull(
                (dataSourceRefs ?: JsonMissing.of()).map { it.toImmutable() },
                documentId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RelatedDocumentFull = apply {
        if (validated) {
            return@apply
        }

        dataSourceRefs().ifPresent { it.forEach { it.validate() } }
        documentId()
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
        (dataSourceRefs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (documentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RelatedDocumentFull &&
            dataSourceRefs == other.dataSourceRefs &&
            documentId == other.documentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataSourceRefs, documentId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RelatedDocumentFull{dataSourceRefs=$dataSourceRefs, documentId=$documentId, additionalProperties=$additionalProperties}"
}
