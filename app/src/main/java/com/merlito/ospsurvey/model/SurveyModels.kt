package com.merlito.ospsurvey.model

data class SurveyPhoto(
    val id: String,
    val thumbnail: String, // base64 thumbnail
    val timestamp: String, // ISO
    val status: Status = Status.PENDING,
    val remarks: String? = null,
    val capturedLat: Double? = null,
    val capturedLng: Double? = null,
    val isStoredInDB: Boolean = false
) {
    enum class Status { PENDING, PASSED, RETAKE }
}

data class PoleSurvey(
    val id: String,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val altitude: Double? = null,
    val timestamp: String,
    val photos: List<SurveyPhoto> = listOf(),
    val notes: String? = null
)

data class SiteSurvey(
    val id: String,
    val siteName: String,
    val companyName: String? = null,
    val groupName: String,
    val poles: List<PoleSurvey> = listOf()
)

data class LocationState(
    val lat: Double,
    val lng: Double,
    val accuracy: Double? = null,
    val altitude: Double? = null
)
