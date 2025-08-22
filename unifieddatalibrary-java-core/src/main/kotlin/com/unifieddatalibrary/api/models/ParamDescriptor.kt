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
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ParamDescriptor
private constructor(
    private val classificationMarking: JsonField<String>,
    private val derived: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val elemMatch: JsonField<Boolean>,
    private val format: JsonField<String>,
    private val histQuerySupported: JsonField<Boolean>,
    private val histTupleSupported: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val restQuerySupported: JsonField<Boolean>,
    private val restTupleSupported: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val unitOfMeasure: JsonField<String>,
    private val utcDate: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("derived") @ExcludeMissing derived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elemMatch") @ExcludeMissing elemMatch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
        @JsonProperty("histQuerySupported")
        @ExcludeMissing
        histQuerySupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("histTupleSupported")
        @ExcludeMissing
        histTupleSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("restQuerySupported")
        @ExcludeMissing
        restQuerySupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("restTupleSupported")
        @ExcludeMissing
        restTupleSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unitOfMeasure")
        @ExcludeMissing
        unitOfMeasure: JsonField<String> = JsonMissing.of(),
        @JsonProperty("utcDate") @ExcludeMissing utcDate: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        derived,
        description,
        elemMatch,
        format,
        histQuerySupported,
        histTupleSupported,
        name,
        required,
        restQuerySupported,
        restTupleSupported,
        type,
        unitOfMeasure,
        utcDate,
        mutableMapOf(),
    )

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> =
        classificationMarking.getOptional("classificationMarking")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun derived(): Optional<Boolean> = derived.getOptional("derived")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elemMatch(): Optional<Boolean> = elemMatch.getOptional("elemMatch")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun format(): Optional<String> = format.getOptional("format")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun histQuerySupported(): Optional<Boolean> =
        histQuerySupported.getOptional("histQuerySupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun histTupleSupported(): Optional<Boolean> =
        histTupleSupported.getOptional("histTupleSupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun required(): Optional<Boolean> = required.getOptional("required")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restQuerySupported(): Optional<Boolean> =
        restQuerySupported.getOptional("restQuerySupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restTupleSupported(): Optional<Boolean> =
        restTupleSupported.getOptional("restTupleSupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unitOfMeasure(): Optional<String> = unitOfMeasure.getOptional("unitOfMeasure")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun utcDate(): Optional<Boolean> = utcDate.getOptional("utcDate")

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
     * Returns the raw JSON value of [derived].
     *
     * Unlike [derived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derived") @ExcludeMissing fun _derived(): JsonField<Boolean> = derived

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [elemMatch].
     *
     * Unlike [elemMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elemMatch") @ExcludeMissing fun _elemMatch(): JsonField<Boolean> = elemMatch

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

    /**
     * Returns the raw JSON value of [histQuerySupported].
     *
     * Unlike [histQuerySupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("histQuerySupported")
    @ExcludeMissing
    fun _histQuerySupported(): JsonField<Boolean> = histQuerySupported

    /**
     * Returns the raw JSON value of [histTupleSupported].
     *
     * Unlike [histTupleSupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("histTupleSupported")
    @ExcludeMissing
    fun _histTupleSupported(): JsonField<Boolean> = histTupleSupported

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [restQuerySupported].
     *
     * Unlike [restQuerySupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("restQuerySupported")
    @ExcludeMissing
    fun _restQuerySupported(): JsonField<Boolean> = restQuerySupported

    /**
     * Returns the raw JSON value of [restTupleSupported].
     *
     * Unlike [restTupleSupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("restTupleSupported")
    @ExcludeMissing
    fun _restTupleSupported(): JsonField<Boolean> = restTupleSupported

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [unitOfMeasure].
     *
     * Unlike [unitOfMeasure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unitOfMeasure")
    @ExcludeMissing
    fun _unitOfMeasure(): JsonField<String> = unitOfMeasure

    /**
     * Returns the raw JSON value of [utcDate].
     *
     * Unlike [utcDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utcDate") @ExcludeMissing fun _utcDate(): JsonField<Boolean> = utcDate

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

        /** Returns a mutable builder for constructing an instance of [ParamDescriptor]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParamDescriptor]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String> = JsonMissing.of()
        private var derived: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var elemMatch: JsonField<Boolean> = JsonMissing.of()
        private var format: JsonField<String> = JsonMissing.of()
        private var histQuerySupported: JsonField<Boolean> = JsonMissing.of()
        private var histTupleSupported: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var restQuerySupported: JsonField<Boolean> = JsonMissing.of()
        private var restTupleSupported: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var unitOfMeasure: JsonField<String> = JsonMissing.of()
        private var utcDate: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paramDescriptor: ParamDescriptor) = apply {
            classificationMarking = paramDescriptor.classificationMarking
            derived = paramDescriptor.derived
            description = paramDescriptor.description
            elemMatch = paramDescriptor.elemMatch
            format = paramDescriptor.format
            histQuerySupported = paramDescriptor.histQuerySupported
            histTupleSupported = paramDescriptor.histTupleSupported
            name = paramDescriptor.name
            required = paramDescriptor.required
            restQuerySupported = paramDescriptor.restQuerySupported
            restTupleSupported = paramDescriptor.restTupleSupported
            type = paramDescriptor.type
            unitOfMeasure = paramDescriptor.unitOfMeasure
            utcDate = paramDescriptor.utcDate
            additionalProperties = paramDescriptor.additionalProperties.toMutableMap()
        }

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

        fun derived(derived: Boolean) = derived(JsonField.of(derived))

        /**
         * Sets [Builder.derived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derived] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun derived(derived: JsonField<Boolean>) = apply { this.derived = derived }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun elemMatch(elemMatch: Boolean) = elemMatch(JsonField.of(elemMatch))

        /**
         * Sets [Builder.elemMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elemMatch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elemMatch(elemMatch: JsonField<Boolean>) = apply { this.elemMatch = elemMatch }

        fun format(format: String) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<String>) = apply { this.format = format }

        fun histQuerySupported(histQuerySupported: Boolean) =
            histQuerySupported(JsonField.of(histQuerySupported))

        /**
         * Sets [Builder.histQuerySupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.histQuerySupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun histQuerySupported(histQuerySupported: JsonField<Boolean>) = apply {
            this.histQuerySupported = histQuerySupported
        }

        fun histTupleSupported(histTupleSupported: Boolean) =
            histTupleSupported(JsonField.of(histTupleSupported))

        /**
         * Sets [Builder.histTupleSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.histTupleSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun histTupleSupported(histTupleSupported: JsonField<Boolean>) = apply {
            this.histTupleSupported = histTupleSupported
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        fun restQuerySupported(restQuerySupported: Boolean) =
            restQuerySupported(JsonField.of(restQuerySupported))

        /**
         * Sets [Builder.restQuerySupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restQuerySupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restQuerySupported(restQuerySupported: JsonField<Boolean>) = apply {
            this.restQuerySupported = restQuerySupported
        }

        fun restTupleSupported(restTupleSupported: Boolean) =
            restTupleSupported(JsonField.of(restTupleSupported))

        /**
         * Sets [Builder.restTupleSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restTupleSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restTupleSupported(restTupleSupported: JsonField<Boolean>) = apply {
            this.restTupleSupported = restTupleSupported
        }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun unitOfMeasure(unitOfMeasure: String) = unitOfMeasure(JsonField.of(unitOfMeasure))

        /**
         * Sets [Builder.unitOfMeasure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitOfMeasure] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitOfMeasure(unitOfMeasure: JsonField<String>) = apply {
            this.unitOfMeasure = unitOfMeasure
        }

        fun utcDate(utcDate: Boolean) = utcDate(JsonField.of(utcDate))

        /**
         * Sets [Builder.utcDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utcDate] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun utcDate(utcDate: JsonField<Boolean>) = apply { this.utcDate = utcDate }

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
         * Returns an immutable instance of [ParamDescriptor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParamDescriptor =
            ParamDescriptor(
                classificationMarking,
                derived,
                description,
                elemMatch,
                format,
                histQuerySupported,
                histTupleSupported,
                name,
                required,
                restQuerySupported,
                restTupleSupported,
                type,
                unitOfMeasure,
                utcDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParamDescriptor = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        derived()
        description()
        elemMatch()
        format()
        histQuerySupported()
        histTupleSupported()
        name()
        required()
        restQuerySupported()
        restTupleSupported()
        type()
        unitOfMeasure()
        utcDate()
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
            (if (derived.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (elemMatch.asKnown().isPresent) 1 else 0) +
            (if (format.asKnown().isPresent) 1 else 0) +
            (if (histQuerySupported.asKnown().isPresent) 1 else 0) +
            (if (histTupleSupported.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (if (restQuerySupported.asKnown().isPresent) 1 else 0) +
            (if (restTupleSupported.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (unitOfMeasure.asKnown().isPresent) 1 else 0) +
            (if (utcDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParamDescriptor &&
            classificationMarking == other.classificationMarking &&
            derived == other.derived &&
            description == other.description &&
            elemMatch == other.elemMatch &&
            format == other.format &&
            histQuerySupported == other.histQuerySupported &&
            histTupleSupported == other.histTupleSupported &&
            name == other.name &&
            required == other.required &&
            restQuerySupported == other.restQuerySupported &&
            restTupleSupported == other.restTupleSupported &&
            type == other.type &&
            unitOfMeasure == other.unitOfMeasure &&
            utcDate == other.utcDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            derived,
            description,
            elemMatch,
            format,
            histQuerySupported,
            histTupleSupported,
            name,
            required,
            restQuerySupported,
            restTupleSupported,
            type,
            unitOfMeasure,
            utcDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParamDescriptor{classificationMarking=$classificationMarking, derived=$derived, description=$description, elemMatch=$elemMatch, format=$format, histQuerySupported=$histQuerySupported, histTupleSupported=$histTupleSupported, name=$name, required=$required, restQuerySupported=$restQuerySupported, restTupleSupported=$restTupleSupported, type=$type, unitOfMeasure=$unitOfMeasure, utcDate=$utcDate, additionalProperties=$additionalProperties}"
}
