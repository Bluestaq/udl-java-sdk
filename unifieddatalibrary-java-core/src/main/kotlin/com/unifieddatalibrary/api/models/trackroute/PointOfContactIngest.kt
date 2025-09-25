// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

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

/** Point of contacts for scheduling or modifying the route. */
class PointOfContactIngest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val office: JsonField<String>,
    private val phone: JsonField<String>,
    private val pocName: JsonField<String>,
    private val pocOrg: JsonField<String>,
    private val pocSequenceId: JsonField<Int>,
    private val pocTypeName: JsonField<String>,
    private val rank: JsonField<String>,
    private val remark: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("office") @ExcludeMissing office: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocName") @ExcludeMissing pocName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocOrg") @ExcludeMissing pocOrg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocSequenceId")
        @ExcludeMissing
        pocSequenceId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pocTypeName")
        @ExcludeMissing
        pocTypeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rank") @ExcludeMissing rank: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remark") @ExcludeMissing remark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        office,
        phone,
        pocName,
        pocOrg,
        pocSequenceId,
        pocTypeName,
        rank,
        remark,
        username,
        mutableMapOf(),
    )

    /**
     * Office name for which the contact belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun office(): Optional<String> = office.getOptional("office")

    /**
     * Phone number of the contact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun phone(): Optional<String> = phone.getOptional("phone")

    /**
     * The name of the contact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocName(): Optional<String> = pocName.getOptional("pocName")

    /**
     * Organization name for which the contact belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocOrg(): Optional<String> = pocOrg.getOptional("pocOrg")

    /**
     * Sequencing field for point of contact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocSequenceId(): Optional<Int> = pocSequenceId.getOptional("pocSequenceId")

    /**
     * A code or name that represents the contact's role in association to the track route (ex.
     * Originator, Scheduler, Maintainer, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocTypeName(): Optional<String> = pocTypeName.getOptional("pocTypeName")

    /**
     * The rank of contact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rank(): Optional<String> = rank.getOptional("rank")

    /**
     * Text of the remark.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remark(): Optional<String> = remark.getOptional("remark")

    /**
     * The username of the contact.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [office].
     *
     * Unlike [office], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("office") @ExcludeMissing fun _office(): JsonField<String> = office

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [pocName].
     *
     * Unlike [pocName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocName") @ExcludeMissing fun _pocName(): JsonField<String> = pocName

    /**
     * Returns the raw JSON value of [pocOrg].
     *
     * Unlike [pocOrg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocOrg") @ExcludeMissing fun _pocOrg(): JsonField<String> = pocOrg

    /**
     * Returns the raw JSON value of [pocSequenceId].
     *
     * Unlike [pocSequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocSequenceId")
    @ExcludeMissing
    fun _pocSequenceId(): JsonField<Int> = pocSequenceId

    /**
     * Returns the raw JSON value of [pocTypeName].
     *
     * Unlike [pocTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocTypeName") @ExcludeMissing fun _pocTypeName(): JsonField<String> = pocTypeName

    /**
     * Returns the raw JSON value of [rank].
     *
     * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<String> = rank

    /**
     * Returns the raw JSON value of [remark].
     *
     * Unlike [remark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remark") @ExcludeMissing fun _remark(): JsonField<String> = remark

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

        /** Returns a mutable builder for constructing an instance of [PointOfContactIngest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PointOfContactIngest]. */
    class Builder internal constructor() {

        private var office: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var pocName: JsonField<String> = JsonMissing.of()
        private var pocOrg: JsonField<String> = JsonMissing.of()
        private var pocSequenceId: JsonField<Int> = JsonMissing.of()
        private var pocTypeName: JsonField<String> = JsonMissing.of()
        private var rank: JsonField<String> = JsonMissing.of()
        private var remark: JsonField<String> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pointOfContactIngest: PointOfContactIngest) = apply {
            office = pointOfContactIngest.office
            phone = pointOfContactIngest.phone
            pocName = pointOfContactIngest.pocName
            pocOrg = pointOfContactIngest.pocOrg
            pocSequenceId = pointOfContactIngest.pocSequenceId
            pocTypeName = pointOfContactIngest.pocTypeName
            rank = pointOfContactIngest.rank
            remark = pointOfContactIngest.remark
            username = pointOfContactIngest.username
            additionalProperties = pointOfContactIngest.additionalProperties.toMutableMap()
        }

        /** Office name for which the contact belongs. */
        fun office(office: String) = office(JsonField.of(office))

        /**
         * Sets [Builder.office] to an arbitrary JSON value.
         *
         * You should usually call [Builder.office] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun office(office: JsonField<String>) = apply { this.office = office }

        /** Phone number of the contact. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        /** The name of the contact. */
        fun pocName(pocName: String) = pocName(JsonField.of(pocName))

        /**
         * Sets [Builder.pocName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocName(pocName: JsonField<String>) = apply { this.pocName = pocName }

        /** Organization name for which the contact belongs. */
        fun pocOrg(pocOrg: String) = pocOrg(JsonField.of(pocOrg))

        /**
         * Sets [Builder.pocOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocOrg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocOrg(pocOrg: JsonField<String>) = apply { this.pocOrg = pocOrg }

        /** Sequencing field for point of contact. */
        fun pocSequenceId(pocSequenceId: Int) = pocSequenceId(JsonField.of(pocSequenceId))

        /**
         * Sets [Builder.pocSequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocSequenceId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pocSequenceId(pocSequenceId: JsonField<Int>) = apply {
            this.pocSequenceId = pocSequenceId
        }

        /**
         * A code or name that represents the contact's role in association to the track route (ex.
         * Originator, Scheduler, Maintainer, etc.).
         */
        fun pocTypeName(pocTypeName: String) = pocTypeName(JsonField.of(pocTypeName))

        /**
         * Sets [Builder.pocTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocTypeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pocTypeName(pocTypeName: JsonField<String>) = apply { this.pocTypeName = pocTypeName }

        /** The rank of contact. */
        fun rank(rank: String) = rank(JsonField.of(rank))

        /**
         * Sets [Builder.rank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rank] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rank(rank: JsonField<String>) = apply { this.rank = rank }

        /** Text of the remark. */
        fun remark(remark: String) = remark(JsonField.of(remark))

        /**
         * Sets [Builder.remark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remark] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remark(remark: JsonField<String>) = apply { this.remark = remark }

        /** The username of the contact. */
        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

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
         * Returns an immutable instance of [PointOfContactIngest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PointOfContactIngest =
            PointOfContactIngest(
                office,
                phone,
                pocName,
                pocOrg,
                pocSequenceId,
                pocTypeName,
                rank,
                remark,
                username,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PointOfContactIngest = apply {
        if (validated) {
            return@apply
        }

        office()
        phone()
        pocName()
        pocOrg()
        pocSequenceId()
        pocTypeName()
        rank()
        remark()
        username()
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
        (if (office.asKnown().isPresent) 1 else 0) +
            (if (phone.asKnown().isPresent) 1 else 0) +
            (if (pocName.asKnown().isPresent) 1 else 0) +
            (if (pocOrg.asKnown().isPresent) 1 else 0) +
            (if (pocSequenceId.asKnown().isPresent) 1 else 0) +
            (if (pocTypeName.asKnown().isPresent) 1 else 0) +
            (if (rank.asKnown().isPresent) 1 else 0) +
            (if (remark.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PointOfContactIngest &&
            office == other.office &&
            phone == other.phone &&
            pocName == other.pocName &&
            pocOrg == other.pocOrg &&
            pocSequenceId == other.pocSequenceId &&
            pocTypeName == other.pocTypeName &&
            rank == other.rank &&
            remark == other.remark &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            office,
            phone,
            pocName,
            pocOrg,
            pocSequenceId,
            pocTypeName,
            rank,
            remark,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PointOfContactIngest{office=$office, phone=$phone, pocName=$pocName, pocOrg=$pocOrg, pocSequenceId=$pocSequenceId, pocTypeName=$pocTypeName, rank=$rank, remark=$remark, username=$username, additionalProperties=$additionalProperties}"
}
