val scala2Version = "2.13.6"
val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-cross",
    version := "0.1.0",

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,

    // To make the default compiler and REPL use Dotty
    scalaVersion := scala3Version,

    // To cross compile with Scala 3 and Scala 2
    crossScalaVersions := Seq(scala3Version, scala2Version)
  )
