package smhiapi
import java.time.ZonedDateTime
import upickle.default.{Reader, reader}

/** 
 *  @param approvedTime the time the forecast was approved by SMHI
 *  @param referenceTime the time the forecast was calculated
 */
case class ApprovedTimeResponse(val approvedTime: ZonedDateTime, val referenceTime: ZonedDateTime)
//Specifies to uPickle how to deserialize the JSON string
given Reader[ApprovedTimeResponse] = reader[ujson.Value].map(
  json => ApprovedTimeResponse(
    ZonedDateTime.parse(json("approvedTime").str),
    ZonedDateTime.parse(json("referenceTime").str),
    )
  )

type ValidTimesResponse = Vector[ZonedDateTime]
given Reader[ValidTimesResponse] = reader[ujson.Value].map(
  json =>
    json("validTime").arr.map(t => ZonedDateTime.parse(t.str)).toVector
)
    



