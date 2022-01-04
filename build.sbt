ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "simple_project_vsc_docker",
    assembly / mainClass := Some("com.github.maksd.ApiServerMain"),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "cask" % "0.2.9"
    )
  )
