scalaVersion in ThisBuild := "2.12.6"

val library_y = project.settings(
  libraryDependencies += "com.example" %% "x" % "0.1"
)

val main = project.settings(
  libraryDependencies += "com.example" %% "x" % "0.2"
).dependsOn(
  library_y
)
