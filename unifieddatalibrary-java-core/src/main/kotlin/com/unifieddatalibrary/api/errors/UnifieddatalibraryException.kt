package com.unifieddatalibrary.api.errors

open class UnifieddatalibraryException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
