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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Collection providing hours of operation and other information specific to a day of the week. */
class DailyOperationFull
private constructor(
    private val dayOfWeek: JsonField<DayOfWeek>,
    private val operatingHours: JsonField<List<OperatingHoursFull>>,
    private val operationName: JsonField<String>,
    private val ophrsLastChangedBy: JsonField<String>,
    private val ophrsLastChangedDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dayOfWeek")
        @ExcludeMissing
        dayOfWeek: JsonField<DayOfWeek> = JsonMissing.of(),
        @JsonProperty("operatingHours")
        @ExcludeMissing
        operatingHours: JsonField<List<OperatingHoursFull>> = JsonMissing.of(),
        @JsonProperty("operationName")
        @ExcludeMissing
        operationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ophrsLastChangedBy")
        @ExcludeMissing
        ophrsLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ophrsLastChangedDate")
        @ExcludeMissing
        ophrsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        dayOfWeek,
        operatingHours,
        operationName,
        ophrsLastChangedBy,
        ophrsLastChangedDate,
        mutableMapOf(),
    )

    /**
     * The day of the week to which this operational information pertains.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dayOfWeek(): Optional<DayOfWeek> = dayOfWeek.getOptional("dayOfWeek")

    /**
     * A collection containing the operational start and stop times scheduled for the day of the
     * week specified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatingHours(): Optional<List<OperatingHoursFull>> =
        operatingHours.getOptional("operatingHours")

    /**
     * The name or type of operation to which this information pertains.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operationName(): Optional<String> = operationName.getOptional("operationName")

    /**
     * The name of the person who made the most recent change to this DailyOperation data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ophrsLastChangedBy(): Optional<String> =
        ophrsLastChangedBy.getOptional("ophrsLastChangedBy")

    /**
     * The datetime of the most recent change made to this DailyOperation data, in ISO 8601 UTC
     * format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ophrsLastChangedDate(): Optional<OffsetDateTime> =
        ophrsLastChangedDate.getOptional("ophrsLastChangedDate")

    /**
     * Returns the raw JSON value of [dayOfWeek].
     *
     * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dayOfWeek") @ExcludeMissing fun _dayOfWeek(): JsonField<DayOfWeek> = dayOfWeek

    /**
     * Returns the raw JSON value of [operatingHours].
     *
     * Unlike [operatingHours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatingHours")
    @ExcludeMissing
    fun _operatingHours(): JsonField<List<OperatingHoursFull>> = operatingHours

    /**
     * Returns the raw JSON value of [operationName].
     *
     * Unlike [operationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operationName")
    @ExcludeMissing
    fun _operationName(): JsonField<String> = operationName

    /**
     * Returns the raw JSON value of [ophrsLastChangedBy].
     *
     * Unlike [ophrsLastChangedBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ophrsLastChangedBy")
    @ExcludeMissing
    fun _ophrsLastChangedBy(): JsonField<String> = ophrsLastChangedBy

    /**
     * Returns the raw JSON value of [ophrsLastChangedDate].
     *
     * Unlike [ophrsLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ophrsLastChangedDate")
    @ExcludeMissing
    fun _ophrsLastChangedDate(): JsonField<OffsetDateTime> = ophrsLastChangedDate

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

        /** Returns a mutable builder for constructing an instance of [DailyOperationFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DailyOperationFull]. */
    class Builder internal constructor() {

        private var dayOfWeek: JsonField<DayOfWeek> = JsonMissing.of()
        private var operatingHours: JsonField<MutableList<OperatingHoursFull>>? = null
        private var operationName: JsonField<String> = JsonMissing.of()
        private var ophrsLastChangedBy: JsonField<String> = JsonMissing.of()
        private var ophrsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dailyOperationFull: DailyOperationFull) = apply {
            dayOfWeek = dailyOperationFull.dayOfWeek
            operatingHours = dailyOperationFull.operatingHours.map { it.toMutableList() }
            operationName = dailyOperationFull.operationName
            ophrsLastChangedBy = dailyOperationFull.ophrsLastChangedBy
            ophrsLastChangedDate = dailyOperationFull.ophrsLastChangedDate
            additionalProperties = dailyOperationFull.additionalProperties.toMutableMap()
        }

        /** The day of the week to which this operational information pertains. */
        fun dayOfWeek(dayOfWeek: DayOfWeek) = dayOfWeek(JsonField.of(dayOfWeek))

        /**
         * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfWeek] with a well-typed [DayOfWeek] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dayOfWeek(dayOfWeek: JsonField<DayOfWeek>) = apply { this.dayOfWeek = dayOfWeek }

        /**
         * A collection containing the operational start and stop times scheduled for the day of the
         * week specified.
         */
        fun operatingHours(operatingHours: List<OperatingHoursFull>) =
            operatingHours(JsonField.of(operatingHours))

        /**
         * Sets [Builder.operatingHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingHours] with a well-typed
         * `List<OperatingHoursFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun operatingHours(operatingHours: JsonField<List<OperatingHoursFull>>) = apply {
            this.operatingHours = operatingHours.map { it.toMutableList() }
        }

        /**
         * Adds a single [OperatingHoursFull] to [operatingHours].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperatingHour(operatingHour: OperatingHoursFull) = apply {
            operatingHours =
                (operatingHours ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operatingHours", it).add(operatingHour)
                }
        }

        /** The name or type of operation to which this information pertains. */
        fun operationName(operationName: String) = operationName(JsonField.of(operationName))

        /**
         * Sets [Builder.operationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operationName(operationName: JsonField<String>) = apply {
            this.operationName = operationName
        }

        /** The name of the person who made the most recent change to this DailyOperation data. */
        fun ophrsLastChangedBy(ophrsLastChangedBy: String) =
            ophrsLastChangedBy(JsonField.of(ophrsLastChangedBy))

        /**
         * Sets [Builder.ophrsLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ophrsLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ophrsLastChangedBy(ophrsLastChangedBy: JsonField<String>) = apply {
            this.ophrsLastChangedBy = ophrsLastChangedBy
        }

        /**
         * The datetime of the most recent change made to this DailyOperation data, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun ophrsLastChangedDate(ophrsLastChangedDate: OffsetDateTime) =
            ophrsLastChangedDate(JsonField.of(ophrsLastChangedDate))

        /**
         * Sets [Builder.ophrsLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ophrsLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ophrsLastChangedDate(ophrsLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.ophrsLastChangedDate = ophrsLastChangedDate
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
         * Returns an immutable instance of [DailyOperationFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DailyOperationFull =
            DailyOperationFull(
                dayOfWeek,
                (operatingHours ?: JsonMissing.of()).map { it.toImmutable() },
                operationName,
                ophrsLastChangedBy,
                ophrsLastChangedDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DailyOperationFull = apply {
        if (validated) {
            return@apply
        }

        dayOfWeek().ifPresent { it.validate() }
        operatingHours().ifPresent { it.forEach { it.validate() } }
        operationName()
        ophrsLastChangedBy()
        ophrsLastChangedDate()
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
        (dayOfWeek.asKnown().getOrNull()?.validity() ?: 0) +
            (operatingHours.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (operationName.asKnown().isPresent) 1 else 0) +
            (if (ophrsLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (ophrsLastChangedDate.asKnown().isPresent) 1 else 0)

    /** The day of the week to which this operational information pertains. */
    class DayOfWeek @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MONDAY = of("MONDAY")

            @JvmField val TUESDAY = of("TUESDAY")

            @JvmField val WEDNESDAY = of("WEDNESDAY")

            @JvmField val THURSDAY = of("THURSDAY")

            @JvmField val FRIDAY = of("FRIDAY")

            @JvmField val SATURDAY = of("SATURDAY")

            @JvmField val SUNDAY = of("SUNDAY")

            @JvmStatic fun of(value: String) = DayOfWeek(JsonField.of(value))
        }

        /** An enum containing [DayOfWeek]'s known values. */
        enum class Known {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY,
        }

        /**
         * An enum containing [DayOfWeek]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DayOfWeek] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY,
            /**
             * An enum member indicating that [DayOfWeek] was instantiated with an unknown value.
             */
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
                MONDAY -> Value.MONDAY
                TUESDAY -> Value.TUESDAY
                WEDNESDAY -> Value.WEDNESDAY
                THURSDAY -> Value.THURSDAY
                FRIDAY -> Value.FRIDAY
                SATURDAY -> Value.SATURDAY
                SUNDAY -> Value.SUNDAY
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
                MONDAY -> Known.MONDAY
                TUESDAY -> Known.TUESDAY
                WEDNESDAY -> Known.WEDNESDAY
                THURSDAY -> Known.THURSDAY
                FRIDAY -> Known.FRIDAY
                SATURDAY -> Known.SATURDAY
                SUNDAY -> Known.SUNDAY
                else -> throw UnifieddatalibraryInvalidDataException("Unknown DayOfWeek: $value")
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

        fun validate(): DayOfWeek = apply {
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

            return other is DayOfWeek && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DailyOperationFull &&
            dayOfWeek == other.dayOfWeek &&
            operatingHours == other.operatingHours &&
            operationName == other.operationName &&
            ophrsLastChangedBy == other.ophrsLastChangedBy &&
            ophrsLastChangedDate == other.ophrsLastChangedDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dayOfWeek,
            operatingHours,
            operationName,
            ophrsLastChangedBy,
            ophrsLastChangedDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DailyOperationFull{dayOfWeek=$dayOfWeek, operatingHours=$operatingHours, operationName=$operationName, ophrsLastChangedBy=$ophrsLastChangedBy, ophrsLastChangedDate=$ophrsLastChangedDate, additionalProperties=$additionalProperties}"
}
