// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html

import smhiapi.MetForecastsClient

class MetForecatsSuite extends munit.FunSuite {

  var client = MetForecastsClient()

  test("getApprovedTime") {
    val res = client.getApprovedTime()
    println(res)
  }

  test("getValidTimes") {
    val res = client.getValidTimes()
    println(res)
  }
}
