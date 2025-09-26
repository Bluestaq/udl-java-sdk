// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.fasterxml.jackson.annotation.JsonCreator
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to post/store Ephemeris data. This operation is intended to be used for
 * automated feeds into UDL. The payload is in Ephemeris format as described by the "Flight Safety
 * Handbook" published by 18th Space Command. A specific role is required to perform this service
 * operation. Please contact the UDL team for assistance.
 *
 * </br> **Example:**
 * /filedrop/ephem?classification=U&dataMode=TEST&source=Bluestaq&satNo=25544&ephemFormatType=NASA&hasMnvr=false&type=ROUTINE&category=EXTERNAL&origin=NASA&tags=tag1,tag2
 */
class EphemerisFileUploadParams
private constructor(
    private val category: String,
    private val classification: String,
    private val dataMode: DataMode,
    private val ephemFormatType: EphemFormatType,
    private val hasMnvr: Boolean,
    private val satNo: Long,
    private val source: String,
    private val type: String,
    private val origin: String?,
    private val tags: String?,
    private val body: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Ephemeris category. */
    fun category(): String = category

    /** Classification marking of the data in IC/CAPCO Portion-marked format. */
    fun classification(): String = classification

    /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
    fun dataMode(): DataMode = dataMode

    /** Ephemeris format as documented in Flight Safety Handbook. */
    fun ephemFormatType(): EphemFormatType = ephemFormatType

    /** Boolean indicating whether maneuver(s) are incorporated into the ephemeris. */
    fun hasMnvr(): Boolean = hasMnvr

    /** Satellite/Catalog number of the target on-orbit object. */
    fun satNo(): Long = satNo

    /** Source of the Ephemeris data. */
    fun source(): String = source

    /** Ephemeris type. */
    fun type(): String = type

    /** Optional origin of the Ephemeris. */
    fun origin(): Optional<String> = Optional.ofNullable(origin)

    /**
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    fun body(): String = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisFileUploadParams].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .classification()
         * .dataMode()
         * .ephemFormatType()
         * .hasMnvr()
         * .satNo()
         * .source()
         * .type()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemerisFileUploadParams]. */
    class Builder internal constructor() {

        private var category: String? = null
        private var classification: String? = null
        private var dataMode: DataMode? = null
        private var ephemFormatType: EphemFormatType? = null
        private var hasMnvr: Boolean? = null
        private var satNo: Long? = null
        private var source: String? = null
        private var type: String? = null
        private var origin: String? = null
        private var tags: String? = null
        private var body: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ephemerisFileUploadParams: EphemerisFileUploadParams) = apply {
            category = ephemerisFileUploadParams.category
            classification = ephemerisFileUploadParams.classification
            dataMode = ephemerisFileUploadParams.dataMode
            ephemFormatType = ephemerisFileUploadParams.ephemFormatType
            hasMnvr = ephemerisFileUploadParams.hasMnvr
            satNo = ephemerisFileUploadParams.satNo
            source = ephemerisFileUploadParams.source
            type = ephemerisFileUploadParams.type
            origin = ephemerisFileUploadParams.origin
            tags = ephemerisFileUploadParams.tags
            body = ephemerisFileUploadParams.body
            additionalHeaders = ephemerisFileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = ephemerisFileUploadParams.additionalQueryParams.toBuilder()
        }

        /** Ephemeris category. */
        fun category(category: String) = apply { this.category = category }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classification(classification: String) = apply { this.classification = classification }

        /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
        fun dataMode(dataMode: DataMode) = apply { this.dataMode = dataMode }

        /** Ephemeris format as documented in Flight Safety Handbook. */
        fun ephemFormatType(ephemFormatType: EphemFormatType) = apply {
            this.ephemFormatType = ephemFormatType
        }

        /** Boolean indicating whether maneuver(s) are incorporated into the ephemeris. */
        fun hasMnvr(hasMnvr: Boolean) = apply { this.hasMnvr = hasMnvr }

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Long) = apply { this.satNo = satNo }

        /** Source of the Ephemeris data. */
        fun source(source: String) = apply { this.source = source }

        /** Ephemeris type. */
        fun type(type: String) = apply { this.type = type }

        /** Optional origin of the Ephemeris. */
        fun origin(origin: String?) = apply { this.origin = origin }

        /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
        fun origin(origin: Optional<String>) = origin(origin.getOrNull())

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        fun body(body: String) = apply { this.body = body }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EphemerisFileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .classification()
         * .dataMode()
         * .ephemFormatType()
         * .hasMnvr()
         * .satNo()
         * .source()
         * .type()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemerisFileUploadParams =
            EphemerisFileUploadParams(
                checkRequired("category", category),
                checkRequired("classification", classification),
                checkRequired("dataMode", dataMode),
                checkRequired("ephemFormatType", ephemFormatType),
                checkRequired("hasMnvr", hasMnvr),
                checkRequired("satNo", satNo),
                checkRequired("source", source),
                checkRequired("type", type),
                origin,
                tags,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): String = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("category", category)
                put("classification", classification)
                put("dataMode", dataMode.toString())
                put("ephemFormatType", ephemFormatType.toString())
                put("hasMnvr", hasMnvr.toString())
                put("satNo", satNo.toString())
                put("source", source)
                put("type", type)
                origin?.let { put("origin", it) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Indicator of whether the data is REAL, TEST, SIMULATED, or EXERCISE data. */
    class DataMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REAL = of("REAL")

            @JvmField val TEST = of("TEST")

            @JvmField val SIMULATED = of("SIMULATED")

            @JvmField val EXERCISE = of("EXERCISE")

            @JvmStatic fun of(value: String) = DataMode(JsonField.of(value))
        }

        /** An enum containing [DataMode]'s known values. */
        enum class Known {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
        }

        /**
         * An enum containing [DataMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
            /** An enum member indicating that [DataMode] was instantiated with an unknown value. */
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
                REAL -> Value.REAL
                TEST -> Value.TEST
                SIMULATED -> Value.SIMULATED
                EXERCISE -> Value.EXERCISE
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
                REAL -> Known.REAL
                TEST -> Known.TEST
                SIMULATED -> Known.SIMULATED
                EXERCISE -> Known.EXERCISE
                else -> throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
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

        fun validate(): DataMode = apply {
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

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Ephemeris format as documented in Flight Safety Handbook. */
    class EphemFormatType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val MOD_ITC = of("ModITC")

            @JvmField val GOO = of("GOO")

            @JvmField val NASA = of("NASA")

            @JvmField val OEM = of("OEM")

            @JvmField val OASYS = of("OASYS")

            @JvmStatic fun of(value: String) = EphemFormatType(JsonField.of(value))
        }

        /** An enum containing [EphemFormatType]'s known values. */
        enum class Known {
            MOD_ITC,
            GOO,
            NASA,
            OEM,
            OASYS,
        }

        /**
         * An enum containing [EphemFormatType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EphemFormatType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MOD_ITC,
            GOO,
            NASA,
            OEM,
            OASYS,
            /**
             * An enum member indicating that [EphemFormatType] was instantiated with an unknown
             * value.
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
                MOD_ITC -> Value.MOD_ITC
                GOO -> Value.GOO
                NASA -> Value.NASA
                OEM -> Value.OEM
                OASYS -> Value.OASYS
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
                MOD_ITC -> Known.MOD_ITC
                GOO -> Known.GOO
                NASA -> Known.NASA
                OEM -> Known.OEM
                OASYS -> Known.OASYS
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown EphemFormatType: $value")
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

        fun validate(): EphemFormatType = apply {
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

            return other is EphemFormatType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemerisFileUploadParams &&
            category == other.category &&
            classification == other.classification &&
            dataMode == other.dataMode &&
            ephemFormatType == other.ephemFormatType &&
            hasMnvr == other.hasMnvr &&
            satNo == other.satNo &&
            source == other.source &&
            type == other.type &&
            origin == other.origin &&
            tags == other.tags &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            classification,
            dataMode,
            ephemFormatType,
            hasMnvr,
            satNo,
            source,
            type,
            origin,
            tags,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EphemerisFileUploadParams{category=$category, classification=$classification, dataMode=$dataMode, ephemFormatType=$ephemFormatType, hasMnvr=$hasMnvr, satNo=$satNo, source=$source, type=$type, origin=$origin, tags=$tags, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
