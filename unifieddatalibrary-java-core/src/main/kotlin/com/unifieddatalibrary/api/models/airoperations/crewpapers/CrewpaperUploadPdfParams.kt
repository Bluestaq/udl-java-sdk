// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.crewpapers

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
 * Service operation to upload a supporting PDF for the aircraft sortie. A specific role is required
 * to perform this service operation. Please contact the UDL team for assistance.
 */
class CrewpaperUploadPdfParams
private constructor(
    private val aircraftSortieIds: String,
    private val classificationMarking: String,
    private val paperStatus: PaperStatus,
    private val papersVersion: String,
    private val fileContent: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Comma-separated list of AircraftSortie IDs the Crew Papers are being added to. */
    fun aircraftSortieIds(): String = aircraftSortieIds

    /** classificationMarking of the Crew Papers. */
    fun classificationMarking(): String = classificationMarking

    /** The status of the supporting document. */
    fun paperStatus(): PaperStatus = paperStatus

    /** The version number of the crew paper. */
    fun papersVersion(): String = papersVersion

    fun fileContent(): Optional<String> = Optional.ofNullable(fileContent)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CrewpaperUploadPdfParams].
         *
         * The following fields are required:
         * ```java
         * .aircraftSortieIds()
         * .classificationMarking()
         * .paperStatus()
         * .papersVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrewpaperUploadPdfParams]. */
    class Builder internal constructor() {

        private var aircraftSortieIds: String? = null
        private var classificationMarking: String? = null
        private var paperStatus: PaperStatus? = null
        private var papersVersion: String? = null
        private var fileContent: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(crewpaperUploadPdfParams: CrewpaperUploadPdfParams) = apply {
            aircraftSortieIds = crewpaperUploadPdfParams.aircraftSortieIds
            classificationMarking = crewpaperUploadPdfParams.classificationMarking
            paperStatus = crewpaperUploadPdfParams.paperStatus
            papersVersion = crewpaperUploadPdfParams.papersVersion
            fileContent = crewpaperUploadPdfParams.fileContent
            additionalHeaders = crewpaperUploadPdfParams.additionalHeaders.toBuilder()
            additionalQueryParams = crewpaperUploadPdfParams.additionalQueryParams.toBuilder()
        }

        /** Comma-separated list of AircraftSortie IDs the Crew Papers are being added to. */
        fun aircraftSortieIds(aircraftSortieIds: String) = apply {
            this.aircraftSortieIds = aircraftSortieIds
        }

        /** classificationMarking of the Crew Papers. */
        fun classificationMarking(classificationMarking: String) = apply {
            this.classificationMarking = classificationMarking
        }

        /** The status of the supporting document. */
        fun paperStatus(paperStatus: PaperStatus) = apply { this.paperStatus = paperStatus }

        /** The version number of the crew paper. */
        fun papersVersion(papersVersion: String) = apply { this.papersVersion = papersVersion }

        fun fileContent(fileContent: String?) = apply { this.fileContent = fileContent }

        /** Alias for calling [Builder.fileContent] with `fileContent.orElse(null)`. */
        fun fileContent(fileContent: Optional<String>) = fileContent(fileContent.getOrNull())

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
         * Returns an immutable instance of [CrewpaperUploadPdfParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aircraftSortieIds()
         * .classificationMarking()
         * .paperStatus()
         * .papersVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CrewpaperUploadPdfParams =
            CrewpaperUploadPdfParams(
                checkRequired("aircraftSortieIds", aircraftSortieIds),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("paperStatus", paperStatus),
                checkRequired("papersVersion", papersVersion),
                fileContent,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<String> = Optional.ofNullable(fileContent)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("aircraftSortieIds", aircraftSortieIds)
                put("classificationMarking", classificationMarking)
                put("paperStatus", paperStatus.toString())
                put("papersVersion", papersVersion)
                putAll(additionalQueryParams)
            }
            .build()

    /** The status of the supporting document. */
    class PaperStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmField val DELETED = of("DELETED")

            @JvmField val UPDATED = of("UPDATED")

            @JvmField val READ = of("READ")

            @JvmStatic fun of(value: String) = PaperStatus(JsonField.of(value))
        }

        /** An enum containing [PaperStatus]'s known values. */
        enum class Known {
            PUBLISHED,
            DELETED,
            UPDATED,
            READ,
        }

        /**
         * An enum containing [PaperStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaperStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PUBLISHED,
            DELETED,
            UPDATED,
            READ,
            /**
             * An enum member indicating that [PaperStatus] was instantiated with an unknown value.
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
                PUBLISHED -> Value.PUBLISHED
                DELETED -> Value.DELETED
                UPDATED -> Value.UPDATED
                READ -> Value.READ
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
                PUBLISHED -> Known.PUBLISHED
                DELETED -> Known.DELETED
                UPDATED -> Known.UPDATED
                READ -> Known.READ
                else -> throw UnifieddatalibraryInvalidDataException("Unknown PaperStatus: $value")
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

        fun validate(): PaperStatus = apply {
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

            return other is PaperStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CrewpaperUploadPdfParams &&
            aircraftSortieIds == other.aircraftSortieIds &&
            classificationMarking == other.classificationMarking &&
            paperStatus == other.paperStatus &&
            papersVersion == other.papersVersion &&
            fileContent == other.fileContent &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            aircraftSortieIds,
            classificationMarking,
            paperStatus,
            papersVersion,
            fileContent,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CrewpaperUploadPdfParams{aircraftSortieIds=$aircraftSortieIds, classificationMarking=$classificationMarking, paperStatus=$paperStatus, papersVersion=$papersVersion, fileContent=$fileContent, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
