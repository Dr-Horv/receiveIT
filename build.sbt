// Project information
lazy val Name = "receiveIT backend"
lazy val Version = "0.0.1"
lazy val Organization = "it.chalmers"

// Tool versions and settings
lazy val ScalaVersion = "2.11.7"

lazy val root = (project in file("."))
  .settings(
    name := Name,
    version := Version,
    organization := Organization
  )
  .settings(
    scalaVersion := ScalaVersion
  )
