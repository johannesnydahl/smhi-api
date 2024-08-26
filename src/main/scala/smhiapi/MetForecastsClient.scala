package smhiapi

import upickle.default.read
import requests._

/**
 * An API client for the [[https://opendata.smhi.se/apidocs/metfcst/index.html Meteorological Forecasts endpoint]]
 */
class MetForecastsClient():
  private val Category = "pmp3g"

  //private def validateStatusCode(request: Response): Unit =
  //  if request.statusCode != 200 then throw Exception("HTTP Request failed: status does not equal 200")

  /** 
   * Fetch the time the current forecast was approved
   * @return An instance containing the time the forecast was approved by SMHI and the time it was calculated
   * @see https://opendata.smhi.se/apidocs/metfcst/approved_time.html
   */
  def getApprovedTime(): ApprovedTimeResponse =
    val Version = 2
    val URL = s"https://opendata-download-metfcst.smhi.se/api/category/$Category/version/$Version/approvedtime.json"
    
    val r = requests.get(URL)

    //validateStatusCode(r)
    read[ApprovedTimeResponse](r)

  /**
   * Fetch the valid times for the current forecast
   * @return A Vector containing all of the forecast's vaild times
   * @see https://opendata.smhi.se/apidocs/metfcst/valid_time.html
   */
  def getValidTimes(): ValidTimesResponse =
    val Version = 2
    val URL = s"https://opendata-download-metfcst.smhi.se/api/category/$Category/version/$Version/validtime.json "
    
    val r = requests.get(URL)

    //validateStatusCode(r)
    read[ValidTimesResponse](r)

