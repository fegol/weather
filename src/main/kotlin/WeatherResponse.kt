import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    val main: TempMain
)

data class TempMain(
    val temp: Double,
    @SerializedName("feels_like")
    val feelsLike: Double
)