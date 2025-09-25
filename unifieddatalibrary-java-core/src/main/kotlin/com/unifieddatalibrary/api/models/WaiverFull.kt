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
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Collection documenting operational waivers that have been issued for the Site associated with
 * this record.
 */
class WaiverFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expirationDate: JsonField<OffsetDateTime>,
    private val hasExpired: JsonField<Boolean>,
    private val issueDate: JsonField<OffsetDateTime>,
    private val issuerName: JsonField<String>,
    private val requesterName: JsonField<String>,
    private val requesterPhoneNumber: JsonField<String>,
    private val requestingUnit: JsonField<String>,
    private val waiverAppliesTo: JsonField<String>,
    private val waiverDescription: JsonField<String>,
    private val waiverLastChangedBy: JsonField<String>,
    private val waiverLastChangedDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expirationDate")
        @ExcludeMissing
        expirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hasExpired")
        @ExcludeMissing
        hasExpired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("issueDate")
        @ExcludeMissing
        issueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issuerName")
        @ExcludeMissing
        issuerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requesterName")
        @ExcludeMissing
        requesterName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requesterPhoneNumber")
        @ExcludeMissing
        requesterPhoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestingUnit")
        @ExcludeMissing
        requestingUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waiverAppliesTo")
        @ExcludeMissing
        waiverAppliesTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waiverDescription")
        @ExcludeMissing
        waiverDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waiverLastChangedBy")
        @ExcludeMissing
        waiverLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waiverLastChangedDate")
        @ExcludeMissing
        waiverLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        expirationDate,
        hasExpired,
        issueDate,
        issuerName,
        requesterName,
        requesterPhoneNumber,
        requestingUnit,
        waiverAppliesTo,
        waiverDescription,
        waiverLastChangedBy,
        waiverLastChangedDate,
        mutableMapOf(),
    )

    /**
     * The expiration date of this waiver, in ISO8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expirationDate(): Optional<OffsetDateTime> = expirationDate.getOptional("expirationDate")

    /**
     * Boolean indicating whether or not this waiver has expired.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hasExpired(): Optional<Boolean> = hasExpired.getOptional("hasExpired")

    /**
     * The issue date of this waiver, in ISO8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun issueDate(): Optional<OffsetDateTime> = issueDate.getOptional("issueDate")

    /**
     * The name of the person who issued this waiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun issuerName(): Optional<String> = issuerName.getOptional("issuerName")

    /**
     * The name of the person requesting this waiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requesterName(): Optional<String> = requesterName.getOptional("requesterName")

    /**
     * The phone number of the person requesting this waiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requesterPhoneNumber(): Optional<String> =
        requesterPhoneNumber.getOptional("requesterPhoneNumber")

    /**
     * The unit requesting this waiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requestingUnit(): Optional<String> = requestingUnit.getOptional("requestingUnit")

    /**
     * Description of the entities to which this waiver applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waiverAppliesTo(): Optional<String> = waiverAppliesTo.getOptional("waiverAppliesTo")

    /**
     * The description of this waiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waiverDescription(): Optional<String> = waiverDescription.getOptional("waiverDescription")

    /**
     * The name of the person who made the most recent change to this Waiver data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waiverLastChangedBy(): Optional<String> =
        waiverLastChangedBy.getOptional("waiverLastChangedBy")

    /**
     * The datetime of the most recent change made to this waiver data, in ISO8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waiverLastChangedDate(): Optional<OffsetDateTime> =
        waiverLastChangedDate.getOptional("waiverLastChangedDate")

    /**
     * Returns the raw JSON value of [expirationDate].
     *
     * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expirationDate")
    @ExcludeMissing
    fun _expirationDate(): JsonField<OffsetDateTime> = expirationDate

    /**
     * Returns the raw JSON value of [hasExpired].
     *
     * Unlike [hasExpired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasExpired") @ExcludeMissing fun _hasExpired(): JsonField<Boolean> = hasExpired

    /**
     * Returns the raw JSON value of [issueDate].
     *
     * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issueDate")
    @ExcludeMissing
    fun _issueDate(): JsonField<OffsetDateTime> = issueDate

    /**
     * Returns the raw JSON value of [issuerName].
     *
     * Unlike [issuerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuerName") @ExcludeMissing fun _issuerName(): JsonField<String> = issuerName

    /**
     * Returns the raw JSON value of [requesterName].
     *
     * Unlike [requesterName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requesterName")
    @ExcludeMissing
    fun _requesterName(): JsonField<String> = requesterName

    /**
     * Returns the raw JSON value of [requesterPhoneNumber].
     *
     * Unlike [requesterPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requesterPhoneNumber")
    @ExcludeMissing
    fun _requesterPhoneNumber(): JsonField<String> = requesterPhoneNumber

    /**
     * Returns the raw JSON value of [requestingUnit].
     *
     * Unlike [requestingUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestingUnit")
    @ExcludeMissing
    fun _requestingUnit(): JsonField<String> = requestingUnit

    /**
     * Returns the raw JSON value of [waiverAppliesTo].
     *
     * Unlike [waiverAppliesTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("waiverAppliesTo")
    @ExcludeMissing
    fun _waiverAppliesTo(): JsonField<String> = waiverAppliesTo

    /**
     * Returns the raw JSON value of [waiverDescription].
     *
     * Unlike [waiverDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("waiverDescription")
    @ExcludeMissing
    fun _waiverDescription(): JsonField<String> = waiverDescription

    /**
     * Returns the raw JSON value of [waiverLastChangedBy].
     *
     * Unlike [waiverLastChangedBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("waiverLastChangedBy")
    @ExcludeMissing
    fun _waiverLastChangedBy(): JsonField<String> = waiverLastChangedBy

    /**
     * Returns the raw JSON value of [waiverLastChangedDate].
     *
     * Unlike [waiverLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("waiverLastChangedDate")
    @ExcludeMissing
    fun _waiverLastChangedDate(): JsonField<OffsetDateTime> = waiverLastChangedDate

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

        /** Returns a mutable builder for constructing an instance of [WaiverFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WaiverFull]. */
    class Builder internal constructor() {

        private var expirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hasExpired: JsonField<Boolean> = JsonMissing.of()
        private var issueDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var issuerName: JsonField<String> = JsonMissing.of()
        private var requesterName: JsonField<String> = JsonMissing.of()
        private var requesterPhoneNumber: JsonField<String> = JsonMissing.of()
        private var requestingUnit: JsonField<String> = JsonMissing.of()
        private var waiverAppliesTo: JsonField<String> = JsonMissing.of()
        private var waiverDescription: JsonField<String> = JsonMissing.of()
        private var waiverLastChangedBy: JsonField<String> = JsonMissing.of()
        private var waiverLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(waiverFull: WaiverFull) = apply {
            expirationDate = waiverFull.expirationDate
            hasExpired = waiverFull.hasExpired
            issueDate = waiverFull.issueDate
            issuerName = waiverFull.issuerName
            requesterName = waiverFull.requesterName
            requesterPhoneNumber = waiverFull.requesterPhoneNumber
            requestingUnit = waiverFull.requestingUnit
            waiverAppliesTo = waiverFull.waiverAppliesTo
            waiverDescription = waiverFull.waiverDescription
            waiverLastChangedBy = waiverFull.waiverLastChangedBy
            waiverLastChangedDate = waiverFull.waiverLastChangedDate
            additionalProperties = waiverFull.additionalProperties.toMutableMap()
        }

        /** The expiration date of this waiver, in ISO8601 UTC format with millisecond precision. */
        fun expirationDate(expirationDate: OffsetDateTime) =
            expirationDate(JsonField.of(expirationDate))

        /**
         * Sets [Builder.expirationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationDate(expirationDate: JsonField<OffsetDateTime>) = apply {
            this.expirationDate = expirationDate
        }

        /** Boolean indicating whether or not this waiver has expired. */
        fun hasExpired(hasExpired: Boolean) = hasExpired(JsonField.of(hasExpired))

        /**
         * Sets [Builder.hasExpired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasExpired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasExpired(hasExpired: JsonField<Boolean>) = apply { this.hasExpired = hasExpired }

        /** The issue date of this waiver, in ISO8601 UTC format with millisecond precision. */
        fun issueDate(issueDate: OffsetDateTime) = issueDate(JsonField.of(issueDate))

        /**
         * Sets [Builder.issueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issueDate(issueDate: JsonField<OffsetDateTime>) = apply { this.issueDate = issueDate }

        /** The name of the person who issued this waiver. */
        fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

        /**
         * Sets [Builder.issuerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuerName(issuerName: JsonField<String>) = apply { this.issuerName = issuerName }

        /** The name of the person requesting this waiver. */
        fun requesterName(requesterName: String) = requesterName(JsonField.of(requesterName))

        /**
         * Sets [Builder.requesterName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requesterName(requesterName: JsonField<String>) = apply {
            this.requesterName = requesterName
        }

        /** The phone number of the person requesting this waiver. */
        fun requesterPhoneNumber(requesterPhoneNumber: String) =
            requesterPhoneNumber(JsonField.of(requesterPhoneNumber))

        /**
         * Sets [Builder.requesterPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requesterPhoneNumber(requesterPhoneNumber: JsonField<String>) = apply {
            this.requesterPhoneNumber = requesterPhoneNumber
        }

        /** The unit requesting this waiver. */
        fun requestingUnit(requestingUnit: String) = requestingUnit(JsonField.of(requestingUnit))

        /**
         * Sets [Builder.requestingUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestingUnit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestingUnit(requestingUnit: JsonField<String>) = apply {
            this.requestingUnit = requestingUnit
        }

        /** Description of the entities to which this waiver applies. */
        fun waiverAppliesTo(waiverAppliesTo: String) =
            waiverAppliesTo(JsonField.of(waiverAppliesTo))

        /**
         * Sets [Builder.waiverAppliesTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waiverAppliesTo] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waiverAppliesTo(waiverAppliesTo: JsonField<String>) = apply {
            this.waiverAppliesTo = waiverAppliesTo
        }

        /** The description of this waiver. */
        fun waiverDescription(waiverDescription: String) =
            waiverDescription(JsonField.of(waiverDescription))

        /**
         * Sets [Builder.waiverDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waiverDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waiverDescription(waiverDescription: JsonField<String>) = apply {
            this.waiverDescription = waiverDescription
        }

        /** The name of the person who made the most recent change to this Waiver data. */
        fun waiverLastChangedBy(waiverLastChangedBy: String) =
            waiverLastChangedBy(JsonField.of(waiverLastChangedBy))

        /**
         * Sets [Builder.waiverLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waiverLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waiverLastChangedBy(waiverLastChangedBy: JsonField<String>) = apply {
            this.waiverLastChangedBy = waiverLastChangedBy
        }

        /**
         * The datetime of the most recent change made to this waiver data, in ISO8601 UTC format
         * with millisecond precision.
         */
        fun waiverLastChangedDate(waiverLastChangedDate: OffsetDateTime) =
            waiverLastChangedDate(JsonField.of(waiverLastChangedDate))

        /**
         * Sets [Builder.waiverLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waiverLastChangedDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun waiverLastChangedDate(waiverLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.waiverLastChangedDate = waiverLastChangedDate
        }

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
         * Returns an immutable instance of [WaiverFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WaiverFull =
            WaiverFull(
                expirationDate,
                hasExpired,
                issueDate,
                issuerName,
                requesterName,
                requesterPhoneNumber,
                requestingUnit,
                waiverAppliesTo,
                waiverDescription,
                waiverLastChangedBy,
                waiverLastChangedDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WaiverFull = apply {
        if (validated) {
            return@apply
        }

        expirationDate()
        hasExpired()
        issueDate()
        issuerName()
        requesterName()
        requesterPhoneNumber()
        requestingUnit()
        waiverAppliesTo()
        waiverDescription()
        waiverLastChangedBy()
        waiverLastChangedDate()
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
        (if (expirationDate.asKnown().isPresent) 1 else 0) +
            (if (hasExpired.asKnown().isPresent) 1 else 0) +
            (if (issueDate.asKnown().isPresent) 1 else 0) +
            (if (issuerName.asKnown().isPresent) 1 else 0) +
            (if (requesterName.asKnown().isPresent) 1 else 0) +
            (if (requesterPhoneNumber.asKnown().isPresent) 1 else 0) +
            (if (requestingUnit.asKnown().isPresent) 1 else 0) +
            (if (waiverAppliesTo.asKnown().isPresent) 1 else 0) +
            (if (waiverDescription.asKnown().isPresent) 1 else 0) +
            (if (waiverLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (waiverLastChangedDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WaiverFull &&
            expirationDate == other.expirationDate &&
            hasExpired == other.hasExpired &&
            issueDate == other.issueDate &&
            issuerName == other.issuerName &&
            requesterName == other.requesterName &&
            requesterPhoneNumber == other.requesterPhoneNumber &&
            requestingUnit == other.requestingUnit &&
            waiverAppliesTo == other.waiverAppliesTo &&
            waiverDescription == other.waiverDescription &&
            waiverLastChangedBy == other.waiverLastChangedBy &&
            waiverLastChangedDate == other.waiverLastChangedDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            expirationDate,
            hasExpired,
            issueDate,
            issuerName,
            requesterName,
            requesterPhoneNumber,
            requestingUnit,
            waiverAppliesTo,
            waiverDescription,
            waiverLastChangedBy,
            waiverLastChangedDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WaiverFull{expirationDate=$expirationDate, hasExpired=$hasExpired, issueDate=$issueDate, issuerName=$issuerName, requesterName=$requesterName, requesterPhoneNumber=$requesterPhoneNumber, requestingUnit=$requestingUnit, waiverAppliesTo=$waiverAppliesTo, waiverDescription=$waiverDescription, waiverLastChangedBy=$waiverLastChangedBy, waiverLastChangedDate=$waiverLastChangedDate, additionalProperties=$additionalProperties}"
}
