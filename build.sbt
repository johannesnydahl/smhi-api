lazy val Scala3Version = "3.4.2"
lazy val Name          = "smhi-api"
lazy val Version       = "0.1.0" 


lazy val root = project
  .in(file("."))
  .settings(
    name := Name,
    version := Version,
    scalaVersion := Scala3Version,
    assembly / assemblyJarName := s"smhi-api-${Version}.jar",

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "com.lihaoyi" %% "requests" % "0.9.0",
      "com.lihaoyi" %% "upickle" % "4.0.0"
    )
  )

ThisBuild / scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Wunused:all",
  "-Wvalue-discard", 
  "-Ysafe-init",
)
