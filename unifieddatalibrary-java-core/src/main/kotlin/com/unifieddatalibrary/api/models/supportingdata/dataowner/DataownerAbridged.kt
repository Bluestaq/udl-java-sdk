// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.dataowner

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Information pertaining to UDL data owners. */
class DataownerAbridged
private constructor(
    private val classificationMarking: JsonField<String>,
    private val description: JsonField<String>,
    private val doName: JsonField<String>,
    private val idContact: JsonField<String>,
    private val source: JsonField<String>,
    private val comingSoon: JsonField<Boolean>,
    private val control: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val dataType: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val ownerType: JsonField<String>,
    private val provider: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("doName") @ExcludeMissing doName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idContact") @ExcludeMissing idContact: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comingSoon")
        @ExcludeMissing
        comingSoon: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("control") @ExcludeMissing control: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataType") @ExcludeMissing dataType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ownerType") @ExcludeMissing ownerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        description,
        doName,
        idContact,
        source,
        comingSoon,
        control,
        countryCode,
        dataType,
        enabled,
        ownerType,
        provider,
        mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Description of this data owner.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The name of the data owner.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun doName(): String = doName.getRequired("doName")

    /**
     * Unique identifier of the contact for this data owner.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idContact(): String = idContact.getRequired("idContact")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Boolean indicating if the data owner is coming soon or not yet available.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun comingSoon(): Optional<Boolean> = comingSoon.getOptional("comingSoon")

    /**
     * Optional control required to access this data type from this owner.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun control(): Optional<String> = control.getOptional("control")

    /**
     * The country code. This value is typically the ISO 3166 Alpha-2 two-character country code,
     * however it can also represent various consortiums that do not appear in the ISO document. The
     * code must correspond to an existing country in the UDL’s country API. Call udl/country/{code}
     * to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for
     * the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Type of data this data owner owns (e.g. EPHEMERIS, IMAGERY, MANEUVER, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataType(): Optional<String> = dataType.getOptional("dataType")

    /**
     * Boolean indicating if the data owner is enabled (if not enabled, they should not appear on
     * the data products screen on the storefront).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Type of organization which this data owner belongs to (e.g. Commercial, Government, Academic,
     * Consortium, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ownerType(): Optional<String> = ownerType.getOptional("ownerType")

    /**
     * Organization name for the data provider.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun provider(): Optional<String> = provider.getOptional("provider")

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [doName].
     *
     * Unlike [doName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doName") @ExcludeMissing fun _doName(): JsonField<String> = doName

    /**
     * Returns the raw JSON value of [idContact].
     *
     * Unlike [idContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idContact") @ExcludeMissing fun _idContact(): JsonField<String> = idContact

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [comingSoon].
     *
     * Unlike [comingSoon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comingSoon") @ExcludeMissing fun _comingSoon(): JsonField<Boolean> = comingSoon

    /**
     * Returns the raw JSON value of [control].
     *
     * Unlike [control], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("control") @ExcludeMissing fun _control(): JsonField<String> = control

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataType") @ExcludeMissing fun _dataType(): JsonField<String> = dataType

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [ownerType].
     *
     * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownerType") @ExcludeMissing fun _ownerType(): JsonField<String> = ownerType

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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

        /**
         * Returns a mutable builder for constructing an instance of [DataownerAbridged].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .description()
         * .doName()
         * .idContact()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataownerAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var doName: JsonField<String>? = null
        private var idContact: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var comingSoon: JsonField<Boolean> = JsonMissing.of()
        private var control: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var dataType: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var ownerType: JsonField<String> = JsonMissing.of()
        private var provider: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataownerAbridged: DataownerAbridged) = apply {
            classificationMarking = dataownerAbridged.classificationMarking
            description = dataownerAbridged.description
            doName = dataownerAbridged.doName
            idContact = dataownerAbridged.idContact
            source = dataownerAbridged.source
            comingSoon = dataownerAbridged.comingSoon
            control = dataownerAbridged.control
            countryCode = dataownerAbridged.countryCode
            dataType = dataownerAbridged.dataType
            enabled = dataownerAbridged.enabled
            ownerType = dataownerAbridged.ownerType
            provider = dataownerAbridged.provider
            additionalProperties = dataownerAbridged.additionalProperties.toMutableMap()
        }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
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

        /** Description of this data owner. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of the data owner. */
        fun doName(doName: String) = doName(JsonField.of(doName))

        /**
         * Sets [Builder.doName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doName(doName: JsonField<String>) = apply { this.doName = doName }

        /** Unique identifier of the contact for this data owner. */
        fun idContact(idContact: String) = idContact(JsonField.of(idContact))

        /**
         * Sets [Builder.idContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idContact] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idContact(idContact: JsonField<String>) = apply { this.idContact = idContact }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Boolean indicating if the data owner is coming soon or not yet available. */
        fun comingSoon(comingSoon: Boolean) = comingSoon(JsonField.of(comingSoon))

        /**
         * Sets [Builder.comingSoon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comingSoon] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun comingSoon(comingSoon: JsonField<Boolean>) = apply { this.comingSoon = comingSoon }

        /** Optional control required to access this data type from this owner. */
        fun control(control: String) = control(JsonField.of(control))

        /**
         * Sets [Builder.control] to an arbitrary JSON value.
         *
         * You should usually call [Builder.control] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun control(control: JsonField<String>) = apply { this.control = control }

        /**
         * The country code. This value is typically the ISO 3166 Alpha-2 two-character country
         * code, however it can also represent various consortiums that do not appear in the ISO
         * document. The code must correspond to an existing country in the UDL’s country API. Call
         * udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code
         * values that exist for the specified country code.
         */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Type of data this data owner owns (e.g. EPHEMERIS, IMAGERY, MANEUVER, etc.). */
        fun dataType(dataType: String) = dataType(JsonField.of(dataType))

        /**
         * Sets [Builder.dataType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dataType(dataType: JsonField<String>) = apply { this.dataType = dataType }

        /**
         * Boolean indicating if the data owner is enabled (if not enabled, they should not appear
         * on the data products screen on the storefront).
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * Type of organization which this data owner belongs to (e.g. Commercial, Government,
         * Academic, Consortium, etc.).
         */
        fun ownerType(ownerType: String) = ownerType(JsonField.of(ownerType))

        /**
         * Sets [Builder.ownerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerType(ownerType: JsonField<String>) = apply { this.ownerType = ownerType }

        /** Organization name for the data provider. */
        fun provider(provider: String) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
         * Returns an immutable instance of [DataownerAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .description()
         * .doName()
         * .idContact()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataownerAbridged =
            DataownerAbridged(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("description", description),
                checkRequired("doName", doName),
                checkRequired("idContact", idContact),
                checkRequired("source", source),
                comingSoon,
                control,
                countryCode,
                dataType,
                enabled,
                ownerType,
                provider,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataownerAbridged = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        description()
        doName()
        idContact()
        source()
        comingSoon()
        control()
        countryCode()
        dataType()
        enabled()
        ownerType()
        provider()
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
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (doName.asKnown().isPresent) 1 else 0) +
            (if (idContact.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (comingSoon.asKnown().isPresent) 1 else 0) +
            (if (control.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (dataType.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (ownerType.asKnown().isPresent) 1 else 0) +
            (if (provider.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataownerAbridged &&
            classificationMarking == other.classificationMarking &&
            description == other.description &&
            doName == other.doName &&
            idContact == other.idContact &&
            source == other.source &&
            comingSoon == other.comingSoon &&
            control == other.control &&
            countryCode == other.countryCode &&
            dataType == other.dataType &&
            enabled == other.enabled &&
            ownerType == other.ownerType &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            description,
            doName,
            idContact,
            source,
            comingSoon,
            control,
            countryCode,
            dataType,
            enabled,
            ownerType,
            provider,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataownerAbridged{classificationMarking=$classificationMarking, description=$description, doName=$doName, idContact=$idContact, source=$source, comingSoon=$comingSoon, control=$control, countryCode=$countryCode, dataType=$dataType, enabled=$enabled, ownerType=$ownerType, provider=$provider, additionalProperties=$additionalProperties}"
}
