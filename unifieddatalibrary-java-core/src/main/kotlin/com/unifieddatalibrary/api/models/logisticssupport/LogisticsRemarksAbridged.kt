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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Remarks associated with this LogisticsSupport record. */
class LogisticsRemarksAbridged
private constructor(
    private val lastChanged: JsonField<OffsetDateTime>,
    private val remark: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lastChanged")
        @ExcludeMissing
        lastChanged: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("remark") @ExcludeMissing remark: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(lastChanged, remark, username, mutableMapOf())

    /**
     * Date the remark was published or updated, in ISO 8601 UTC format, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastChanged(): Optional<OffsetDateTime> = lastChanged.getOptional("lastChanged")

    /**
     * Text of the remark.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remark(): Optional<String> = remark.getOptional("remark")

    /**
     * User who published the remark.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [lastChanged].
     *
     * Unlike [lastChanged], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastChanged")
    @ExcludeMissing
    fun _lastChanged(): JsonField<OffsetDateTime> = lastChanged

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

        /** Returns a mutable builder for constructing an instance of [LogisticsRemarksAbridged]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogisticsRemarksAbridged]. */
    class Builder internal constructor() {

        private var lastChanged: JsonField<OffsetDateTime> = JsonMissing.of()
        private var remark: JsonField<String> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsRemarksAbridged: LogisticsRemarksAbridged) = apply {
            lastChanged = logisticsRemarksAbridged.lastChanged
            remark = logisticsRemarksAbridged.remark
            username = logisticsRemarksAbridged.username
            additionalProperties = logisticsRemarksAbridged.additionalProperties.toMutableMap()
        }

        /**
         * Date the remark was published or updated, in ISO 8601 UTC format, with millisecond
         * precision.
         */
        fun lastChanged(lastChanged: OffsetDateTime) = lastChanged(JsonField.of(lastChanged))

        /**
         * Sets [Builder.lastChanged] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastChanged] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastChanged(lastChanged: JsonField<OffsetDateTime>) = apply {
            this.lastChanged = lastChanged
        }

        /** Text of the remark. */
        fun remark(remark: String) = remark(JsonField.of(remark))

        /**
         * Sets [Builder.remark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remark] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remark(remark: JsonField<String>) = apply { this.remark = remark }

        /** User who published the remark. */
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
         * Returns an immutable instance of [LogisticsRemarksAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogisticsRemarksAbridged =
            LogisticsRemarksAbridged(
                lastChanged,
                remark,
                username,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsRemarksAbridged = apply {
        if (validated) {
            return@apply
        }

        lastChanged()
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
        (if (lastChanged.asKnown().isPresent) 1 else 0) +
            (if (remark.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LogisticsRemarksAbridged && lastChanged == other.lastChanged && remark == other.remark && username == other.username && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(lastChanged, remark, username, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogisticsRemarksAbridged{lastChanged=$lastChanged, remark=$remark, username=$username, additionalProperties=$additionalProperties}"
}
