// Project information
lazy val Name = "receiveIT backend"
lazy val Version = "0.0.1"
lazy val Organization = "it.chalmers"

// Tool versions and settings
lazy val ScalaVersion = "2.11.7"
lazy val ScalatraVersion = "2.4.0"

lazy val root = (project in file("."))
  // Project information
  .settings(
    name := Name,
    version := Version,
    organization := Organization
  )
  // Tool versions and settings
  .settings(
    scalaVersion := ScalaVersion
  )
  // Dependencies
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",

      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
    )
  )
