// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** The specialties required to implement this support item. */
class LogisticsSpecialtiesFull
private constructor(
    private val firstName: JsonField<String>,
    private val last4Ssn: JsonField<String>,
    private val lastName: JsonField<String>,
    private val rankCode: JsonField<String>,
    private val roleTypeCode: JsonField<String>,
    private val skillLevel: JsonField<Int>,
    private val specialty: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last4Ssn") @ExcludeMissing last4Ssn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rankCode") @ExcludeMissing rankCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roleTypeCode")
        @ExcludeMissing
        roleTypeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("skillLevel") @ExcludeMissing skillLevel: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("specialty") @ExcludeMissing specialty: JsonField<String> = JsonMissing.of(),
    ) : this(
        firstName,
        last4Ssn,
        lastName,
        rankCode,
        roleTypeCode,
        skillLevel,
        specialty,
        mutableMapOf(),
    )

    /**
     * The first name of the specialist.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The last four digits of the specialist's social security number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun last4Ssn(): Optional<String> = last4Ssn.getOptional("last4Ssn")

    /**
     * The last name of the specialist.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * Military service rank designation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rankCode(): Optional<String> = rankCode.getOptional("rankCode")

    /**
     * Type code that determines role of the mission response team member. TC - Team Chief, TM -
     * Team Member.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun roleTypeCode(): Optional<String> = roleTypeCode.getOptional("roleTypeCode")

    /**
     * Skill level of the mission response team member.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun skillLevel(): Optional<Int> = skillLevel.getOptional("skillLevel")

    /**
     * Indicates where the repairs will be performed, or which shop specialty has been assigned
     * responsibility for correcting the discrepancy. Shop specialties are normally listed in
     * abbreviated format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specialty(): Optional<String> = specialty.getOptional("specialty")

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [last4Ssn].
     *
     * Unlike [last4Ssn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last4Ssn") @ExcludeMissing fun _last4Ssn(): JsonField<String> = last4Ssn

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [rankCode].
     *
     * Unlike [rankCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rankCode") @ExcludeMissing fun _rankCode(): JsonField<String> = rankCode

    /**
     * Returns the raw JSON value of [roleTypeCode].
     *
     * Unlike [roleTypeCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roleTypeCode")
    @ExcludeMissing
    fun _roleTypeCode(): JsonField<String> = roleTypeCode

    /**
     * Returns the raw JSON value of [skillLevel].
     *
     * Unlike [skillLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skillLevel") @ExcludeMissing fun _skillLevel(): JsonField<Int> = skillLevel

    /**
     * Returns the raw JSON value of [specialty].
     *
     * Unlike [specialty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specialty") @ExcludeMissing fun _specialty(): JsonField<String> = specialty

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

        /** Returns a mutable builder for constructing an instance of [LogisticsSpecialtiesFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsSpecialtiesFull]. */
    class Builder internal constructor() {

        private var firstName: JsonField<String> = JsonMissing.of()
        private var last4Ssn: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var rankCode: JsonField<String> = JsonMissing.of()
        private var roleTypeCode: JsonField<String> = JsonMissing.of()
        private var skillLevel: JsonField<Int> = JsonMissing.of()
        private var specialty: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsSpecialtiesFull: LogisticsSpecialtiesFull) = apply {
            firstName = logisticsSpecialtiesFull.firstName
            last4Ssn = logisticsSpecialtiesFull.last4Ssn
            lastName = logisticsSpecialtiesFull.lastName
            rankCode = logisticsSpecialtiesFull.rankCode
            roleTypeCode = logisticsSpecialtiesFull.roleTypeCode
            skillLevel = logisticsSpecialtiesFull.skillLevel
            specialty = logisticsSpecialtiesFull.specialty
            additionalProperties = logisticsSpecialtiesFull.additionalProperties.toMutableMap()
        }

        /** The first name of the specialist. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The last four digits of the specialist's social security number. */
        fun last4Ssn(last4Ssn: String) = last4Ssn(JsonField.of(last4Ssn))

        /**
         * Sets [Builder.last4Ssn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4Ssn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4Ssn(last4Ssn: JsonField<String>) = apply { this.last4Ssn = last4Ssn }

        /** The last name of the specialist. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Military service rank designation. */
        fun rankCode(rankCode: String) = rankCode(JsonField.of(rankCode))

        /**
         * Sets [Builder.rankCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rankCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rankCode(rankCode: JsonField<String>) = apply { this.rankCode = rankCode }

        /**
         * Type code that determines role of the mission response team member. TC - Team Chief, TM -
         * Team Member.
         */
        fun roleTypeCode(roleTypeCode: String) = roleTypeCode(JsonField.of(roleTypeCode))

        /**
         * Sets [Builder.roleTypeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleTypeCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roleTypeCode(roleTypeCode: JsonField<String>) = apply {
            this.roleTypeCode = roleTypeCode
        }

        /** Skill level of the mission response team member. */
        fun skillLevel(skillLevel: Int) = skillLevel(JsonField.of(skillLevel))

        /**
         * Sets [Builder.skillLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skillLevel] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skillLevel(skillLevel: JsonField<Int>) = apply { this.skillLevel = skillLevel }

        /**
         * Indicates where the repairs will be performed, or which shop specialty has been assigned
         * responsibility for correcting the discrepancy. Shop specialties are normally listed in
         * abbreviated format.
         */
        fun specialty(specialty: String) = specialty(JsonField.of(specialty))

        /**
         * Sets [Builder.specialty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialty] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun specialty(specialty: JsonField<String>) = apply { this.specialty = specialty }

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
         * Returns an immutable instance of [LogisticsSpecialtiesFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsSpecialtiesFull =
            LogisticsSpecialtiesFull(
                firstName,
                last4Ssn,
                lastName,
                rankCode,
                roleTypeCode,
                skillLevel,
                specialty,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsSpecialtiesFull = apply {
        if (validated) {
            return@apply
        }

        firstName()
        last4Ssn()
        lastName()
        rankCode()
        roleTypeCode()
        skillLevel()
        specialty()
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
        (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (last4Ssn.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (rankCode.asKnown().isPresent) 1 else 0) +
            (if (roleTypeCode.asKnown().isPresent) 1 else 0) +
            (if (skillLevel.asKnown().isPresent) 1 else 0) +
            (if (specialty.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogisticsSpecialtiesFull &&
            firstName == other.firstName &&
            last4Ssn == other.last4Ssn &&
            lastName == other.lastName &&
            rankCode == other.rankCode &&
            roleTypeCode == other.roleTypeCode &&
            skillLevel == other.skillLevel &&
            specialty == other.specialty &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            firstName,
            last4Ssn,
            lastName,
            rankCode,
            roleTypeCode,
            skillLevel,
            specialty,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogisticsSpecialtiesFull{firstName=$firstName, last4Ssn=$last4Ssn, lastName=$lastName, rankCode=$rankCode, roleTypeCode=$roleTypeCode, skillLevel=$skillLevel, specialty=$specialty, additionalProperties=$additionalProperties}"
}
