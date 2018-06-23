scalaVersion in ThisBuild := "2.12.6"
organization in ThisBuild := "com.example"

val v1 = project.settings(
  name := "x",
  version := "0.1"
)

val v2 = project.settings(
  name := "x",
  mimaPreviousArtifacts := Set(
    organization.value %% name.value % "0.1"
  ),
  version := "0.2"
)
